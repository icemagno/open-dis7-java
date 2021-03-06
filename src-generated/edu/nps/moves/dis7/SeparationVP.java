/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Physical separation of an entity from another entity.  Section 6.2.94.6
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class SeparationVP extends Object implements Serializable
{
   /** the identification of the Variable Parameter record. Enumeration from EBV uid 56 */
   protected VariableParameterRecordType recordType = VariableParameterRecordType.SEPARATION;

   /** Reason for separation. EBV uid 282 */
   protected SeparationVPReasonforSeparation reasonForSeparation = SeparationVPReasonforSeparation.values()[0];

   /** Whether the entity existed prior to separation EBV uid 283 */
   protected SeparationVPPreEntityIndicator preEntityIndicator = SeparationVPPreEntityIndicator.values()[0];

   /** padding */
   protected byte  padding1 = (byte)0;

   /** ID of parent */
   protected EntityID  parentEntityID = new EntityID(); 

   /** padding */
   protected short  padding2 = (short)0;

   /** Station separated from */
   protected NamedLocationIdentification  stationLocation = new NamedLocationIdentification(); 


/** Constructor */
 public SeparationVP()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += recordType.getMarshalledSize();
   marshalSize += reasonForSeparation.getMarshalledSize();
   marshalSize += preEntityIndicator.getMarshalledSize();
   marshalSize += 1;  // padding1
   marshalSize += parentEntityID.getMarshalledSize();
   marshalSize += 2;  // padding2
   marshalSize += stationLocation.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link SeparationVP#recordType}*/
public SeparationVP setRecordType(VariableParameterRecordType pRecordType)
{
    recordType = pRecordType;
    return this;
}

/** Getter for {@link SeparationVP#recordType}*/
public VariableParameterRecordType getRecordType()
{
    return recordType; 
}

/** Setter for {@link SeparationVP#reasonForSeparation}*/
public SeparationVP setReasonForSeparation(SeparationVPReasonforSeparation pReasonForSeparation)
{
    reasonForSeparation = pReasonForSeparation;
    return this;
}

/** Getter for {@link SeparationVP#reasonForSeparation}*/
public SeparationVPReasonforSeparation getReasonForSeparation()
{
    return reasonForSeparation; 
}

/** Setter for {@link SeparationVP#preEntityIndicator}*/
public SeparationVP setPreEntityIndicator(SeparationVPPreEntityIndicator pPreEntityIndicator)
{
    preEntityIndicator = pPreEntityIndicator;
    return this;
}

/** Getter for {@link SeparationVP#preEntityIndicator}*/
public SeparationVPPreEntityIndicator getPreEntityIndicator()
{
    return preEntityIndicator; 
}

/** Setter for {@link SeparationVP#padding1}*/
public SeparationVP setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}

/** Getter for {@link SeparationVP#padding1}*/
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link SeparationVP#parentEntityID}*/
public SeparationVP setParentEntityID(EntityID pParentEntityID)
{
    parentEntityID = pParentEntityID;
    return this;
}

/** Getter for {@link SeparationVP#parentEntityID}*/
public EntityID getParentEntityID()
{
    return parentEntityID; 
}

/** Setter for {@link SeparationVP#padding2}*/
public SeparationVP setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}

/** Getter for {@link SeparationVP#padding2}*/
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link SeparationVP#stationLocation}*/
public SeparationVP setStationLocation(NamedLocationIdentification pStationLocation)
{
    stationLocation = pStationLocation;
    return this;
}

/** Getter for {@link SeparationVP#stationLocation}*/
public NamedLocationIdentification getStationLocation()
{
    return stationLocation; 
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
       recordType.marshal(dos);
       reasonForSeparation.marshal(dos);
       preEntityIndicator.marshal(dos);
       dos.writeByte( (byte)padding1);
       parentEntityID.marshal(dos);
       dos.writeShort( (short)padding2);
       stationLocation.marshal(dos);
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
        recordType = VariableParameterRecordType.unmarshalEnum(dis);
        uPosition += recordType.getMarshalledSize();
        reasonForSeparation = SeparationVPReasonforSeparation.unmarshalEnum(dis);
        uPosition += reasonForSeparation.getMarshalledSize();
        preEntityIndicator = SeparationVPPreEntityIndicator.unmarshalEnum(dis);
        uPosition += preEntityIndicator.getMarshalledSize();
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += parentEntityID.unmarshal(dis);
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += stationLocation.unmarshal(dis);
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
   recordType.marshal(buff);
   reasonForSeparation.marshal(buff);
   preEntityIndicator.marshal(buff);
   buff.put( (byte)padding1);
   parentEntityID.marshal(buff);
   buff.putShort( (short)padding2);
   stationLocation.marshal(buff);
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
    recordType = VariableParameterRecordType.unmarshalEnum(buff);
    reasonForSeparation = SeparationVPReasonforSeparation.unmarshalEnum(buff);
    preEntityIndicator = SeparationVPPreEntityIndicator.unmarshalEnum(buff);
    padding1 = (byte)(buff.get() & 0xFF);
    parentEntityID.unmarshal(buff);
    padding2 = (short)(buff.getShort() & 0xFFFF);
    stationLocation.unmarshal(buff);
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

     final SeparationVP rhs = (SeparationVP)obj;

     if( ! (recordType == rhs.recordType)) ivarsEqual = false;
     if( ! (reasonForSeparation == rhs.reasonForSeparation)) ivarsEqual = false;
     if( ! (preEntityIndicator == rhs.preEntityIndicator)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (parentEntityID.equals( rhs.parentEntityID) )) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;
     if( ! (stationLocation.equals( rhs.stationLocation) )) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" recordType: ").append(recordType).append("\n");
    sb.append(" reasonForSeparation: ").append(reasonForSeparation).append("\n");
    sb.append(" preEntityIndicator: ").append(preEntityIndicator).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" parentEntityID: ").append(parentEntityID).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");
    sb.append(" stationLocation: ").append(stationLocation).append("\n");

   return sb.toString();
 }
} // end of class
