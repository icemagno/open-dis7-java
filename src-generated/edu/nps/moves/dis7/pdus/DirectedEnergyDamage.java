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
 * Damage sustained by an entity due to directed energy. Location of the damage based on a relative x,y,z location from the center of the entity. Section 6.2.15.2
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class DirectedEnergyDamage extends Object implements Serializable
{
   /** DE Record Type. */
   protected int recordType = (int)4500;

   /** DE Record Length (bytes) */
   protected short recordLength = (short)40;

   /** zero-filled array of padding bits for byte alignment and consistent sizing of PDU data */
   protected short padding = (short)0;

   /** location of damage, relative to center of entity */
   protected Vector3Float  damageLocation = new Vector3Float(); 

   /** Size of damaged area, in meters */
   protected float damageDiameter;

   /** average temp of the damaged area, in degrees celsius. If firing entitty does not model this, use a value of -273.15 */
   protected float temperature = (float)-273.15;

   /** enumeration uid 314 */
   protected EntityDamageStatusComponentIdentification componentIdentification = EntityDamageStatusComponentIdentification.values()[0];

   /** enumeration uid 315 */
   protected DEDamageDescriptionComponentDamageStatus componentDamageStatus = DEDamageDescriptionComponentDamageStatus.values()[0];

   /** enumeration uid 317 */
   protected DEDamageDescriptionComponentVisualDamageStatus componentVisualDamageStatus = new DEDamageDescriptionComponentVisualDamageStatus();

   /** enumeration uid 316 */
   protected DEDamageDescriptionComponentVisualSmokeColor componentVisualSmokeColor = DEDamageDescriptionComponentVisualSmokeColor.values()[0];

   /** For any component damage resulting this field shall be set to the fire event ID from that PDU. */
   protected EventIdentifier  fireEventID = new EventIdentifier(); 

   /** padding */
   protected short padding2 = (short)0;


/** Constructor creates and configures a new instance object */
 public DirectedEnergyDamage()
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

   marshalSize += 4;  // recordType
   marshalSize += 2;  // recordLength
   marshalSize += 2;  // padding
   if (damageLocation != null)
       marshalSize += damageLocation.getMarshalledSize();
   marshalSize += 4;  // damageDiameter
   marshalSize += 4;  // temperature
   if (componentIdentification != null)
       marshalSize += componentIdentification.getMarshalledSize();
   if (componentDamageStatus != null)
       marshalSize += componentDamageStatus.getMarshalledSize();
   if (componentVisualDamageStatus != null)
       marshalSize += componentVisualDamageStatus.getMarshalledSize();
   if (componentVisualSmokeColor != null)
       marshalSize += componentVisualSmokeColor.getMarshalledSize();
   if (fireEventID != null)
       marshalSize += fireEventID.getMarshalledSize();
   marshalSize += 2;  // padding2

   return marshalSize;
}


/** Setter for {@link DirectedEnergyDamage#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setRecordType(int pRecordType)
{
    recordType = pRecordType;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#recordType}
  * @return value of interest */
public int getRecordType()
{
    return recordType; 
}

/** Setter for {@link DirectedEnergyDamage#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setRecordLength(short pRecordLength)
{
    recordLength = pRecordLength;
    return this;
}
/** Utility setter for {@link DirectedEnergyDamage#recordLength}
  * @param pRecordLength new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setRecordLength(int pRecordLength){
    recordLength = (short) pRecordLength;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#recordLength}
  * @return value of interest */
public short getRecordLength()
{
    return recordLength; 
}

/** Setter for {@link DirectedEnergyDamage#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setPadding(short pPadding)
{
    padding = pPadding;
    return this;
}
/** Utility setter for {@link DirectedEnergyDamage#padding}
  * @param pPadding new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setPadding(int pPadding){
    padding = (short) pPadding;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#padding}
  * @return value of interest */
public short getPadding()
{
    return padding; 
}

/** Setter for {@link DirectedEnergyDamage#damageLocation}
  * @param pDamageLocation new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setDamageLocation(Vector3Float pDamageLocation)
{
    damageLocation = pDamageLocation;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#damageLocation}
  * @return value of interest */
public Vector3Float getDamageLocation()
{
    return damageLocation;
}


/** Setter for {@link DirectedEnergyDamage#damageDiameter}
  * @param pDamageDiameter new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setDamageDiameter(float pDamageDiameter)
{
    damageDiameter = pDamageDiameter;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#damageDiameter}
  * @return value of interest */
public float getDamageDiameter()
{
    return damageDiameter; 
}

/** Setter for {@link DirectedEnergyDamage#temperature}
  * @param pTemperature new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setTemperature(float pTemperature)
{
    temperature = pTemperature;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#temperature}
  * @return value of interest */
public float getTemperature()
{
    return temperature; 
}

/** Setter for {@link DirectedEnergyDamage#componentIdentification}
  * @param pComponentIdentification new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setComponentIdentification(EntityDamageStatusComponentIdentification pComponentIdentification)
{
    componentIdentification = pComponentIdentification;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#componentIdentification}
  * @return value of interest */
public EntityDamageStatusComponentIdentification getComponentIdentification()
{
    return componentIdentification; 
}

/** Setter for {@link DirectedEnergyDamage#componentDamageStatus}
  * @param pComponentDamageStatus new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setComponentDamageStatus(DEDamageDescriptionComponentDamageStatus pComponentDamageStatus)
{
    componentDamageStatus = pComponentDamageStatus;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#componentDamageStatus}
  * @return value of interest */
public DEDamageDescriptionComponentDamageStatus getComponentDamageStatus()
{
    return componentDamageStatus; 
}

/** Setter for {@link DirectedEnergyDamage#componentVisualDamageStatus}
  * @param pComponentVisualDamageStatus new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setComponentVisualDamageStatus(DEDamageDescriptionComponentVisualDamageStatus pComponentVisualDamageStatus)
{
    componentVisualDamageStatus = pComponentVisualDamageStatus;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#componentVisualDamageStatus}
  * @return value of interest */
public DEDamageDescriptionComponentVisualDamageStatus getComponentVisualDamageStatus()
{
    return componentVisualDamageStatus; 
}

/** Setter for {@link DirectedEnergyDamage#componentVisualSmokeColor}
  * @param pComponentVisualSmokeColor new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setComponentVisualSmokeColor(DEDamageDescriptionComponentVisualSmokeColor pComponentVisualSmokeColor)
{
    componentVisualSmokeColor = pComponentVisualSmokeColor;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#componentVisualSmokeColor}
  * @return value of interest */
public DEDamageDescriptionComponentVisualSmokeColor getComponentVisualSmokeColor()
{
    return componentVisualSmokeColor; 
}

/** Setter for {@link DirectedEnergyDamage#fireEventID}
  * @param pFireEventID new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setFireEventID(EventIdentifier pFireEventID)
{
    fireEventID = pFireEventID;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#fireEventID}
  * @return value of interest */
public EventIdentifier getFireEventID()
{
    return fireEventID;
}


/** Setter for {@link DirectedEnergyDamage#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link DirectedEnergyDamage#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public synchronized DirectedEnergyDamage setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}
/** Getter for {@link DirectedEnergyDamage#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
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
       dos.writeInt(recordType);
       dos.writeShort(recordLength);
       dos.writeShort(padding);
       damageLocation.marshal(dos);
       dos.writeFloat(damageDiameter);
       dos.writeFloat(temperature);
       componentIdentification.marshal(dos);
       componentDamageStatus.marshal(dos);
       componentVisualDamageStatus.marshal(dos);
       componentVisualSmokeColor.marshal(dos);
       fireEventID.marshal(dos);
       dos.writeShort(padding2);
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
        recordType = dis.readInt();
        uPosition += 4;
        recordLength = (short)dis.readUnsignedShort();
        uPosition += 2;
        padding = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += damageLocation.unmarshal(dis);
        damageDiameter = dis.readFloat();
        uPosition += 4;
        temperature = dis.readFloat();
        uPosition += 4;
        componentIdentification = EntityDamageStatusComponentIdentification.unmarshalEnum(dis);
        uPosition += componentIdentification.getMarshalledSize();
        componentDamageStatus = DEDamageDescriptionComponentDamageStatus.unmarshalEnum(dis);
        uPosition += componentDamageStatus.getMarshalledSize();
        uPosition += componentVisualDamageStatus.unmarshal(dis);
        componentVisualSmokeColor = DEDamageDescriptionComponentVisualSmokeColor.unmarshalEnum(dis);
        uPosition += componentVisualSmokeColor.getMarshalledSize();
        uPosition += fireEventID.unmarshal(dis);
        padding2 = (short)dis.readUnsignedShort();
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
   byteBuffer.putInt( (int)recordType);
   byteBuffer.putShort( (short)recordLength);
   byteBuffer.putShort( (short)padding);
   damageLocation.marshal(byteBuffer);
   byteBuffer.putFloat( (float)damageDiameter);
   byteBuffer.putFloat( (float)temperature);
   componentIdentification.marshal(byteBuffer);
   componentDamageStatus.marshal(byteBuffer);
   componentVisualDamageStatus.marshal(byteBuffer);
   componentVisualSmokeColor.marshal(byteBuffer);
   fireEventID.marshal(byteBuffer);
   byteBuffer.putShort( (short)padding2);
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
        // attribute recordType marked as not serialized
        recordType = byteBuffer.getInt();
        // attribute recordLength marked as not serialized
        recordLength = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute padding marked as not serialized
        padding = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute damageLocation marked as not serialized
        damageLocation.unmarshal(byteBuffer);
        // attribute damageDiameter marked as not serialized
        damageDiameter = byteBuffer.getFloat();
        // attribute temperature marked as not serialized
        temperature = byteBuffer.getFloat();
        // attribute componentIdentification marked as not serialized
        componentIdentification = EntityDamageStatusComponentIdentification.unmarshalEnum(byteBuffer);
        // attribute componentDamageStatus marked as not serialized
        componentDamageStatus = DEDamageDescriptionComponentDamageStatus.unmarshalEnum(byteBuffer);
        // attribute componentVisualDamageStatus marked as not serialized
        componentVisualDamageStatus.unmarshal(byteBuffer);
        // attribute componentVisualSmokeColor marked as not serialized
        componentVisualSmokeColor = DEDamageDescriptionComponentVisualSmokeColor.unmarshalEnum(byteBuffer);
        // attribute fireEventID marked as not serialized
        fireEventID.unmarshal(byteBuffer);
        // attribute padding2 marked as not serialized
        padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final DirectedEnergyDamage rhs = (DirectedEnergyDamage)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (recordLength == rhs.recordLength)) ivarsEqual = false;
     if( ! (padding == rhs.padding)) ivarsEqual = false;
     if( ! (damageLocation.equals( rhs.damageLocation) )) ivarsEqual = false;
     if( ! (damageDiameter == rhs.damageDiameter)) ivarsEqual = false;
     if( ! (temperature == rhs.temperature)) ivarsEqual = false;
     if( ! (componentIdentification == rhs.componentIdentification)) ivarsEqual = false;
     if( ! (componentDamageStatus == rhs.componentDamageStatus)) ivarsEqual = false;
     if( ! (componentVisualDamageStatus.equals( rhs.componentVisualDamageStatus) )) ivarsEqual = false;
     if( ! (componentVisualSmokeColor == rhs.componentVisualSmokeColor)) ivarsEqual = false;
     if( ! (fireEventID.equals( rhs.fireEventID) )) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" recordType:").append(recordType); // writeOneToString
    sb.append(" recordLength:").append(recordLength); // writeOneToString
    sb.append(" padding:").append(padding); // writeOneToString
    sb.append(" damageLocation:").append(damageLocation); // writeOneToString
    sb.append(" damageDiameter:").append(damageDiameter); // writeOneToString
    sb.append(" temperature:").append(temperature); // writeOneToString
    sb.append(" componentIdentification:").append(componentIdentification); // writeOneToString
    sb.append(" componentDamageStatus:").append(componentDamageStatus); // writeOneToString
    sb.append(" componentVisualDamageStatus:").append(componentVisualDamageStatus); // writeOneToString
    sb.append(" componentVisualSmokeColor:").append(componentVisualSmokeColor); // writeOneToString
    sb.append(" fireEventID:").append(fireEventID); // writeOneToString
    sb.append(" padding2:").append(padding2); // writeOneToString

   return sb.toString();
 }
} // end of class
