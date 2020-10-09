/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Additional Passive Activity for use by Underwater Acoustic (UA) PDU. Section 7.6.4
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class APA extends Object implements Serializable
{
   protected short  parameterIndex;

   protected short  value;


/** Constructor */
 public APA()
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

   marshalSize += 2;  // parameterIndex
   marshalSize += 2;  // value

   return marshalSize;
}


/** Setter for {@link APA#parameterIndex}
  * @param pParameterIndex new value of interest
  * @return same object to permit progressive setters */
public APA setParameterIndex(short pParameterIndex)
{
    parameterIndex = pParameterIndex;
    return this;
}
/** Utility setter for {@link APA#parameterIndex}
  * @param pParameterIndex new value of interest
  * @return same object to permit progressive setters */
public APA setParameterIndex(int pParameterIndex){
    parameterIndex = (short) pParameterIndex;
    return this;
}

/** Getter for {@link APA#parameterIndex}
  * @return value of interest */
public short getParameterIndex()
{
    return parameterIndex; 
}

/** Setter for {@link APA#value}
  * @param pValue new value of interest
  * @return same object to permit progressive setters */
public APA setValue(short pValue)
{
    value = pValue;
    return this;
}
/** Utility setter for {@link APA#value}
  * @param pValue new value of interest
  * @return same object to permit progressive setters */
public APA setValue(int pValue){
    value = (short) pValue;
    return this;
}

/** Getter for {@link APA#value}
  * @return value of interest */
public short getValue()
{
    return value; 
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
       dos.writeShort(parameterIndex);
       dos.writeShort(value);
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
        parameterIndex = (short)dis.readUnsignedShort();
        uPosition += 2;
        value = (short)dis.readUnsignedShort();
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
   byteBuffer.putShort( (short)parameterIndex);
   byteBuffer.putShort( (short)value);
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
    parameterIndex = (short)(byteBuffer.getShort() & 0xFFFF);
    value = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final APA rhs = (APA)obj;

     if( ! (parameterIndex == rhs.parameterIndex)) ivarsEqual = false;
     if( ! (value == rhs.value)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" parameterIndex: ").append(parameterIndex).append("\n");
    sb.append(" value: ").append(value).append("\n");

   return sb.toString();
 }
} // end of class