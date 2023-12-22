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
 *  UID 72,
 * marshal size 32;
 * ActionResponseRequestStatus has 17 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum ActionResponseRequestStatus 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Pending */
    // autogenerated using string template disenumpart2.txt
    PENDING (1, "Pending"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Executing */
    // autogenerated using string template disenumpart2.txt
    EXECUTING (2, "Executing"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Partially Complete */
    // autogenerated using string template disenumpart2.txt
    PARTIALLY_COMPLETE (3, "Partially Complete"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Complete */
    // autogenerated using string template disenumpart2.txt
    COMPLETE (4, "Complete"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Request rejected */
    // autogenerated using string template disenumpart2.txt
    REQUEST_REJECTED (5, "Request rejected"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Retransmit request now */
    // autogenerated using string template disenumpart2.txt
    RETRANSMIT_REQUEST_NOW (6, "Retransmit request now"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Retransmit request later */
    // autogenerated using string template disenumpart2.txt
    RETRANSMIT_REQUEST_LATER (7, "Retransmit request later"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Invalid time parameters */
    // autogenerated using string template disenumpart2.txt
    INVALID_TIME_PARAMETERS (8, "Invalid time parameters"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Simulation time exceeded */
    // autogenerated using string template disenumpart2.txt
    SIMULATION_TIME_EXCEEDED (9, "Simulation time exceeded"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Request done */
    // autogenerated using string template disenumpart2.txt
    REQUEST_DONE (10, "Request done"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TACCSF LOS Reply-Type 1 */
    // autogenerated using string template disenumpart2.txt
    TACCSF_LOS_REPLY_TYPE_1 (100, "TACCSF LOS Reply-Type 1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TACCSF LOS Reply-Type 2 */
    // autogenerated using string template disenumpart2.txt
    TACCSF_LOS_REPLY_TYPE_2 (101, "TACCSF LOS Reply-Type 2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Join Exercise Request Rejected */
    // autogenerated using string template disenumpart2.txt
    JOIN_EXERCISE_REQUEST_REJECTED (201, "Join Exercise Request Rejected"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** OK, The requested range is separated from and chosen to be non-intersecting with values in the 2006 Enum Document. */
    // autogenerated using string template disenumpart2.txt
    OK (1131, "OK"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Error */
    // autogenerated using string template disenumpart2.txt
    ERROR (1132, "Error"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Delay */
    // autogenerated using string template disenumpart2.txt
    DELAY (1133, "Delay");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    ActionResponseRequestStatus(int value, String description)
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
    public static ActionResponseRequestStatus getEnumForValue(int value)
    {
       for (ActionResponseRequestStatus nextEnum : ActionResponseRequestStatus.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum ActionResponseRequestStatus");
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
    public static ActionResponseRequestStatus unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readInt());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @return enumeration of interest */
    public static ActionResponseRequestStatus unmarshalEnum (ByteBuffer byteBuffer)
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
        return "ActionResponseRequestStatus: " + getValue() + " " + name();
    }
}
