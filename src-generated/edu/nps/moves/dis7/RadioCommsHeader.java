/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class RadioCommsHeader extends Object implements Serializable
{
   /** ID of the entitythat is the source of the communication */
   protected EntityID  radioReferenceID = new EntityID(); 

   /** particular radio within an entity */
   protected short  radioNumber;


/** Constructor */
 public RadioCommsHeader()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += radioReferenceID.getMarshalledSize();
   marshalSize += 2;  // radioNumber

   return marshalSize;
}


/** Setter for {@link RadioCommsHeader#radioReferenceID}*/
public RadioCommsHeader setRadioReferenceID(EntityID pRadioReferenceID)
{
    radioReferenceID = pRadioReferenceID;
    return this;
}

/** Getter for {@link RadioCommsHeader#radioReferenceID}*/
public EntityID getRadioReferenceID()
{
    return radioReferenceID; 
}

/** Setter for {@link RadioCommsHeader#radioNumber}*/
public RadioCommsHeader setRadioNumber(short pRadioNumber)
{
    radioNumber = pRadioNumber;
    return this;
}

/** Getter for {@link RadioCommsHeader#radioNumber}*/
public short getRadioNumber()
{
    return radioNumber; 
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
       radioReferenceID.marshal(dos);
       dos.writeShort( (short)radioNumber);
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
        uPosition += radioReferenceID.unmarshal(dis);
        radioNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
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
   radioReferenceID.marshal(buff);
   buff.putShort( (short)radioNumber);
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
    radioReferenceID.unmarshal(buff);
    radioNumber = (short)(buff.getShort() & 0xFFFF);
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

     final RadioCommsHeader rhs = (RadioCommsHeader)obj;

     if( ! (radioReferenceID.equals( rhs.radioReferenceID) )) ivarsEqual = false;
     if( ! (radioNumber == rhs.radioNumber)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" radioReferenceID: ").append(radioReferenceID).append("\n");
    sb.append(" radioNumber: ").append(radioNumber).append("\n");

   return sb.toString();
 }
} // end of class
