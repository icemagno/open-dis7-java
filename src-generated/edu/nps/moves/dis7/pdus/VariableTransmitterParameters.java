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
 * Relates to radios. Section 6.2.95
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class VariableTransmitterParameters extends Object implements Serializable
{
   /** Type of VTP uid 66 Variable Record Type values are defined by VariableRecordType enumerations */
   protected VariableRecordType recordType = VariableRecordType.values()[0];

   /** Length, in bytes */
   protected short recordLength;

   /** recordSpecificFields is an undescribed parameter... */
   protected byte[]  recordSpecificFields = new byte[0]; 

   /** pad to 64-bit boundary */

   private byte[] padding = new byte[0];


/** Constructor creates and configures a new instance object */
 public VariableTransmitterParameters()
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

   if (recordType != null)
       marshalSize += recordType.getMarshalledSize();
   marshalSize += 2;  // recordLength
   if (recordSpecificFields != null)
       marshalSize += recordSpecificFields.length * 1;
   if (padding != null)
       marshalSize += padding.length;

   return marshalSize;
}


/** Setter for {@link VariableTransmitterParameters#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public synchronized VariableTransmitterParameters setRecordType(VariableRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}
/** Getter for {@link VariableTransmitterParameters#recordType}
  * @return value of interest */
public VariableRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link VariableTransmitterParameters#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public synchronized VariableTransmitterParameters setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link VariableTransmitterParameters#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public synchronized VariableTransmitterParameters setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}
/** Getter for {@link VariableTransmitterParameters#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link VariableTransmitterParameters#recordSpecificFields}
  * @param pRecordSpecificFields new value of interest
  * @return same object to permit progressive setters */
public synchronized VariableTransmitterParameters setRecordSpecificFields(byte[] pRecordSpecificFields)
{
    recordSpecificFields = pRecordSpecificFields;
    return this;
}
/** Getter for {@link VariableTransmitterParameters#recordSpecificFields}
  * @return value of interest */
public byte[] getRecordSpecificFields()
{
    return recordSpecificFields; 
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
       recordType.marshal(dos);
       dos.writeShort(recordLength);

       for (int idx = 0; idx < recordSpecificFields.length; idx++)
           dos.writeByte(recordSpecificFields[idx]);

       padding = new byte[Align.to64bits(dos)];
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
        recordType = VariableRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < recordSpecificFields.length; idx++)
            recordSpecificFields[idx] = dis.readByte();
        uPosition += (recordSpecificFields.length * 1);
        padding = new byte[Align.from64bits(uPosition,dis)];
        uPosition += padding.length;
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
   recordType.marshal(byteBuffer);
   byteBuffer.putShort( (short)recordLength);

   for (int idx = 0; idx < recordSpecificFields.length; idx++)
       byteBuffer.put((byte)recordSpecificFields[idx]);

   padding = new byte[Align.to64bits(byteBuffer)];
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
        // attribute recordType marked as not serialized
        recordType = VariableRecordType.unmarshalEnum(byteBuffer);
        // attribute recordLength marked as not serialized
        recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute recordSpecificFields marked as not serialized
        for (int idx = 0; idx < recordSpecificFields.length; idx++)
            recordSpecificFields[idx] = byteBuffer.get();
        // attribute padding marked as not serialized
        padding = new byte[Align.from64bits(byteBuffer)];
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
     final VariableTransmitterParameters rhs = (VariableTransmitterParameters)obj;

     if( ! (recordType == rhs.recordType)) return false;
     if( ! (recordLength == rhs.recordLength)) return false;

     for (int idx = 0; idx < 0; idx++)
     {
          if(!(recordSpecificFields[idx] == rhs.recordSpecificFields[idx])) return false;
     }

    return true;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" recordType:").append(recordType); // writeOneToString
    sb.append(" recordLength:").append(recordLength); // writeOneToString
    sb.append(" recordSpecificFields:");
    sb.append(Arrays.toString(recordSpecificFields)); // writePrimitiveList
    sb.append(" padding:").append(padding); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.recordType,
	                     this.recordLength,
	                     this.recordSpecificFields,
	                     this.padding);
 }
} // end of VariableTransmitterParameters
