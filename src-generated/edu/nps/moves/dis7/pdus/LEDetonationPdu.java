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
 * 9.4.6 Communicate information associated with the impact or detonation of a munition.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class LEDetonationPdu extends LiveEntityFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "LEDetonationPdu";
   
   /** firingLiveEntityId is an undescribed parameter... */
   protected EntityID  firingLiveEntityId = new EntityID(); 

   /** detonationFlag1 is an undescribed parameter... */
   protected byte detonationFlag1;

   /** detonationFlag2 is an undescribed parameter... */
   protected byte detonationFlag2;

   /** targetLiveEntityId is an undescribed parameter... */
   protected EntityID  targetLiveEntityId = new EntityID(); 

   /** munitionLiveEntityId is an undescribed parameter... */
   protected EntityID  munitionLiveEntityId = new EntityID(); 

   /** eventId is an undescribed parameter... */
   protected EventIdentifier  eventId = new EventIdentifier(); 

   /** worldLocation is an undescribed parameter... */
   protected LiveEntityRelativeWorldCoordinates  worldLocation = new LiveEntityRelativeWorldCoordinates(); 

   /** velocity is an undescribed parameter... */
   protected LiveEntityLinearVelocity  velocity = new LiveEntityLinearVelocity(); 

   /** spec error? 16-bit fields vs. 8-bit in TspiPdu? */
   protected LiveEntityOrientation16  munitionOrientation = new LiveEntityOrientation16(); 

   /** munitionDescriptor is an undescribed parameter... */
   protected MunitionDescriptor  munitionDescriptor = new MunitionDescriptor(); 

   /** entityLocation is an undescribed parameter... */
   protected LiveEntityLinearVelocity  entityLocation = new LiveEntityLinearVelocity(); 

   /** detonationResult is an undescribed parameter... */
   protected byte detonationResult;


/** Constructor creates and configures a new instance object */
 public LEDetonationPdu()
 {
    setPduType( DisPduType.LIVE_ENTITY_DETONATION );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized LEDetonationPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized LEDetonationPdu copyByteBuffer()
 {
     LEDetonationPdu newCopy = new LEDetonationPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("LEDetonationPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized LEDetonationPdu copyDataOutputStream()
 {
     LEDetonationPdu newCopy = new LEDetonationPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("LEDetonationPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("LEDetonationPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   marshalSize += 1;  // detonationFlag1
   marshalSize += 1;  // detonationFlag2
   if (targetLiveEntityId != null)
       marshalSize += targetLiveEntityId.getMarshalledSize();
   if (munitionLiveEntityId != null)
       marshalSize += munitionLiveEntityId.getMarshalledSize();
   if (eventId != null)
       marshalSize += eventId.getMarshalledSize();
   if (worldLocation != null)
       marshalSize += worldLocation.getMarshalledSize();
   if (velocity != null)
       marshalSize += velocity.getMarshalledSize();
   if (munitionOrientation != null)
       marshalSize += munitionOrientation.getMarshalledSize();
   if (munitionDescriptor != null)
       marshalSize += munitionDescriptor.getMarshalledSize();
   if (entityLocation != null)
       marshalSize += entityLocation.getMarshalledSize();
   marshalSize += 1;  // detonationResult

   return marshalSize;
}


/** Setter for {@link LEDetonationPdu#firingLiveEntityId}
  * @param pFiringLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setFiringLiveEntityId(EntityID pFiringLiveEntityId)
{
    firingLiveEntityId = pFiringLiveEntityId;
    return this;
}
/** Getter for {@link LEDetonationPdu#firingLiveEntityId}
  * @return value of interest */
public EntityID getFiringLiveEntityId()
{
    return firingLiveEntityId;
}


/** Setter for {@link LEDetonationPdu#detonationFlag1}
  * @param pDetonationFlag1 new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setDetonationFlag1(byte pDetonationFlag1)
{
    detonationFlag1 = pDetonationFlag1;
    return this;
}
/** Utility setter for {@link LEDetonationPdu#detonationFlag1}
  * @param pDetonationFlag1 new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setDetonationFlag1(int pDetonationFlag1){
    detonationFlag1 = (byte) pDetonationFlag1;
    return this;
}
/** Getter for {@link LEDetonationPdu#detonationFlag1}
  * @return value of interest */
public byte getDetonationFlag1()
{
    return detonationFlag1; 
}

/** Setter for {@link LEDetonationPdu#detonationFlag2}
  * @param pDetonationFlag2 new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setDetonationFlag2(byte pDetonationFlag2)
{
    detonationFlag2 = pDetonationFlag2;
    return this;
}
/** Utility setter for {@link LEDetonationPdu#detonationFlag2}
  * @param pDetonationFlag2 new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setDetonationFlag2(int pDetonationFlag2){
    detonationFlag2 = (byte) pDetonationFlag2;
    return this;
}
/** Getter for {@link LEDetonationPdu#detonationFlag2}
  * @return value of interest */
public byte getDetonationFlag2()
{
    return detonationFlag2; 
}

/** Setter for {@link LEDetonationPdu#targetLiveEntityId}
  * @param pTargetLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setTargetLiveEntityId(EntityID pTargetLiveEntityId)
{
    targetLiveEntityId = pTargetLiveEntityId;
    return this;
}
/** Getter for {@link LEDetonationPdu#targetLiveEntityId}
  * @return value of interest */
public EntityID getTargetLiveEntityId()
{
    return targetLiveEntityId;
}


/** Setter for {@link LEDetonationPdu#munitionLiveEntityId}
  * @param pMunitionLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setMunitionLiveEntityId(EntityID pMunitionLiveEntityId)
{
    munitionLiveEntityId = pMunitionLiveEntityId;
    return this;
}
/** Getter for {@link LEDetonationPdu#munitionLiveEntityId}
  * @return value of interest */
public EntityID getMunitionLiveEntityId()
{
    return munitionLiveEntityId;
}


/** Setter for {@link LEDetonationPdu#eventId}
  * @param pEventId new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setEventId(EventIdentifier pEventId)
{
    eventId = pEventId;
    return this;
}
/** Getter for {@link LEDetonationPdu#eventId}
  * @return value of interest */
public EventIdentifier getEventId()
{
    return eventId;
}


/** Setter for {@link LEDetonationPdu#worldLocation}
  * @param pWorldLocation new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setWorldLocation(LiveEntityRelativeWorldCoordinates pWorldLocation)
{
    worldLocation = pWorldLocation;
    return this;
}
/** Getter for {@link LEDetonationPdu#worldLocation}
  * @return value of interest */
public LiveEntityRelativeWorldCoordinates getWorldLocation()
{
    return worldLocation;
}


/** Setter for {@link LEDetonationPdu#velocity}
  * @param pVelocity new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setVelocity(LiveEntityLinearVelocity pVelocity)
{
    velocity = pVelocity;
    return this;
}
/** Getter for {@link LEDetonationPdu#velocity}
  * @return value of interest */
public LiveEntityLinearVelocity getVelocity()
{
    return velocity;
}


/** Setter for {@link LEDetonationPdu#munitionOrientation}
  * @param pMunitionOrientation new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setMunitionOrientation(LiveEntityOrientation16 pMunitionOrientation)
{
    munitionOrientation = pMunitionOrientation;
    return this;
}
/** Getter for {@link LEDetonationPdu#munitionOrientation}
  * @return value of interest */
public LiveEntityOrientation16 getMunitionOrientation()
{
    return munitionOrientation;
}


/** Setter for {@link LEDetonationPdu#munitionDescriptor}
  * @param pMunitionDescriptor new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setMunitionDescriptor(MunitionDescriptor pMunitionDescriptor)
{
    munitionDescriptor = pMunitionDescriptor;
    return this;
}
/** Getter for {@link LEDetonationPdu#munitionDescriptor}
  * @return value of interest */
public MunitionDescriptor getMunitionDescriptor()
{
    return munitionDescriptor;
}


/** Setter for {@link LEDetonationPdu#entityLocation}
  * @param pEntityLocation new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setEntityLocation(LiveEntityLinearVelocity pEntityLocation)
{
    entityLocation = pEntityLocation;
    return this;
}
/** Getter for {@link LEDetonationPdu#entityLocation}
  * @return value of interest */
public LiveEntityLinearVelocity getEntityLocation()
{
    return entityLocation;
}


/** Setter for {@link LEDetonationPdu#detonationResult}
  * @param pDetonationResult new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setDetonationResult(byte pDetonationResult)
{
    detonationResult = pDetonationResult;
    return this;
}
/** Utility setter for {@link LEDetonationPdu#detonationResult}
  * @param pDetonationResult new value of interest
  * @return same object to permit progressive setters */
public synchronized LEDetonationPdu setDetonationResult(int pDetonationResult){
    detonationResult = (byte) pDetonationResult;
    return this;
}
/** Getter for {@link LEDetonationPdu#detonationResult}
  * @return value of interest */
public byte getDetonationResult()
{
    return detonationResult; 
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
       dos.writeByte(detonationFlag1);
       dos.writeByte(detonationFlag2);
       targetLiveEntityId.marshal(dos);
       munitionLiveEntityId.marshal(dos);
       eventId.marshal(dos);
       worldLocation.marshal(dos);
       velocity.marshal(dos);
       munitionOrientation.marshal(dos);
       munitionDescriptor.marshal(dos);
       entityLocation.marshal(dos);
       dos.writeByte(detonationResult);
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
        detonationFlag1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        detonationFlag2 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += targetLiveEntityId.unmarshal(dis);
        uPosition += munitionLiveEntityId.unmarshal(dis);
        uPosition += eventId.unmarshal(dis);
        uPosition += worldLocation.unmarshal(dis);
        uPosition += velocity.unmarshal(dis);
        uPosition += munitionOrientation.unmarshal(dis);
        uPosition += munitionDescriptor.unmarshal(dis);
        uPosition += entityLocation.unmarshal(dis);
        detonationResult = (byte)dis.readUnsignedByte();
        uPosition += 1;
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
   byteBuffer.put( (byte)detonationFlag1);
   byteBuffer.put( (byte)detonationFlag2);
   targetLiveEntityId.marshal(byteBuffer);
   munitionLiveEntityId.marshal(byteBuffer);
   eventId.marshal(byteBuffer);
   worldLocation.marshal(byteBuffer);
   velocity.marshal(byteBuffer);
   munitionOrientation.marshal(byteBuffer);
   munitionDescriptor.marshal(byteBuffer);
   entityLocation.marshal(byteBuffer);
   byteBuffer.put( (byte)detonationResult);
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
        // attribute detonationFlag1 marked as not serialized
        detonationFlag1 = (byte)(byteBuffer.get() & 0xFF);
        // attribute detonationFlag2 marked as not serialized
        detonationFlag2 = (byte)(byteBuffer.get() & 0xFF);
        // attribute targetLiveEntityId marked as not serialized
        targetLiveEntityId.unmarshal(byteBuffer);
        // attribute munitionLiveEntityId marked as not serialized
        munitionLiveEntityId.unmarshal(byteBuffer);
        // attribute eventId marked as not serialized
        eventId.unmarshal(byteBuffer);
        // attribute worldLocation marked as not serialized
        worldLocation.unmarshal(byteBuffer);
        // attribute velocity marked as not serialized
        velocity.unmarshal(byteBuffer);
        // attribute munitionOrientation marked as not serialized
        munitionOrientation.unmarshal(byteBuffer);
        // attribute munitionDescriptor marked as not serialized
        munitionDescriptor.unmarshal(byteBuffer);
        // attribute entityLocation marked as not serialized
        entityLocation.unmarshal(byteBuffer);
        // attribute detonationResult marked as not serialized
        detonationResult = (byte)(byteBuffer.get() & 0xFF);
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
     final LEDetonationPdu rhs = (LEDetonationPdu)obj;

     if( ! Objects.equals(firingLiveEntityId, rhs.firingLiveEntityId) ) return false;
     if( ! (detonationFlag1 == rhs.detonationFlag1)) return false;
     if( ! (detonationFlag2 == rhs.detonationFlag2)) return false;
     if( ! Objects.equals(targetLiveEntityId, rhs.targetLiveEntityId) ) return false;
     if( ! Objects.equals(munitionLiveEntityId, rhs.munitionLiveEntityId) ) return false;
     if( ! Objects.equals(eventId, rhs.eventId) ) return false;
     if( ! Objects.equals(worldLocation, rhs.worldLocation) ) return false;
     if( ! Objects.equals(velocity, rhs.velocity) ) return false;
     if( ! Objects.equals(munitionOrientation, rhs.munitionOrientation) ) return false;
     if( ! Objects.equals(munitionDescriptor, rhs.munitionDescriptor) ) return false;
     if( ! Objects.equals(entityLocation, rhs.entityLocation) ) return false;
     if( ! (detonationResult == rhs.detonationResult)) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" firingLiveEntityId:").append(firingLiveEntityId); // writeOneToString
    sb.append(" detonationFlag1:").append(detonationFlag1); // writeOneToString
    sb.append(" detonationFlag2:").append(detonationFlag2); // writeOneToString
    sb.append(" targetLiveEntityId:").append(targetLiveEntityId); // writeOneToString
    sb.append(" munitionLiveEntityId:").append(munitionLiveEntityId); // writeOneToString
    sb.append(" eventId:").append(eventId); // writeOneToString
    sb.append(" worldLocation:").append(worldLocation); // writeOneToString
    sb.append(" velocity:").append(velocity); // writeOneToString
    sb.append(" munitionOrientation:").append(munitionOrientation); // writeOneToString
    sb.append(" munitionDescriptor:").append(munitionDescriptor); // writeOneToString
    sb.append(" entityLocation:").append(entityLocation); // writeOneToString
    sb.append(" detonationResult:").append(detonationResult); // writeOneToString

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.firingLiveEntityId,
	                     this.detonationFlag1,
	                     this.detonationFlag2,
	                     this.targetLiveEntityId,
	                     this.munitionLiveEntityId,
	                     this.eventId,
	                     this.worldLocation,
	                     this.velocity,
	                     this.munitionOrientation,
	                     this.munitionDescriptor,
	                     this.entityLocation,
	                     this.detonationResult);
 }
} // end of LEDetonationPdu
