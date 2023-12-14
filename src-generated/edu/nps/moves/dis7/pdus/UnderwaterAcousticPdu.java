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
 * 7.6.4 Information about underwater acoustic emmissions. See 5.7.5.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class UnderwaterAcousticPdu extends DistributedEmissionsRegenerationFamilyPdu implements Serializable
{
   /** ID of the entity that is the source of the emission */
   protected EntityID  emittingEntityID = new EntityID(); 

   /** ID of event */
   protected EventIdentifier  eventID = new EventIdentifier(); 

   /** This field shall be used to indicate whether the data in the UA PDU represent a state update or data that have changed since issuance of the last UA PDU uid 143 */
   protected UAStateChangeUpdateIndicator stateChangeIndicator = UAStateChangeUpdateIndicator.values()[0];

   /** padding */
   protected byte pad;

   /** This field indicates which database record (or file) shall be used in the definition of passive signature (unintentional) emissions of the entity. The indicated database record (or  file) shall define all noise generated as a function of propulsion plant configurations and associated  auxiliaries. uid 148 */
   protected UAPassiveParameterIndex passiveParameterIndex = UAPassiveParameterIndex.values()[0];

   /** This field shall specify the entity propulsion plant configuration. This field is used to determine the passive signature characteristics of an entity. */
   protected byte propulsionPlantConfiguration;

   /**  This field shall represent the number of shafts on a platform */
   protected byte numberOfShafts;

   /** This field shall indicate the number of APAs described in the current UA PDU */
   protected byte numberOfAPAs;

   /** This field shall specify the number of UA emitter systems being described in the current UA PDU */
   protected byte numberOfUAEmitterSystems;

   /** shaft RPM values. */
   protected List< ShaftRPM > shaftRPMs = new ArrayList<>();
 
   /** additional passive activities */
   protected List< APA > apaData = new ArrayList<>();
 
   /** emitterSystems is an undescribed parameter... */
   protected List< UAEmitter > emitterSystems = new ArrayList<>();
 

/** Constructor creates and configures a new instance object */
 public UnderwaterAcousticPdu()
 {
    setPduType( DisPduType.UNDERWATER_ACOUSTIC );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized UnderwaterAcousticPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized UnderwaterAcousticPdu copyByteBuffer()
 {
     UnderwaterAcousticPdu newCopy = new UnderwaterAcousticPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("UnderwaterAcousticPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized UnderwaterAcousticPdu copyDataOutputStream()
 {
     UnderwaterAcousticPdu newCopy = new UnderwaterAcousticPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("UnderwaterAcousticPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("UnderwaterAcousticPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
        }
     return newCopy;
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   if (emittingEntityID != null)
       marshalSize += emittingEntityID.getMarshalledSize();
   if (eventID != null)
       marshalSize += eventID.getMarshalledSize();
   if (stateChangeIndicator != null)
       marshalSize += stateChangeIndicator.getMarshalledSize();
   marshalSize += 1;  // pad
   if (passiveParameterIndex != null)
       marshalSize += passiveParameterIndex.getMarshalledSize();
   marshalSize += 1;  // propulsionPlantConfiguration
   marshalSize += 1;  // numberOfShafts
   marshalSize += 1;  // numberOfAPAs
   marshalSize += 1;  // numberOfUAEmitterSystems
   if (shaftRPMs != null)
       for (int idx=0; idx < shaftRPMs.size(); idx++)
       {
            ShaftRPM listElement = shaftRPMs.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }
   if (apaData != null)
       for (int idx=0; idx < apaData.size(); idx++)
       {
            APA listElement = apaData.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }
   if (emitterSystems != null)
       for (int idx=0; idx < emitterSystems.size(); idx++)
       {
            UAEmitter listElement = emitterSystems.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link UnderwaterAcousticPdu#emittingEntityID}
  * @param pEmittingEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setEmittingEntityID(EntityID pEmittingEntityID)
{
    emittingEntityID = pEmittingEntityID;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#emittingEntityID}
  * @return value of interest */
public EntityID getEmittingEntityID()
{
    return emittingEntityID;
}


/** Setter for {@link UnderwaterAcousticPdu#eventID}
  * @param pEventID new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setEventID(EventIdentifier pEventID)
{
    eventID = pEventID;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#eventID}
  * @return value of interest */
public EventIdentifier getEventID()
{
    return eventID;
}


/** Setter for {@link UnderwaterAcousticPdu#stateChangeIndicator}
  * @param pStateChangeIndicator new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setStateChangeIndicator(UAStateChangeUpdateIndicator pStateChangeIndicator)
{
    stateChangeIndicator = pStateChangeIndicator;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#stateChangeIndicator}
  * @return value of interest */
public UAStateChangeUpdateIndicator getStateChangeIndicator()
{
    return stateChangeIndicator; 
}

/** Setter for {@link UnderwaterAcousticPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setPad(byte pPad)
{
    pad = pPad;
    return this;
}
/** Utility setter for {@link UnderwaterAcousticPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setPad(int pPad){
    pad = (byte) pPad;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#pad}
  * @return value of interest */
public byte getPad()
{
    return pad; 
}

/** Setter for {@link UnderwaterAcousticPdu#passiveParameterIndex}
  * @param pPassiveParameterIndex new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setPassiveParameterIndex(UAPassiveParameterIndex pPassiveParameterIndex)
{
    passiveParameterIndex = pPassiveParameterIndex;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#passiveParameterIndex}
  * @return value of interest */
public UAPassiveParameterIndex getPassiveParameterIndex()
{
    return passiveParameterIndex; 
}

/** Setter for {@link UnderwaterAcousticPdu#propulsionPlantConfiguration}
  * @param pPropulsionPlantConfiguration new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setPropulsionPlantConfiguration(byte pPropulsionPlantConfiguration)
{
    propulsionPlantConfiguration = pPropulsionPlantConfiguration;
    return this;
}
/** Utility setter for {@link UnderwaterAcousticPdu#propulsionPlantConfiguration}
  * @param pPropulsionPlantConfiguration new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setPropulsionPlantConfiguration(int pPropulsionPlantConfiguration){
    propulsionPlantConfiguration = (byte) pPropulsionPlantConfiguration;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#propulsionPlantConfiguration}
  * @return value of interest */
public byte getPropulsionPlantConfiguration()
{
    return propulsionPlantConfiguration; 
}

/** Setter for {@link UnderwaterAcousticPdu#shaftRPMs}
  * @param pShaftRPMs new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setShaftRPMs(List<ShaftRPM> pShaftRPMs)
{
    shaftRPMs = pShaftRPMs;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#shaftRPMs}
  * @return value of interest */
public List<ShaftRPM> getShaftRPMs()
{
    return shaftRPMs; 
}

/** Setter for {@link UnderwaterAcousticPdu#apaData}
  * @param pApaData new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setApaData(List<APA> pApaData)
{
    apaData = pApaData;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#apaData}
  * @return value of interest */
public List<APA> getApaData()
{
    return apaData; 
}

/** Setter for {@link UnderwaterAcousticPdu#emitterSystems}
  * @param pEmitterSystems new value of interest
  * @return same object to permit progressive setters */
public synchronized UnderwaterAcousticPdu setEmitterSystems(List<UAEmitter> pEmitterSystems)
{
    emitterSystems = pEmitterSystems;
    return this;
}
/** Getter for {@link UnderwaterAcousticPdu#emitterSystems}
  * @return value of interest */
public List<UAEmitter> getEmitterSystems()
{
    return emitterSystems; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       emittingEntityID.marshal(dos);
       eventID.marshal(dos);
       stateChangeIndicator.marshal(dos);
       dos.writeByte(pad);
       passiveParameterIndex.marshal(dos);
       dos.writeByte(propulsionPlantConfiguration);
       dos.writeByte(shaftRPMs.size());
       dos.writeByte(apaData.size());
       dos.writeByte(emitterSystems.size());

       for (int idx = 0; idx < shaftRPMs.size(); idx++)
       {
            ShaftRPM aShaftRPM = shaftRPMs.get(idx);
            aShaftRPM.marshal(dos);
       }


       for (int idx = 0; idx < apaData.size(); idx++)
       {
            APA aAPA = apaData.get(idx);
            aAPA.marshal(dos);
       }


       for (int idx = 0; idx < emitterSystems.size(); idx++)
       {
            UAEmitter aUAEmitter = emitterSystems.get(idx);
            aUAEmitter.marshal(dos);
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
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += emittingEntityID.unmarshal(dis);
        uPosition += eventID.unmarshal(dis);
        stateChangeIndicator = UAStateChangeUpdateIndicator.unmarshalEnum(dis);
        uPosition += stateChangeIndicator.getMarshalledSize();
        pad = (byte)dis.readUnsignedByte();
        uPosition += 1;
        passiveParameterIndex = UAPassiveParameterIndex.unmarshalEnum(dis);
        uPosition += passiveParameterIndex.getMarshalledSize();
        propulsionPlantConfiguration = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfShafts = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfAPAs = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfUAEmitterSystems = (byte)dis.readUnsignedByte();
        uPosition += 1;
        for (int idx = 0; idx < numberOfShafts; idx++)
        {
            ShaftRPM anX = new ShaftRPM();
            uPosition += anX.unmarshal(dis);
            shaftRPMs.add(anX);
        }

        for (int idx = 0; idx < numberOfAPAs; idx++)
        {
            APA anX = new APA();
            uPosition += anX.unmarshal(dis);
            apaData.add(anX);
        }

        for (int idx = 0; idx < numberOfUAEmitterSystems; idx++)
        {
            UAEmitter anX = new UAEmitter();
            uPosition += anX.unmarshal(dis);
            emitterSystems.add(anX);
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
public void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   emittingEntityID.marshal(byteBuffer);
   eventID.marshal(byteBuffer);
   stateChangeIndicator.marshal(byteBuffer);
   byteBuffer.put( (byte)pad);
   passiveParameterIndex.marshal(byteBuffer);
   byteBuffer.put( (byte)propulsionPlantConfiguration);
   byteBuffer.put( (byte)shaftRPMs.size());
   byteBuffer.put( (byte)apaData.size());
   byteBuffer.put( (byte)emitterSystems.size());

   for (int idx = 0; idx < shaftRPMs.size(); idx++)
   {
        ShaftRPM aShaftRPM = shaftRPMs.get(idx);
        aShaftRPM.marshal(byteBuffer);
   }


   for (int idx = 0; idx < apaData.size(); idx++)
   {
        APA aAPA = apaData.get(idx);
        aAPA.marshal(byteBuffer);
   }


   for (int idx = 0; idx < emitterSystems.size(); idx++)
   {
        UAEmitter aUAEmitter = emitterSystems.get(idx);
        aUAEmitter.marshal(byteBuffer);
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
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute emittingEntityID marked as not serialized
        emittingEntityID.unmarshal(byteBuffer);
        // attribute eventID marked as not serialized
        eventID.unmarshal(byteBuffer);
        // attribute stateChangeIndicator marked as not serialized
        stateChangeIndicator = UAStateChangeUpdateIndicator.unmarshalEnum(byteBuffer);
        // attribute pad marked as not serialized
        pad = (byte)(byteBuffer.get() & 0xFF);
        // attribute passiveParameterIndex marked as not serialized
        passiveParameterIndex = UAPassiveParameterIndex.unmarshalEnum(byteBuffer);
        // attribute propulsionPlantConfiguration marked as not serialized
        propulsionPlantConfiguration = (byte)(byteBuffer.get() & 0xFF);
        // attribute numberOfShafts marked as not serialized
        numberOfShafts = (byte)(byteBuffer.get() & 0xFF);
        // attribute numberOfAPAs marked as not serialized
        numberOfAPAs = (byte)(byteBuffer.get() & 0xFF);
        // attribute numberOfUAEmitterSystems marked as not serialized
        numberOfUAEmitterSystems = (byte)(byteBuffer.get() & 0xFF);
        // attribute shaftRPMs marked as not serialized
        for (int idx = 0; idx < numberOfShafts; idx++)
        {
        ShaftRPM anX = new ShaftRPM();
        anX.unmarshal(byteBuffer);
        shaftRPMs.add(anX);
        }

        // attribute apaData marked as not serialized
        for (int idx = 0; idx < numberOfAPAs; idx++)
        {
        APA anX = new APA();
        anX.unmarshal(byteBuffer);
        apaData.add(anX);
        }

        // attribute emitterSystems marked as not serialized
        for (int idx = 0; idx < numberOfUAEmitterSystems; idx++)
        {
        UAEmitter anX = new UAEmitter();
        anX.unmarshal(byteBuffer);
        emitterSystems.add(anX);
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
     boolean ivarsEqual = true;

     final UnderwaterAcousticPdu rhs = (UnderwaterAcousticPdu)obj;

     if( ! (emittingEntityID.equals( rhs.emittingEntityID) )) ivarsEqual = false;
     if( ! (eventID.equals( rhs.eventID) )) ivarsEqual = false;
     if( ! (stateChangeIndicator == rhs.stateChangeIndicator)) ivarsEqual = false;
     if( ! (pad == rhs.pad)) ivarsEqual = false;
     if( ! (passiveParameterIndex == rhs.passiveParameterIndex)) ivarsEqual = false;
     if( ! (propulsionPlantConfiguration == rhs.propulsionPlantConfiguration)) ivarsEqual = false;

     for (int idx = 0; idx < shaftRPMs.size(); idx++)
        if( ! ( shaftRPMs.get(idx).equals(rhs.shaftRPMs.get(idx)))) ivarsEqual = false;


     for (int idx = 0; idx < apaData.size(); idx++)
        if( ! ( apaData.get(idx).equals(rhs.apaData.get(idx)))) ivarsEqual = false;


     for (int idx = 0; idx < emitterSystems.size(); idx++)
        if( ! ( emitterSystems.get(idx).equals(rhs.emitterSystems.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" emittingEntityID:").append(emittingEntityID); // writeOneToString
    sb.append(" eventID:").append(eventID); // writeOneToString
    sb.append(" stateChangeIndicator:").append(stateChangeIndicator); // writeOneToString
    sb.append(" pad:").append(pad); // writeOneToString
    sb.append(" passiveParameterIndex:").append(passiveParameterIndex); // writeOneToString
    sb.append(" propulsionPlantConfiguration:").append(propulsionPlantConfiguration); // writeOneToString
    sb.append(" shaftRPMs: ");
    shaftRPMs.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset
    sb.append(" apaData: ");
    apaData.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset
    sb.append(" emitterSystems: ");
    emitterSystems.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
