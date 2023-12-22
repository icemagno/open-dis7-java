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
import java.nio.ByteBuffer;

/**
 * 9.4.5 Representation of weapons fire in a DIS exercise involving LEs.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class LEFirePdu extends LiveEntityFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "LEFirePdu";
   
   /** firingLiveEntityId is an undescribed parameter... */
   protected EntityID  firingLiveEntityId = new EntityID(); 

   /** Bits defined in IEEE Standard */
   protected byte flags;

   /** targetLiveEntityId is an undescribed parameter... */
   protected EntityID  targetLiveEntityId = new EntityID(); 

   /** munitionLiveEntityId is an undescribed parameter... */
   protected EntityID  munitionLiveEntityId = new EntityID(); 

   /** eventId is an undescribed parameter... */
   protected EventIdentifier  eventId = new EventIdentifier(); 

   /** location is an undescribed parameter... */
   protected LiveEntityRelativeWorldCoordinates  location = new LiveEntityRelativeWorldCoordinates(); 

   /** munitionDescriptor is an undescribed parameter... */
   protected MunitionDescriptor  munitionDescriptor = new MunitionDescriptor(); 

   /** velocity is an undescribed parameter... */
   protected LiveEntityLinearVelocity  velocity = new LiveEntityLinearVelocity(); 

   /** range is an undescribed parameter... */
   protected short range;


/** Constructor creates and configures a new instance object */
 public LEFirePdu()
 {
    setPduType( DisPduType.LIVE_ENTITY_FIRE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized LEFirePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized LEFirePdu copyByteBuffer()
 {
     LEFirePdu newCopy = new LEFirePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("LEFirePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace(System.err);
         System.exit(-1); // TODO: Abruptly ending VM not a good practice
     }
     return newCopy;
 }

/** byteArrayOutputStream (baos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/** dataOutputStream (dos) is used for marshal/unmarshal serialization
   * @see copyDataOutputStream() */
protected DataOutputStream      dataOutputStream      = new DataOutputStream(byteArrayOutputStream);

/** copy method creates a deep copy of current object using DataOutputStream methods.
 * @return deep copy of PDU */
 public synchronized LEFirePdu copyDataOutputStream()
 {
     LEFirePdu newCopy = new LEFirePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("LEFirePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace(System.err);
         System.exit(-1); // TODO: Abruptly ending VM not a good practice
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.err.println("LEFirePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
@Override
public synchronized int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (firingLiveEntityId != null)
       marshalSize += firingLiveEntityId.getMarshalledSize();
   marshalSize += 1;  // flags
   if (targetLiveEntityId != null)
       marshalSize += targetLiveEntityId.getMarshalledSize();
   if (munitionLiveEntityId != null)
       marshalSize += munitionLiveEntityId.getMarshalledSize();
   if (eventId != null)
       marshalSize += eventId.getMarshalledSize();
   if (location != null)
       marshalSize += location.getMarshalledSize();
   if (munitionDescriptor != null)
       marshalSize += munitionDescriptor.getMarshalledSize();
   if (velocity != null)
       marshalSize += velocity.getMarshalledSize();
   marshalSize += 2;  // range

   return marshalSize;
}


/** Setter for {@link LEFirePdu#firingLiveEntityId}
  * @param pFiringLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setFiringLiveEntityId(EntityID pFiringLiveEntityId)
{
    firingLiveEntityId = pFiringLiveEntityId;
    return this;
}
/** Getter for {@link LEFirePdu#firingLiveEntityId}
  * @return value of interest */
public EntityID getFiringLiveEntityId()
{
    return firingLiveEntityId;
}


/** Setter for {@link LEFirePdu#flags}
  * @param pFlags new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setFlags(byte pFlags)
{
    flags = pFlags;
    return this;
}
/** Utility setter for {@link LEFirePdu#flags}
  * @param pFlags new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setFlags(int pFlags){
    flags = (byte) pFlags;
    return this;
}
/** Getter for {@link LEFirePdu#flags}
  * @return value of interest */
public byte getFlags()
{
    return flags; 
}

/** Setter for {@link LEFirePdu#targetLiveEntityId}
  * @param pTargetLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setTargetLiveEntityId(EntityID pTargetLiveEntityId)
{
    targetLiveEntityId = pTargetLiveEntityId;
    return this;
}
/** Getter for {@link LEFirePdu#targetLiveEntityId}
  * @return value of interest */
public EntityID getTargetLiveEntityId()
{
    return targetLiveEntityId;
}


/** Setter for {@link LEFirePdu#munitionLiveEntityId}
  * @param pMunitionLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setMunitionLiveEntityId(EntityID pMunitionLiveEntityId)
{
    munitionLiveEntityId = pMunitionLiveEntityId;
    return this;
}
/** Getter for {@link LEFirePdu#munitionLiveEntityId}
  * @return value of interest */
public EntityID getMunitionLiveEntityId()
{
    return munitionLiveEntityId;
}


/** Setter for {@link LEFirePdu#eventId}
  * @param pEventId new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setEventId(EventIdentifier pEventId)
{
    eventId = pEventId;
    return this;
}
/** Getter for {@link LEFirePdu#eventId}
  * @return value of interest */
public EventIdentifier getEventId()
{
    return eventId;
}


/** Setter for {@link LEFirePdu#location}
  * @param pLocation new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setLocation(LiveEntityRelativeWorldCoordinates pLocation)
{
    location = pLocation;
    return this;
}
/** Getter for {@link LEFirePdu#location}
  * @return value of interest */
public LiveEntityRelativeWorldCoordinates getLocation()
{
    return location;
}


/** Setter for {@link LEFirePdu#munitionDescriptor}
  * @param pMunitionDescriptor new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setMunitionDescriptor(MunitionDescriptor pMunitionDescriptor)
{
    munitionDescriptor = pMunitionDescriptor;
    return this;
}
/** Getter for {@link LEFirePdu#munitionDescriptor}
  * @return value of interest */
public MunitionDescriptor getMunitionDescriptor()
{
    return munitionDescriptor;
}


/** Setter for {@link LEFirePdu#velocity}
  * @param pVelocity new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setVelocity(LiveEntityLinearVelocity pVelocity)
{
    velocity = pVelocity;
    return this;
}
/** Getter for {@link LEFirePdu#velocity}
  * @return value of interest */
public LiveEntityLinearVelocity getVelocity()
{
    return velocity;
}


/** Setter for {@link LEFirePdu#range}
  * @param pRange new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setRange(short pRange)
{
    range = pRange;
    return this;
}
/** Utility setter for {@link LEFirePdu#range}
  * @param pRange new value of interest
  * @return same object to permit progressive setters */
public synchronized LEFirePdu setRange(int pRange){
    range = (short) pRange;
    return this;
}
/** Getter for {@link LEFirePdu#range}
  * @return value of interest */
public short getRange()
{
    return range; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
@Override
public synchronized void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       firingLiveEntityId.marshal(dos);
       dos.writeByte(flags);
       targetLiveEntityId.marshal(dos);
       munitionLiveEntityId.marshal(dos);
       eventId.marshal(dos);
       location.marshal(dos);
       munitionDescriptor.marshal(dos);
       velocity.marshal(dos);
       dos.writeShort(range);
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
@Override
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += firingLiveEntityId.unmarshal(dis);
        flags = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += targetLiveEntityId.unmarshal(dis);
        uPosition += munitionLiveEntityId.unmarshal(dis);
        uPosition += eventId.unmarshal(dis);
        uPosition += location.unmarshal(dis);
        uPosition += munitionDescriptor.unmarshal(dis);
        uPosition += velocity.unmarshal(dis);
        range = (short)dis.readUnsignedShort();
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
@Override
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   firingLiveEntityId.marshal(byteBuffer);
   byteBuffer.put( (byte)flags);
   targetLiveEntityId.marshal(byteBuffer);
   munitionLiveEntityId.marshal(byteBuffer);
   eventId.marshal(byteBuffer);
   location.marshal(byteBuffer);
   munitionDescriptor.marshal(byteBuffer);
   velocity.marshal(byteBuffer);
   byteBuffer.putShort( (short)range);
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
@Override
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute firingLiveEntityId marked as not serialized
        firingLiveEntityId.unmarshal(byteBuffer);
        // attribute flags marked as not serialized
        flags = (byte)(byteBuffer.get() & 0xFF);
        // attribute targetLiveEntityId marked as not serialized
        targetLiveEntityId.unmarshal(byteBuffer);
        // attribute munitionLiveEntityId marked as not serialized
        munitionLiveEntityId.unmarshal(byteBuffer);
        // attribute eventId marked as not serialized
        eventId.unmarshal(byteBuffer);
        // attribute location marked as not serialized
        location.unmarshal(byteBuffer);
        // attribute munitionDescriptor marked as not serialized
        munitionDescriptor.unmarshal(byteBuffer);
        // attribute velocity marked as not serialized
        velocity.unmarshal(byteBuffer);
        // attribute range marked as not serialized
        range = (short)(byteBuffer.getShort() & 0xFFFF);
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

@Override
 public synchronized boolean equalsImpl(Object obj)
 {
     final LEFirePdu rhs = (LEFirePdu)obj;

     if( ! Objects.equals(firingLiveEntityId, rhs.firingLiveEntityId) ) return false;
     if( ! (flags == rhs.flags)) return false;
     if( ! Objects.equals(targetLiveEntityId, rhs.targetLiveEntityId) ) return false;
     if( ! Objects.equals(munitionLiveEntityId, rhs.munitionLiveEntityId) ) return false;
     if( ! Objects.equals(eventId, rhs.eventId) ) return false;
     if( ! Objects.equals(location, rhs.location) ) return false;
     if( ! Objects.equals(munitionDescriptor, rhs.munitionDescriptor) ) return false;
     if( ! Objects.equals(velocity, rhs.velocity) ) return false;
     if( ! (range == rhs.range)) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" firingLiveEntityId:").append(firingLiveEntityId); // writeOneToString
    sb.append(" flags:").append(flags); // writeOneToString
    sb.append(" targetLiveEntityId:").append(targetLiveEntityId); // writeOneToString
    sb.append(" munitionLiveEntityId:").append(munitionLiveEntityId); // writeOneToString
    sb.append(" eventId:").append(eventId); // writeOneToString
    sb.append(" location:").append(location); // writeOneToString
    sb.append(" munitionDescriptor:").append(munitionDescriptor); // writeOneToString
    sb.append(" velocity:").append(velocity); // writeOneToString
    sb.append(" range:").append(range); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.firingLiveEntityId,
	                     this.flags,
	                     this.targetLiveEntityId,
	                     this.munitionLiveEntityId,
	                     this.eventId,
	                     this.location,
	                     this.munitionDescriptor,
	                     this.velocity,
	                     this.range);
 }
} // end of LEFirePdu
