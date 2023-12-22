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
 * 7.6.2 Communicate active electromagnetic emissions, including radar and radar-related electronic warfare (e.g., jamming). Exceptions include IFF interrogations and replies, navigation aids, voice, beacon and data radio communications, directed energy weapons, and laser ranging and designation systems, which are handled by other PDUs. Section 5.3.7.1.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class ElectromagneticEmissionPdu extends DistributedEmissionsRegenerationFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "ElectromagneticEmissionPdu";
   
   /** ID of the entity emitting */
   protected EntityID  emittingEntityID = new EntityID(); 

   /** ID of event */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** This field shall be used to indicate if the data in the PDU represents a state update or just data that has changed since issuance of the last Electromagnetic Emission PDU [relative to the identified entity and emission system(s)]. uid 77 */
   protected ElectromagneticEmissionStateUpdateIndicator stateUpdateIndicator = ElectromagneticEmissionStateUpdateIndicator.values()[0];

   /** This field shall specify the number of emission systems being described in the current PDU. */
   protected byte numberOfSystems;

   /** padding */
   protected short paddingForEmissionsPdu;

   /** Electronic emmissions systems */
   protected List< ElectronicEmitter > systems = new ArrayList<>();
 

/** Constructor creates and configures a new instance object */
 public ElectromagneticEmissionPdu()
 {
    setPduType( DisPduType.ELECTROMAGNETIC_EMISSION );
    setPaddingForEmissionsPdu( (short)0 );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized ElectromagneticEmissionPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized ElectromagneticEmissionPdu copyByteBuffer()
 {
     ElectromagneticEmissionPdu newCopy = new ElectromagneticEmissionPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("ElectromagneticEmissionPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized ElectromagneticEmissionPdu copyDataOutputStream()
 {
     ElectromagneticEmissionPdu newCopy = new ElectromagneticEmissionPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("ElectromagneticEmissionPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("ElectromagneticEmissionPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (emittingEntityID != null)
       marshalSize += emittingEntityID.getMarshalledSize();
   if (eventID != null)
       marshalSize += eventID.getMarshalledSize();
   if (stateUpdateIndicator != null)
       marshalSize += stateUpdateIndicator.getMarshalledSize();
   marshalSize += 1;  // numberOfSystems
   marshalSize += 2;  // paddingForEmissionsPdu
   if (systems != null)
       for (int idx=0; idx < systems.size(); idx++)
       {
            ElectronicEmitter listElement = systems.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link ElectromagneticEmissionPdu#emittingEntityID}
  * @param pEmittingEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized ElectromagneticEmissionPdu setEmittingEntityID(EntityID pEmittingEntityID)
{
    emittingEntityID = pEmittingEntityID;
    return this;
}
/** Getter for {@link ElectromagneticEmissionPdu#emittingEntityID}
  * @return value of interest */
public EntityID getEmittingEntityID()
{
    return emittingEntityID;
}


/** Setter for {@link ElectromagneticEmissionPdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public synchronized ElectromagneticEmissionPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}
/** Getter for {@link ElectromagneticEmissionPdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID;
}


/** Setter for {@link ElectromagneticEmissionPdu#stateUpdateIndicator}
  * @param pStateUpdateIndicator new value of interest
  * @return same object to permit progressive setters */
public synchronized ElectromagneticEmissionPdu setStateUpdateIndicator(ElectromagneticEmissionStateUpdateIndicator pStateUpdateIndicator)
{
    stateUpdateIndicator = pStateUpdateIndicator;
    return this;
}
/** Getter for {@link ElectromagneticEmissionPdu#stateUpdateIndicator}
  * @return value of interest */
public ElectromagneticEmissionStateUpdateIndicator getStateUpdateIndicator()
{
    return stateUpdateIndicator; 
}

/** Setter for {@link ElectromagneticEmissionPdu#paddingForEmissionsPdu}
  * @param pPaddingForEmissionsPdu new value of interest
  * @return same object to permit progressive setters */
public synchronized ElectromagneticEmissionPdu setPaddingForEmissionsPdu(short pPaddingForEmissionsPdu)
{
    paddingForEmissionsPdu = pPaddingForEmissionsPdu;
    return this;
}
/** Utility setter for {@link ElectromagneticEmissionPdu#paddingForEmissionsPdu}
  * @param pPaddingForEmissionsPdu new value of interest
  * @return same object to permit progressive setters */
public synchronized ElectromagneticEmissionPdu setPaddingForEmissionsPdu(int pPaddingForEmissionsPdu){
    paddingForEmissionsPdu = (short) pPaddingForEmissionsPdu;
    return this;
}
/** Getter for {@link ElectromagneticEmissionPdu#paddingForEmissionsPdu}
  * @return value of interest */
public short getPaddingForEmissionsPdu()
{
    return paddingForEmissionsPdu; 
}

/** Setter for {@link ElectromagneticEmissionPdu#systems}
  * @param pSystems new value of interest
  * @return same object to permit progressive setters */
public synchronized ElectromagneticEmissionPdu setSystems(List<ElectronicEmitter> pSystems)
{
    systems = pSystems;
    return this;
}
/** Getter for {@link ElectromagneticEmissionPdu#systems}
  * @return value of interest */
public List<ElectronicEmitter> getSystems()
{
    return systems; 
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
       emittingEntityID.marshal(dos);
       eventID.marshal(dos);
       stateUpdateIndicator.marshal(dos);
       dos.writeByte(systems.size());
       dos.writeShort(paddingForEmissionsPdu);

       for (int idx = 0; idx < systems.size(); idx++)
       {
            ElectronicEmitter aElectronicEmitter = systems.get(idx);
            aElectronicEmitter.marshal(dos);
       }

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
        uPosition += emittingEntityID.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        stateUpdateIndicator = ElectromagneticEmissionStateUpdateIndicator.unmarshalEnum(dis);
        uPosition += stateUpdateIndicator.getMarshalledSize();
        numberOfSystems = (byte)dis.readUnsignedByte();
        uPosition += 1;
        paddingForEmissionsPdu = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfSystems; idx++)
        {
            ElectronicEmitter anX = new ElectronicEmitter();
            uPosition += anX.unmarshal(dis);
            systems.add(anX);
        }

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
   emittingEntityID.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   stateUpdateIndicator.marshal(byteBuffer);
   byteBuffer.put( (byte)systems.size());
   byteBuffer.putShort( (short)paddingForEmissionsPdu);

   for (int idx = 0; idx < systems.size(); idx++)
   {
        ElectronicEmitter aElectronicEmitter = systems.get(idx);
        aElectronicEmitter.marshal(byteBuffer);
   }

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
        // attribute emittingEntityID marked as not serialized
        emittingEntityID.unmarshal(byteBuffer);
        // attribute eventID marked as not serialized
        eventID.unmarshal(byteBuffer);
        // attribute stateUpdateIndicator marked as not serialized
        stateUpdateIndicator = ElectromagneticEmissionStateUpdateIndicator.unmarshalEnum(byteBuffer);
        // attribute numberOfSystems marked as not serialized
        numberOfSystems = (byte)(byteBuffer.get() & 0xFF);
        // attribute paddingForEmissionsPdu marked as not serialized
        paddingForEmissionsPdu = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute systems marked as not serialized
        for (int idx = 0; idx < numberOfSystems; idx++)
        {
        ElectronicEmitter anX = new ElectronicEmitter();
        anX.unmarshal(byteBuffer);
        systems.add(anX);
        }

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
     final ElectromagneticEmissionPdu rhs = (ElectromagneticEmissionPdu)obj;

     if( ! Objects.equals(emittingEntityID, rhs.emittingEntityID) ) return false;
     if( ! Objects.equals(eventID, rhs.eventID) ) return false;
     if( ! (stateUpdateIndicator == rhs.stateUpdateIndicator)) return false;
     if( ! (paddingForEmissionsPdu == rhs.paddingForEmissionsPdu)) return false;
     if( ! Objects.equals(systems, rhs.systems) ) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" emittingEntityID:").append(emittingEntityID); // writeOneToString
    sb.append(" eventID:").append(eventID); // writeOneToString
    sb.append(" stateUpdateIndicator:").append(stateUpdateIndicator); // writeOneToString
    sb.append(" paddingForEmissionsPdu:").append(paddingForEmissionsPdu); // writeOneToString
    sb.append(" systems: ");
    systems.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.emittingEntityID,
	                     this.eventID,
	                     this.stateUpdateIndicator,
	                     this.numberOfSystems,
	                     this.paddingForEmissionsPdu,
	                     this.systems);
 }
} // end of ElectromagneticEmissionPdu
