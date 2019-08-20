/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * information abou an enitity not producing espdus. Section 6.2.79
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
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


/** Constructor */
 public SilentEntitySystem()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 2;  // numberOfEntities
   marshalSize += 2;  // numberOfAppearanceRecords
   marshalSize += entityType.getMarshalledSize();
   marshalSize += appearanceRecordList.length * 4;

   return marshalSize;
}


/** Setter for {@link SilentEntitySystem#numberOfEntities}*/
public SilentEntitySystem setNumberOfEntities(short pNumberOfEntities)
{
    numberOfEntities = pNumberOfEntities;
    return this;
}

/** Getter for {@link SilentEntitySystem#numberOfEntities}*/
public short getNumberOfEntities()
{
    return numberOfEntities; 
}

/** Setter for {@link SilentEntitySystem#entityType}*/
public SilentEntitySystem setEntityType(EntityType pEntityType)
{
    entityType = pEntityType;
    return this;
}

/** Getter for {@link SilentEntitySystem#entityType}*/
public EntityType getEntityType()
{
    return entityType; 
}

/** Setter for {@link SilentEntitySystem#appearanceRecordList}*/
public SilentEntitySystem setAppearanceRecordList(int[] pAppearanceRecordList)
{
    appearanceRecordList = pAppearanceRecordList;
    return this;
}

/** Getter for {@link SilentEntitySystem#appearanceRecordList}*/
public int[] getAppearanceRecordList()
{
    return appearanceRecordList; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @see java.io.DataOutputStream
 * @param dos The DataOutputStream
 */
public void marshal(DataOutputStream dos)
{
    try 
    {
       dos.writeShort( (short)numberOfEntities);
       dos.writeShort( (short)numberOfAppearanceRecords);
       entityType.marshal(dos);

       for(int idx = 0; idx < appearanceRecordList.length; idx++)
           dos.writeInt(appearanceRecordList[idx]);

    }
    catch(Exception e)
    {
      System.err.println(e);
    }
}

/**
 * Unserializes an object from a DataInputStream.
 * @see java.io.DataInputStream
 * @param dis The DataInputStream
 * @return marshalled size
 */
public int unmarshal(DataInputStream dis)
{
    int uPosition = 0;
    try 
    {
        numberOfEntities = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfAppearanceRecords = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += entityType.unmarshal(dis);
        for(int idx = 0; idx < appearanceRecordList.length; idx++)
            appearanceRecordList[idx] = dis.readInt(); // mike check
        uPosition += appearanceRecordList.length; // todo, multiply by prim size mike
    }
    catch(Exception e)
    { 
      System.out.println(e); 
    }
    return getMarshalledSize();
}

/**
 * Packs an object into the ByteBuffer.
 * @throws java.nio.BufferOverflowException if buff is too small
 * @throws java.nio.ReadOnlyBufferException if buff is read only
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin writing
 * @throws Exception ByteBuffer-generated exception
 */
public void marshal(java.nio.ByteBuffer buff) throws Exception
{
   buff.putShort( (short)numberOfEntities);
   buff.putShort( (short)numberOfAppearanceRecords);
   entityType.marshal(buff);

   for(int idx = 0; idx < appearanceRecordList.length; idx++)
       buff.putInt((int)appearanceRecordList[idx]);

}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if buff is too small
 * @see java.nio.ByteBuffer
 * @param buff The ByteBuffer at the position to begin reading
 * @return marshalled size
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer buff) throws Exception
{
    numberOfEntities = (short)(buff.getShort() & 0xFFFF);
    numberOfAppearanceRecords = (short)(buff.getShort() & 0xFFFF);
    entityType.unmarshal(buff);
    for(int idx = 0; idx < appearanceRecordList.length; idx++)
        appearanceRecordList[idx] = buff.getInt();
    return getMarshalledSize();
}

 /*
  * The equals method doesn't always work--mostly it works only on classes that consist only of primitives. Be careful.
  */
@Override
 public boolean equals(Object obj)
 {
    if(this == obj)
      return true;

    if(obj == null)
       return false;

    if(getClass() != obj.getClass())
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

    if(!(obj instanceof SilentEntitySystem))
        return false;

     final SilentEntitySystem rhs = (SilentEntitySystem)obj;

     if( ! (numberOfEntities == rhs.numberOfEntities)) ivarsEqual = false;
     if( ! (numberOfAppearanceRecords == rhs.numberOfAppearanceRecords)) ivarsEqual = false;
     if( ! (entityType.equals( rhs.entityType) )) ivarsEqual = false;

     for(int idx = 0; idx < 0; idx++)
     {
          if(!(appearanceRecordList[idx] == rhs.appearanceRecordList[idx])) ivarsEqual = false;
     }

    return ivarsEqual;
 }
} // end of class
