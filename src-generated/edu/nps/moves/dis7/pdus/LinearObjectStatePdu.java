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
 * 7.10.5 Used to communicate detailed information about the addition/modification of a synthetic environment object that is geometrically anchored to the terrain with one point and has size and orientation.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class LinearObjectStatePdu extends SyntheticEnvironmentFamilyPdu implements Serializable
{
   /** Object in synthetic environment */
   protected ObjectIdentifier  objectID = new ObjectIdentifier(); 

   /** Object with which this point object is associated */
   protected ObjectIdentifier  referencedObjectID = new ObjectIdentifier(); 

   /** unique update number of each state transition of an object */
   protected short updateNumber;

   /** force ID provides a unique identifier uid 6 */
   protected ForceID forceID = ForceID.values()[0];

   /** number of linear segment parameters */
   protected byte numberOfLinearSegments;

   /** requesterID */
   protected SimulationAddress  requesterID = new SimulationAddress(); 

   /** receiver ID provides a unique identifier */
   protected SimulationAddress  receivingID = new SimulationAddress(); 

   /** Object type */
   protected ObjectType  objectType = new ObjectType(); 

   /** Linear segment parameters */
   protected List< LinearSegmentParameter > linearSegmentParameters = new ArrayList< LinearSegmentParameter >();
 

/** Constructor creates and configures a new instance object */
 public LinearObjectStatePdu()
 {
    setPduType( DisPduType.LINEAR_OBJECT_STATE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public LinearObjectStatePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public LinearObjectStatePdu copyByteBuffer()
 {
     LinearObjectStatePdu newCopy = new LinearObjectStatePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("LinearObjectStatePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public LinearObjectStatePdu copyDataOutputStream()
 {
     LinearObjectStatePdu newCopy = new LinearObjectStatePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("LinearObjectStatePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("LinearObjectStatePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (objectID != null)
       marshalSize += objectID.getMarshalledSize();
   if (referencedObjectID != null)
       marshalSize += referencedObjectID.getMarshalledSize();
   marshalSize += 2;  // updateNumber
   if (forceID != null)
       marshalSize += forceID.getMarshalledSize();
   marshalSize += 1;  // numberOfLinearSegments
   if (requesterID != null)
       marshalSize += requesterID.getMarshalledSize();
   if (receivingID != null)
       marshalSize += receivingID.getMarshalledSize();
   if (objectType != null)
       marshalSize += objectType.getMarshalledSize();
   if (linearSegmentParameters != null)
       for (int idx=0; idx < linearSegmentParameters.size(); idx++)
       {
            LinearSegmentParameter listElement = linearSegmentParameters.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link LinearObjectStatePdu#objectID}
  * @param pObjectID new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setObjectID(ObjectIdentifier pObjectID)
{
    objectID = pObjectID;
    return this;
}
/** Getter for {@link LinearObjectStatePdu#objectID}
  * @return value of interest */
public ObjectIdentifier getObjectID()
{
    return objectID;
}


/** Setter for {@link LinearObjectStatePdu#referencedObjectID}
  * @param pReferencedObjectID new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setReferencedObjectID(ObjectIdentifier pReferencedObjectID)
{
    referencedObjectID = pReferencedObjectID;
    return this;
}
/** Getter for {@link LinearObjectStatePdu#referencedObjectID}
  * @return value of interest */
public ObjectIdentifier getReferencedObjectID()
{
    return referencedObjectID;
}


/** Setter for {@link LinearObjectStatePdu#updateNumber}
  * @param pUpdateNumber new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setUpdateNumber(short pUpdateNumber)
{
    updateNumber = pUpdateNumber;
    return this;
}
/** Utility setter for {@link LinearObjectStatePdu#updateNumber}
  * @param pUpdateNumber new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setUpdateNumber(int pUpdateNumber){
    updateNumber = (short) pUpdateNumber;
    return this;
}
/** Getter for {@link LinearObjectStatePdu#updateNumber}
  * @return value of interest */
public short getUpdateNumber()
{
    return updateNumber; 
}

/** Setter for {@link LinearObjectStatePdu#forceID}
  * @param pForceID new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setForceID(ForceID pForceID)
{
    forceID = pForceID;
    return this;
}
/** Getter for {@link LinearObjectStatePdu#forceID}
  * @return value of interest */
public ForceID getForceID()
{
    return forceID; 
}

/** Setter for {@link LinearObjectStatePdu#requesterID}
  * @param pRequesterID new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setRequesterID(SimulationAddress pRequesterID)
{
    requesterID = pRequesterID;
    return this;
}
/** Getter for {@link LinearObjectStatePdu#requesterID}
  * @return value of interest */
public SimulationAddress getRequesterID()
{
    return requesterID;
}


/** Setter for {@link LinearObjectStatePdu#receivingID}
  * @param pReceivingID new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setReceivingID(SimulationAddress pReceivingID)
{
    receivingID = pReceivingID;
    return this;
}
/** Getter for {@link LinearObjectStatePdu#receivingID}
  * @return value of interest */
public SimulationAddress getReceivingID()
{
    return receivingID;
}


/** Setter for {@link LinearObjectStatePdu#objectType}
  * @param pObjectType new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setObjectType(ObjectType pObjectType)
{
    objectType = pObjectType;
    return this;
}
/** Getter for {@link LinearObjectStatePdu#objectType}
  * @return value of interest */
public ObjectType getObjectType()
{
    return objectType;
}


/** Setter for {@link LinearObjectStatePdu#linearSegmentParameters}
  * @param pLinearSegmentParameters new value of interest
  * @return same object to permit progressive setters */
public LinearObjectStatePdu setLinearSegmentParameters(List<LinearSegmentParameter> pLinearSegmentParameters)
{
    linearSegmentParameters = pLinearSegmentParameters;
    return this;
}
/** Getter for {@link LinearObjectStatePdu#linearSegmentParameters}
  * @return value of interest */
public List<LinearSegmentParameter> getLinearSegmentParameters()
{
    return linearSegmentParameters; 
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
       objectID.marshal(dos);
       referencedObjectID.marshal(dos);
       dos.writeShort(updateNumber);
       forceID.marshal(dos);
       dos.writeByte(linearSegmentParameters.size());
       requesterID.marshal(dos);
       receivingID.marshal(dos);
       objectType.marshal(dos);

       for (int idx = 0; idx < linearSegmentParameters.size(); idx++)
       {
            LinearSegmentParameter aLinearSegmentParameter = linearSegmentParameters.get(idx);
            aLinearSegmentParameter.marshal(dos);
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
        uPosition += objectID.unmarshal(dis);
        uPosition += referencedObjectID.unmarshal(dis);
        updateNumber = (short)dis.readUnsignedShort();
        uPosition += 2;
        forceID = ForceID.unmarshalEnum(dis);
        uPosition += forceID.getMarshalledSize();
        numberOfLinearSegments = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += requesterID.unmarshal(dis);
        uPosition += receivingID.unmarshal(dis);
        uPosition += objectType.unmarshal(dis);
        for (int idx = 0; idx < numberOfLinearSegments; idx++)
        {
            LinearSegmentParameter anX = new LinearSegmentParameter();
            uPosition += anX.unmarshal(dis);
            linearSegmentParameters.add(anX);
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
   objectID.marshal(byteBuffer);
   referencedObjectID.marshal(byteBuffer);
   byteBuffer.putShort( (short)updateNumber);
   forceID.marshal(byteBuffer);
   byteBuffer.put( (byte)linearSegmentParameters.size());
   requesterID.marshal(byteBuffer);
   receivingID.marshal(byteBuffer);
   objectType.marshal(byteBuffer);

   for (int idx = 0; idx < linearSegmentParameters.size(); idx++)
   {
        LinearSegmentParameter aLinearSegmentParameter = linearSegmentParameters.get(idx);
        aLinearSegmentParameter.marshal(byteBuffer);
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
        // attribute objectID marked as not serialized
        objectID.unmarshal(byteBuffer);
        // attribute referencedObjectID marked as not serialized
        referencedObjectID.unmarshal(byteBuffer);
        // attribute updateNumber marked as not serialized
        updateNumber = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute forceID marked as not serialized
        forceID = ForceID.unmarshalEnum(byteBuffer);
        // attribute numberOfLinearSegments marked as not serialized
        numberOfLinearSegments = (byte)(byteBuffer.get() & 0xFF);
        // attribute requesterID marked as not serialized
        requesterID.unmarshal(byteBuffer);
        // attribute receivingID marked as not serialized
        receivingID.unmarshal(byteBuffer);
        // attribute objectType marked as not serialized
        objectType.unmarshal(byteBuffer);
        // attribute linearSegmentParameters marked as not serialized
        for (int idx = 0; idx < numberOfLinearSegments; idx++)
        {
        LinearSegmentParameter anX = new LinearSegmentParameter();
        anX.unmarshal(byteBuffer);
        linearSegmentParameters.add(anX);
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

     final LinearObjectStatePdu rhs = (LinearObjectStatePdu)obj;

     if( ! (objectID.equals( rhs.objectID) )) ivarsEqual = false;
     if( ! (referencedObjectID.equals( rhs.referencedObjectID) )) ivarsEqual = false;
     if( ! (updateNumber == rhs.updateNumber)) ivarsEqual = false;
     if( ! (forceID == rhs.forceID)) ivarsEqual = false;
     if( ! (requesterID.equals( rhs.requesterID) )) ivarsEqual = false;
     if( ! (receivingID.equals( rhs.receivingID) )) ivarsEqual = false;
     if( ! (objectType.equals( rhs.objectType) )) ivarsEqual = false;

     for (int idx = 0; idx < linearSegmentParameters.size(); idx++)
        if( ! ( linearSegmentParameters.get(idx).equals(rhs.linearSegmentParameters.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" objectID:").append(objectID); // writeOneToString
    sb.append(" referencedObjectID:").append(referencedObjectID); // writeOneToString
    sb.append(" updateNumber:").append(updateNumber); // writeOneToString
    sb.append(" forceID:").append(forceID); // writeOneToString
    sb.append(" requesterID:").append(requesterID); // writeOneToString
    sb.append(" receivingID:").append(receivingID); // writeOneToString
    sb.append(" objectType:").append(objectType); // writeOneToString
    sb.append(" linearSegmentParameters: ");
    linearSegmentParameters.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
