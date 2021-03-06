/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * contains information describing the propulsion systems of the entity. This information shall be provided for each active propulsion system defined. Section 6.2.68
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class PropulsionSystemData extends Object implements Serializable
{
   /** powerSetting */
   protected float  powerSetting;

   /** engine RPMs */
   protected float  engineRpm;


/** Constructor */
 public PropulsionSystemData()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 4;  // powerSetting
   marshalSize += 4;  // engineRpm

   return marshalSize;
}


/** Setter for {@link PropulsionSystemData#powerSetting}*/
public PropulsionSystemData setPowerSetting(float pPowerSetting)
{
    powerSetting = pPowerSetting;
    return this;
}

/** Getter for {@link PropulsionSystemData#powerSetting}*/
public float getPowerSetting()
{
    return powerSetting; 
}

/** Setter for {@link PropulsionSystemData#engineRpm}*/
public PropulsionSystemData setEngineRpm(float pEngineRpm)
{
    engineRpm = pEngineRpm;
    return this;
}

/** Getter for {@link PropulsionSystemData#engineRpm}*/
public float getEngineRpm()
{
    return engineRpm; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @see java.io.DataOutputStream
 * @param dos The DataOutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeFloat( (float)powerSetting);
       dos.writeFloat( (float)engineRpm);
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
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        powerSetting = dis.readFloat();
        uPosition += 4;
        engineRpm = dis.readFloat();
        uPosition += 4;
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
   buff.putFloat( (float)powerSetting);
   buff.putFloat( (float)engineRpm);
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
    powerSetting = buff.getFloat();
    engineRpm = buff.getFloat();
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

     final PropulsionSystemData rhs = (PropulsionSystemData)obj;

     if( ! (powerSetting == rhs.powerSetting)) ivarsEqual = false;
     if( ! (engineRpm == rhs.engineRpm)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" powerSetting: ").append(powerSetting).append("\n");
    sb.append(" engineRpm: ").append(engineRpm).append("\n");

   return sb.toString();
 }
} // end of class
