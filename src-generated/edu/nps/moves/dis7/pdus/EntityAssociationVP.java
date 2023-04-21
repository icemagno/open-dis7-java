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
 * Association or disassociation of two entities.  Section 6.2.94.4.3
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class EntityAssociationVP extends Object implements Serializable
{
   /** The identification of the Variable Parameter record. Enumeration from EBV uid 56 */
   protected VariableParameterRecordType recordType = VariableParameterRecordType.ENTITY_ASSOCIATION;

   /** Indicates if this VP has changed since last issuance uid 320 */
   protected EntityVPRecordChangeIndicator changeIndicator = EntityVPRecordChangeIndicator.values()[0];

   /** Indicates association status between two entities uid 319 */
   protected EntityAssociationAssociationType associationStatus = EntityAssociationAssociationType.values()[0];

   /** Type of association; 8-bit enum uid 323 */
   protected EntityAssociationPhysicalAssociationType associationType = EntityAssociationPhysicalAssociationType.values()[0];

   /** Object ID of entity associated with this entity */
   protected EntityID  entityID = new EntityID(); 

   /** Station location on one's own entity uid 212 */
   protected IsPartOfStationName ownStationLocation = IsPartOfStationName.values()[0];

   /** Type of physical connection uid 324 */
   protected EntityAssociationPhysicalConnectionType physicalConnectionType = EntityAssociationPhysicalConnectionType.values()[0];

   /** Type of member the entity is within the group uid 321 */
   protected EntityAssociationGroupMemberType groupMemberType = EntityAssociationGroupMemberType.values()[0];

   /** Group if any to which the entity belongs */
   protected short groupNumber;


/** Constructor creates and configures a new instance object */
 public EntityAssociationVP()
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

   if (recordType != null)
       marshalSize += recordType.getMarshalledSize();
   if (changeIndicator != null)
       marshalSize += changeIndicator.getMarshalledSize();
   if (associationStatus != null)
       marshalSize += associationStatus.getMarshalledSize();
   if (associationType != null)
       marshalSize += associationType.getMarshalledSize();
   if (entityID != null)
       marshalSize += entityID.getMarshalledSize();
   if (ownStationLocation != null)
       marshalSize += ownStationLocation.getMarshalledSize();
   if (physicalConnectionType != null)
       marshalSize += physicalConnectionType.getMarshalledSize();
   if (groupMemberType != null)
       marshalSize += groupMemberType.getMarshalledSize();
   marshalSize += 2;  // groupNumber

   return marshalSize;
}


/** Setter for {@link EntityAssociationVP#recordType}
  * @param pRecordType new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setRecordType(VariableParameterRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}
/** Getter for {@link EntityAssociationVP#recordType}
  * @return value of interest */
public VariableParameterRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link EntityAssociationVP#changeIndicator}
  * @param pChangeIndicator new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setChangeIndicator(EntityVPRecordChangeIndicator pChangeIndicator)
{
    changeIndicator = pChangeIndicator;
    return this;
}
/** Getter for {@link EntityAssociationVP#changeIndicator}
  * @return value of interest */
public EntityVPRecordChangeIndicator getChangeIndicator()
{
    return changeIndicator; 
}

/** Setter for {@link EntityAssociationVP#associationStatus}
  * @param pAssociationStatus new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setAssociationStatus(EntityAssociationAssociationType pAssociationStatus)
{
    associationStatus = pAssociationStatus;
    return this;
}
/** Getter for {@link EntityAssociationVP#associationStatus}
  * @return value of interest */
public EntityAssociationAssociationType getAssociationStatus()
{
    return associationStatus; 
}

/** Setter for {@link EntityAssociationVP#associationType}
  * @param pAssociationType new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setAssociationType(EntityAssociationPhysicalAssociationType pAssociationType)
{
    associationType = pAssociationType;
    return this;
}
/** Getter for {@link EntityAssociationVP#associationType}
  * @return value of interest */
public EntityAssociationPhysicalAssociationType getAssociationType()
{
    return associationType; 
}

/** Setter for {@link EntityAssociationVP#entityID}
  * @param pEntityID new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setEntityID(EntityID pEntityID)
{
    entityID = pEntityID;
    return this;
}
/** Getter for {@link EntityAssociationVP#entityID}
  * @return value of interest */
public EntityID getEntityID()
{
    return entityID;
}


/** Setter for {@link EntityAssociationVP#ownStationLocation}
  * @param pOwnStationLocation new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setOwnStationLocation(IsPartOfStationName pOwnStationLocation)
{
    ownStationLocation = pOwnStationLocation;
    return this;
}
/** Getter for {@link EntityAssociationVP#ownStationLocation}
  * @return value of interest */
public IsPartOfStationName getOwnStationLocation()
{
    return ownStationLocation; 
}

/** Setter for {@link EntityAssociationVP#physicalConnectionType}
  * @param pPhysicalConnectionType new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setPhysicalConnectionType(EntityAssociationPhysicalConnectionType pPhysicalConnectionType)
{
    physicalConnectionType = pPhysicalConnectionType;
    return this;
}
/** Getter for {@link EntityAssociationVP#physicalConnectionType}
  * @return value of interest */
public EntityAssociationPhysicalConnectionType getPhysicalConnectionType()
{
    return physicalConnectionType; 
}

/** Setter for {@link EntityAssociationVP#groupMemberType}
  * @param pGroupMemberType new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setGroupMemberType(EntityAssociationGroupMemberType pGroupMemberType)
{
    groupMemberType = pGroupMemberType;
    return this;
}
/** Getter for {@link EntityAssociationVP#groupMemberType}
  * @return value of interest */
public EntityAssociationGroupMemberType getGroupMemberType()
{
    return groupMemberType; 
}

/** Setter for {@link EntityAssociationVP#groupNumber}
  * @param pGroupNumber new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setGroupNumber(short pGroupNumber)
{
    groupNumber = pGroupNumber;
    return this;
}
/** Utility setter for {@link EntityAssociationVP#groupNumber}
  * @param pGroupNumber new value of interest
  * @return same object to permit progressive setters */
public EntityAssociationVP setGroupNumber(int pGroupNumber){
    groupNumber = (short) pGroupNumber;
    return this;
}
/** Getter for {@link EntityAssociationVP#groupNumber}
  * @return value of interest */
public short getGroupNumber()
{
    return groupNumber; 
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
       recordType.marshal(dos);
       changeIndicator.marshal(dos);
       associationStatus.marshal(dos);
       associationType.marshal(dos);
       entityID.marshal(dos);
       ownStationLocation.marshal(dos);
       physicalConnectionType.marshal(dos);
       groupMemberType.marshal(dos);
       dos.writeShort(groupNumber);
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
        recordType = VariableParameterRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        changeIndicator = EntityVPRecordChangeIndicator.unmarshalEnum(dis);
        uPosition += changeIndicator.getMarshalledSize();
        associationStatus = EntityAssociationAssociationType.unmarshalEnum(dis);
        uPosition += associationStatus.getMarshalledSize();
        associationType = EntityAssociationPhysicalAssociationType.unmarshalEnum(dis);
        uPosition += associationType.getMarshalledSize();
        uPosition += entityID.unmarshal(dis);
        ownStationLocation = IsPartOfStationName.unmarshalEnum(dis);
        uPosition += ownStationLocation.getMarshalledSize();
        physicalConnectionType = EntityAssociationPhysicalConnectionType.unmarshalEnum(dis);
        uPosition += physicalConnectionType.getMarshalledSize();
        groupMemberType = EntityAssociationGroupMemberType.unmarshalEnum(dis);
        uPosition += groupMemberType.getMarshalledSize();
        groupNumber = (short)dis.readUnsignedShort();
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
   recordType.marshal(byteBuffer);
   changeIndicator.marshal(byteBuffer);
   associationStatus.marshal(byteBuffer);
   associationType.marshal(byteBuffer);
   entityID.marshal(byteBuffer);
   ownStationLocation.marshal(byteBuffer);
   physicalConnectionType.marshal(byteBuffer);
   groupMemberType.marshal(byteBuffer);
   byteBuffer.putShort( (short)groupNumber);
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
        recordType = VariableParameterRecordType.unmarshalEnum(byteBuffer);
        // attribute changeIndicator marked as not serialized
        changeIndicator = EntityVPRecordChangeIndicator.unmarshalEnum(byteBuffer);
        // attribute associationStatus marked as not serialized
        associationStatus = EntityAssociationAssociationType.unmarshalEnum(byteBuffer);
        // attribute associationType marked as not serialized
        associationType = EntityAssociationPhysicalAssociationType.unmarshalEnum(byteBuffer);
        // attribute entityID marked as not serialized
        entityID.unmarshal(byteBuffer);
        // attribute ownStationLocation marked as not serialized
        ownStationLocation = IsPartOfStationName.unmarshalEnum(byteBuffer);
        // attribute physicalConnectionType marked as not serialized
        physicalConnectionType = EntityAssociationPhysicalConnectionType.unmarshalEnum(byteBuffer);
        // attribute groupMemberType marked as not serialized
        groupMemberType = EntityAssociationGroupMemberType.unmarshalEnum(byteBuffer);
        // attribute groupNumber marked as not serialized
        groupNumber = (short)(byteBuffer.getShort() & 0xFFFF);
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

     final EntityAssociationVP rhs = (EntityAssociationVP)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (changeIndicator == rhs.changeIndicator)) ivarsEqual = false;
     if( ! (associationStatus == rhs.associationStatus)) ivarsEqual = false;
     if( ! (associationType == rhs.associationType)) ivarsEqual = false;
     if( ! (entityID.equals( rhs.entityID) )) ivarsEqual = false;
     if( ! (ownStationLocation == rhs.ownStationLocation)) ivarsEqual = false;
     if( ! (physicalConnectionType == rhs.physicalConnectionType)) ivarsEqual = false;
     if( ! (groupMemberType == rhs.groupMemberType)) ivarsEqual = false;
     if( ! (groupNumber == rhs.groupNumber)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" recordType:").append(recordType); // writeOneToString
    sb.append(" changeIndicator:").append(changeIndicator); // writeOneToString
    sb.append(" associationStatus:").append(associationStatus); // writeOneToString
    sb.append(" associationType:").append(associationType); // writeOneToString
    sb.append(" entityID:").append(entityID); // writeOneToString
    sb.append(" ownStationLocation:").append(ownStationLocation); // writeOneToString
    sb.append(" physicalConnectionType:").append(physicalConnectionType); // writeOneToString
    sb.append(" groupMemberType:").append(groupMemberType); // writeOneToString
    sb.append(" groupNumber:").append(groupNumber); // writeOneToString

   return sb.toString();
 }
} // end of class
