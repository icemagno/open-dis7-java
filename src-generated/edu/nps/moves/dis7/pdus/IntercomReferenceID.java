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
 * unique reference ID for this intercom
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class IntercomReferenceID extends Object implements Serializable
{
   /** siteNumber is an undescribed parameter... */
   protected short siteNumber;

   /** applicationNumber is an undescribed parameter... */
   protected short applicationNumber;

   /** referenceNumber is an undescribed parameter... */
   protected short referenceNumber;


/** Constructor creates and configures a new instance object */
 public IntercomReferenceID()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 2;  // siteNumber
   marshalSize += 2;  // applicationNumber
   marshalSize += 2;  // referenceNumber

   return marshalSize;
}


/** Setter for {@link IntercomReferenceID#siteNumber}
  * @param pSiteNumber new value of interest
  * @return same object to permit progressive setters */
public IntercomReferenceID setSiteNumber(short pSiteNumber)
{
    siteNumber = pSiteNumber;
    return this;
}
/** Utility setter for {@link IntercomReferenceID#siteNumber}
  * @param pSiteNumber new value of interest
  * @return same object to permit progressive setters */
public IntercomReferenceID setSiteNumber(int pSiteNumber){
    siteNumber = (short) pSiteNumber;
    return this;
}
/** Getter for {@link IntercomReferenceID#siteNumber}
  * @return value of interest */
public short getSiteNumber()
{
    return siteNumber; 
}

/** Setter for {@link IntercomReferenceID#applicationNumber}
  * @param pApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public IntercomReferenceID setApplicationNumber(short pApplicationNumber)
{
    applicationNumber = pApplicationNumber;
    return this;
}
/** Utility setter for {@link IntercomReferenceID#applicationNumber}
  * @param pApplicationNumber new value of interest
  * @return same object to permit progressive setters */
public IntercomReferenceID setApplicationNumber(int pApplicationNumber){
    applicationNumber = (short) pApplicationNumber;
    return this;
}
/** Getter for {@link IntercomReferenceID#applicationNumber}
  * @return value of interest */
public short getApplicationNumber()
{
    return applicationNumber; 
}

/** Setter for {@link IntercomReferenceID#referenceNumber}
  * @param pReferenceNumber new value of interest
  * @return same object to permit progressive setters */
public IntercomReferenceID setReferenceNumber(short pReferenceNumber)
{
    referenceNumber = pReferenceNumber;
    return this;
}
/** Utility setter for {@link IntercomReferenceID#referenceNumber}
  * @param pReferenceNumber new value of interest
  * @return same object to permit progressive setters */
public IntercomReferenceID setReferenceNumber(int pReferenceNumber){
    referenceNumber = (short) pReferenceNumber;
    return this;
}
/** Getter for {@link IntercomReferenceID#referenceNumber}
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
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeShort(siteNumber);
       dos.writeShort(applicationNumber);
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
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        siteNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        applicationNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
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
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   byteBuffer.putShort( (short)siteNumber);
   byteBuffer.putShort( (short)applicationNumber);
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
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    try
    {
        // attribute siteNumber marked as not serialized
        siteNumber = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute applicationNumber marked as not serialized
        applicationNumber = (short)(byteBuffer.getShort() & 0xFFFF);
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

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final IntercomReferenceID rhs = (IntercomReferenceID)obj;

     if( ! (siteNumber == rhs.siteNumber)) ivarsEqual = false;
     if( ! (applicationNumber == rhs.applicationNumber)) ivarsEqual = false;
     if( ! (referenceNumber == rhs.referenceNumber)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" siteNumber:").append(siteNumber); // writeOneToString
    sb.append(" applicationNumber:").append(applicationNumber); // writeOneToString
    sb.append(" referenceNumber:").append(referenceNumber); // writeOneToString

   return sb.toString();
 }
} // end of class
