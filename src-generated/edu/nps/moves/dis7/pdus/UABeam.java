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
 * Information for one or more acoustic beams that the system has, including: length of the beam data,  beam identification number for each beam, and fundamental parametric data used to define the entity’s active emissions.  This field defines the active  emission  parameter  index,  beam  scan  pattern,  orientation,  and beamwidth, which can vary dynamically during system operation.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class UABeam extends Object implements Serializable
{
   /** beamDataLength is an undescribed parameter... */
   protected byte beamDataLength;

   /** beamNumber is an undescribed parameter... */
   protected byte beamNumber;

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected short padding;

   /** fundamentalParameterData is an undescribed parameter... */
   protected UAFundamentalParameter  fundamentalParameterData = new UAFundamentalParameter(); 


/** Constructor creates and configures a new instance object */
 public UABeam()
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

   marshalSize += 1;  // beamDataLength
   marshalSize += 1;  // beamNumber
   marshalSize += 2;  // padding
   if (fundamentalParameterData != null)
       marshalSize += fundamentalParameterData.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link UABeam#beamDataLength}
  * @param pBeamDataLength new value of interest
  * @return same object to permit progressive setters */
public synchronized UABeam setBeamDataLength(byte pBeamDataLength)
{
    beamDataLength = pBeamDataLength;
    return this;
}
/** Utility setter for {@link UABeam#beamDataLength}
  * @param pBeamDataLength new value of interest
  * @return same object to permit progressive setters */
public synchronized UABeam setBeamDataLength(int pBeamDataLength){
    beamDataLength = (byte) pBeamDataLength;
    return this;
}
/** Getter for {@link UABeam#beamDataLength}
  * @return value of interest */
public byte getBeamDataLength()
{
    return beamDataLength; 
}

/** Setter for {@link UABeam#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized UABeam setBeamNumber(byte pBeamNumber)
{
    beamNumber = pBeamNumber;
    return this;
}
/** Utility setter for {@link UABeam#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public synchronized UABeam setBeamNumber(int pBeamNumber){
    beamNumber = (byte) pBeamNumber;
    return this;
}
/** Getter for {@link UABeam#beamNumber}
  * @return value of interest */
public byte getBeamNumber()
{
    return beamNumber; 
}

/** Setter for {@link UABeam#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public synchronized UABeam setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link UABeam#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public synchronized UABeam setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}
/** Getter for {@link UABeam#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link UABeam#fundamentalParameterData}
  * @param pFundamentalParameterData new value of interest
  * @return same object to permit progressive setters */
public synchronized UABeam setFundamentalParameterData(UAFundamentalParameter pFundamentalParameterData)
{
    fundamentalParameterData = pFundamentalParameterData;
    return this;
}
/** Getter for {@link UABeam#fundamentalParameterData}
  * @return value of interest */
public UAFundamentalParameter getFundamentalParameterData()
{
    return fundamentalParameterData;
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
       dos.writeByte(beamDataLength);
       dos.writeByte(beamNumber);
       dos.writeShort(padding);
       fundamentalParameterData.marshal(dos);
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
        beamDataLength = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += fundamentalParameterData.unmarshal(dis);
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
   byteBuffer.put( (byte)beamDataLength);
   byteBuffer.put( (byte)beamNumber);
   byteBuffer.putShort( (short)padding);
   fundamentalParameterData.marshal(byteBuffer);
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
        // attribute beamDataLength marked as not serialized
        beamDataLength = (byte)(byteBuffer.get() & 0xFF);
        // attribute beamNumber marked as not serialized
        beamNumber = (byte)(byteBuffer.get() & 0xFF);
        // attribute padding marked as not serialized
        padding = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute fundamentalParameterData marked as not serialized
        fundamentalParameterData.unmarshal(byteBuffer);
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
     boolean ivarsEqual = true;

     final UABeam rhs = (UABeam)obj;

     if( ! (beamDataLength == rhs.beamDataLength)) ivarsEqual = false;
     if( ! (beamNumber == rhs.beamNumber)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (fundamentalParameterData.equals( rhs.fundamentalParameterData) )) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" beamDataLength:").append(beamDataLength); // writeOneToString
    sb.append(" beamNumber:").append(beamNumber); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString
    sb.append(" fundamentalParameterData:").append(fundamentalParameterData); // writeOneToString

   return sb.toString();
 }
} // end of class
