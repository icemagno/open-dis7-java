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
 * 5.5.8 Used to communicate the canceling of a resupply service provided through logistics support.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class ResupplyCancelPdu extends LogisticsFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "ResupplyCancelPdu";
   
   /** Requesting entity, Section 7.4.5 */
   protected EntityID  receivingEntityID = new EntityID(); 

   /** Supplying entity, Section 7.4.5 */
   protected EntityID  supplyingEntityID = new EntityID(); 


/** Constructor creates and configures a new instance object */
 public ResupplyCancelPdu()
 {
    setPduType( DisPduType.RESUPPLY_CANCEL );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized ResupplyCancelPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized ResupplyCancelPdu copyByteBuffer()
 {
     ResupplyCancelPdu newCopy = new ResupplyCancelPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("ResupplyCancelPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized ResupplyCancelPdu copyDataOutputStream()
 {
     ResupplyCancelPdu newCopy = new ResupplyCancelPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("ResupplyCancelPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("ResupplyCancelPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (receivingEntityID != null)
       marshalSize += receivingEntityID.getMarshalledSize();
   if (supplyingEntityID != null)
       marshalSize += supplyingEntityID.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link ResupplyCancelPdu#receivingEntityID}
  * @param pReceivingEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized ResupplyCancelPdu setReceivingEntityID(EntityID pReceivingEntityID)
{
    receivingEntityID = pReceivingEntityID;
    return this;
}
/** Getter for {@link ResupplyCancelPdu#receivingEntityID}
  * @return value of interest */
public EntityID getReceivingEntityID()
{
    return receivingEntityID;
}


/** Setter for {@link ResupplyCancelPdu#supplyingEntityID}
  * @param pSupplyingEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized ResupplyCancelPdu setSupplyingEntityID(EntityID pSupplyingEntityID)
{
    supplyingEntityID = pSupplyingEntityID;
    return this;
}
/** Getter for {@link ResupplyCancelPdu#supplyingEntityID}
  * @return value of interest */
public EntityID getSupplyingEntityID()
{
    return supplyingEntityID;
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
       receivingEntityID.marshal(dos);
       supplyingEntityID.marshal(dos);
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
        uPosition += receivingEntityID.unmarshal(dis);
        uPosition += supplyingEntityID.unmarshal(dis);
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
   receivingEntityID.marshal(byteBuffer);
   supplyingEntityID.marshal(byteBuffer);
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
        // attribute receivingEntityID marked as not serialized
        receivingEntityID.unmarshal(byteBuffer);
        // attribute supplyingEntityID marked as not serialized
        supplyingEntityID.unmarshal(byteBuffer);
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

     final ResupplyCancelPdu rhs = (ResupplyCancelPdu)obj;

     if( ! (receivingEntityID.equals( rhs.receivingEntityID) )) ivarsEqual = false;
     if( ! (supplyingEntityID.equals( rhs.supplyingEntityID) )) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" receivingEntityID:").append(receivingEntityID); // writeOneToString
    sb.append(" supplyingEntityID:").append(supplyingEntityID); // writeOneToString

   return sb.toString();
 }
} // end of class
