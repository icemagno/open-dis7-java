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
 *  UID 330,
 * marshal size 8;
 * EntityAssociationAssociationType has 15 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum EntityAssociationAssociationType 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Target Entity */
    // autogenerated using string template disenumpart2.txt
    TARGET_ENTITY (1, "Target Entity"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Target Location */
    // autogenerated using string template disenumpart2.txt
    TARGET_LOCATION (2, "Target Location"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Home Base Location */
    // autogenerated using string template disenumpart2.txt
    HOME_BASE_LOCATION (3, "Home Base Location"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CAP Point Location */
    // autogenerated using string template disenumpart2.txt
    CAP_POINT_LOCATION (4, "CAP Point Location"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Flight Leader */
    // autogenerated using string template disenumpart2.txt
    FLIGHT_LEADER (5, "Flight Leader"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Flight Member */
    // autogenerated using string template disenumpart2.txt
    FLIGHT_MEMBER (6, "Flight Member"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** IP Point */
    // autogenerated using string template disenumpart2.txt
    IP_POINT (7, "IP Point"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Rendezvous Point */
    // autogenerated using string template disenumpart2.txt
    RENDEZVOUS_POINT (8, "Rendezvous Point"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** On-Station Location */
    // autogenerated using string template disenumpart2.txt
    ON_STATION_LOCATION (9, "On-Station Location"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Landing Zone Location */
    // autogenerated using string template disenumpart2.txt
    LANDING_ZONE_LOCATION (10, "Landing Zone Location"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Downed Pilot */
    // autogenerated using string template disenumpart2.txt
    DOWNED_PILOT (11, "Downed Pilot"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tanker Entity that Is Currently Refueling the Transferred Entity */
    // autogenerated using string template disenumpart2.txt
    TANKER_ENTITY_THAT_IS_CURRENTLY_REFUELING_THE_TRANSFERRED_ENTITY (12, "Tanker Entity that Is Currently Refueling the Transferred Entity"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tanker Entity the Transferred Entity Is Headed towards to Refuel */
    // autogenerated using string template disenumpart2.txt
    TANKER_ENTITY_THE_TRANSFERRED_ENTITY_IS_HEADED_TOWARDS_TO_REFUEL (13, "Tanker Entity the Transferred Entity Is Headed towards to Refuel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Entity Headed towards to Join Up With */
    // autogenerated using string template disenumpart2.txt
    ENTITY_HEADED_TOWARDS_TO_JOIN_UP_WITH (14, "Entity Headed towards to Join Up With");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    EntityAssociationAssociationType(int value, String description)
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
    public static EntityAssociationAssociationType getEnumForValue(int value)
    {
       for (EntityAssociationAssociationType nextEnum : EntityAssociationAssociationType.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum EntityAssociationAssociationType");
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
    public static EntityAssociationAssociationType unmarshalEnum (DataInputStream dis) throws Exception
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
    public static EntityAssociationAssociationType unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
