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
public class IFFPdu extends DistributedEmissionsFamilyPdu implements Serializable
{
   /** ID of the entity that is the source of the emissions */
   protected EntityID  emittingEntityId = new EntityID(); 

   /** Number generated by the issuing simulation to associate realted events. */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** Location wrt entity. There is some ambugiuity in the standard here, but this is the order it is listed in the table. */
   protected Vector3Float  location = new Vector3Float(); 

   /** System ID information */
   protected SystemIdentifier  systemID = new SystemIdentifier(); 

   protected byte  systemDesignator;

   protected byte  systemSpecificData;

   /** fundamental parameters */
   protected FundamentalOperationalData  fundamentalParameters = new FundamentalOperationalData(); 


/** Constructor */
 public IFFPdu()
 {
    setPduType( DISPDUType.IDENTIFICATION_FRIEND_OR_FOE );
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += emittingEntityId.getMarshalledSize();
   marshalSize += eventID.getMarshalledSize();
   marshalSize += location.getMarshalledSize();
   marshalSize += systemID.getMarshalledSize();
   marshalSize += 1;  // systemDesignator
   marshalSize += 1;  // systemSpecificData
   marshalSize += fundamentalParameters.getMarshalledSize();

   return marshalSize;
}


/** Setter for {@link IFFPdu#emittingEntityId}*/
public IFFPdu setEmittingEntityId(EntityID pEmittingEntityId)
{
    emittingEntityId = pEmittingEntityId;
    return this;
}

/** Getter for {@link IFFPdu#emittingEntityId}*/
public EntityID getEmittingEntityId()
{
    return emittingEntityId; 
}

/** Setter for {@link IFFPdu#eventID}*/
public IFFPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}

/** Getter for {@link IFFPdu#eventID}*/
public EventIdentifier getEventID()
{
    return eventID; 
}

/** Setter for {@link IFFPdu#location}*/
public IFFPdu setLocation(Vector3Float pLocation)
{
    location = pLocation;
    return this;
}

/** Getter for {@link IFFPdu#location}*/
public Vector3Float getLocation()
{
    return location; 
}

/** Setter for {@link IFFPdu#systemID}*/
public IFFPdu setSystemID(SystemIdentifier pSystemID)
{
    systemID = pSystemID;
    return this;
}

/** Getter for {@link IFFPdu#systemID}*/
public SystemIdentifier getSystemID()
{
    return systemID; 
}

/** Setter for {@link IFFPdu#systemDesignator}*/
public IFFPdu setSystemDesignator(byte pSystemDesignator)
{
    systemDesignator = pSystemDesignator;
    return this;
}

/** Getter for {@link IFFPdu#systemDesignator}*/
public byte getSystemDesignator()
{
    return systemDesignator; 
}

/** Setter for {@link IFFPdu#systemSpecificData}*/
public IFFPdu setSystemSpecificData(byte pSystemSpecificData)
{
    systemSpecificData = pSystemSpecificData;
    return this;
}

/** Getter for {@link IFFPdu#systemSpecificData}*/
public byte getSystemSpecificData()
{
    return systemSpecificData; 
}

/** Setter for {@link IFFPdu#fundamentalParameters}*/
public IFFPdu setFundamentalParameters(FundamentalOperationalData pFundamentalParameters)
{
    fundamentalParameters = pFundamentalParameters;
    return this;
}

/** Getter for {@link IFFPdu#fundamentalParameters}*/
public FundamentalOperationalData getFundamentalParameters()
{
    return fundamentalParameters; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @see java.io.DataOutputStream
 * @param dos The DataOutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       emittingEntityId.marshal(dos);
       eventID.marshal(dos);
       location.marshal(dos);
       systemID.marshal(dos);
       dos.writeByte( (byte)systemDesignator);
       dos.writeByte( (byte)systemSpecificData);
       fundamentalParameters.marshal(dos);
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
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += emittingEntityId.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        uPosition += location.unmarshal(dis);
        uPosition += systemID.unmarshal(dis);
        systemDesignator = (byte)dis.readUnsignedByte();
        uPosition += 1;
        systemSpecificData = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += fundamentalParameters.unmarshal(dis);
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
   super.marshal(buff);
   emittingEntityId.marshal(buff);
   eventID.marshal(buff);
   location.marshal(buff);
   systemID.marshal(buff);
   buff.put( (byte)systemDesignator);
   buff.put( (byte)systemSpecificData);
   fundamentalParameters.marshal(buff);
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
    super.unmarshal(buff);

    emittingEntityId.unmarshal(buff);
    eventID.unmarshal(buff);
    location.unmarshal(buff);
    systemID.unmarshal(buff);
    systemDesignator = (byte)(buff.get() & 0xFF);
    systemSpecificData = (byte)(buff.get() & 0xFF);
    fundamentalParameters.unmarshal(buff);
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

@Override
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final IFFPdu rhs = (IFFPdu)obj;

     if( ! (emittingEntityId.equals( rhs.emittingEntityId) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (location.equals( rhs.location) )) ivarsEqual = false;
     if( ! (systemID.equals( rhs.systemID) )) ivarsEqual = false;
     if( ! (systemDesignator == rhs.systemDesignator)) ivarsEqual = false;
     if( ! (systemSpecificData == rhs.systemSpecificData)) ivarsEqual = false;
     if( ! (fundamentalParameters.equals( rhs.fundamentalParameters) )) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" emittingEntityId: ").append(emittingEntityId).append("\n");
    sb.append(" eventID: ").append(eventID).append("\n");
    sb.append(" location: ").append(location).append("\n");
    sb.append(" systemID: ").append(systemID).append("\n");
    sb.append(" systemDesignator: ").append(systemDesignator).append("\n");
    sb.append(" systemSpecificData: ").append(systemSpecificData).append("\n");
    sb.append(" fundamentalParameters: ").append(fundamentalParameters).append("\n");

   return sb.toString();
 }
} // end of class
