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
 *  UID 13,
 * marshal size 8;
 * PlatformSpaceCategory has 13 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum PlatformSpaceCategory implements Category
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Manned Spacecraft */
    // autogenerated using string template disenumpart2.txt
    MANNED_SPACECRAFT (1, "Manned Spacecraft"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Unmanned */
    // autogenerated using string template disenumpart2.txt
    UNMANNED (2, "Unmanned"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Booster */
    // autogenerated using string template disenumpart2.txt
    BOOSTER (3, "Booster"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Debris */
    // autogenerated using string template disenumpart2.txt
    DEBRIS (10, "Debris"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Satellite - Unknown/Unspecified Mission */
    // autogenerated using string template disenumpart2.txt
    SATELLITE_UNKNOWN_UNSPECIFIED_MISSION (11, "Satellite - Unknown/Unspecified Mission"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Satellite - Communication */
    // autogenerated using string template disenumpart2.txt
    SATELLITE_COMMUNICATION (12, "Satellite - Communication"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Satellite - Navigation */
    // autogenerated using string template disenumpart2.txt
    SATELLITE_NAVIGATION (13, "Satellite - Navigation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Satellite - Science/Experimental/Demonstration */
    // autogenerated using string template disenumpart2.txt
    SATELLITE_SCIENCE_EXPERIMENTAL_DEMONSTRATION (14, "Satellite - Science/Experimental/Demonstration"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Satellite - Inert (Target/Reflector/Calibration) */
    // autogenerated using string template disenumpart2.txt
    SATELLITE_INERT_TARGET_REFLECTOR_CALIBRATION (15, "Satellite - Inert (Target/Reflector/Calibration)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Satellite - Earth Observation */
    // autogenerated using string template disenumpart2.txt
    SATELLITE_EARTH_OBSERVATION (16, "Satellite - Earth Observation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Satellite - Space Surveillance */
    // autogenerated using string template disenumpart2.txt
    SATELLITE_SPACE_SURVEILLANCE (17, "Satellite - Space Surveillance"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Satellite - Astronomy */
    // autogenerated using string template disenumpart2.txt
    SATELLITE_ASTRONOMY (18, "Satellite - Astronomy");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformSpaceCategory(int value, String description)
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
    public static PlatformSpaceCategory getEnumForValue(int value)
    {
       for (PlatformSpaceCategory nextEnum : PlatformSpaceCategory.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum PlatformSpaceCategory");
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
    public static PlatformSpaceCategory unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformSpaceCategory unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
