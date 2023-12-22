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
 * 5.12.4.6 Serves the same function as the Acknowledge PDU but is used to acknowledge the receipt of a Create Entity-R PDU, a Remove Entity-R PDU, a Start/Resume-R PDU, or a Stop/Freeze-R PDU.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class AcknowledgeRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "AcknowledgeRPdu";
   
   /** ack flags uid 69 */
   protected AcknowledgeAcknowledgeFlag acknowledgeFlag = AcknowledgeAcknowledgeFlag.values()[0];

   /** response flags uid 70 */
   protected AcknowledgeResponseFlag responseFlag = AcknowledgeResponseFlag.values()[0];

   /** Request ID provides a unique identifier */
   protected int requestID;


/** Constructor creates and configures a new instance object */
 public AcknowledgeRPdu()
 {
    setPduType( DisPduType.ACKNOWLEDGE_RELIABLE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized AcknowledgeRPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized AcknowledgeRPdu copyByteBuffer()
 {
     AcknowledgeRPdu newCopy = new AcknowledgeRPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("AcknowledgeRPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized AcknowledgeRPdu copyDataOutputStream()
 {
     AcknowledgeRPdu newCopy = new AcknowledgeRPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("AcknowledgeRPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("AcknowledgeRPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (acknowledgeFlag != null)
       marshalSize += acknowledgeFlag.getMarshalledSize();
   if (responseFlag != null)
       marshalSize += responseFlag.getMarshalledSize();
   marshalSize += 4;  // requestID

   return marshalSize;
}


/** Setter for {@link AcknowledgeRPdu#acknowledgeFlag}
  * @param pAcknowledgeFlag new value of interest
  * @return same object to permit progressive setters */
public synchronized AcknowledgeRPdu setAcknowledgeFlag(AcknowledgeAcknowledgeFlag pAcknowledgeFlag)
{
    acknowledgeFlag = pAcknowledgeFlag;
    return this;
}
/** Getter for {@link AcknowledgeRPdu#acknowledgeFlag}
  * @return value of interest */
public AcknowledgeAcknowledgeFlag getAcknowledgeFlag()
{
    return acknowledgeFlag; 
}

/** Setter for {@link AcknowledgeRPdu#responseFlag}
  * @param pResponseFlag new value of interest
  * @return same object to permit progressive setters */
public synchronized AcknowledgeRPdu setResponseFlag(AcknowledgeResponseFlag pResponseFlag)
{
    responseFlag = pResponseFlag;
    return this;
}
/** Getter for {@link AcknowledgeRPdu#responseFlag}
  * @return value of interest */
public AcknowledgeResponseFlag getResponseFlag()
{
    return responseFlag; 
}

/** Setter for {@link AcknowledgeRPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public synchronized AcknowledgeRPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Getter for {@link AcknowledgeRPdu#requestID}
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
       acknowledgeFlag.marshal(dos);
       responseFlag.marshal(dos);
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
        acknowledgeFlag = AcknowledgeAcknowledgeFlag.unmarshalEnum(dis);
        uPosition += acknowledgeFlag.getMarshalledSize();
        responseFlag = AcknowledgeResponseFlag.unmarshalEnum(dis);
        uPosition += responseFlag.getMarshalledSize();
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
   acknowledgeFlag.marshal(byteBuffer);
   responseFlag.marshal(byteBuffer);
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
        // attribute acknowledgeFlag marked as not serialized
        acknowledgeFlag = AcknowledgeAcknowledgeFlag.unmarshalEnum(byteBuffer);
        // attribute responseFlag marked as not serialized
        responseFlag = AcknowledgeResponseFlag.unmarshalEnum(byteBuffer);
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
     final AcknowledgeRPdu rhs = (AcknowledgeRPdu)obj;

     if( ! (acknowledgeFlag == rhs.acknowledgeFlag)) return false;
     if( ! (responseFlag == rhs.responseFlag)) return false;
     if( ! (requestID == rhs.requestID)) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" acknowledgeFlag:").append(acknowledgeFlag); // writeOneToString
    sb.append(" responseFlag:").append(responseFlag); // writeOneToString
    sb.append(" requestID:").append(requestID); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.acknowledgeFlag,
	                     this.responseFlag,
	                     this.requestID);
 }
} // end of AcknowledgeRPdu
