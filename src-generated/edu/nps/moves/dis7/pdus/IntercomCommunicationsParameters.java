/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Intercom communications parameters. Section 6.2.46
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class IntercomCommunicationsParameters extends Object implements Serializable
{
   /** Type of intercom parameters record uid 185 */
   protected IntercomControlRecordType recordType = IntercomControlRecordType.values()[0];

   /** length of record */
   protected short  recordLength;

   /** This is a placeholder. */
   protected byte[]  recordSpecificField = new byte[0]; 

   private byte[] padding = new byte[0]; // pad to 32-bit boundary


/** Constructor */
 public IntercomCommunicationsParameters()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += recordType.getMarshalledSize();
   marshalSize += 2;  // recordLength
   marshalSize += recordSpecificField.length * 1;
   marshalSize += padding.length;

   return marshalSize;
}


/** Setter for {@link IntercomCommunicationsParameters#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public IntercomCommunicationsParameters setRecordType(IntercomControlRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link IntercomCommunicationsParameters#recordType}
  * @return value of interest */
public IntercomControlRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link IntercomCommunicationsParameters#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public IntercomCommunicationsParameters setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link IntercomCommunicationsParameters#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public IntercomCommunicationsParameters setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}

/** Getter for {@link IntercomCommunicationsParameters#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link IntercomCommunicationsParameters#recordSpecificField}
  * @param pRecordSpecificField new value of interest
  * @return same object to permit progressive setters */
public IntercomCommunicationsParameters setRecordSpecificField(byte[] pRecordSpecificField)
{
    recordSpecificField = pRecordSpecificField;
    return this;
}

/** Getter for {@link IntercomCommunicationsParameters#recordSpecificField}
  * @return value of interest */
public byte[] getRecordSpecificField()
{
    return recordSpecificField; 
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
       recordType.marshal(dos);
       dos.writeShort(recordLength);

       for(int idx = 0; idx < recordSpecificField.length; idx++)
           dos.writeByte(recordSpecificField[idx]);

       padding = new byte[Align.to32bits(dos)];
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
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        recordType = IntercomControlRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < recordSpecificField.length; idx++)
            recordSpecificField[idx] = dis.readByte();
        uPosition += (recordSpecificField.length * 1);
        padding = new byte[Align.from32bits(uPosition,dis)];
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
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   recordType.marshal(byteBuffer);
   byteBuffer.putShort( (short)recordLength);

   for(int idx = 0; idx < recordSpecificField.length; idx++)
       byteBuffer.put((byte)recordSpecificField[idx]);

   padding = new byte[Align.to32bits(byteBuffer)];
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    recordType = IntercomControlRecordType.unmarshalEnum(byteBuffer);
    recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
    for(int idx = 0; idx < recordSpecificField.length; idx++)
        recordSpecificField[idx] = byteBuffer.get();
    padding = new byte[Align.from32bits(byteBuffer)];
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

     final IntercomCommunicationsParameters rhs = (IntercomCommunicationsParameters)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;

     for(int idx = 0; idx < 0; idx++)
     {
          if(!(recordSpecificField[idx] == rhs.recordSpecificField[idx])) ivarsEqual = false;
     }

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" recordLength: ").append(recordLength).append("\n");
    sb.append(" recordSpecificField: ").append("\n");
    sb.append(Arrays.toString(recordSpecificField)).append("\n");
    sb.append(" padding: ").append(padding).append("\n");

   return sb.toString();
 }
} // end of class