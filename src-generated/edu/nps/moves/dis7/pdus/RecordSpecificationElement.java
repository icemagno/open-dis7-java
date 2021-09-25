// autogenerated using string template dis7javalicense.txt

/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Synthetic record, made up from section 6.2.73. This is used to achieve a repeating variable list element.<p>recordLength, recordCount and recordValues must be set by hand so the.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class RecordSpecificationElement extends Object implements Serializable
{
   /** The data structure used to convey the parameter values of the record for each record. 32-bit enumeration. uid = 66 */
   protected VariableRecordType recordID = VariableRecordType.values()[0];

   /** The serial number of the first record in the block of records */
   protected int  recordSetSerialNumber;

   /** padding is an undescribed parameter... */
   protected int  padding;

   /**  the length, in bits, of the record. Note, bits, not bytes. */
   protected short  recordLength;

   /**  the number of records included in the record set  */
   protected short  recordCount;

   /** The concatenated records of the format specified by the Record ID field. The length of this field is the Record Length multiplied by the Record Count, in units of bits. */
   protected byte[]  recordValues = new byte[0]; 

   /** used if required to make entire record size an even multiple of 8 bytes */
   protected byte[]  padTo64 = new byte[0]; 


/** Constructor creates and configures a new instance object */
 public RecordSpecificationElement()
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

   if (recordID != null)
       marshalSize += recordID.getMarshalledSize();
   marshalSize += 4;  // recordSetSerialNumber
   marshalSize += 4;  // padding
   marshalSize += 2;  // recordLength
   marshalSize += 2;  // recordCount
   if (recordValues != null)
       marshalSize += recordValues.length * 1;
   if (padTo64 != null)
       marshalSize += padTo64.length * 1;

   return marshalSize;
}


/** Setter for {@link RecordSpecificationElement#recordID}
  * @param pRecordID new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setRecordID(VariableRecordType pRecordID)
{
    recordID = pRecordID;
    return this;
}

/** Getter for {@link RecordSpecificationElement#recordID}
  * @return value of interest */
public VariableRecordType getRecordID()
{
    return recordID; 
}

/** Setter for {@link RecordSpecificationElement#recordSetSerialNumber}
  * @param pRecordSetSerialNumber new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setRecordSetSerialNumber(int pRecordSetSerialNumber)
{
    recordSetSerialNumber = pRecordSetSerialNumber;
    return this;
}

/** Getter for {@link RecordSpecificationElement#recordSetSerialNumber}
  * @return value of interest */
public int getRecordSetSerialNumber()
{
    return recordSetSerialNumber; 
}

/** Setter for {@link RecordSpecificationElement#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setPadding(int pPadding)
{
    padding = pPadding;
    return this;
}

/** Getter for {@link RecordSpecificationElement#padding}
  * @return value of interest */
public int getPadding()
{
    return padding; 
}

/** Setter for {@link RecordSpecificationElement#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link RecordSpecificationElement#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}

/** Getter for {@link RecordSpecificationElement#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link RecordSpecificationElement#recordCount}
  * @param pRecordCount new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setRecordCount(short pRecordCount)
{
    recordCount = pRecordCount;
    return this;
}
/** Utility setter for {@link RecordSpecificationElement#recordCount}
  * @param pRecordCount new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setRecordCount(int pRecordCount){
    recordCount = (short) pRecordCount;
    return this;
}

/** Getter for {@link RecordSpecificationElement#recordCount}
  * @return value of interest */
public short getRecordCount()
{
    return recordCount; 
}

/** Setter for {@link RecordSpecificationElement#recordValues}
  * @param pRecordValues new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setRecordValues(byte[] pRecordValues)
{
    recordValues = pRecordValues;
    return this;
}

/** Getter for {@link RecordSpecificationElement#recordValues}
  * @return value of interest */
public byte[] getRecordValues()
{
    return recordValues; 
}

/** Setter for {@link RecordSpecificationElement#padTo64}
  * @param pPadTo64 new value of interest
  * @return same object to permit progressive setters */
public RecordSpecificationElement setPadTo64(byte[] pPadTo64)
{
    padTo64 = pPadTo64;
    return this;
}

/** Getter for {@link RecordSpecificationElement#padTo64}
  * @return value of interest */
public byte[] getPadTo64()
{
    return padTo64; 
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
       recordID.marshal(dos);
       dos.writeInt(recordSetSerialNumber);
       dos.writeInt(padding);
       dos.writeShort(recordLength);
       dos.writeShort(recordCount);

       for (int idx = 0; idx < recordValues.length; idx++)
           dos.writeByte(recordValues[idx]);


       for (int idx = 0; idx < padTo64.length; idx++)
           dos.writeByte(padTo64[idx]);

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
        recordID = VariableRecordType.unmarshalEnum(dis);
        uPosition += recordID.getMarshalledSize();
        recordSetSerialNumber = dis.readInt();
        uPosition += 4;
        padding = dis.readInt();
        uPosition += 4;
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        recordCount = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < recordValues.length; idx++)
            recordValues[idx] = dis.readByte();
        uPosition += (recordValues.length * 1);
        for (int idx = 0; idx < padTo64.length; idx++)
            padTo64[idx] = dis.readByte();
        uPosition += (padTo64.length * 1);
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
   recordID.marshal(byteBuffer);
   byteBuffer.putInt( (int)recordSetSerialNumber);
   byteBuffer.putInt( (int)padding);
   byteBuffer.putShort( (short)recordLength);
   byteBuffer.putShort( (short)recordCount);

   for (int idx = 0; idx < recordValues.length; idx++)
       byteBuffer.put((byte)recordValues[idx]);


   for (int idx = 0; idx < padTo64.length; idx++)
       byteBuffer.put((byte)padTo64[idx]);

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
        // attribute recordID marked as not serialized
        recordID = VariableRecordType.unmarshalEnum(byteBuffer);
        // attribute recordSetSerialNumber marked as not serialized
        recordSetSerialNumber = byteBuffer.getInt();
        // attribute padding marked as not serialized
        padding = byteBuffer.getInt();
        // attribute recordLength marked as not serialized
        recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute recordCount marked as not serialized
        recordCount = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute recordValues marked as not serialized
        for (int idx = 0; idx < recordValues.length; idx++)
            recordValues[idx] = byteBuffer.get();
        // attribute padTo64 marked as not serialized
        for (int idx = 0; idx < padTo64.length; idx++)
            padTo64[idx] = byteBuffer.get();
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

     final RecordSpecificationElement rhs = (RecordSpecificationElement)obj;

     if( ! (recordID == rhs.recordID)) ivarsEqual = false;
     if( ! (recordSetSerialNumber == rhs.recordSetSerialNumber)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;
     if( ! (recordCount == rhs.recordCount)) ivarsEqual = false;

     for (int idx = 0; idx < 0; idx++)
     {
          if(!(recordValues[idx] == rhs.recordValues[idx])) ivarsEqual = false;
     }


     for (int idx = 0; idx < 0; idx++)
     {
          if(!(padTo64[idx] == rhs.padTo64[idx])) ivarsEqual = false;
     }

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordID: ").append(recordID).append("\n");
    sb.append(" recordSetSerialNumber: ").append(recordSetSerialNumber).append("\n");
    sb.append(" padding: ").append(padding).append("\n");
    sb.append(" recordLength: ").append(recordLength).append("\n");
    sb.append(" recordCount: ").append(recordCount).append("\n");
    sb.append(" recordValues: ").append("\n");
    sb.append(Arrays.toString(recordValues)).append("\n");
    sb.append(" padTo64: ").append("\n");
    sb.append(Arrays.toString(padTo64)).append("\n");

   return sb.toString();
 }
} // end of class
