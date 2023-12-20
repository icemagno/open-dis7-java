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
import java.nio.ByteBuffer;

/**
 * Section 7.5.5. The stopping or freezing of an entity/exercise shall be communicated using a Stop/Freeze PDU. See 5.6.5.5
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class StopFreezePdu extends SimulationManagementFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "StopFreezePdu";
   
   /** real-world(UTC) time at which the entity shall stop or freeze in the exercise */
   protected ClockTime  realWorldTime = new ClockTime(); 

   /** Reason the simulation was stopped or frozen (see section 7 of SISO-REF-010) represented by an 8-bit enumeration uid 67 */
   protected StopFreezeReason reason = StopFreezeReason.values()[0];

   /** Internal behavior of the entity (or simulation) and its appearance while frozen to the other participants uid 68 */
   protected StopFreezeFrozenBehavior frozenBehavior = new StopFreezeFrozenBehavior();

   /** padding */
   protected short padding1 = (short)0;

   /** Request ID that is unique */
   protected int requestID;


/** Constructor creates and configures a new instance object */
 public StopFreezePdu()
 {
    setPduType( DisPduType.STOP_FREEZE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized StopFreezePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized StopFreezePdu copyByteBuffer()
 {
     StopFreezePdu newCopy = new StopFreezePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("StopFreezePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace(System.err);
         System.exit(-1); // TODO: Abruptly ending VM not a good practice
     }
     return newCopy;
 }

/** byteArrayOutputStream (baos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/** dataOutputStream (dos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected DataOutputStream      dataOutputStream      = new DataOutputStream(byteArrayOutputStream);

/** copy method creates a deep copy of current object using DataOutputStream methods.
 * @return deep copy of PDU */
 public synchronized StopFreezePdu copyDataOutputStream()
 {
     StopFreezePdu newCopy = new StopFreezePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("StopFreezePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace(System.err);
         System.exit(-1); // TODO: Abruptly ending VM not a good practice
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.err.println("StopFreezePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
@Override
public synchronized int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (realWorldTime != null)
       marshalSize += realWorldTime.getMarshalledSize();
   if (reason != null)
       marshalSize += reason.getMarshalledSize();
   if (frozenBehavior != null)
       marshalSize += frozenBehavior.getMarshalledSize();
   marshalSize += 2;  // padding1
   marshalSize += 4;  // requestID

   return marshalSize;
}


/** Setter for {@link StopFreezePdu#realWorldTime}
  * @param pRealWorldTime new value of interest
  * @return same object to permit progressive setters */
public synchronized StopFreezePdu setRealWorldTime(ClockTime pRealWorldTime)
{
    realWorldTime = pRealWorldTime;
    return this;
}
/** Getter for {@link StopFreezePdu#realWorldTime}
  * @return value of interest */
public ClockTime getRealWorldTime()
{
    return realWorldTime;
}


/** Setter for {@link StopFreezePdu#reason}
  * @param pReason new value of interest
  * @return same object to permit progressive setters */
public synchronized StopFreezePdu setReason(StopFreezeReason pReason)
{
    reason = pReason;
    return this;
}
/** Getter for {@link StopFreezePdu#reason}
  * @return value of interest */
public StopFreezeReason getReason()
{
    return reason; 
}

/** Setter for {@link StopFreezePdu#frozenBehavior}
  * @param pFrozenBehavior new value of interest
  * @return same object to permit progressive setters */
public synchronized StopFreezePdu setFrozenBehavior(StopFreezeFrozenBehavior pFrozenBehavior)
{
    frozenBehavior = pFrozenBehavior;
    return this;
}
/** Getter for {@link StopFreezePdu#frozenBehavior}
  * @return value of interest */
public StopFreezeFrozenBehavior getFrozenBehavior()
{
    return frozenBehavior; 
}

/** Setter for {@link StopFreezePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public synchronized StopFreezePdu setPadding1(short pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link StopFreezePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public synchronized StopFreezePdu setPadding1(int pPadding1){
    padding1 = (short) pPadding1;
    return this;
}
/** Getter for {@link StopFreezePdu#padding1}
  * @return value of interest */
public short getPadding1()
{
    return padding1; 
}

/** Setter for {@link StopFreezePdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public synchronized StopFreezePdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Getter for {@link StopFreezePdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
@Override
public synchronized void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       realWorldTime.marshal(dos);
       reason.marshal(dos);
       frozenBehavior.marshal(dos);
       dos.writeShort(padding1);
       dos.writeInt(requestID);
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
@Override
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += realWorldTime.unmarshal(dis);
        reason = StopFreezeReason.unmarshalEnum(dis);
        uPosition += reason.getMarshalledSize();
        uPosition += frozenBehavior.unmarshal(dis);
        padding1 = (short)dis.readUnsignedShort();
        uPosition += 2;
        requestID = dis.readInt();
        uPosition += 4;
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
@Override
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   realWorldTime.marshal(byteBuffer);
   reason.marshal(byteBuffer);
   frozenBehavior.marshal(byteBuffer);
   byteBuffer.putShort( (short)padding1);
   byteBuffer.putInt( (int)requestID);
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
@Override
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute realWorldTime marked as not serialized
        realWorldTime.unmarshal(byteBuffer);
        // attribute reason marked as not serialized
        reason = StopFreezeReason.unmarshalEnum(byteBuffer);
        // attribute frozenBehavior marked as not serialized
        frozenBehavior.unmarshal(byteBuffer);
        // attribute padding1 marked as not serialized
        padding1 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute requestID marked as not serialized
        requestID = byteBuffer.getInt();
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

@Override
 public synchronized boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final StopFreezePdu rhs = (StopFreezePdu)obj;

     if( ! (realWorldTime.equals( rhs.realWorldTime) )) ivarsEqual = false;
     if( ! (reason == rhs.reason)) ivarsEqual = false;
     if( ! (frozenBehavior.equals( rhs.frozenBehavior) )) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" realWorldTime:").append(realWorldTime); // writeOneToString
    sb.append(" reason:").append(reason); // writeOneToString
    sb.append(" frozenBehavior:").append(frozenBehavior); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" requestID:").append(requestID); // writeOneToString

   return sb.toString();
 }
} // end of class
