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
 * used in DetonationPdu, ArticulatedPartsPdu among others
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class VariableParameter extends Object implements Serializable
{
   /** The identification of the Variable Parameter record. Enumeration from EBV uid 56 */
   protected VariableParameterRecordType recordType = VariableParameterRecordType.values()[0];

   /** 120 bits */
   protected byte[]  recordSpecificFields = new byte[15]; 


/** Constructor creates and configures a new instance object */
 public VariableParameter()
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
   if (recordSpecificFields != null)
       marshalSize += recordSpecificFields.length * 1;

   return marshalSize;
}


/** Setter for {@link VariableParameter#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public synchronized VariableParameter setRecordType(VariableParameterRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}
/** Getter for {@link VariableParameter#recordType}
  * @return value of interest */
public VariableParameterRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link VariableParameter#recordSpecificFields}
  * @param pRecordSpecificFields new value of interest
  * @return same object to permit progressive setters */
public synchronized VariableParameter setRecordSpecificFields(byte[] pRecordSpecificFields)
{
    recordSpecificFields = Arrays.copyOf(pRecordSpecificFields, recordSpecificFields.length);
    return this;
}
/** Getter for {@link VariableParameter#recordSpecificFields}
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

       for (int idx = 0; idx < recordSpecificFields.length; idx++)
           dos.writeByte(recordSpecificFields[idx]);

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
        recordType = VariableParameterRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        for (int idx = 0; idx < recordSpecificFields.length; idx++)
            recordSpecificFields[idx] = dis.readByte();
        uPosition += (recordSpecificFields.length * 1);
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

   for (int idx = 0; idx < recordSpecificFields.length; idx++)
       byteBuffer.put((byte)recordSpecificFields[idx]);

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
        recordType = VariableParameterRecordType.unmarshalEnum(byteBuffer);
        // attribute recordSpecificFields marked as not serialized
        for (int idx = 0; idx < recordSpecificFields.length; idx++)
            recordSpecificFields[idx] = byteBuffer.get();
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
     final VariableParameter rhs = (VariableParameter)obj;

     if( ! (recordType == rhs.recordType)) return false;

     for (int idx = 0; idx < 15; idx++)
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
    sb.append(" recordSpecificFields:");
    sb.append(Arrays.toString(recordSpecificFields)); // writePrimitiveList

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.recordType,
	                     this.recordSpecificFields);
 }
} // end of VariableParameter
