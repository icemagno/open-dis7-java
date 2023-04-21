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
 * 7.2.5. Nonstatic information about a particular entity may be communicated by issuing an Entity State Update PDU. 5.3.5.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class EntityStateUpdatePdu extends EntityInformationInteractionFamilyPdu implements Serializable
{
   /** This field shall identify the entity issuing the PDU, and shall be represented by an Entity Identifier record (see 6.2.28). */
   protected EntityID  entityID = new EntityID(); 

   /** Padding */
   protected byte padding1;

   /** This field shall specify the number of variable parameters present. This field shall be represented by an 8-bit unsigned integer (see Annex I). */
   protected byte numberOfVariableParameters;

   /** This field shall specify an entity's linear velocity. The coordinate system for an entity's linear velocity depends on the dead reckoning algorithm used. This field shall be represented by a Linear Velocity Vector record [see 6.2.95 item c)]). */
   protected Vector3Float  entityLinearVelocity = new Vector3Float(); 

   /** This field shall specify an entity's physical location in the simulated world and shall be represented by a World Coordinates record (see 6.2.97). */
   protected Vector3Double  entityLocation = new Vector3Double(); 

   /** This field shall specify an entity's orientation with units of radians and shall be represented by an Euler Angles record (see 6.2.33). */
   protected EulerAngles  entityOrientation = new EulerAngles(); 

   /** This field shall specify the dynamic changes to the entity's appearance attributes. This field shall be represented by an Entity Appearance record (see 6.2.26). */
   protected int entityAppearance;

   /** This field shall specify the parameter values for each Variable Parameter record that is included (see 6.2.93 and Annex I). */
   protected List< VariableParameter > variableParameters = new ArrayList< VariableParameter >();
 

/** Constructor creates and configures a new instance object */
 public EntityStateUpdatePdu()
 {
    setPduType( DisPduType.ENTITY_STATE_UPDATE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public EntityStateUpdatePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public EntityStateUpdatePdu copyByteBuffer()
 {
     EntityStateUpdatePdu newCopy = new EntityStateUpdatePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.out.println("EntityStateUpdatePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public EntityStateUpdatePdu copyDataOutputStream()
 {
     EntityStateUpdatePdu newCopy = new EntityStateUpdatePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.out.println("EntityStateUpdatePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.out.println("EntityStateUpdatePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (entityID != null)
       marshalSize += entityID.getMarshalledSize();
   marshalSize += 1;  // padding1
   marshalSize += 1;  // numberOfVariableParameters
   if (entityLinearVelocity != null)
       marshalSize += entityLinearVelocity.getMarshalledSize();
   if (entityLocation != null)
       marshalSize += entityLocation.getMarshalledSize();
   if (entityOrientation != null)
       marshalSize += entityOrientation.getMarshalledSize();
   marshalSize += 4;  // entityAppearance
   if (variableParameters != null)
       for (int idx=0; idx < variableParameters.size(); idx++)
       {
            VariableParameter listElement = variableParameters.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link EntityStateUpdatePdu#entityID}
  * @param pEntityID new value of interest
  * @return same object to permit progressive setters */
public EntityStateUpdatePdu setEntityID(EntityID pEntityID)
{
    entityID = pEntityID;
    return this;
}
/** Getter for {@link EntityStateUpdatePdu#entityID}
  * @return value of interest */
public EntityID getEntityID()
{
    return entityID;
}


/** Setter for {@link EntityStateUpdatePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public EntityStateUpdatePdu setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}
/** Utility setter for {@link EntityStateUpdatePdu#padding1}
  * @param pPadding1 new value of interest
  * @return same object to permit progressive setters */
public EntityStateUpdatePdu setPadding1(int pPadding1){
    padding1 = (byte) pPadding1;
    return this;
}
/** Getter for {@link EntityStateUpdatePdu#padding1}
  * @return value of interest */
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link EntityStateUpdatePdu#entityLinearVelocity}
  * @param pEntityLinearVelocity new value of interest
  * @return same object to permit progressive setters */
public EntityStateUpdatePdu setEntityLinearVelocity(Vector3Float pEntityLinearVelocity)
{
    entityLinearVelocity = pEntityLinearVelocity;
    return this;
}
/** Getter for {@link EntityStateUpdatePdu#entityLinearVelocity}
  * @return value of interest */
public Vector3Float getEntityLinearVelocity()
{
    return entityLinearVelocity;
}


/** Setter for {@link EntityStateUpdatePdu#entityLocation}
  * @param pEntityLocation new value of interest
  * @return same object to permit progressive setters */
public EntityStateUpdatePdu setEntityLocation(Vector3Double pEntityLocation)
{
    entityLocation = pEntityLocation;
    return this;
}
/** Getter for {@link EntityStateUpdatePdu#entityLocation}
  * @return value of interest */
public Vector3Double getEntityLocation()
{
    return entityLocation;
}


/** Setter for {@link EntityStateUpdatePdu#entityOrientation}
  * @param pEntityOrientation new value of interest
  * @return same object to permit progressive setters */
public EntityStateUpdatePdu setEntityOrientation(EulerAngles pEntityOrientation)
{
    entityOrientation = pEntityOrientation;
    return this;
}
/** Getter for {@link EntityStateUpdatePdu#entityOrientation}
  * @return value of interest */
public EulerAngles getEntityOrientation()
{
    return entityOrientation;
}


/** Setter for {@link EntityStateUpdatePdu#entityAppearance}
  * @param pEntityAppearance new value of interest
  * @return same object to permit progressive setters */
public EntityStateUpdatePdu setEntityAppearance(int pEntityAppearance)
{
    entityAppearance = pEntityAppearance;
    return this;
}
/** Getter for {@link EntityStateUpdatePdu#entityAppearance}
  * @return value of interest */
public int getEntityAppearance()
{
    return entityAppearance; 
}

/** Setter for {@link EntityStateUpdatePdu#variableParameters}
  * @param pVariableParameters new value of interest
  * @return same object to permit progressive setters */
public EntityStateUpdatePdu setVariableParameters(List<VariableParameter> pVariableParameters)
{
    variableParameters = pVariableParameters;
    return this;
}
/** Getter for {@link EntityStateUpdatePdu#variableParameters}
  * @return value of interest */
public List<VariableParameter> getVariableParameters()
{
    return variableParameters; 
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
       entityID.marshal(dos);
       dos.writeByte(padding1);
       dos.writeByte(variableParameters.size());
       entityLinearVelocity.marshal(dos);
       entityLocation.marshal(dos);
       entityOrientation.marshal(dos);
       dos.writeInt(entityAppearance);

       for (int idx = 0; idx < variableParameters.size(); idx++)
       {
            VariableParameter aVariableParameter = variableParameters.get(idx);
            aVariableParameter.marshal(dos);
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
        uPosition += entityID.unmarshal(dis);
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfVariableParameters = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += entityLinearVelocity.unmarshal(dis);
        uPosition += entityLocation.unmarshal(dis);
        uPosition += entityOrientation.unmarshal(dis);
        entityAppearance = dis.readInt();
        uPosition += 4;
        for (int idx = 0; idx < numberOfVariableParameters; idx++)
        {
            VariableParameter anX = new VariableParameter();
            uPosition += anX.unmarshal(dis);
            variableParameters.add(anX);
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
   entityID.marshal(byteBuffer);
   byteBuffer.put( (byte)padding1);
   byteBuffer.put( (byte)variableParameters.size());
   entityLinearVelocity.marshal(byteBuffer);
   entityLocation.marshal(byteBuffer);
   entityOrientation.marshal(byteBuffer);
   byteBuffer.putInt( (int)entityAppearance);

   for (int idx = 0; idx < variableParameters.size(); idx++)
   {
        VariableParameter aVariableParameter = variableParameters.get(idx);
        aVariableParameter.marshal(byteBuffer);
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
        // attribute entityID marked as not serialized
        entityID.unmarshal(byteBuffer);
        // attribute padding1 marked as not serialized
        padding1 = (byte)(byteBuffer.get() & 0xFF);
        // attribute numberOfVariableParameters marked as not serialized
        numberOfVariableParameters = (byte)(byteBuffer.get() & 0xFF);
        // attribute entityLinearVelocity marked as not serialized
        entityLinearVelocity.unmarshal(byteBuffer);
        // attribute entityLocation marked as not serialized
        entityLocation.unmarshal(byteBuffer);
        // attribute entityOrientation marked as not serialized
        entityOrientation.unmarshal(byteBuffer);
        // attribute entityAppearance marked as not serialized
        entityAppearance = byteBuffer.getInt();
        // attribute variableParameters marked as not serialized
        for (int idx = 0; idx < numberOfVariableParameters; idx++)
        {
        VariableParameter anX = new VariableParameter();
        anX.unmarshal(byteBuffer);
        variableParameters.add(anX);
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

     final EntityStateUpdatePdu rhs = (EntityStateUpdatePdu)obj;

     if( ! (entityID.equals( rhs.entityID) )) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (entityLinearVelocity.equals( rhs.entityLinearVelocity) )) ivarsEqual = false;
     if( ! (entityLocation.equals( rhs.entityLocation) )) ivarsEqual = false;
     if( ! (entityOrientation.equals( rhs.entityOrientation) )) ivarsEqual = false;
     if( ! (entityAppearance == rhs.entityAppearance)) ivarsEqual = false;

     for (int idx = 0; idx < variableParameters.size(); idx++)
        if( ! ( variableParameters.get(idx).equals(rhs.variableParameters.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" entityID:").append(entityID); // writeOneToString
    sb.append(" padding1:").append(padding1); // writeOneToString
    sb.append(" entityLinearVelocity:").append(entityLinearVelocity); // writeOneToString
    sb.append(" entityLocation:").append(entityLocation); // writeOneToString
    sb.append(" entityOrientation:").append(entityOrientation); // writeOneToString
    sb.append(" entityAppearance:").append(entityAppearance); // writeOneToString
    sb.append(" variableParameters: ");
    variableParameters.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
