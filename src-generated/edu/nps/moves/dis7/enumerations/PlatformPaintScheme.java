/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 620,
 * marshal size 8;
 * PlatformPaintScheme has 18 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum PlatformPaintScheme 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Default */
    // autogenerated using string template disenumpart2.txt
    DEFAULT (0, "Default"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Solid Color (primary) */
    // autogenerated using string template disenumpart2.txt
    SOLID_COLOR_PRIMARY (1, "Solid Color (primary)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Two Tone (Top Primary, Bottom Secondary) */
    // autogenerated using string template disenumpart2.txt
    TWO_TONE_TOP_PRIMARY_BOTTOM_SECONDARY (2, "Two Tone (Top Primary, Bottom Secondary)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Two Tone (Body Primary, Bed Secondary) */
    // autogenerated using string template disenumpart2.txt
    TWO_TONE_BODY_PRIMARY_BED_SECONDARY (3, "Two Tone (Body Primary, Bed Secondary)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Two Tone (Body Primary, Trim Secondary) */
    // autogenerated using string template disenumpart2.txt
    TWO_TONE_BODY_PRIMARY_TRIM_SECONDARY (4, "Two Tone (Body Primary, Trim Secondary)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Desert */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_DESERT (5, "Camouflage, Desert"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Jungle */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_JUNGLE (6, "Camouflage, Jungle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Snow */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_SNOW (7, "Camouflage, Snow"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Gravel */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_GRAVEL (8, "Camouflage, Gravel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Pavement */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_PAVEMENT (9, "Camouflage, Pavement"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Sand */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_SAND (10, "Camouflage, Sand"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Camouflage, Forest */
    // autogenerated using string template disenumpart2.txt
    CAMOUFLAGE_FOREST (11, "Camouflage, Forest"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Natural Wood */
    // autogenerated using string template disenumpart2.txt
    NATURAL_WOOD (12, "Natural Wood"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Clear */
    // autogenerated using string template disenumpart2.txt
    CLEAR (13, "Clear"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** United Nations (UN) */
    // autogenerated using string template disenumpart2.txt
    UNITED_NATIONS_UN (14, "United Nations (UN)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Taxi */
    // autogenerated using string template disenumpart2.txt
    TAXI (15, "Taxi"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** News */
    // autogenerated using string template disenumpart2.txt
    NEWS (16, "News"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Jingle */
    // autogenerated using string template disenumpart2.txt
    JINGLE (17, "Jingle");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformPaintScheme(int value, String description)
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
    public static PlatformPaintScheme getEnumForValue(int value)
    {
       for (PlatformPaintScheme nextEnum : PlatformPaintScheme.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum PlatformPaintScheme");
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
    public static PlatformPaintScheme unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformPaintScheme unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
   * Provide name
   * @return  name
   */
    public String getName()
    {
        return name();
    }

    
  /**
   * Provide simple identifier
   * @return class name, value and name
   */
    @Override
    public String toString()
    {
        String padding = new String();
        if (this.getClass().getName().endsWith("DisPduType") && (getValue() < 10))
            padding = "0"; // leading zero for column spacing
        String result = this.getClass().getSimpleName() + " " + padding + getValue() + " " + name();
        if (getTRACE())
            System.out.println ("*** enum " + this.getClass().getSimpleName() + " name=" + name() + ", value=" + getValue() + "; " +
               result); // debug diagnostic
        return result;
    }
}
