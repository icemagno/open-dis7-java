// autogenerated using string template dis7javalicense.txt

/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * information abou an enitity not producing espdus. Section 6.2.79
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class SilentEntitySystem extends Object implements Serializable
{
   /** number of the type specified by the entity type field */
   protected short  numberOfEntities;

   /** number of entity appearance records that follow */
   protected short  numberOfAppearanceRecords;

   /** Entity type */
   protected EntityType  entityType = new EntityType(); 

   /** Variable length list of appearance records */
   protected int[]  appearanceRecordList = new int[0]; 


/** Constructor creates and configures a new instance object */
 public SilentEntitySystem()
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

   marshalSize += 2;  // numberOfEntities
   marshalSize += 2;  // numberOfAppearanceRecords
   if (entityType != null)
       marshalSize += entityType.getMarshalledSize();
   if (appearanceRecordList != null)
       marshalSize += appearanceRecordList.length * 4;

   return marshalSize;
}


/** Setter for {@link SilentEntitySystem#numberOfEntities}
  * @param pNumberOfEntities new value of interest
  * @return same object to permit progressive setters */
public SilentEntitySystem setNumberOfEntities(short pNumberOfEntities)
{
    numberOfEntities = pNumberOfEntities;
    return this;
}
/** Utility setter for {@link SilentEntitySystem#numberOfEntities}
  * @param pNumberOfEntities new value of interest
  * @return same object to permit progressive setters */
public SilentEntitySystem setNumberOfEntities(int pNumberOfEntities){
    numberOfEntities = (short) pNumberOfEntities;
    return this;
}

/** Getter for {@link SilentEntitySystem#numberOfEntities}
  * @return value of interest */
public short getNumberOfEntities()
{
    return numberOfEntities; 
}

/** Setter for {@link SilentEntitySystem#entityType}
  * @param pEntityType new value of interest
  * @return same object to permit progressive setters */
public SilentEntitySystem setEntityType(EntityType pEntityType)
{
    entityType = pEntityType;
    return this;
}

/** Getter for {@link SilentEntitySystem#entityType}
  * @return value of interest */
public EntityType getEntityType()
{
    return entityType; 
}

/** Setter for {@link SilentEntitySystem#appearanceRecordList}
  * @param pAppearanceRecordList new value of interest
  * @return same object to permit progressive setters */
public SilentEntitySystem setAppearanceRecordList(int[] pAppearanceRecordList)
{
    appearanceRecordList = pAppearanceRecordList;
    return this;
}

/** Getter for {@link SilentEntitySystem#appearanceRecordList}
  * @return value of interest */
public int[] getAppearanceRecordList()
{
    return appearanceRecordList; 
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
       dos.writeShort(numberOfEntities);
       dos.writeShort(appearanceRecordList.length);
       entityType.marshal(dos);

       for (int idx = 0; idx < appearanceRecordList.length; idx++)
           dos.writeInt(appearanceRecordList[idx]);

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
        numberOfEntities = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfAppearanceRecords = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += entityType.unmarshal(dis);
        for (int idx = 0; idx < appearanceRecordList.length; idx++)
            appearanceRecordList[idx] = dis.readInt();
        uPosition += (appearanceRecordList.length * 4);
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
   byteBuffer.putShort( (short)numberOfEntities);
   byteBuffer.putShort( (short)appearanceRecordList.length);
   entityType.marshal(byteBuffer);

   for (int idx = 0; idx < appearanceRecordList.length; idx++)
       byteBuffer.putInt((int)appearanceRecordList[idx]);

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
        // attribute numberOfEntities marked as not serialized
        numberOfEntities = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute numberOfAppearanceRecords marked as not serialized
        numberOfAppearanceRecords = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute entityType marked as not serialized
        entityType.unmarshal(byteBuffer);
        // attribute appearanceRecordList marked as not serialized
        for (int idx = 0; idx < appearanceRecordList.length; idx++)
            appearanceRecordList[idx] = byteBuffer.getInt();
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

     final SilentEntitySystem rhs = (SilentEntitySystem)obj;

     if( ! (numberOfEntities == rhs.numberOfEntities)) ivarsEqual = false;
     if( ! (entityType.equals( rhs.entityType) )) ivarsEqual = false;

     for (int idx = 0; idx < 0; idx++)
     {
          if(!(appearanceRecordList[idx] == rhs.appearanceRecordList[idx])) ivarsEqual = false;
     }

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" numberOfEntities: ").append(numberOfEntities).append("\n");
    sb.append(" entityType: ").append(entityType).append("\n");
    sb.append(" appearanceRecordList: ").append("\n");
    sb.append(Arrays.toString(appearanceRecordList)).append("\n");

   return sb.toString();
 }
} // end of class
