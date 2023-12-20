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
 * 7.3.2 Used to communicate the firing of a weapon or expendable.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class FirePdu extends WarfareFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "FirePdu";
   
   /** ID of the entity that shot */
   protected EntityID  firingEntityID = new EntityID(); 

   /** ID of the entity that is being shot at */
   protected EntityID  targetEntityID = new EntityID(); 

   /** This field shall specify the entity identification of the fired munition or expendable. This field shall be represented by an Entity Identifier record (see 6.2.28). */
   protected EntityID  munitionExpendibleID = new EntityID(); 

   /** This field shall contain an identification generated by the firing entity to associate related firing and detonation events. This field shall be represented by an Event Identifier record (see 6.2.34). */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** This field shall identify the fire mission (see 5.4.3.3). This field shall be represented by a 32-bit unsigned integer. */
   protected int fireMissionIndex;

   /** This field shall specify the location, in world coordinates, from which the munition was launched, and shall be represented by a World Coordinates record (see 6.2.97). */
   protected Vector3Double  locationInWorldCoordinates = new Vector3Double(); 

   /** This field shall describe the firing or launch of a munition or expendable represented by one of the following types of Descriptor records: Munition Descriptor (6.2.20.2) or Expendable Descriptor (6.2.20.4). */
   protected MunitionDescriptor  descriptor = new MunitionDescriptor(); 

   /** This field shall specify the velocity of the fired munition at the point when the issuing simulation application intends the externally visible effects of the launch (e.g. exhaust plume or muzzle blast) to first become apparent. The velocity shall be represented in world coordinates. This field shall be represented by a Linear Velocity Vector record [see 6.2.95 item c)]. */
   protected Vector3Float  velocity = new Vector3Float(); 

   /** This field shall specify the range that an entity's fire control system has assumed in computing the fire control solution. This field shall be represented by a 32-bit floating point number in meters. For systems where range is unknown or unavailable, this field shall contain a value of zero. */
   protected float range;


/** Constructor creates and configures a new instance object */
 public FirePdu()
 {
    setPduType( DisPduType.FIRE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized FirePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized FirePdu copyByteBuffer()
 {
     FirePdu newCopy = new FirePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("FirePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized FirePdu copyDataOutputStream()
 {
     FirePdu newCopy = new FirePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("FirePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("FirePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (firingEntityID != null)
       marshalSize += firingEntityID.getMarshalledSize();
   if (targetEntityID != null)
       marshalSize += targetEntityID.getMarshalledSize();
   if (munitionExpendibleID != null)
       marshalSize += munitionExpendibleID.getMarshalledSize();
   if (eventID != null)
       marshalSize += eventID.getMarshalledSize();
   marshalSize += 4;  // fireMissionIndex
   if (locationInWorldCoordinates != null)
       marshalSize += locationInWorldCoordinates.getMarshalledSize();
   if (descriptor != null)
       marshalSize += descriptor.getMarshalledSize();
   if (velocity != null)
       marshalSize += velocity.getMarshalledSize();
   marshalSize += 4;  // range

   return marshalSize;
}


/** Setter for {@link FirePdu#firingEntityID}
  * @param pFiringEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setFiringEntityID(EntityID pFiringEntityID)
{
    firingEntityID = pFiringEntityID;
    return this;
}
/** Getter for {@link FirePdu#firingEntityID}
  * @return value of interest */
public EntityID getFiringEntityID()
{
    return firingEntityID;
}


/** Setter for {@link FirePdu#targetEntityID}
  * @param pTargetEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setTargetEntityID(EntityID pTargetEntityID)
{
    targetEntityID = pTargetEntityID;
    return this;
}
/** Getter for {@link FirePdu#targetEntityID}
  * @return value of interest */
public EntityID getTargetEntityID()
{
    return targetEntityID;
}


/** Setter for {@link FirePdu#munitionExpendibleID}
  * @param pMunitionExpendibleID new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setMunitionExpendibleID(EntityID pMunitionExpendibleID)
{
    munitionExpendibleID = pMunitionExpendibleID;
    return this;
}
/** Getter for {@link FirePdu#munitionExpendibleID}
  * @return value of interest */
public EntityID getMunitionExpendibleID()
{
    return munitionExpendibleID;
}


/** Setter for {@link FirePdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}
/** Getter for {@link FirePdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID;
}


/** Setter for {@link FirePdu#fireMissionIndex}
  * @param pFireMissionIndex new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setFireMissionIndex(int pFireMissionIndex)
{
    fireMissionIndex = pFireMissionIndex;
    return this;
}
/** Getter for {@link FirePdu#fireMissionIndex}
  * @return value of interest */
public int getFireMissionIndex()
{
    return fireMissionIndex; 
}

/** Setter for {@link FirePdu#locationInWorldCoordinates}
  * @param pLocationInWorldCoordinates new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setLocationInWorldCoordinates(Vector3Double pLocationInWorldCoordinates)
{
    locationInWorldCoordinates = pLocationInWorldCoordinates;
    return this;
}
/** Getter for {@link FirePdu#locationInWorldCoordinates}
  * @return value of interest */
public Vector3Double getLocationInWorldCoordinates()
{
    return locationInWorldCoordinates;
}


/** Setter for {@link FirePdu#descriptor}
  * @param pDescriptor new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setDescriptor(MunitionDescriptor pDescriptor)
{
    descriptor = pDescriptor;
    return this;
}
/** Getter for {@link FirePdu#descriptor}
  * @return value of interest */
public MunitionDescriptor getDescriptor()
{
    return descriptor;
}


/** Setter for {@link FirePdu#velocity}
  * @param pVelocity new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setVelocity(Vector3Float pVelocity)
{
    velocity = pVelocity;
    return this;
}
/** Getter for {@link FirePdu#velocity}
  * @return value of interest */
public Vector3Float getVelocity()
{
    return velocity;
}


/** Setter for {@link FirePdu#range}
  * @param pRange new value of interest
  * @return same object to permit progressive setters */
public synchronized FirePdu setRange(float pRange)
{
    range = pRange;
    return this;
}
/** Getter for {@link FirePdu#range}
  * @return value of interest */
public float getRange()
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
       firingEntityID.marshal(dos);
       targetEntityID.marshal(dos);
       munitionExpendibleID.marshal(dos);
       eventID.marshal(dos);
       dos.writeInt(fireMissionIndex);
       locationInWorldCoordinates.marshal(dos);
       descriptor.marshal(dos);
       velocity.marshal(dos);
       dos.writeFloat(range);
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
        uPosition += firingEntityID.unmarshal(dis);
        uPosition += targetEntityID.unmarshal(dis);
        uPosition += munitionExpendibleID.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        fireMissionIndex = dis.readInt();
        uPosition += 4;
        uPosition += locationInWorldCoordinates.unmarshal(dis);
        uPosition += descriptor.unmarshal(dis);
        uPosition += velocity.unmarshal(dis);
        range = dis.readFloat();
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
@Override
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   firingEntityID.marshal(byteBuffer);
   targetEntityID.marshal(byteBuffer);
   munitionExpendibleID.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   byteBuffer.putInt( (int)fireMissionIndex);
   locationInWorldCoordinates.marshal(byteBuffer);
   descriptor.marshal(byteBuffer);
   velocity.marshal(byteBuffer);
   byteBuffer.putFloat( (float)range);
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
        // attribute firingEntityID marked as not serialized
        firingEntityID.unmarshal(byteBuffer);
        // attribute targetEntityID marked as not serialized
        targetEntityID.unmarshal(byteBuffer);
        // attribute munitionExpendibleID marked as not serialized
        munitionExpendibleID.unmarshal(byteBuffer);
        // attribute eventID marked as not serialized
        eventID.unmarshal(byteBuffer);
        // attribute fireMissionIndex marked as not serialized
        fireMissionIndex = byteBuffer.getInt();
        // attribute locationInWorldCoordinates marked as not serialized
        locationInWorldCoordinates.unmarshal(byteBuffer);
        // attribute descriptor marked as not serialized
        descriptor.unmarshal(byteBuffer);
        // attribute velocity marked as not serialized
        velocity.unmarshal(byteBuffer);
        // attribute range marked as not serialized
        range = byteBuffer.getFloat();
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
     boolean ivarsEqual = true;

     final FirePdu rhs = (FirePdu)obj;

     if( ! (firingEntityID.equals( rhs.firingEntityID) )) ivarsEqual = false;
     if( ! (targetEntityID.equals( rhs.targetEntityID) )) ivarsEqual = false;
     if( ! (munitionExpendibleID.equals( rhs.munitionExpendibleID) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (fireMissionIndex == rhs.fireMissionIndex)) ivarsEqual = false;
     if( ! (locationInWorldCoordinates.equals( rhs.locationInWorldCoordinates) )) ivarsEqual = false;
     if( ! (descriptor.equals( rhs.descriptor) )) ivarsEqual = false;
     if( ! (velocity.equals( rhs.velocity) )) ivarsEqual = false;
     if( ! (range == rhs.range)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" firingEntityID:").append(firingEntityID); // writeOneToString
    sb.append(" targetEntityID:").append(targetEntityID); // writeOneToString
    sb.append(" munitionExpendibleID:").append(munitionExpendibleID); // writeOneToString
    sb.append(" eventID:").append(eventID); // writeOneToString
    sb.append(" fireMissionIndex:").append(fireMissionIndex); // writeOneToString
    sb.append(" locationInWorldCoordinates:").append(locationInWorldCoordinates); // writeOneToString
    sb.append(" descriptor:").append(descriptor); // writeOneToString
    sb.append(" velocity:").append(velocity); // writeOneToString
    sb.append(" range:").append(range); // writeOneToString

   return sb.toString();
 }
} // end of class
