/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt



package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Simulation Management with Reliability PDUs with reliability service levels in a DIS exercise are an alternative to the Simulation Management PDUs, and may or may not be required for participation in an DIS exercise,
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public abstract class SimulationManagementWithReliabilityFamilyPdu extends PduBase implements Serializable
{
   /** IDs the simulation or entity, either a simulation or an entity. Either 6.2.80 or 6.2.28 */
   protected SimulationIdentifier  originatingID = new SimulationIdentifier(); 

   /** simulation, all simulations, a special ID, or an entity. See 5.6.5 and 5.12.4 */
   protected SimulationIdentifier  receivingID = new SimulationIdentifier(); 


/** Constructor creates and configures a new instance object */
 public SimulationManagementWithReliabilityFamilyPdu()
 {
    setProtocolFamily( DISProtocolFamily.SIMULATION_MANAGEMENT_WITH_RELIABILITY );
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (originatingID != null)
       marshalSize += originatingID.getMarshalledSize();
   if (receivingID != null)
       marshalSize += receivingID.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link SimulationManagementWithReliabilityFamilyPdu#originatingID}
  * @param pOriginatingID new value of interest
  * @return same object to permit progressive setters */
public SimulationManagementWithReliabilityFamilyPdu setOriginatingID(SimulationIdentifier pOriginatingID)
{
    originatingID = pOriginatingID;
    return this;
}
/** Getter for {@link SimulationManagementWithReliabilityFamilyPdu#originatingID}
  * @return value of interest */
public SimulationIdentifier getOriginatingID()
{
    return originatingID;
}


/** Setter for {@link SimulationManagementWithReliabilityFamilyPdu#receivingID}
  * @param pReceivingID new value of interest
  * @return same object to permit progressive setters */
public SimulationManagementWithReliabilityFamilyPdu setReceivingID(SimulationIdentifier pReceivingID)
{
    receivingID = pReceivingID;
    return this;
}
/** Getter for {@link SimulationManagementWithReliabilityFamilyPdu#receivingID}
  * @return value of interest */
public SimulationIdentifier getReceivingID()
{
    return receivingID;
}


/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       originatingID.marshal(dos);
       receivingID.marshal(dos);
    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Deserializes an object from a DataInputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataInputStream
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += originatingID.unmarshal(dis);
        uPosition += receivingID.unmarshal(dis);
    }
    catch(Exception e)
    { 
      System.err.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if byteBuffer is too small
 * @throws java.nio.ReadOnlyBufferException if byteBuffer is read only
 * @see java.nio.ByteBuffer
 * @param byteBuffer The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   originatingID.marshal(byteBuffer);
   receivingID.marshal(byteBuffer);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute originatingID marked as not serialized
        originatingID.unmarshal(byteBuffer);
        // attribute receivingID marked as not serialized
        receivingID.unmarshal(byteBuffer);
    }
    catch (java.nio.BufferUnderflowException bue)
    {
        System.err.println("*** buffer underflow error while unmarshalling " + this.getClass().getName());
    }
    return getMarshalledSize();
}

 /*
  * Override of default equals method.  Calls equalsImpl() for content comparison.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final SimulationManagementWithReliabilityFamilyPdu rhs = (SimulationManagementWithReliabilityFamilyPdu)obj;

     if( ! (originatingID.equals( rhs.originatingID) )) ivarsEqual = false;
     if( ! (receivingID.equals( rhs.receivingID) )) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" originatingID:").append(originatingID); // writeOneToString
    sb.append(" receivingID:").append(receivingID); // writeOneToString

   return sb.toString();
 }
} // end of class
