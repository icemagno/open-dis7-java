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
 * 5.10.5 Contains information about the requesting entity and the PDU(s) that were not received in response to a query. NACK = Negative Acknowledgment.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class MinefieldResponseNACKPdu extends MinefieldFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "MinefieldResponseNACKPdu";
   
   /** Minefield ID provides a unique identifier */
   protected MinefieldIdentifier  minefieldID = new MinefieldIdentifier(); 

   /** entity ID making the request */
   protected SimulationIdentifier  requestingEntityID = new SimulationIdentifier(); 

   /** request ID provides a unique identifier */
   protected byte requestID;

   /** how many pdus were missing */
   protected byte numberOfMissingPdus;

   /** PDU sequence numbers that were missing */
   protected byte[]  missingPduSequenceNumbers = new byte[0]; 


/** Constructor creates and configures a new instance object */
 public MinefieldResponseNACKPdu()
 {
    setPduType( DisPduType.MINEFIELD_RESPONSE_NACK );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized MinefieldResponseNACKPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized MinefieldResponseNACKPdu copyByteBuffer()
 {
     MinefieldResponseNACKPdu newCopy = new MinefieldResponseNACKPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("MinefieldResponseNACKPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized MinefieldResponseNACKPdu copyDataOutputStream()
 {
     MinefieldResponseNACKPdu newCopy = new MinefieldResponseNACKPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("MinefieldResponseNACKPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("MinefieldResponseNACKPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (minefieldID != null)
       marshalSize += minefieldID.getMarshalledSize();
   if (requestingEntityID != null)
       marshalSize += requestingEntityID.getMarshalledSize();
   marshalSize += 1;  // requestID
   marshalSize += 1;  // numberOfMissingPdus
   if (missingPduSequenceNumbers != null)
       marshalSize += missingPduSequenceNumbers.length * 1;

   return marshalSize;
}


/** Setter for {@link MinefieldResponseNACKPdu#minefieldID}
  * @param pMinefieldID new value of interest
  * @return same object to permit progressive setters */
public synchronized MinefieldResponseNACKPdu setMinefieldID(MinefieldIdentifier pMinefieldID)
{
    minefieldID = pMinefieldID;
    return this;
}
/** Getter for {@link MinefieldResponseNACKPdu#minefieldID}
  * @return value of interest */
public MinefieldIdentifier getMinefieldID()
{
    return minefieldID;
}


/** Setter for {@link MinefieldResponseNACKPdu#requestingEntityID}
  * @param pRequestingEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized MinefieldResponseNACKPdu setRequestingEntityID(SimulationIdentifier pRequestingEntityID)
{
    requestingEntityID = pRequestingEntityID;
    return this;
}
/** Getter for {@link MinefieldResponseNACKPdu#requestingEntityID}
  * @return value of interest */
public SimulationIdentifier getRequestingEntityID()
{
    return requestingEntityID;
}


/** Setter for {@link MinefieldResponseNACKPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public synchronized MinefieldResponseNACKPdu setRequestID(byte pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Utility setter for {@link MinefieldResponseNACKPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public synchronized MinefieldResponseNACKPdu setRequestID(int pRequestID){
    requestID = (byte) pRequestID;
    return this;
}
/** Getter for {@link MinefieldResponseNACKPdu#requestID}
  * @return value of interest */
public byte getRequestID()
{
    return requestID; 
}

/** Setter for {@link MinefieldResponseNACKPdu#missingPduSequenceNumbers}
  * @param pMissingPduSequenceNumbers new value of interest
  * @return same object to permit progressive setters */
public synchronized MinefieldResponseNACKPdu setMissingPduSequenceNumbers(byte[] pMissingPduSequenceNumbers)
{
    missingPduSequenceNumbers = pMissingPduSequenceNumbers;
    return this;
}
/** Getter for {@link MinefieldResponseNACKPdu#missingPduSequenceNumbers}
  * @return value of interest */
public byte[] getMissingPduSequenceNumbers()
{
    return missingPduSequenceNumbers; 
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
       minefieldID.marshal(dos);
       requestingEntityID.marshal(dos);
       dos.writeByte(requestID);
       dos.writeByte(missingPduSequenceNumbers.length);

       for (int idx = 0; idx < missingPduSequenceNumbers.length; idx++)
           dos.writeByte(missingPduSequenceNumbers[idx]);

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
        uPosition += minefieldID.unmarshal(dis);
        uPosition += requestingEntityID.unmarshal(dis);
        requestID = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfMissingPdus = (byte)dis.readUnsignedByte();
        uPosition += 1;
        for (int idx = 0; idx < missingPduSequenceNumbers.length; idx++)
            missingPduSequenceNumbers[idx] = dis.readByte();
        uPosition += (missingPduSequenceNumbers.length * 1);
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
   minefieldID.marshal(byteBuffer);
   requestingEntityID.marshal(byteBuffer);
   byteBuffer.put( (byte)requestID);
   byteBuffer.put( (byte)missingPduSequenceNumbers.length);

   for (int idx = 0; idx < missingPduSequenceNumbers.length; idx++)
       byteBuffer.put((byte)missingPduSequenceNumbers[idx]);

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
        // attribute minefieldID marked as not serialized
        minefieldID.unmarshal(byteBuffer);
        // attribute requestingEntityID marked as not serialized
        requestingEntityID.unmarshal(byteBuffer);
        // attribute requestID marked as not serialized
        requestID = (byte)(byteBuffer.get() & 0xFF);
        // attribute numberOfMissingPdus marked as not serialized
        numberOfMissingPdus = (byte)(byteBuffer.get() & 0xFF);
        // attribute missingPduSequenceNumbers marked as not serialized
        for (int idx = 0; idx < missingPduSequenceNumbers.length; idx++)
            missingPduSequenceNumbers[idx] = byteBuffer.get();
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
     final MinefieldResponseNACKPdu rhs = (MinefieldResponseNACKPdu)obj;

     if( ! Objects.equals(minefieldID, rhs.minefieldID) ) return false;
     if( ! Objects.equals(requestingEntityID, rhs.requestingEntityID) ) return false;
     if( ! (requestID == rhs.requestID)) return false;

     for (int idx = 0; idx < 0; idx++)
     {
          if(!(missingPduSequenceNumbers[idx] == rhs.missingPduSequenceNumbers[idx])) return false;
     }

    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" minefieldID:").append(minefieldID); // writeOneToString
    sb.append(" requestingEntityID:").append(requestingEntityID); // writeOneToString
    sb.append(" requestID:").append(requestID); // writeOneToString
    sb.append(" missingPduSequenceNumbers:");
    sb.append(Arrays.toString(missingPduSequenceNumbers)); // writePrimitiveList

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.minefieldID,
	                     this.requestingEntityID,
	                     this.requestID,
	                     this.numberOfMissingPdus,
	                     this.missingPduSequenceNumbers);
 }
} // end of MinefieldResponseNACKPdu
