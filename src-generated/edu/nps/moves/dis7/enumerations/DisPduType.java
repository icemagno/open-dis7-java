// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 4,
 * marshal size 8;
 * DISPDUType has 73 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum DisPduType 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Entity State */
    // autogenerated using string template disenumpart2.txt
    ENTITY_STATE (1, "Entity State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fire */
    // autogenerated using string template disenumpart2.txt
    FIRE (2, "Fire"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Detonation */
    // autogenerated using string template disenumpart2.txt
    DETONATION (3, "Detonation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Collision */
    // autogenerated using string template disenumpart2.txt
    COLLISION (4, "Collision"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Service Request */
    // autogenerated using string template disenumpart2.txt
    SERVICE_REQUEST (5, "Service Request"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Resupply Offer */
    // autogenerated using string template disenumpart2.txt
    RESUPPLY_OFFER (6, "Resupply Offer"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Resupply Received */
    // autogenerated using string template disenumpart2.txt
    RESUPPLY_RECEIVED (7, "Resupply Received"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Resupply Cancel */
    // autogenerated using string template disenumpart2.txt
    RESUPPLY_CANCEL (8, "Resupply Cancel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Repair Complete */
    // autogenerated using string template disenumpart2.txt
    REPAIR_COMPLETE (9, "Repair Complete"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Repair Response */
    // autogenerated using string template disenumpart2.txt
    REPAIR_RESPONSE (10, "Repair Response"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Create Entity */
    // autogenerated using string template disenumpart2.txt
    CREATE_ENTITY (11, "Create Entity"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Remove Entity */
    // autogenerated using string template disenumpart2.txt
    REMOVE_ENTITY (12, "Remove Entity"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Start/Resume */
    // autogenerated using string template disenumpart2.txt
    START_RESUME (13, "Start/Resume"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Stop/Freeze */
    // autogenerated using string template disenumpart2.txt
    STOP_FREEZE (14, "Stop/Freeze"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Acknowledge */
    // autogenerated using string template disenumpart2.txt
    ACKNOWLEDGE (15, "Acknowledge"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Action Request */
    // autogenerated using string template disenumpart2.txt
    ACTION_REQUEST (16, "Action Request"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Action Response */
    // autogenerated using string template disenumpart2.txt
    ACTION_RESPONSE (17, "Action Response"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Data Query */
    // autogenerated using string template disenumpart2.txt
    DATA_QUERY (18, "Data Query"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Set Data */
    // autogenerated using string template disenumpart2.txt
    SET_DATA (19, "Set Data"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Data */
    // autogenerated using string template disenumpart2.txt
    DATA (20, "Data"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Event Report */
    // autogenerated using string template disenumpart2.txt
    EVENT_REPORT (21, "Event Report"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Comment */
    // autogenerated using string template disenumpart2.txt
    COMMENT (22, "Comment"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Electromagnetic Emission */
    // autogenerated using string template disenumpart2.txt
    ELECTROMAGNETIC_EMISSION (23, "Electromagnetic Emission"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Designator */
    // autogenerated using string template disenumpart2.txt
    DESIGNATOR (24, "Designator"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Transmitter */
    // autogenerated using string template disenumpart2.txt
    TRANSMITTER (25, "Transmitter"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Signal */
    // autogenerated using string template disenumpart2.txt
    SIGNAL (26, "Signal"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Receiver */
    // autogenerated using string template disenumpart2.txt
    RECEIVER (27, "Receiver"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** IFF */
    // autogenerated using string template disenumpart2.txt
    IDENTIFICATION_FRIEND_OR_FOE (28, "IFF"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Underwater Acoustic */
    // autogenerated using string template disenumpart2.txt
    UNDERWATER_ACOUSTIC (29, "Underwater Acoustic"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Supplemental Emission / Entity State */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Supplemental Emission / Entity State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Intercom Signal */
    // autogenerated using string template disenumpart2.txt
    INTERCOM_SIGNAL (31, "Intercom Signal"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Intercom Control */
    // autogenerated using string template disenumpart2.txt
    INTERCOM_CONTROL (32, "Intercom Control"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aggregate State */
    // autogenerated using string template disenumpart2.txt
    AGGREGATE_STATE (33, "Aggregate State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** IsGroupOf */
    // autogenerated using string template disenumpart2.txt
    ISGROUPOF (34, "IsGroupOf"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Transfer Ownership */
    // autogenerated using string template disenumpart2.txt
    TRANSFER_OWNERSHIP (35, "Transfer Ownership"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** IsPartOf */
    // autogenerated using string template disenumpart2.txt
    ISPARTOF (36, "IsPartOf"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Minefield State */
    // autogenerated using string template disenumpart2.txt
    MINEFIELD_STATE (37, "Minefield State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Minefield Query */
    // autogenerated using string template disenumpart2.txt
    MINEFIELD_QUERY (38, "Minefield Query"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Minefield Data */
    // autogenerated using string template disenumpart2.txt
    MINEFIELD_DATA (39, "Minefield Data"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Minefield Response NACK */
    // autogenerated using string template disenumpart2.txt
    MINEFIELD_RESPONSE_NACK (40, "Minefield Response NACK"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Environmental Process */
    // autogenerated using string template disenumpart2.txt
    ENVIRONMENTAL_PROCESS (41, "Environmental Process"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gridded Data */
    // autogenerated using string template disenumpart2.txt
    GRIDDED_DATA (42, "Gridded Data"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Point Object State */
    // autogenerated using string template disenumpart2.txt
    POINT_OBJECT_STATE (43, "Point Object State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Linear Object State */
    // autogenerated using string template disenumpart2.txt
    LINEAR_OBJECT_STATE (44, "Linear Object State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Areal Object State */
    // autogenerated using string template disenumpart2.txt
    AREAL_OBJECT_STATE (45, "Areal Object State"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TSPI */
    // autogenerated using string template disenumpart2.txt
    TIME_SPACE_POSITION_INFORMATION (46, "TSPI"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Appearance */
    // autogenerated using string template disenumpart2.txt
    APPEARANCE (47, "Appearance"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Articulated Parts */
    // autogenerated using string template disenumpart2.txt
    ARTICULATED_PARTS (48, "Articulated Parts"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** LE Fire */
    // autogenerated using string template disenumpart2.txt
    LIVE_ENTITY_FIRE (49, "LE Fire"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** LE Detonation */
    // autogenerated using string template disenumpart2.txt
    LIVE_ENTITY_DETONATION (50, "LE Detonation"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Create Entity-R */
    // autogenerated using string template disenumpart2.txt
    CREATE_ENTITY_RELIABLE (51, "Create Entity-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Remove Entity-R */
    // autogenerated using string template disenumpart2.txt
    REMOVE_ENTITY_RELIABLE (52, "Remove Entity-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Start/Resume-R */
    // autogenerated using string template disenumpart2.txt
    START_RESUME_RELIABLE (53, "Start/Resume-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Stop/Freeze-R */
    // autogenerated using string template disenumpart2.txt
    STOP_FREEZE_RELIABLE (54, "Stop/Freeze-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Acknowledge-R */
    // autogenerated using string template disenumpart2.txt
    ACKNOWLEDGE_RELIABLE (55, "Acknowledge-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Action Request-R */
    // autogenerated using string template disenumpart2.txt
    ACTION_REQUEST_RELIABLE (56, "Action Request-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Action Response-R */
    // autogenerated using string template disenumpart2.txt
    ACTION_RESPONSE_RELIABLE (57, "Action Response-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Data Query-R */
    // autogenerated using string template disenumpart2.txt
    DATA_QUERY_RELIABLE (58, "Data Query-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Set Data-R */
    // autogenerated using string template disenumpart2.txt
    SET_DATA_RELIABLE (59, "Set Data-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Data-R */
    // autogenerated using string template disenumpart2.txt
    DATA_RELIABLE (60, "Data-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Event Report-R */
    // autogenerated using string template disenumpart2.txt
    EVENT_REPORT_RELIABLE (61, "Event Report-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Comment-R */
    // autogenerated using string template disenumpart2.txt
    COMMENT_RELIABLE (62, "Comment-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Record-R */
    // autogenerated using string template disenumpart2.txt
    RECORD_RELIABLE (63, "Record-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Set Record-R */
    // autogenerated using string template disenumpart2.txt
    SET_RECORD_RELIABLE	 (64, "Set Record-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Record Query-R */
    // autogenerated using string template disenumpart2.txt
    RECORD_QUERY_RELIABLE (65, "Record Query-R"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Collision-Elastic */
    // autogenerated using string template disenumpart2.txt
    COLLISION_ELASTIC (66, "Collision-Elastic"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Entity State Update */
    // autogenerated using string template disenumpart2.txt
    ENTITY_STATE_UPDATE (67, "Entity State Update"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Directed Energy Fire */
    // autogenerated using string template disenumpart2.txt
    DIRECTED_ENERGY_FIRE (68, "Directed Energy Fire"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Entity Damage Status */
    // autogenerated using string template disenumpart2.txt
    ENTITY_DAMAGE_STATUS (69, "Entity Damage Status"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Information Operations Action */
    // autogenerated using string template disenumpart2.txt
    INFORMATION_OPERATIONS_ACTION (70, "Information Operations Action"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Information Operations Report */
    // autogenerated using string template disenumpart2.txt
    INFORMATION_OPERATIONS_REPORT (71, "Information Operations Report"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Attribute */
    // autogenerated using string template disenumpart2.txt
    ATTRIBUTE (72, "Attribute");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    DisPduType(int value, String description)
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
    public static DisPduType getEnumForValue(int value)
    {
       for (DisPduType nextEnum : DisPduType.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum DisPduType");
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
    public static DisPduType unmarshalEnum (DataInputStream dis) throws Exception
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
    public static DisPduType unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
