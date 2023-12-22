/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt



package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * The unique designation of a simulation when using the 48-bit identifier format shall be specified by the Sim- ulation Identifier record. The reason that the 48-bit format is required in addition to the 32-bit simulation address format that actually identifies a specific simulation is because some 48-bit identifier fields in PDUs may contain either an Object Identifier, such as an Entity ID, or a Simulation Identifier. Section 6.2.80
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class SimulationIdentifier extends Object implements Serializable
{
   /** Simulation address  */
   protected SimulationAddress  simulationAddress = new SimulationAddress(); 

   /** This field shall be set to zero as there is no reference number associated with a Simulation Identifier. */
   protected short referenceNumber = (short)0;


/** Constructor creates and configures a new instance object */
 public SimulationIdentifier()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public synchronized int getMarshalledSize()
{
   int marshalSize = 0; 

   if (simulationAddress != null)
       marshalSize += simulationAddress.getMarshalledSize();
   marshalSize += 2;  // referenceNumber

   return marshalSize;
}


/** Setter for {@link SimulationIdentifier#simulationAddress}
  * @param pSimulationAddress new value of interest
  * @return same object to permit progressive setters */
public synchronized SimulationIdentifier setSimulationAddress(SimulationAddress pSimulationAddress)
{
    simulationAddress = pSimulationAddress;
    return this;
}
/** Getter for {@link SimulationIdentifier#simulationAddress}
  * @return value of interest */
public SimulationAddress getSimulationAddress()
{
    return simulationAddress;
}


/** Setter for {@link SimulationIdentifier#referenceNumber}
  * @param pReferenceNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized SimulationIdentifier setReferenceNumber(short pReferenceNumber)
{
    referenceNumber = pReferenceNumber;
    return this;
}
/** Utility setter for {@link SimulationIdentifier#referenceNumber}
  * @param pReferenceNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized SimulationIdentifier setReferenceNumber(int pReferenceNumber){
    referenceNumber = (short) pReferenceNumber;
    return this;
}
/** Getter for {@link SimulationIdentifier#referenceNumber}
  * @return value of interest */
public short getReferenceNumber()
{
    return referenceNumber; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public synchronized void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       simulationAddress.marshal(dos);
       dos.writeShort(referenceNumber);
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
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        uPosition += simulationAddress.unmarshal(dis);
        referenceNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
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
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   simulationAddress.marshal(byteBuffer);
   byteBuffer.putShort( (short)referenceNumber);
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
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    try
    {
        // attribute simulationAddress marked as not serialized
        simulationAddress.unmarshal(byteBuffer);
        // attribute referenceNumber marked as not serialized
        referenceNumber = (short)(byteBuffer.getShort() & 0xFFFF);
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
 public synchronized boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(!getClass().isAssignableFrom(obj.getClass())) //if(getClass() != obj.getClass())
        return false;

    return equalsImpl(obj);
 }

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public synchronized boolean equalsImpl(Object obj)
 {
     final SimulationIdentifier rhs = (SimulationIdentifier)obj;

     if( ! Objects.equals(simulationAddress, rhs.simulationAddress) ) return false;
     if( ! (referenceNumber == rhs.referenceNumber)) return false;
    return true;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" simulationAddress:").append(simulationAddress); // writeOneToString
    sb.append(" referenceNumber:").append(referenceNumber); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.simulationAddress,
	                     this.referenceNumber);
 }
} // end of SimulationIdentifier
