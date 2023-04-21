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
 *  UID 73,
 * marshal size 32;
 * EventReportEventType has 19 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum EventReportEventType 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ran Out of Ammunition */
    // autogenerated using string template disenumpart2.txt
    RAN_OUT_OF_AMMUNITION (2, "Ran Out of Ammunition"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Killed in Action (KIA) */
    // autogenerated using string template disenumpart2.txt
    KILLED_IN_ACTION_KIA (3, "Killed in Action (KIA)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Damage */
    // autogenerated using string template disenumpart2.txt
    DAMAGE (4, "Damage"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mobility Disabled */
    // autogenerated using string template disenumpart2.txt
    MOBILITY_DISABLED (5, "Mobility Disabled"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fire Disabled */
    // autogenerated using string template disenumpart2.txt
    FIRE_DISABLED (6, "Fire Disabled"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ran Out of Fuel */
    // autogenerated using string template disenumpart2.txt
    RAN_OUT_OF_FUEL (7, "Ran Out of Fuel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Entity Initialization */
    // autogenerated using string template disenumpart2.txt
    ENTITY_INITIALIZATION (8, "Entity Initialization"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Request for Indirect Fire or CAS Mission */
    // autogenerated using string template disenumpart2.txt
    REQUEST_FOR_INDIRECT_FIRE_OR_CAS_MISSION (9, "Request for Indirect Fire or CAS Mission"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Indirect Fire or CAS Fire */
    // autogenerated using string template disenumpart2.txt
    INDIRECT_FIRE_OR_CAS_FIRE (10, "Indirect Fire or CAS Fire"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Minefield Entry */
    // autogenerated using string template disenumpart2.txt
    MINEFIELD_ENTRY (11, "Minefield Entry"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Minefield Detonation */
    // autogenerated using string template disenumpart2.txt
    MINEFIELD_DETONATION (12, "Minefield Detonation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Vehicle Master Power On */
    // autogenerated using string template disenumpart2.txt
    VEHICLE_MASTER_POWER_ON (13, "Vehicle Master Power On"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Vehicle Master Power Off */
    // autogenerated using string template disenumpart2.txt
    VEHICLE_MASTER_POWER_OFF (14, "Vehicle Master Power Off"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aggregate State Change Requested */
    // autogenerated using string template disenumpart2.txt
    AGGREGATE_STATE_CHANGE_REQUESTED (15, "Aggregate State Change Requested"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Prevent Collision / Detonation */
    // autogenerated using string template disenumpart2.txt
    PREVENT_COLLISION_DETONATION (16, "Prevent Collision / Detonation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ownership Report */
    // autogenerated using string template disenumpart2.txt
    OWNERSHIP_REPORT (17, "Ownership Report"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Radar Perception */
    // autogenerated using string template disenumpart2.txt
    RADAR_PERCEPTION (18, "Radar Perception"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Detect */
    // autogenerated using string template disenumpart2.txt
    DETECT (19, "Detect");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    EventReportEventType(int value, String description)
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
      return 32;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static EventReportEventType getEnumForValue(int value)
    {
       for (EventReportEventType nextEnum : EventReportEventType.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum EventReportEventType");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_32.txt

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeInt(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output */
    public void marshal(ByteBuffer byteBuffer)
    {
        byteBuffer.putInt(getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static EventReportEventType unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readInt());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @return enumeration of interest */
    public static EventReportEventType unmarshalEnum (ByteBuffer byteBuffer)
    {
        return getEnumForValue(byteBuffer.getInt());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 4; // 32 bits
    }
    
    @Override
    public String toString()
    {
        return "EventReportEventType: " + getValue() + " " + name();
    }
}
