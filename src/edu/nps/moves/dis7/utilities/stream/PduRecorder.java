package edu.nps.moves.dis7.utilities.stream;

import com.google.common.primitives.Longs;

import edu.nps.moves.dis7.enumerations.DISPDUType;
import edu.nps.moves.dis7.utilities.DisThreadedNetIF;
import edu.nps.moves.dis7.utilities.PduFactory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;

import org.apache.commons.io.FilenameUtils;

public class PduRecorder implements PduReceiver
{
  static String DEFAULT_OUTDIR = "./pdulog";
  static String DEFAULT_FILEPREFIX = "Pdusave"; // TODO better name
  static String DISLOG_FILE_EXTENSION = ".dislog";
  
  static String DEFAULT_MCAST = "230.0.0.0";
  static int    DEFAULT_PORT = 3000;
 
  public static final String COMMENT_MARKER = "#";
  static String  START_COMMENT_MARKER = COMMENT_MARKER + " Start,  ";
  static String FINISH_COMMENT_MARKER = COMMENT_MARKER + " Finish, ";
  
  static final String ENCODING_BASE64                = "ENCODING_BASE64";
  static final String ENCODING_PLAINTEXT             = "ENCODING_PLAINTEXT";
  static final String ENCODING_BINARY                = "ENCODING_BINARY";  // TODO likely requires different code path
  static final String ENCODING_XML                   = "ENCODING_XML";     // TODO, repeat Open-DIS version 4 effort
  static final String ENCODING_EXI                   = "ENCODING_EXI";     // TODO, use Exificient or Nagasena libraries
  static final String ENCODING_JSON                  = "ENCODING_JSON";    // TODO, repeat Open-DIS version 4 effort
  static final String ENCODING_MAK_DATA_LOGGER       = "ENCODING_MAK_DATA_LOGGER";        // verbose pretty-print. perhaps output only (MAK format itself is binary)
  static final String ENCODING_WIRESHARK_DATA_LOGGER = "ENCODING_WIRESHARK_DATA_LOGGER"; // 
  static final String ENCODING_CDIS                  = "ENCODING_CDIS";    // future work based on new SISO standard
  
  private static       String pduLogEncoding  = ENCODING_PLAINTEXT; // TODO use Java enumerations, generalize/share across library

    /**
     * TODO change this to enumeration type for strictness
     * @return the pduLogEncoding
     */
    public static String getEncoding() {
        return pduLogEncoding;
    }

    /**
     * @param aEncoding the pduLogEncoding to set
     */
    public static void setEncoding(String aEncoding) {
        pduLogEncoding = aEncoding;
    }

  private Writer bufferedWriter;
  private File           logFile;
  
  private DisThreadedNetIF disThreadedNetIF;
  
  /**
   * Default constructor that uses default values for output directory, multicast
   * address and port.
   * 
   * @throws IOException if something goes wrong during instantiation
   */
  public PduRecorder() throws IOException
  {
    this(DEFAULT_OUTDIR, DEFAULT_MCAST, DEFAULT_PORT);
  }
  
  /**
   * Constructor to let the use specify an output directory. Uses default values 
   * multicast address and port.
   * 
   * @param dir the directory to write log files to
   * 
   * @throws IOException if something goes wrong during instantiation
   */
  public PduRecorder(String dir) throws IOException
  {
    this(dir, DEFAULT_MCAST, DEFAULT_PORT);
  }
  
  /** Constructor to let the use specify all required parameters
   * 
   * @param outputDir the directory to write log files to
   * @param mcastaddr the multicast address to receive data from
   * @param port the port to receive data through
   * @throws IOException if something goes wrong during instantiation
   */
  public PduRecorder(String outputDir, String mcastaddr, int port) throws IOException
  {
    DEFAULT_OUTDIR = outputDir;
    logFile = makeFile(new File(outputDir).toPath(), DEFAULT_FILEPREFIX+DISLOG_FILE_EXTENSION );
    bufferedWriter = new BufferedWriter(new FileWriter(logFile));
    
    disThreadedNetIF = new DisThreadedNetIF(port, mcastaddr);
    disThreadedNetIF.addRawListener(bAndL -> {
        receivePdu(bAndL.buff,bAndL.length);
    });
  }
  
  public void startResume()
  {
    doSave = true;
  }
  
  public void stopPause()
  {
    doSave = false;
  }
  
  public File end() throws IOException
  {
    disThreadedNetIF.kill();

    writeFooter();
    bufferedWriter.flush();
    bufferedWriter.close();
    System.out.println();
    System.out.println("Recorder log file closed: " + logFile.getPath());
    return logFile;
  }
 
  Long startNanoTime = null;
  StringBuilder sb = new StringBuilder();
  java.util.Base64.Encoder base64Encoder = Base64.getEncoder();
  int pduCount = 0;
  boolean headerWritten = false;
  boolean doSave = true;
  
  @Override
  public void receivePdu(byte[] buff, int len)
  {
    if(!doSave)
      return;
    
    long packetRcvNanoTime = System.nanoTime();
    if (startNanoTime == null)
        startNanoTime = packetRcvNanoTime;

    byte[] timeByteArray = Longs.toByteArray(packetRcvNanoTime - startNanoTime);
    //System.out.println("wrote time "+(packetRcvNanoTime - startNanoTime));

    sb.setLength(0);
    byte[] buffsized;
    
    switch (pduLogEncoding)
    {
        case ENCODING_BASE64:
            sb.append(base64Encoder.encodeToString(timeByteArray));
            sb.append(',');
            buffsized = Arrays.copyOf(buff, len);
            sb.append(base64Encoder.encodeToString(buffsized)); 
            break;
            
        case ENCODING_PLAINTEXT:
            // by Tobias Brennenstuhl SPring 2020
            //sb.append(encdr.encodeToString(timeAr));
            sb.append(Arrays.toString(timeByteArray).replace(" ", ""));
            sb.append(',');
            buffsized = Arrays.copyOf(buff, len);
            sb.append(Arrays.toString(buffsized).replace(" ", ""));
            
            sb.append(" # " + "TODO PDU type (number and name)");
            break;
        
        default:
            System.err.println ("Encoding'" + pduLogEncoding + " not recognized or supported");
    }
    try {
      if (!headerWritten) {
        writeHeader();
        headerWritten = true;
      }
      bufferedWriter.write(sb.toString());
      ((BufferedWriter)bufferedWriter).newLine();
    }
    catch (IOException ex) {
      System.err.println("Fatal exception writing DIS log file in Recorder.start()");
      throw new RuntimeException(ex);
    }
    //System.out.println("Recorder: "+ ++pduCount);

    sb.setLength(0);
  }
  
  public String getLogFile()
  {
    return logFile.getAbsolutePath();
  }
  
  private void writeHeader() throws IOException
  {
    // https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    
    bufferedWriter.write( START_COMMENT_MARKER + pduLogEncoding + ", " +  timeStamp + ", DIS capture file, " + logFile.getPath());
    ((BufferedWriter)bufferedWriter).newLine();
  }

  private void writeFooter() throws IOException
  {   
    // https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
    
    bufferedWriter.write(FINISH_COMMENT_MARKER + pduLogEncoding + ", " + timeStamp + ", DIS capture file, " + logFile.getPath());
    ((BufferedWriter)bufferedWriter).newLine();
  }

  /**
   * Rotates through file names so that no present file get overwritten.
   * 
   * @param outputDir the directory to place the log file
   * @param filename the name of the file w/ extension
   * @return a File reference to the log file
   * @throws IOException if something goes awry
   */
  private File makeFile(Path outputDir, String filename) throws IOException
  {
    String bname = FilenameUtils.getBaseName(filename);
    String ext = FilenameUtils.getExtension(filename);

    Integer count = null;
    File f;
    boolean fileExists;
    outputDir.toFile().mkdirs();
    do {
      String fn = bname + (count == null ? "" : count) + "." + ext;
      f = new File(outputDir.toFile(), fn);
      fileExists = f.exists();
      if (count == null)
        count = 1;
      else
        count++;
    } while (fileExists);
    if (!f.createNewFile()) {
      System.out.println("Cannot create dis log file at " + f.getAbsolutePath());
      throw new RuntimeException("File creation error");
    }
    return f;
  }
  
  /** Entry point invocation. Saves a PDU output log to ./pduLog. Invoking the
   *  edu.nps.moves.dis7.examples.PduReaderPlayer will playback all logs written
   *  to the log directory
   * 
   * @param args none supported, TODO offer path/filename
   */
  public static void main(String[] args)
  {
    PduFactory factory = new PduFactory(); //default appid, country, etc.

    PduRecorder recorder;
    try {
        recorder = new PduRecorder(); // default addr, port, output dir
        recorder.startResume();
    } 
    catch(IOException ex) {
      System.err.println("Exception creating recorder: "+ex.getLocalizedMessage());
      return;
    }
     
    DISPDUType all[] = DISPDUType.values();
    Arrays.stream(all).forEach(typ-> {
      if(typ != DISPDUType.OTHER) {
        try {
            recorder.getDisThreadedNetIF().send(factory.createPdu(typ));
//          sleep(100);
        }
        catch(Exception ex) {
          System.err.println("Exception sending Pdu: "+ex.getLocalizedMessage());
        }
      }
    });

    try {
      recorder.end();
    }
    catch(IOException ex) {
      System.err.println("Exception closing recorder: "+ex.getClass().getSimpleName()+": "+ex.getLocalizedMessage());
    }
  }
  
  private static void sleep(long ms)
  {
    try{
        Thread.sleep(ms);}
    catch(InterruptedException ex) {
    }
  }

    /**
     * @return an instance of this DisThreadedNetIF
     */
    public DisThreadedNetIF getDisThreadedNetIF() {
        return disThreadedNetIF;
    }
}
