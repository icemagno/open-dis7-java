// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 28,
 * marshal size 8;
 * SensorEmitterCategory has 17 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum SensorEmitterCategory implements Category
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Multi-spectral */
    // autogenerated using string template disenumpart2.txt
    MULTI_SPECTRAL (1, "Multi-spectral"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** RF Active */
    // autogenerated using string template disenumpart2.txt
    RF_ACTIVE (2, "RF Active"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** RF Passive (intercept and DF) */
    // autogenerated using string template disenumpart2.txt
    RF_PASSIVE_INTERCEPT_AND_DF (3, "RF Passive (intercept and DF)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Optical (direct viewing with or without optics) */
    // autogenerated using string template disenumpart2.txt
    OPTICAL_DIRECT_VIEWING_WITH_OR_WITHOUT_OPTICS (4, "Optical (direct viewing with or without optics)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Electro-Optical */
    // autogenerated using string template disenumpart2.txt
    ELECTRO_OPTICAL (5, "Electro-Optical"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Seismic */
    // autogenerated using string template disenumpart2.txt
    SEISMIC (6, "Seismic"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical, point detector */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_POINT_DETECTOR (7, "Chemical, point detector"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Chemical, standoff */
    // autogenerated using string template disenumpart2.txt
    CHEMICAL_STANDOFF (8, "Chemical, standoff"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Thermal (temperature sensing) */
    // autogenerated using string template disenumpart2.txt
    THERMAL_TEMPERATURE_SENSING (9, "Thermal (temperature sensing)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Acoustic, Active */
    // autogenerated using string template disenumpart2.txt
    ACOUSTIC_ACTIVE (10, "Acoustic, Active"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Acoustic, Passive */
    // autogenerated using string template disenumpart2.txt
    ACOUSTIC_PASSIVE (11, "Acoustic, Passive"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Contact/Pressure (physical, hydrostatic, barometric) */
    // autogenerated using string template disenumpart2.txt
    CONTACT_PRESSURE_PHYSICAL_HYDROSTATIC_BAROMETRIC (12, "Contact/Pressure (physical, hydrostatic, barometric)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Electro-Magnetic Radiation (gamma radiation) */
    // autogenerated using string template disenumpart2.txt
    ELECTRO_MAGNETIC_RADIATION_GAMMA_RADIATION (13, "Electro-Magnetic Radiation (gamma radiation)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Particle Radiation (Neutrons, alpha, beta particles) */
    // autogenerated using string template disenumpart2.txt
    PARTICLE_RADIATION_NEUTRONS_ALPHA_BETA_PARTICLES (14, "Particle Radiation (Neutrons, alpha, beta particles)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Magnetic */
    // autogenerated using string template disenumpart2.txt
    MAGNETIC (15, "Magnetic"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gravitational */
    // autogenerated using string template disenumpart2.txt
    GRAVITATIONAL (16, "Gravitational");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    SensorEmitterCategory(int value, String description)
    {
        this.value = value;
        this.description = description;
    }
    /** Provide enumeration value
      * @return integer value */
    public int getValue()
    {
        return value;
    }

    /** Provide enumeration description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /** bit width for this enumeration
     * @return number of bits wide
     */
    public static int getEnumBitWidth()
    {
      return 8;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static SensorEmitterCategory getEnumForValue(int value)
    {
       for (SensorEmitterCategory nextEnum : SensorEmitterCategory.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum SensorEmitterCategory");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_8.txt

    private boolean TRACE = false;

    /** Set tracing on/off for this object 
     * @param value whether tracing is on or off */
    public void setTRACE (boolean value)
    {
        TRACE = value;
    }

    /** Whether tracing is on or off for this object
     * @return whether tracing is on or off */
    public boolean getTRACE ()
    {
        return TRACE;
    }

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.put((byte)getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static SensorEmitterCategory unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static SensorEmitterCategory unmarshalEnum(ByteBuffer byteBuffer) throws Exception
    {
        /*
        try {
            value = (int)byteBuffer.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue(byteBuffer.get());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        String padding = new String();
        if (this.getClass().getName().endsWith("DisPduType") && (getValue() < 10))
            padding = "0"; // leading zero for column spacing
        String result = "DisPduType " + padding + getValue() + " " + name();
        if (getTRACE())
            System.out.println ("*** enum " + this.getClass().getName() + " name=" + name() + ", value=" + getValue() + "; " +
               result); // debug diagnostic
        return result;
    }
}
