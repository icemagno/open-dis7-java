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
 * 16-bit fixed binaries
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class LiveEntityOrientationError extends Object implements Serializable
{
   /** azimuthError is an undescribed parameter... */
   protected short azimuthError;

   /** elevationError is an undescribed parameter... */
   protected short elevationError;

   /** rotationError is an undescribed parameter... */
   protected short rotationError;


/** Constructor creates and configures a new instance object */
 public LiveEntityOrientationError()
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

   marshalSize += 2;  // azimuthError
   marshalSize += 2;  // elevationError
   marshalSize += 2;  // rotationError

   return marshalSize;
}


/** Setter for {@link LiveEntityOrientationError#azimuthError}
  * @param pAzimuthError new value of interest
  * @return same object to permit progressive setters */
public synchronized LiveEntityOrientationError setAzimuthError(short pAzimuthError)
{
    azimuthError = pAzimuthError;
    return this;
}
/** Utility setter for {@link LiveEntityOrientationError#azimuthError}
  * @param pAzimuthError new value of interest
  * @return same object to permit progressive setters */
public synchronized LiveEntityOrientationError setAzimuthError(int pAzimuthError){
    azimuthError = (short) pAzimuthError;
    return this;
}
/** Getter for {@link LiveEntityOrientationError#azimuthError}
  * @return value of interest */
public short getAzimuthError()
{
    return azimuthError; 
}

/** Setter for {@link LiveEntityOrientationError#elevationError}
  * @param pElevationError new value of interest
  * @return same object to permit progressive setters */
public synchronized LiveEntityOrientationError setElevationError(short pElevationError)
{
    elevationError = pElevationError;
    return this;
}
/** Utility setter for {@link LiveEntityOrientationError#elevationError}
  * @param pElevationError new value of interest
  * @return same object to permit progressive setters */
public synchronized LiveEntityOrientationError setElevationError(int pElevationError){
    elevationError = (short) pElevationError;
    return this;
}
/** Getter for {@link LiveEntityOrientationError#elevationError}
  * @return value of interest */
public short getElevationError()
{
    return elevationError; 
}

/** Setter for {@link LiveEntityOrientationError#rotationError}
  * @param pRotationError new value of interest
  * @return same object to permit progressive setters */
public synchronized LiveEntityOrientationError setRotationError(short pRotationError)
{
    rotationError = pRotationError;
    return this;
}
/** Utility setter for {@link LiveEntityOrientationError#rotationError}
  * @param pRotationError new value of interest
  * @return same object to permit progressive setters */
public synchronized LiveEntityOrientationError setRotationError(int pRotationError){
    rotationError = (short) pRotationError;
    return this;
}
/** Getter for {@link LiveEntityOrientationError#rotationError}
  * @return value of interest */
public short getRotationError()
{
    return rotationError; 
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
       dos.writeShort(azimuthError);
       dos.writeShort(elevationError);
       dos.writeShort(rotationError);
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
        azimuthError = (short)dis.readUnsignedShort();
        uPosition += 2;
        elevationError = (short)dis.readUnsignedShort();
        uPosition += 2;
        rotationError = (short)dis.readUnsignedShort();
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
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   byteBuffer.putShort( (short)azimuthError);
   byteBuffer.putShort( (short)elevationError);
   byteBuffer.putShort( (short)rotationError);
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
        // attribute azimuthError marked as not serialized
        azimuthError = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute elevationError marked as not serialized
        elevationError = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute rotationError marked as not serialized
        rotationError = (short)(byteBuffer.getShort() & 0xFFFF);
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
     final LiveEntityOrientationError rhs = (LiveEntityOrientationError)obj;

     if( ! (azimuthError == rhs.azimuthError)) return false;
     if( ! (elevationError == rhs.elevationError)) return false;
     if( ! (rotationError == rhs.rotationError)) return false;
    return true;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" azimuthError:").append(azimuthError); // writeOneToString
    sb.append(" elevationError:").append(elevationError); // writeOneToString
    sb.append(" rotationError:").append(rotationError); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.azimuthError,
	                     this.elevationError,
	                     this.rotationError);
 }
} // end of LiveEntityOrientationError
