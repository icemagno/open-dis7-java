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
import java.nio.ByteBuffer;

/**
 * 5.13.3.1 Used to communicate an IO attack or the effects of an IO attack on one or more target entities.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class InformationOperationsActionPdu extends InformationOperationsFamilyPdu implements Serializable
{
   /** the simulation to which this PDU is addressed */
   protected EntityID  receivingSimID = new EntityID(); 

   /** request ID provides a unique identifier */
   protected int requestID;

   /**  uid 285 */
   protected IOActionIOWarfareType IOWarfareType = IOActionIOWarfareType.values()[0];

   /**  uid 286 */
   protected IOActionIOSimulationSource IOSimulationSource = IOActionIOSimulationSource.values()[0];

   /**  uid 287 */
   protected IOActionIOActionType IOActionType = IOActionIOActionType.values()[0];

   /**  uid 288 */
   protected IOActionIOActionPhase IOActionPhase = IOActionIOActionPhase.values()[0];

   /** padding1 is an undescribed parameter... */
   protected int padding1;

   /** ioAttackerID is an undescribed parameter... */
   protected EntityID  ioAttackerID = new EntityID(); 

   /** ioPrimaryTargetID is an undescribed parameter... */
   protected EntityID  ioPrimaryTargetID = new EntityID(); 

   /** padding2 is an undescribed parameter... */
   protected short padding2;

   /** numberOfIORecords is an undescribed parameter... */
   protected short numberOfIORecords;

   /** ioRecords is an undescribed parameter... */
   protected List< IORecord > ioRecords = new ArrayList< IORecord >();
 

/** Constructor creates and configures a new instance object */
 public InformationOperationsActionPdu()
 {
    setPduType( DisPduType.INFORMATION_OPERATIONS_ACTION );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public InformationOperationsActionPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public InformationOperationsActionPdu copyByteBuffer()
 {
     InformationOperationsActionPdu newCopy = new InformationOperationsActionPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("InformationOperationsActionPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
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
 public InformationOperationsActionPdu copyDataOutputStream()
 {
     InformationOperationsActionPdu newCopy = new InformationOperationsActionPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("InformationOperationsActionPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
         e.printStackTrace();
         System.exit(-1);
     }
        try
        {
                 dataOutputStream.flush();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.reset();
        }
        catch (IOException ioe)
        {
            System.out.println("InformationOperationsActionPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (receivingSimID != null)
       marshalSize += receivingSimID.getMarshalledSize();
   marshalSize += 4;  // requestID
   if (IOWarfareType != null)
       marshalSize += IOWarfareType.getMarshalledSize();
   if (IOSimulationSource != null)
       marshalSize += IOSimulationSource.getMarshalledSize();
   if (IOActionType != null)
       marshalSize += IOActionType.getMarshalledSize();
   if (IOActionPhase != null)
       marshalSize += IOActionPhase.getMarshalledSize();
   marshalSize += 4;  // padding1
   if (ioAttackerID != null)
       marshalSize += ioAttackerID.getMarshalledSize();
   if (ioPrimaryTargetID != null)
       marshalSize += ioPrimaryTargetID.getMarshalledSize();
   marshalSize += 2;  // padding2
   marshalSize += 2;  // numberOfIORecords
   if (ioRecords != null)
       for (int idx=0; idx < ioRecords.size(); idx++)
       {
            IORecord listElement = ioRecords.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link InformationOperationsActionPdu#receivingSimID}
  * @param pReceivingSimID new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setReceivingSimID(EntityID pReceivingSimID)
{
    receivingSimID = pReceivingSimID;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#receivingSimID}
  * @return value of interest */
public EntityID getReceivingSimID()
{
    return receivingSimID;
}


/** Setter for {@link InformationOperationsActionPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link InformationOperationsActionPdu#IOWarfareType}
  * @param pIOWarfareType new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setIOWarfareType(IOActionIOWarfareType pIOWarfareType)
{
    IOWarfareType = pIOWarfareType;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#IOWarfareType}
  * @return value of interest */
public IOActionIOWarfareType getIOWarfareType()
{
    return IOWarfareType; 
}

/** Setter for {@link InformationOperationsActionPdu#IOSimulationSource}
  * @param pIOSimulationSource new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setIOSimulationSource(IOActionIOSimulationSource pIOSimulationSource)
{
    IOSimulationSource = pIOSimulationSource;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#IOSimulationSource}
  * @return value of interest */
public IOActionIOSimulationSource getIOSimulationSource()
{
    return IOSimulationSource; 
}

/** Setter for {@link InformationOperationsActionPdu#IOActionType}
  * @param pIOActionType new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setIOActionType(IOActionIOActionType pIOActionType)
{
    IOActionType = pIOActionType;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#IOActionType}
  * @return value of interest */
public IOActionIOActionType getIOActionType()
{
    return IOActionType; 
}

/** Setter for {@link InformationOperationsActionPdu#IOActionPhase}
  * @param pIOActionPhase new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setIOActionPhase(IOActionIOActionPhase pIOActionPhase)
{
    IOActionPhase = pIOActionPhase;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#IOActionPhase}
  * @return value of interest */
public IOActionIOActionPhase getIOActionPhase()
{
    return IOActionPhase; 
}

/** Setter for {@link InformationOperationsActionPdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setPadding1(int pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#padding1}
  * @return value of interest */
public int getPadding1()
{
    return padding1; 
}

/** Setter for {@link InformationOperationsActionPdu#ioAttackerID}
  * @param pIoAttackerID new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setIoAttackerID(EntityID pIoAttackerID)
{
    ioAttackerID = pIoAttackerID;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#ioAttackerID}
  * @return value of interest */
public EntityID getIoAttackerID()
{
    return ioAttackerID;
}


/** Setter for {@link InformationOperationsActionPdu#ioPrimaryTargetID}
  * @param pIoPrimaryTargetID new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setIoPrimaryTargetID(EntityID pIoPrimaryTargetID)
{
    ioPrimaryTargetID = pIoPrimaryTargetID;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#ioPrimaryTargetID}
  * @return value of interest */
public EntityID getIoPrimaryTargetID()
{
    return ioPrimaryTargetID;
}


/** Setter for {@link InformationOperationsActionPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}
/** Utility setter for {@link InformationOperationsActionPdu#padding2}
  * @param pPadding2 new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setPadding2(int pPadding2){
    padding2 = (short) pPadding2;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#padding2}
  * @return value of interest */
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link InformationOperationsActionPdu#ioRecords}
  * @param pIoRecords new value of interest
  * @return same object to permit progressive setters */
public InformationOperationsActionPdu setIoRecords(List<IORecord> pIoRecords)
{
    ioRecords = pIoRecords;
    return this;
}
/** Getter for {@link InformationOperationsActionPdu#ioRecords}
  * @return value of interest */
public List<IORecord> getIoRecords()
{
    return ioRecords; 
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
       receivingSimID.marshal(dos);
       dos.writeInt(requestID);
       IOWarfareType.marshal(dos);
       IOSimulationSource.marshal(dos);
       IOActionType.marshal(dos);
       IOActionPhase.marshal(dos);
       dos.writeInt(padding1);
       ioAttackerID.marshal(dos);
       ioPrimaryTargetID.marshal(dos);
       dos.writeShort(padding2);
       dos.writeShort(ioRecords.size());

       for (int idx = 0; idx < ioRecords.size(); idx++)
       {
            IORecord aIORecord = ioRecords.get(idx);
            aIORecord.marshal(dos);
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
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += receivingSimID.unmarshal(dis);
        requestID = dis.readInt();
        uPosition += 4;
        IOWarfareType = IOActionIOWarfareType.unmarshalEnum(dis);
        uPosition += IOWarfareType.getMarshalledSize();
        IOSimulationSource = IOActionIOSimulationSource.unmarshalEnum(dis);
        uPosition += IOSimulationSource.getMarshalledSize();
        IOActionType = IOActionIOActionType.unmarshalEnum(dis);
        uPosition += IOActionType.getMarshalledSize();
        IOActionPhase = IOActionIOActionPhase.unmarshalEnum(dis);
        uPosition += IOActionPhase.getMarshalledSize();
        padding1 = dis.readInt();
        uPosition += 4;
        uPosition += ioAttackerID.unmarshal(dis);
        uPosition += ioPrimaryTargetID.unmarshal(dis);
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        numberOfIORecords = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfIORecords; idx++)
        {
            IORecord anX = new IORecord();
            uPosition += anX.unmarshal(dis);
            ioRecords.add(anX);
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
   receivingSimID.marshal(byteBuffer);
   byteBuffer.putInt( (int)requestID);
   IOWarfareType.marshal(byteBuffer);
   IOSimulationSource.marshal(byteBuffer);
   IOActionType.marshal(byteBuffer);
   IOActionPhase.marshal(byteBuffer);
   byteBuffer.putInt( (int)padding1);
   ioAttackerID.marshal(byteBuffer);
   ioPrimaryTargetID.marshal(byteBuffer);
   byteBuffer.putShort( (short)padding2);
   byteBuffer.putShort( (short)ioRecords.size());

   for (int idx = 0; idx < ioRecords.size(); idx++)
   {
        IORecord aIORecord = ioRecords.get(idx);
        aIORecord.marshal(byteBuffer);
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
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute receivingSimID marked as not serialized
        receivingSimID.unmarshal(byteBuffer);
        // attribute requestID marked as not serialized
        requestID = byteBuffer.getInt();
        // attribute IOWarfareType marked as not serialized
        IOWarfareType = IOActionIOWarfareType.unmarshalEnum(byteBuffer);
        // attribute IOSimulationSource marked as not serialized
        IOSimulationSource = IOActionIOSimulationSource.unmarshalEnum(byteBuffer);
        // attribute IOActionType marked as not serialized
        IOActionType = IOActionIOActionType.unmarshalEnum(byteBuffer);
        // attribute IOActionPhase marked as not serialized
        IOActionPhase = IOActionIOActionPhase.unmarshalEnum(byteBuffer);
        // attribute padding1 marked as not serialized
        padding1 = byteBuffer.getInt();
        // attribute ioAttackerID marked as not serialized
        ioAttackerID.unmarshal(byteBuffer);
        // attribute ioPrimaryTargetID marked as not serialized
        ioPrimaryTargetID.unmarshal(byteBuffer);
        // attribute padding2 marked as not serialized
        padding2 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute numberOfIORecords marked as not serialized
        numberOfIORecords = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute ioRecords marked as not serialized
        for (int idx = 0; idx < numberOfIORecords; idx++)
        {
        IORecord anX = new IORecord();
        anX.unmarshal(byteBuffer);
        ioRecords.add(anX);
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

     final InformationOperationsActionPdu rhs = (InformationOperationsActionPdu)obj;

     if( ! (receivingSimID.equals( rhs.receivingSimID) )) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;
     if( ! (IOWarfareType == rhs.IOWarfareType)) ivarsEqual = false;
     if( ! (IOSimulationSource == rhs.IOSimulationSource)) ivarsEqual = false;
     if( ! (IOActionType == rhs.IOActionType)) ivarsEqual = false;
     if( ! (IOActionPhase == rhs.IOActionPhase)) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (ioAttackerID.equals( rhs.ioAttackerID) )) ivarsEqual = false;
     if( ! (ioPrimaryTargetID.equals( rhs.ioPrimaryTargetID) )) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;

     for (int idx = 0; idx < ioRecords.size(); idx++)
        if( ! ( ioRecords.get(idx).equals(rhs.ioRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" receivingSimID:").append(receivingSimID); // writeOneToString
    sb.append(" requestID:").append(requestID); // writeOneToString
    sb.append(" IOWarfareType:").append(IOWarfareType); // writeOneToString
    sb.append(" IOSimulationSource:").append(IOSimulationSource); // writeOneToString
    sb.append(" IOActionType:").append(IOActionType); // writeOneToString
    sb.append(" IOActionPhase:").append(IOActionPhase); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" ioAttackerID:").append(ioAttackerID); // writeOneToString
    sb.append(" ioPrimaryTargetID:").append(ioPrimaryTargetID); // writeOneToString
    sb.append(" padding2:").append(padding2); // writeOneToString
    sb.append(" ioRecords: ");
    ioRecords.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
