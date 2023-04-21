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
 *  UID 212,
 * marshal size 16;
 * IsPartOfStationName has 23 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum IsPartOfStationName 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aircraft Wingstation */
    // autogenerated using string template disenumpart2.txt
    AIRCRAFT_WINGSTATION (1, "Aircraft Wingstation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ship's Forward Gunmount (Starboard) */
    // autogenerated using string template disenumpart2.txt
    SHIPS_FORWARD_GUNMOUNT_STARBOARD (2, "Ship's Forward Gunmount (Starboard)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ship's Forward Gunmount (Port) */
    // autogenerated using string template disenumpart2.txt
    SHIPS_FORWARD_GUNMOUNT_PORT (3, "Ship's Forward Gunmount (Port)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ship's Forward Gunmount (Centerline) */
    // autogenerated using string template disenumpart2.txt
    SHIPS_FORWARD_GUNMOUNT_CENTERLINE (4, "Ship's Forward Gunmount (Centerline)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ship's Aft Gunmount (Starboard) */
    // autogenerated using string template disenumpart2.txt
    SHIPS_AFT_GUNMOUNT_STARBOARD (5, "Ship's Aft Gunmount (Starboard)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ship's Aft Gunmount (Port) */
    // autogenerated using string template disenumpart2.txt
    SHIPS_AFT_GUNMOUNT_PORT (6, "Ship's Aft Gunmount (Port)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ship's Aft Gunmount (Centerline) */
    // autogenerated using string template disenumpart2.txt
    SHIPS_AFT_GUNMOUNT_CENTERLINE (7, "Ship's Aft Gunmount (Centerline)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Forward Torpedo Tube */
    // autogenerated using string template disenumpart2.txt
    FORWARD_TORPEDO_TUBE (8, "Forward Torpedo Tube"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aft Torpedo Tube */
    // autogenerated using string template disenumpart2.txt
    AFT_TORPEDO_TUBE (9, "Aft Torpedo Tube"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Bomb Bay */
    // autogenerated using string template disenumpart2.txt
    BOMB_BAY (10, "Bomb Bay"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cargo Bay */
    // autogenerated using string template disenumpart2.txt
    CARGO_BAY (11, "Cargo Bay"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Truck Bed */
    // autogenerated using string template disenumpart2.txt
    TRUCK_BED (12, "Truck Bed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Trailer Bed */
    // autogenerated using string template disenumpart2.txt
    TRAILER_BED (13, "Trailer Bed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Well Deck */
    // autogenerated using string template disenumpart2.txt
    WELL_DECK (14, "Well Deck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** On Station Range and Bearing */
    // autogenerated using string template disenumpart2.txt
    ON_STATION_RANGE_AND_BEARING (15, "On Station Range and Bearing"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** On Station xyz */
    // autogenerated using string template disenumpart2.txt
    ON_STATION_XYZ (16, "On Station xyz"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Air-to-Air Refueling Boom */
    // autogenerated using string template disenumpart2.txt
    AIR_TO_AIR_REFUELING_BOOM (17, "Air-to-Air Refueling Boom"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aerial Refueling Receptacle */
    // autogenerated using string template disenumpart2.txt
    AERIAL_REFUELING_RECEPTACLE (18, "Aerial Refueling Receptacle"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Port Side Refueling Drogue */
    // autogenerated using string template disenumpart2.txt
    PORT_SIDE_REFUELING_DROGUE (19, "Port Side Refueling Drogue"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Starboard Side Refueling Drogue */
    // autogenerated using string template disenumpart2.txt
    STARBOARD_SIDE_REFUELING_DROGUE (20, "Starboard Side Refueling Drogue"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Center Refueling Drogue */
    // autogenerated using string template disenumpart2.txt
    CENTER_REFUELING_DROGUE (21, "Center Refueling Drogue"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Air Refueling Probe */
    // autogenerated using string template disenumpart2.txt
    AIR_REFUELING_PROBE (22, "Air Refueling Probe");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    IsPartOfStationName(int value, String description)
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
    public static IsPartOfStationName getEnumForValue(int value)
    {
       for (IsPartOfStationName nextEnum : IsPartOfStationName.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum IsPartOfStationName");
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
    public static IsPartOfStationName unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static IsPartOfStationName unmarshalEnum (ByteBuffer byteBuffer) throws Exception
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
        return "IsPartOfStationName " + getValue() + " " + name(); 
    }
}
