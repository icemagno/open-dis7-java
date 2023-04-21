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
 * 6.2.41, table 70
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class GridDataType2 extends GridData implements Serializable
{
   /** numberOfValues is an undescribed parameter... */
   protected short numberOfValues;

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected short padding;

   /** dataValues is an undescribed parameter... */
   protected float[]  dataValues = new float[0]; 


/** Constructor creates and configures a new instance object */
 public GridDataType2()
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

   marshalSize = super.getMarshalledSize();
   marshalSize += 2;  // numberOfValues
   marshalSize += 2;  // padding
   if (dataValues != null)
       marshalSize += dataValues.length * 4;

   return marshalSize;
}


/** Setter for {@link GridDataType2#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public GridDataType2 setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link GridDataType2#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public GridDataType2 setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}
/** Getter for {@link GridDataType2#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link GridDataType2#dataValues}
  * @param pDataValues new value of interest
  * @return same object to permit progressive setters */
public GridDataType2 setDataValues(float[] pDataValues)
{
    dataValues = pDataValues;
    return this;
}
/** Getter for {@link GridDataType2#dataValues}
  * @return value of interest */
public float[] getDataValues()
{
    return dataValues; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       dos.writeShort(dataValues.length);
       dos.writeShort(padding);

       for (int idx = 0; idx < dataValues.length; idx++)
           dos.writeFloat(dataValues[idx]);

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
    uPosition += super.unmarshal(dis);

    try 
    {
        numberOfValues = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < dataValues.length; idx++)
            dataValues[idx] = dis.readFloat();
        uPosition += (dataValues.length * 4);
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
   super.marshal(byteBuffer);
   byteBuffer.putShort( (short)dataValues.length);
   byteBuffer.putShort( (short)padding);

   for (int idx = 0; idx < dataValues.length; idx++)
       byteBuffer.putFloat((float)dataValues[idx]);

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
    super.unmarshal(byteBuffer);

    try
    {
        // attribute numberOfValues marked as not serialized
        numberOfValues = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute padding marked as not serialized
        padding = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute dataValues marked as not serialized
        for (int idx = 0; idx < dataValues.length; idx++)
            dataValues[idx] = byteBuffer.getFloat();
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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final GridDataType2 rhs = (GridDataType2)obj;

     if( ! (padding == rhs.padding)) ivarsEqual = false;

     for (int idx = 0; idx < 0; idx++)
     {
          if(!(dataValues[idx] == rhs.dataValues[idx])) ivarsEqual = false;
     }

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" padding:").append(padding); // writeOneToString
    sb.append(" dataValues:");
    sb.append(Arrays.toString(dataValues)); // writePrimitiveList

   return sb.toString();
 }
} // end of class
