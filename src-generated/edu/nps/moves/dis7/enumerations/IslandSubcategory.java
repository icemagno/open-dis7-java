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
 *  UID 715,
 * marshal size 16;
 * IslandSubcategory has 7 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum IslandSubcategory implements SubCategory
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Islands 1,000-2,499 km2 (386-965 sq mi) */
    // autogenerated using string template disenumpart2.txt
    ISLANDS_1_000_2_499_KM2_386_965_SQ_MI (1, "Islands 1,000-2,499 km2 (386-965 sq mi)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Islands 2,500-4,999 km2 (965-1,930 sq mi) */
    // autogenerated using string template disenumpart2.txt
    ISLANDS_2_500_4_999_KM2_965_1_930_SQ_MI (2, "Islands 2,500-4,999 km2 (965-1,930 sq mi)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Islands 5,000-9,999 km2 (1,931-3,861 sq mi) */
    // autogenerated using string template disenumpart2.txt
    ISLANDS_5_000_9_999_KM2_1_931_3_861_SQ_MI (3, "Islands 5,000-9,999 km2 (1,931-3,861 sq mi)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Islands 10,000-24,999 km2 (3,861-9,652 sq mi) */
    // autogenerated using string template disenumpart2.txt
    ISLANDS_10_000_24_999_KM2_3_861_9_652_SQ_MI (4, "Islands 10,000-24,999 km2 (3,861-9,652 sq mi)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Islands 25,000-99,999 km2 (9,653-38,610 sq mi) */
    // autogenerated using string template disenumpart2.txt
    ISLANDS_25_000_99_999_KM2_9_653_38_610_SQ_MI (5, "Islands 25,000-99,999 km2 (9,653-38,610 sq mi)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Islands 100,000 km2 (39,000 sq mi) and Greater */
    // autogenerated using string template disenumpart2.txt
    ISLANDS_100_000_KM2_39_000_SQ_MI_AND_GREATER (6, "Islands 100,000 km2 (39,000 sq mi) and Greater");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    IslandSubcategory(int value, String description)
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
      return 16;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static IslandSubcategory getEnumForValue(int value)
    {
       for (IslandSubcategory nextEnum : IslandSubcategory.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum IslandSubcategory");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_16.txt

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.putShort((short)getValue());
    }
    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static IslandSubcategory unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static IslandSubcategory unmarshalEnum (ByteBuffer byteBuffer) throws Exception
    {
        return getEnumForValue(byteBuffer.getShort());
    }   

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 2; // 16 bits
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
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        return "IslandSubcategory " + getValue() + " " + name(); 
    }
}
