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
 * Common PDU fields for Radio Communications family
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class RadioCommsHeader extends Object implements Serializable
{
   /** ID of the entitythat is the source of the communication */
   protected EntityID  radioReferenceID = new EntityID(); 

   /** particular radio within an entity */
   protected short radioNumber;


/** Constructor creates and configures a new instance object */
 public RadioCommsHeader()
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

   if (radioReferenceID != null)
       marshalSize += radioReferenceID.getMarshalledSize();
   marshalSize += 2;  // radioNumber

   return marshalSize;
}


/** Setter for {@link RadioCommsHeader#radioReferenceID}
  * @param pRadioReferenceID new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioCommsHeader setRadioReferenceID(EntityID pRadioReferenceID)
{
    radioReferenceID = pRadioReferenceID;
    return this;
}
/** Getter for {@link RadioCommsHeader#radioReferenceID}
  * @return value of interest */
public EntityID getRadioReferenceID()
{
    return radioReferenceID;
}


/** Setter for {@link RadioCommsHeader#radioNumber}
  * @param pRadioNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioCommsHeader setRadioNumber(short pRadioNumber)
{
    radioNumber = pRadioNumber;
    return this;
}
/** Utility setter for {@link RadioCommsHeader#radioNumber}
  * @param pRadioNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized RadioCommsHeader setRadioNumber(int pRadioNumber){
    radioNumber = (short) pRadioNumber;
    return this;
}
/** Getter for {@link RadioCommsHeader#radioNumber}
  * @return value of interest */
public short getRadioNumber()
{
    return radioNumber; 
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
       radioReferenceID.marshal(dos);
       dos.writeShort(radioNumber);
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
        uPosition += radioReferenceID.unmarshal(dis);
        radioNumber = (short)dis.readUnsignedShort();
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
   radioReferenceID.marshal(byteBuffer);
   byteBuffer.putShort( (short)radioNumber);
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
        // attribute radioReferenceID marked as not serialized
        radioReferenceID.unmarshal(byteBuffer);
        // attribute radioNumber marked as not serialized
        radioNumber = (short)(byteBuffer.getShort() & 0xFFFF);
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
     final RadioCommsHeader rhs = (RadioCommsHeader)obj;

     if( ! Objects.equals(radioReferenceID, rhs.radioReferenceID) ) return false;
     if( ! (radioNumber == rhs.radioNumber)) return false;
    return true;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" radioReferenceID:").append(radioReferenceID); // writeOneToString
    sb.append(" radioNumber:").append(radioNumber); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.radioReferenceID,
	                     this.radioNumber);
 }
} // end of RadioCommsHeader
