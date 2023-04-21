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
 * The Blanking Sector attribute record may be used to convey persistent areas within a scan volume where emitter power for a specific active emitter beam is reduced to an insignificant value. Section 6.2.21.2
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class BlankingSector extends Object implements Serializable
{
   /** record type */
   protected int recordType = (int)3500;

   /** The length of the Blanking Sector attribute record in octets. */
   protected short recordLength = (short)40;

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected short padding = (short)0;

   /** indicates the emitter system for which the blanking sector values are applicable */
   protected byte emitterNumber;

   /** indicates the beam for which the blanking sector values are applicable. */
   protected byte beamNumber;

   /** indicate if blanking sector data have changed since issuance of the last Blanking Sector attribute record for this beam, if the Blanking Sector attribute record beam has ceased uid 300 */
   protected EEAttributeStateIndicator stateIndicator = EEAttributeStateIndicator.values()[0];

   /** Padding */
   protected byte padding2 = (byte)0;

   /** This field is provided to indicate the left-most azimuth (clockwise in radians) for which emitted power is reduced. This angle is measured in the X-Y plane of the radar's entity coor- dinate system (see 1.4.3). The range of permissible values is 0 to 2PI, with zero pointing in the X- direction.  */
   protected float leftAzimuth;

   /** Indicate the right-most azimuth (clockwise in radians) for which emitted power is reduced. This angle is measured in the X-Y plane of the radar's entity coordinate system (see 1.4.3). The range of permissible values is 0 to 2PI , with zero pointing in the X- direction. */
   protected float rightAzimuth;

   /** This field is provided to indicate the lowest elevation (in radians) for which emit- ted power is reduced. This angle is measured positive upward with respect to the X-Y plane of the radar's entity coordinate system (see 1.4.3). The range of permissible values is -PI/2 to PI/2 */
   protected float lowerElevation;

   /** This field is provided to indicate the highest elevation (in radians) for which emitted power is reduced. This angle is measured positive upward with respect to the X-Y plane of the radar's entitycoordinatesystem(see1.4.3). The range of permissible values is -PI/2 to PI/2 */
   protected float upperElevation;

   /** This field shall specify the residual effective radiated power in the blanking sector in dBm.  */
   protected float residualPower;

   /** Padding, 32-bits */
   protected long padding3 = (long)0;


/** Constructor creates and configures a new instance object */
 public BlankingSector()
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

   marshalSize += 4;  // recordType
   marshalSize += 2;  // recordLength
   marshalSize += 2;  // padding
   marshalSize += 1;  // emitterNumber
   marshalSize += 1;  // beamNumber
   if (stateIndicator != null)
       marshalSize += stateIndicator.getMarshalledSize();
   marshalSize += 1;  // padding2
   marshalSize += 4;  // leftAzimuth
   marshalSize += 4;  // rightAzimuth
   marshalSize += 4;  // lowerElevation
   marshalSize += 4;  // upperElevation
   marshalSize += 4;  // residualPower
   marshalSize += 8;  // padding3

   return marshalSize;
}


/** Setter for {@link BlankingSector#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setRecordType(int pRecordType)
{
    recordType = pRecordType;
    return this;
}
/** Getter for {@link BlankingSector#recordType}
  * @return value of interest */
public int getRecordType()
{
    return recordType; 
}

/** Setter for {@link BlankingSector#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link BlankingSector#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}
/** Getter for {@link BlankingSector#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link BlankingSector#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link BlankingSector#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}
/** Getter for {@link BlankingSector#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link BlankingSector#emitterNumber}
  * @param pEmitterNumber new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setEmitterNumber(byte pEmitterNumber)
{
    emitterNumber = pEmitterNumber;
    return this;
}
/** Utility setter for {@link BlankingSector#emitterNumber}
  * @param pEmitterNumber new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setEmitterNumber(int pEmitterNumber){
    emitterNumber = (byte) pEmitterNumber;
    return this;
}
/** Getter for {@link BlankingSector#emitterNumber}
  * @return value of interest */
public byte getEmitterNumber()
{
    return emitterNumber; 
}

/** Setter for {@link BlankingSector#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setBeamNumber(byte pBeamNumber)
{
    beamNumber = pBeamNumber;
    return this;
}
/** Utility setter for {@link BlankingSector#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setBeamNumber(int pBeamNumber){
    beamNumber = (byte) pBeamNumber;
    return this;
}
/** Getter for {@link BlankingSector#beamNumber}
  * @return value of interest */
public byte getBeamNumber()
{
    return beamNumber; 
}

/** Setter for {@link BlankingSector#stateIndicator}
  * @param pStateIndicator new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setStateIndicator(EEAttributeStateIndicator pStateIndicator)
{
    stateIndicator = pStateIndicator;
    return this;
}
/** Getter for {@link BlankingSector#stateIndicator}
  * @return value of interest */
public EEAttributeStateIndicator getStateIndicator()
{
    return stateIndicator; 
}

/** Setter for {@link BlankingSector#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setPadding2(byte pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link BlankingSector#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setPadding2(int pPadding2){
    padding2 = (byte) pPadding2;
    return this;
}
/** Getter for {@link BlankingSector#padding2}
  * @return value of interest */
public byte getPadding2()
{
    return padding2; 
}

/** Setter for {@link BlankingSector#leftAzimuth}
  * @param pLeftAzimuth new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setLeftAzimuth(float pLeftAzimuth)
{
    leftAzimuth = pLeftAzimuth;
    return this;
}
/** Getter for {@link BlankingSector#leftAzimuth}
  * @return value of interest */
public float getLeftAzimuth()
{
    return leftAzimuth; 
}

/** Setter for {@link BlankingSector#rightAzimuth}
  * @param pRightAzimuth new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setRightAzimuth(float pRightAzimuth)
{
    rightAzimuth = pRightAzimuth;
    return this;
}
/** Getter for {@link BlankingSector#rightAzimuth}
  * @return value of interest */
public float getRightAzimuth()
{
    return rightAzimuth; 
}

/** Setter for {@link BlankingSector#lowerElevation}
  * @param pLowerElevation new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setLowerElevation(float pLowerElevation)
{
    lowerElevation = pLowerElevation;
    return this;
}
/** Getter for {@link BlankingSector#lowerElevation}
  * @return value of interest */
public float getLowerElevation()
{
    return lowerElevation; 
}

/** Setter for {@link BlankingSector#upperElevation}
  * @param pUpperElevation new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setUpperElevation(float pUpperElevation)
{
    upperElevation = pUpperElevation;
    return this;
}
/** Getter for {@link BlankingSector#upperElevation}
  * @return value of interest */
public float getUpperElevation()
{
    return upperElevation; 
}

/** Setter for {@link BlankingSector#residualPower}
  * @param pResidualPower new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setResidualPower(float pResidualPower)
{
    residualPower = pResidualPower;
    return this;
}
/** Getter for {@link BlankingSector#residualPower}
  * @return value of interest */
public float getResidualPower()
{
    return residualPower; 
}

/** Setter for {@link BlankingSector#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setPadding3(long pPadding3)
{
    padding3 = pPadding3;
    return this;
}
/** Utility setter for {@link BlankingSector#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public BlankingSector setPadding3(int pPadding3){
    padding3 = (long) pPadding3;
    return this;
}
/** Getter for {@link BlankingSector#padding3}
  * @return value of interest */
public long getPadding3()
{
    return padding3; 
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
       dos.writeInt(recordType);
       dos.writeShort(recordLength);
       dos.writeShort(padding);
       dos.writeByte(emitterNumber);
       dos.writeByte(beamNumber);
       stateIndicator.marshal(dos);
       dos.writeByte(padding2);
       dos.writeFloat(leftAzimuth);
       dos.writeFloat(rightAzimuth);
       dos.writeFloat(lowerElevation);
       dos.writeFloat(upperElevation);
       dos.writeFloat(residualPower);
       dos.writeLong(padding3);
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
        recordType = dis.readInt();
        uPosition += 4;
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        emitterNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        stateIndicator = EEAttributeStateIndicator.unmarshalEnum(dis);
        uPosition += stateIndicator.getMarshalledSize();
        padding2 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        leftAzimuth = dis.readFloat();
        uPosition += 4;
        rightAzimuth = dis.readFloat();
        uPosition += 4;
        lowerElevation = dis.readFloat();
        uPosition += 4;
        upperElevation = dis.readFloat();
        uPosition += 4;
        residualPower = dis.readFloat();
        uPosition += 4;
        padding3 = dis.readLong();
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
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   byteBuffer.putInt( (int)recordType);
   byteBuffer.putShort( (short)recordLength);
   byteBuffer.putShort( (short)padding);
   byteBuffer.put( (byte)emitterNumber);
   byteBuffer.put( (byte)beamNumber);
   stateIndicator.marshal(byteBuffer);
   byteBuffer.put( (byte)padding2);
   byteBuffer.putFloat( (float)leftAzimuth);
   byteBuffer.putFloat( (float)rightAzimuth);
   byteBuffer.putFloat( (float)lowerElevation);
   byteBuffer.putFloat( (float)upperElevation);
   byteBuffer.putFloat( (float)residualPower);
   byteBuffer.putLong( (long)padding3);
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
        // attribute recordType marked as not serialized
        recordType = byteBuffer.getInt();
        // attribute recordLength marked as not serialized
        recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute padding marked as not serialized
        padding = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute emitterNumber marked as not serialized
        emitterNumber = (byte)(byteBuffer.get() & 0xFF);
        // attribute beamNumber marked as not serialized
        beamNumber = (byte)(byteBuffer.get() & 0xFF);
        // attribute stateIndicator marked as not serialized
        stateIndicator = EEAttributeStateIndicator.unmarshalEnum(byteBuffer);
        // attribute padding2 marked as not serialized
        padding2 = (byte)(byteBuffer.get() & 0xFF);
        // attribute leftAzimuth marked as not serialized
        leftAzimuth = byteBuffer.getFloat();
        // attribute rightAzimuth marked as not serialized
        rightAzimuth = byteBuffer.getFloat();
        // attribute lowerElevation marked as not serialized
        lowerElevation = byteBuffer.getFloat();
        // attribute upperElevation marked as not serialized
        upperElevation = byteBuffer.getFloat();
        // attribute residualPower marked as not serialized
        residualPower = byteBuffer.getFloat();
        // attribute padding3 marked as not serialized
        padding3 = byteBuffer.getLong();
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

     final BlankingSector rhs = (BlankingSector)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (emitterNumber == rhs.emitterNumber)) ivarsEqual = false;
     if( ! (beamNumber == rhs.beamNumber)) ivarsEqual = false;
     if( ! (stateIndicator == rhs.stateIndicator)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
     if( ! (leftAzimuth == rhs.leftAzimuth)) ivarsEqual = false;
     if( ! (rightAzimuth == rhs.rightAzimuth)) ivarsEqual = false;
     if( ! (lowerElevation == rhs.lowerElevation)) ivarsEqual = false;
     if( ! (upperElevation == rhs.upperElevation)) ivarsEqual = false;
     if( ! (residualPower == rhs.residualPower)) ivarsEqual = false;
     if( ! (padding3 == rhs.padding3)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" recordType:").append(recordType); // writeOneToString
    sb.append(" recordLength:").append(recordLength); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString
    sb.append(" emitterNumber:").append(emitterNumber); // writeOneToString
    sb.append(" beamNumber:").append(beamNumber); // writeOneToString
    sb.append(" stateIndicator:").append(stateIndicator); // writeOneToString
    sb.append(" padding2:").append(padding2); // writeOneToString
    sb.append(" leftAzimuth:").append(leftAzimuth); // writeOneToString
    sb.append(" rightAzimuth:").append(rightAzimuth); // writeOneToString
    sb.append(" lowerElevation:").append(lowerElevation); // writeOneToString
    sb.append(" upperElevation:").append(upperElevation); // writeOneToString
    sb.append(" residualPower:").append(residualPower); // writeOneToString
    sb.append(" padding3:").append(padding3); // writeOneToString

   return sb.toString();
 }
} // end of class
