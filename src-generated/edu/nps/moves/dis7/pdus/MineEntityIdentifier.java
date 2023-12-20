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
 * The unique designation of a mine contained in the Minefield Data PDU. No espdus are issued for mine entities.  Section 6.2.55 
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class MineEntityIdentifier extends Object implements Serializable
{
   /** simulationAddress is an undescribed parameter... */
   protected SimulationAddress  simulationAddress = new SimulationAddress(); 

   /** mineEntityNumber is an undescribed parameter... */
   protected short mineEntityNumber;


/** Constructor creates and configures a new instance object */
 public MineEntityIdentifier()
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
   marshalSize += 2;  // mineEntityNumber

   return marshalSize;
}


/** Setter for {@link MineEntityIdentifier#simulationAddress}
  * @param pSimulationAddress new value of interest
  * @return same object to permit progressive setters */
public synchronized MineEntityIdentifier setSimulationAddress(SimulationAddress pSimulationAddress)
{
    simulationAddress = pSimulationAddress;
    return this;
}
/** Getter for {@link MineEntityIdentifier#simulationAddress}
  * @return value of interest */
public SimulationAddress getSimulationAddress()
{
    return simulationAddress;
}


/** Setter for {@link MineEntityIdentifier#mineEntityNumber}
  * @param pMineEntityNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized MineEntityIdentifier setMineEntityNumber(short pMineEntityNumber)
{
    mineEntityNumber = pMineEntityNumber;
    return this;
}
/** Utility setter for {@link MineEntityIdentifier#mineEntityNumber}
  * @param pMineEntityNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized MineEntityIdentifier setMineEntityNumber(int pMineEntityNumber){
    mineEntityNumber = (short) pMineEntityNumber;
    return this;
}
/** Getter for {@link MineEntityIdentifier#mineEntityNumber}
  * @return value of interest */
public short getMineEntityNumber()
{
    return mineEntityNumber; 
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
       dos.writeShort(mineEntityNumber);
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
        mineEntityNumber = (short)dis.readUnsignedShort();
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
   byteBuffer.putShort( (short)mineEntityNumber);
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
        // attribute mineEntityNumber marked as not serialized
        mineEntityNumber = (short)(byteBuffer.getShort() & 0xFFFF);
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
     boolean ivarsEqual = true;

     final MineEntityIdentifier rhs = (MineEntityIdentifier)obj;

     if( ! (simulationAddress.equals( rhs.simulationAddress) )) ivarsEqual = false;
     if( ! (mineEntityNumber == rhs.mineEntityNumber)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" simulationAddress:").append(simulationAddress); // writeOneToString
    sb.append(" mineEntityNumber:").append(mineEntityNumber); // writeOneToString

   return sb.toString();
 }
} // end of class
