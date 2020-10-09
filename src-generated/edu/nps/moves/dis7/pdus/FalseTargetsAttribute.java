/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * The False Targets attribute record shall be used to communicate discrete values that are associated with false targets jamming that cannot be referenced to an emitter mode. The values provided in the False Targets attri- bute record shall be considered valid only for the victim radar beams listed in the jamming beam's Track/Jam Data records (provided in the associated Electromagnetic Emission PDU). Section 6.2.21.3
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class FalseTargetsAttribute extends Object implements Serializable
{
   /** record type */
   protected int  recordType = (int)3502;

   /** The length of the record in octets. */
   protected short  recordLength = (short)40;

   /** padding */
   protected short  padding = (short)0;

   /** This field indicates the emitter system generating the false targets. */
   protected byte  emitterNumber;

   /** This field indicates the jamming beam generating the false targets.  */
   protected byte  beamNumber;

   /** This field shall be used to indicate if false target data have changed since issuance of the last False Targets attribute record for this beam, if the False Targets attribute record is part of a heartbeat update to meet periodic update requirements or if false target data for the beam has ceased. uid 300 */
   protected EEAttributeStateIndicator stateIndicator = EEAttributeStateIndicator.values()[0];

   /** padding */
   protected byte  padding2 = (byte)0;

   protected short  padding3 = (short)0;

   /** This field indicates the jamming beam generating the false targets.  */
   protected short  falseTargetCount;

   /** This field shall specify the speed (in meters per second) at which false targets move toward the victim radar. Negative values shall indicate a velocity away from the victim radar.  */
   protected float  walkSpeed;

   /** This field shall specify the rate (in meters per second squared) at which false tar- gets accelerate toward the victim radar. Negative values shall indicate an acceleration direction away from the victim radar.  */
   protected float  walkAcceleration;

   /** This field shall specify the distance (in meters) that a false target is to walk before it pauses in range.  */
   protected float  maximumWalkDistance;

   /** This field shall specify the time (in seconds) that a false target is to be held at the Maxi- mum Walk Distance before it resets to its initial position.  */
   protected float  keepTime;

   /** This field shall specify the distance between false targets in meters. Positive values for this field shall indicate that second and subsequent false targets are initially placed at increasing ranges from the victim radar.  */
   protected float  echoSpacing;

   /** Sets the position of the first false target relative to the jamming entity in meters. */
   protected float  firstTargetOffset;


/** Constructor */
 public FalseTargetsAttribute()
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

   marshalSize += 4;  // recordType
   marshalSize += 2;  // recordLength
   marshalSize += 2;  // padding
   marshalSize += 1;  // emitterNumber
   marshalSize += 1;  // beamNumber
   marshalSize += stateIndicator.getMarshalledSize();
   marshalSize += 1;  // padding2
   marshalSize += 2;  // padding3
   marshalSize += 2;  // falseTargetCount
   marshalSize += 4;  // walkSpeed
   marshalSize += 4;  // walkAcceleration
   marshalSize += 4;  // maximumWalkDistance
   marshalSize += 4;  // keepTime
   marshalSize += 4;  // echoSpacing
   marshalSize += 4;  // firstTargetOffset

   return marshalSize;
}


/** Setter for {@link FalseTargetsAttribute#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setRecordType(int pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#recordType}
  * @return value of interest */
public int getRecordType()
{
    return recordType; 
}

/** Setter for {@link FalseTargetsAttribute#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link FalseTargetsAttribute#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link FalseTargetsAttribute#emitterNumber}
  * @param pEmitterNumber new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setEmitterNumber(byte pEmitterNumber)
{
    emitterNumber = pEmitterNumber;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#emitterNumber}
  * @param pEmitterNumber new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setEmitterNumber(int pEmitterNumber){
    emitterNumber = (byte) pEmitterNumber;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#emitterNumber}
  * @return value of interest */
public byte getEmitterNumber()
{
    return emitterNumber; 
}

/** Setter for {@link FalseTargetsAttribute#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setBeamNumber(byte pBeamNumber)
{
    beamNumber = pBeamNumber;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#beamNumber}
  * @param pBeamNumber new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setBeamNumber(int pBeamNumber){
    beamNumber = (byte) pBeamNumber;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#beamNumber}
  * @return value of interest */
public byte getBeamNumber()
{
    return beamNumber; 
}

/** Setter for {@link FalseTargetsAttribute#stateIndicator}
  * @param pStateIndicator new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setStateIndicator(EEAttributeStateIndicator pStateIndicator)
{
    stateIndicator = pStateIndicator;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#stateIndicator}
  * @return value of interest */
public EEAttributeStateIndicator getStateIndicator()
{
    return stateIndicator; 
}

/** Setter for {@link FalseTargetsAttribute#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding2(byte pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding2(int pPadding2){
    padding2 = (byte) pPadding2;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#padding2}
  * @return value of interest */
public byte getPadding2()
{
    return padding2; 
}

/** Setter for {@link FalseTargetsAttribute#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding3(short pPadding3)
{
    padding3 = pPadding3;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#padding3}
  * @param pPadding3 new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setPadding3(int pPadding3){
    padding3 = (short) pPadding3;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#padding3}
  * @return value of interest */
public short getPadding3()
{
    return padding3; 
}

/** Setter for {@link FalseTargetsAttribute#falseTargetCount}
  * @param pFalseTargetCount new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setFalseTargetCount(short pFalseTargetCount)
{
    falseTargetCount = pFalseTargetCount;
    return this;
}
/** Utility setter for {@link FalseTargetsAttribute#falseTargetCount}
  * @param pFalseTargetCount new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setFalseTargetCount(int pFalseTargetCount){
    falseTargetCount = (short) pFalseTargetCount;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#falseTargetCount}
  * @return value of interest */
public short getFalseTargetCount()
{
    return falseTargetCount; 
}

/** Setter for {@link FalseTargetsAttribute#walkSpeed}
  * @param pWalkSpeed new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setWalkSpeed(float pWalkSpeed)
{
    walkSpeed = pWalkSpeed;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#walkSpeed}
  * @return value of interest */
public float getWalkSpeed()
{
    return walkSpeed; 
}

/** Setter for {@link FalseTargetsAttribute#walkAcceleration}
  * @param pWalkAcceleration new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setWalkAcceleration(float pWalkAcceleration)
{
    walkAcceleration = pWalkAcceleration;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#walkAcceleration}
  * @return value of interest */
public float getWalkAcceleration()
{
    return walkAcceleration; 
}

/** Setter for {@link FalseTargetsAttribute#maximumWalkDistance}
  * @param pMaximumWalkDistance new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setMaximumWalkDistance(float pMaximumWalkDistance)
{
    maximumWalkDistance = pMaximumWalkDistance;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#maximumWalkDistance}
  * @return value of interest */
public float getMaximumWalkDistance()
{
    return maximumWalkDistance; 
}

/** Setter for {@link FalseTargetsAttribute#keepTime}
  * @param pKeepTime new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setKeepTime(float pKeepTime)
{
    keepTime = pKeepTime;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#keepTime}
  * @return value of interest */
public float getKeepTime()
{
    return keepTime; 
}

/** Setter for {@link FalseTargetsAttribute#echoSpacing}
  * @param pEchoSpacing new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setEchoSpacing(float pEchoSpacing)
{
    echoSpacing = pEchoSpacing;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#echoSpacing}
  * @return value of interest */
public float getEchoSpacing()
{
    return echoSpacing; 
}

/** Setter for {@link FalseTargetsAttribute#firstTargetOffset}
  * @param pFirstTargetOffset new value of interest
  * @return same object to permit progressive setters */
public FalseTargetsAttribute setFirstTargetOffset(float pFirstTargetOffset)
{
    firstTargetOffset = pFirstTargetOffset;
    return this;
}

/** Getter for {@link FalseTargetsAttribute#firstTargetOffset}
  * @return value of interest */
public float getFirstTargetOffset()
{
    return firstTargetOffset; 
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
       dos.writeShort(padding3);
       dos.writeShort(falseTargetCount);
       dos.writeFloat(walkSpeed);
       dos.writeFloat(walkAcceleration);
       dos.writeFloat(maximumWalkDistance);
       dos.writeFloat(keepTime);
       dos.writeFloat(echoSpacing);
       dos.writeFloat(firstTargetOffset);
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
        padding3 = (short)dis.readUnsignedShort();
        uPosition += 2;
        falseTargetCount = (short)dis.readUnsignedShort();
        uPosition += 2;
        walkSpeed = dis.readFloat();
        uPosition += 4;
        walkAcceleration = dis.readFloat();
        uPosition += 4;
        maximumWalkDistance = dis.readFloat();
        uPosition += 4;
        keepTime = dis.readFloat();
        uPosition += 4;
        echoSpacing = dis.readFloat();
        uPosition += 4;
        firstTargetOffset = dis.readFloat();
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
   byteBuffer.putShort( (short)padding3);
   byteBuffer.putShort( (short)falseTargetCount);
   byteBuffer.putFloat( (float)walkSpeed);
   byteBuffer.putFloat( (float)walkAcceleration);
   byteBuffer.putFloat( (float)maximumWalkDistance);
   byteBuffer.putFloat( (float)keepTime);
   byteBuffer.putFloat( (float)echoSpacing);
   byteBuffer.putFloat( (float)firstTargetOffset);
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
    recordType = byteBuffer.getInt();
    recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
    padding = (short)(byteBuffer.getShort() & 0xFFFF);
    emitterNumber = (byte)(byteBuffer.get() & 0xFF);
    beamNumber = (byte)(byteBuffer.get() & 0xFF);
    stateIndicator = EEAttributeStateIndicator.unmarshalEnum(byteBuffer);
    padding2 = (byte)(byteBuffer.get() & 0xFF);
    padding3 = (short)(byteBuffer.getShort() & 0xFFFF);
    falseTargetCount = (short)(byteBuffer.getShort() & 0xFFFF);
    walkSpeed = byteBuffer.getFloat();
    walkAcceleration = byteBuffer.getFloat();
    maximumWalkDistance = byteBuffer.getFloat();
    keepTime = byteBuffer.getFloat();
    echoSpacing = byteBuffer.getFloat();
    firstTargetOffset = byteBuffer.getFloat();
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

     final FalseTargetsAttribute rhs = (FalseTargetsAttribute)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (emitterNumber == rhs.emitterNumber)) ivarsEqual = false;
     if( ! (beamNumber == rhs.beamNumber)) ivarsEqual = false;
     if( ! (stateIndicator == rhs.stateIndicator)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
     if( ! (padding3 == rhs.padding3)) ivarsEqual = false;
     if( ! (falseTargetCount == rhs.falseTargetCount)) ivarsEqual = false;
     if( ! (walkSpeed == rhs.walkSpeed)) ivarsEqual = false;
     if( ! (walkAcceleration == rhs.walkAcceleration)) ivarsEqual = false;
     if( ! (maximumWalkDistance == rhs.maximumWalkDistance)) ivarsEqual = false;
     if( ! (keepTime == rhs.keepTime)) ivarsEqual = false;
     if( ! (echoSpacing == rhs.echoSpacing)) ivarsEqual = false;
     if( ! (firstTargetOffset == rhs.firstTargetOffset)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" recordLength: ").append(recordLength).append("\n");
    sb.append(" padding: ").append(padding).append("\n");
    sb.append(" emitterNumber: ").append(emitterNumber).append("\n");
    sb.append(" beamNumber: ").append(beamNumber).append("\n");
    sb.append(" stateIndicator: ").append(stateIndicator).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");
    sb.append(" padding3: ").append(padding3).append("\n");
    sb.append(" falseTargetCount: ").append(falseTargetCount).append("\n");
    sb.append(" walkSpeed: ").append(walkSpeed).append("\n");
    sb.append(" walkAcceleration: ").append(walkAcceleration).append("\n");
    sb.append(" maximumWalkDistance: ").append(maximumWalkDistance).append("\n");
    sb.append(" keepTime: ").append(keepTime).append("\n");
    sb.append(" echoSpacing: ").append(echoSpacing).append("\n");
    sb.append(" firstTargetOffset: ").append(firstTargetOffset).append("\n");

   return sb.toString();
 }
} // end of class