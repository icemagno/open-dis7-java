/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
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
 *  UID 6,
 * marshal size 8;
 * ForceID has 31 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum ForceID 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY (1, "Friendly"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing */
    // autogenerated using string template disenumpart2.txt
    OPPOSING (2, "Opposing"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL (3, "Neutral"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 2 */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY_2 (4, "Friendly 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 2 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_2 (5, "Opposing 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 2 */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL_2 (6, "Neutral 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 3 */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY_3 (7, "Friendly 3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 3 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_3 (8, "Opposing 3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 3 */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL_3 (9, "Neutral 3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 4 */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY_4 (10, "Friendly 4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 4 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_4 (11, "Opposing 4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 4 */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL_4 (12, "Neutral 4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 5 */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY_5 (13, "Friendly 5"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 5 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_5 (14, "Opposing 5"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 5 */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL_5 (15, "Neutral 5"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 6 */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY_6 (16, "Friendly 6"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 6 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_6 (17, "Opposing 6"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 6 */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL_6 (18, "Neutral 6"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 7 */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY_7 (19, "Friendly 7"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 7 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_7 (20, "Opposing 7"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 7 */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL_7 (21, "Neutral 7"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 8 */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY_8 (22, "Friendly 8"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 8 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_8 (23, "Opposing 8"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 8 */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL_8 (24, "Neutral 8"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 9 */
    // autogenerated using string template disenumpart2.txt
    FRIENDLY_9 (25, "Friendly 9"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 9 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_9 (26, "Opposing 9"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 9 */
    // autogenerated using string template disenumpart2.txt
    NEUTRAL_9 (27, "Neutral 9"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Friendly 10 */
    // autogenerated using string template disenumpart2.txt
    IDENTIFICATION_FRIEND_OR_FOE (28, "Friendly 10"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Opposing 10 */
    // autogenerated using string template disenumpart2.txt
    OPPOSING_10 (29, "Opposing 10"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Neutral 10 */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Neutral 10");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    ForceID(int value, String description)
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
    public static ForceID getEnumForValue(int value)
    {
       for (ForceID nextEnum : ForceID.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum ForceID");
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
    public static ForceID unmarshalEnum (DataInputStream dis) throws Exception
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
    public static ForceID unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
