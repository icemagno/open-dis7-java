/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Base class of PduBase and LiveEntityPdu
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public abstract class Pdu extends Object implements Serializable,Marshaller
{
   /** The version of the protocol. 5=DIS-1995, 6=DIS-1998, 7=DIS-2012 uid 3 */
   protected DISProtocolVersion protocolVersion = DISProtocolVersion.IEEE_12781_2012;

   /** Exercise ID */
   protected byte  exerciseID = (byte)0;

   /** Type of pdu, unique for each PDU class uid 4 */
   protected DISPDUType pduType = DISPDUType.values()[0];

   /** value that refers to the protocol family, eg SimulationManagement, et uid 5 */
   protected DISProtocolFamily protocolFamily = DISProtocolFamily.values()[0];

   /** Timestamp value */
   protected int  timestamp;

   /** Length, in bytes, of the PDU */
   protected short  length;


/** Constructor */
 public Pdu()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += protocolVersion.getMarshalledSize();
   marshalSize += 1;  // exerciseID
   marshalSize += pduType.getMarshalledSize();
   marshalSize += protocolFamily.getMarshalledSize();
   marshalSize += 4;  // timestamp
   marshalSize += 2;  // length

   return marshalSize;
}


/** Setter for {@link Pdu#protocolVersion}*/
public Pdu setProtocolVersion(DISProtocolVersion pProtocolVersion)
{
    protocolVersion = pProtocolVersion;
    return this;
}

/** Getter for {@link Pdu#protocolVersion}*/
public DISProtocolVersion getProtocolVersion()
{
    return protocolVersion; 
}

/** Setter for {@link Pdu#exerciseID}*/
public Pdu setExerciseID(byte pExerciseID)
{
    exerciseID = pExerciseID;
    return this;
}

/** Getter for {@link Pdu#exerciseID}*/
public byte getExerciseID()
{
    return exerciseID; 
}

/** Setter for {@link Pdu#pduType}*/
public Pdu setPduType(DISPDUType pPduType)
{
    pduType = pPduType;
    return this;
}

/** Getter for {@link Pdu#pduType}*/
public DISPDUType getPduType()
{
    return pduType; 
}

/** Setter for {@link Pdu#protocolFamily}*/
public Pdu setProtocolFamily(DISProtocolFamily pProtocolFamily)
{
    protocolFamily = pProtocolFamily;
    return this;
}

/** Getter for {@link Pdu#protocolFamily}*/
public DISProtocolFamily getProtocolFamily()
{
    return protocolFamily; 
}

/** Setter for {@link Pdu#timestamp}*/
public Pdu setTimestamp(int pTimestamp)
{
    timestamp = pTimestamp;
    return this;
}

/** Getter for {@link Pdu#timestamp}*/
public int getTimestamp()
{
    return timestamp; 
}

/** Setter for {@link Pdu#length}*/
public Pdu setLength(short pLength)
{
    length = pLength;
    return this;
}

/** Getter for {@link Pdu#length}*/
public short getLength()
{
    return length; 
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
       protocolVersion.marshal(dos);
       dos.writeByte( (byte)exerciseID);
       pduType.marshal(dos);
       protocolFamily.marshal(dos);
       dos.writeInt( (int)timestamp);
       dos.writeShort( (short)length);
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
        protocolVersion = DISProtocolVersion.unmarshalEnum(dis);
        uPosition += protocolVersion.getMarshalledSize();
        exerciseID = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pduType = DISPDUType.unmarshalEnum(dis);
        uPosition += pduType.getMarshalledSize();
        protocolFamily = DISProtocolFamily.unmarshalEnum(dis);
        uPosition += protocolFamily.getMarshalledSize();
        timestamp = dis.readInt();
        uPosition += 4;
        length = (short)dis.readUnsignedShort();
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
   protocolVersion.marshal(buff);
   buff.put( (byte)exerciseID);
   pduType.marshal(buff);
   protocolFamily.marshal(buff);
   buff.putInt( (int)timestamp);
   buff.putShort( (short)length);
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
    protocolVersion = DISProtocolVersion.unmarshalEnum(buff);
    exerciseID = (byte)(buff.get() & 0xFF);
    pduType = DISPDUType.unmarshalEnum(buff);
    protocolFamily = DISProtocolFamily.unmarshalEnum(buff);
    timestamp = buff.getInt();
    length = (short)(buff.getShort() & 0xFFFF);
    return getMarshalledSize();
}


/**
 * A convenience method for marshalling to a byte array.
 * This is not as efficient as reusing a ByteBuffer, but it <em>is</em> easy.
 * @return a byte array with the marshalled {@link Pdu}
 * @throws Exception ByteBuffer-generated exception
 */
public byte[] marshal() throws Exception
{
    byte[] data = new byte[getMarshalledSize()];
    java.nio.ByteBuffer buff = java.nio.ByteBuffer.wrap(data);
    marshal(buff);
    return data;
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

     final Pdu rhs = (Pdu)obj;

     if( ! (protocolVersion == rhs.protocolVersion)) ivarsEqual = false;
     if( ! (exerciseID == rhs.exerciseID)) ivarsEqual = false;
     if( ! (pduType == rhs.pduType)) ivarsEqual = false;
     if( ! (protocolFamily == rhs.protocolFamily)) ivarsEqual = false;
     if( ! (timestamp == rhs.timestamp)) ivarsEqual = false;
     if( ! (length == rhs.length)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" protocolVersion: ").append(protocolVersion).append("\n");
    sb.append(" exerciseID: ").append(exerciseID).append("\n");
    sb.append(" pduType: ").append(pduType).append("\n");
    sb.append(" protocolFamily: ").append(protocolFamily).append("\n");
    sb.append(" timestamp: ").append(timestamp).append("\n");
    sb.append(" length: ").append(length).append("\n");

   return sb.toString();
 }
} // end of class
