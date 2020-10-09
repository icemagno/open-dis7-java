/**
 * Copyright (c) 2008-2020, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */

package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 7.2.4 Information about elastic collisions in a DIS exercise shall be communicated using a Collision-Elastic PDU. See 5.3.4.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class CollisionElasticPdu extends EntityInformationFamilyPdu implements Serializable
{
   /** This field shall identify the entity that is issuing the PDU and shall be represented by an Entity Identifier record (see 6.2.28) */
   protected EntityID  issuingEntityID = new EntityID(); 

   /** This field shall identify the entity that has collided with the issuing entity. This field shall be a valid identifier of an entity or server capable of responding to the receipt of this Collision-Elastic PDU. This field shall be represented by an Entity Identifier record (see 6.2.28). */
   protected EntityID  collidingEntityID = new EntityID(); 

   /** This field shall contain an identification generated by the issuing simulation application to associate related collision events. This field shall be represented by an Event Identifier record (see 6.2.34). */
   protected EventIdentifier  collisionEventID = new EventIdentifier(); 

   /** some padding */
   protected short  pad = (short)0;

   /** This field shall contain the velocity at the time the collision is detected at the point the collision is detected. The velocity shall be represented in world coordinates. This field shall be represented by the Linear Velocity Vector record [see 6.2.95 item c)] */
   protected Vector3Float  contactVelocity = new Vector3Float(); 

   /** This field shall contain the mass of the issuing entity and shall be represented by a 32-bit floating point number representing kilograms */
   protected float  mass;

   /** This field shall specify the location of the collision with respect to the entity with which the issuing entity collided. This field shall be represented by an Entity Coordinate Vector record [see 6.2.95 item a)]. */
   protected Vector3Float  locationOfImpact = new Vector3Float(); 

   /** These six records represent the six independent components of a positive semi-definite matrix formed by pre-multiplying and post-multiplying the tensor of inertia, by the anti-symmetric matrix generated by the moment arm, and shall be represented by 32-bit floating point numbers (see 5.3.4.4) */
   protected float  collisionIntermediateResultXX;

   /** tensor values */
   protected float  collisionIntermediateResultXY;

   /** tensor values */
   protected float  collisionIntermediateResultXZ;

   /** tensor values */
   protected float  collisionIntermediateResultYY;

   /** tensor values */
   protected float  collisionIntermediateResultYZ;

   /** tensor values */
   protected float  collisionIntermediateResultZZ;

   /** This record shall represent the normal vector to the surface at the point of collision detection. The surface normal shall be represented in world coordinates. This field shall be represented by an Entity Coordinate Vector record [see 6.2.95 item a)]. */
   protected Vector3Float  unitSurfaceNormal = new Vector3Float(); 

   /** This field shall represent the degree to which energy is conserved in a collision and shall be represented by a 32-bit floating point number. In addition, it represents a free parameter by which simulation application developers may "tune" their collision interactions. */
   protected float  coefficientOfRestitution;


/** Constructor */
 public CollisionElasticPdu()
 {
    setPduType( DISPDUType.COLLISION_ELASTIC );
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += issuingEntityID.getMarshalledSize();
   marshalSize += collidingEntityID.getMarshalledSize();
   marshalSize += collisionEventID.getMarshalledSize();
   marshalSize += 2;  // pad
   marshalSize += contactVelocity.getMarshalledSize();
   marshalSize += 4;  // mass
   marshalSize += locationOfImpact.getMarshalledSize();
   marshalSize += 4;  // collisionIntermediateResultXX
   marshalSize += 4;  // collisionIntermediateResultXY
   marshalSize += 4;  // collisionIntermediateResultXZ
   marshalSize += 4;  // collisionIntermediateResultYY
   marshalSize += 4;  // collisionIntermediateResultYZ
   marshalSize += 4;  // collisionIntermediateResultZZ
   marshalSize += unitSurfaceNormal.getMarshalledSize();
   marshalSize += 4;  // coefficientOfRestitution

   return marshalSize;
}


/** Setter for {@link CollisionElasticPdu#issuingEntityID}
  * @param pIssuingEntityID new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setIssuingEntityID(EntityID pIssuingEntityID)
{
    issuingEntityID = pIssuingEntityID;
    return this;
}

/** Getter for {@link CollisionElasticPdu#issuingEntityID}
  * @return value of interest */
public EntityID getIssuingEntityID()
{
    return issuingEntityID; 
}

/** Setter for {@link CollisionElasticPdu#collidingEntityID}
  * @param pCollidingEntityID new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCollidingEntityID(EntityID pCollidingEntityID)
{
    collidingEntityID = pCollidingEntityID;
    return this;
}

/** Getter for {@link CollisionElasticPdu#collidingEntityID}
  * @return value of interest */
public EntityID getCollidingEntityID()
{
    return collidingEntityID; 
}

/** Setter for {@link CollisionElasticPdu#collisionEventID}
  * @param pCollisionEventID new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCollisionEventID(EventIdentifier pCollisionEventID)
{
    collisionEventID = pCollisionEventID;
    return this;
}

/** Getter for {@link CollisionElasticPdu#collisionEventID}
  * @return value of interest */
public EventIdentifier getCollisionEventID()
{
    return collisionEventID; 
}

/** Setter for {@link CollisionElasticPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setPad(short pPad)
{
    pad = pPad;
    return this;
}
/** Utility setter for {@link CollisionElasticPdu#pad}
  * @param pPad new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setPad(int pPad){
    pad = (short) pPad;
    return this;
}

/** Getter for {@link CollisionElasticPdu#pad}
  * @return value of interest */
public short getPad()
{
    return pad; 
}

/** Setter for {@link CollisionElasticPdu#contactVelocity}
  * @param pContactVelocity new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setContactVelocity(Vector3Float pContactVelocity)
{
    contactVelocity = pContactVelocity;
    return this;
}

/** Getter for {@link CollisionElasticPdu#contactVelocity}
  * @return value of interest */
public Vector3Float getContactVelocity()
{
    return contactVelocity; 
}

/** Setter for {@link CollisionElasticPdu#mass}
  * @param pMass new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setMass(float pMass)
{
    mass = pMass;
    return this;
}

/** Getter for {@link CollisionElasticPdu#mass}
  * @return value of interest */
public float getMass()
{
    return mass; 
}

/** Setter for {@link CollisionElasticPdu#locationOfImpact}
  * @param pLocationOfImpact new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setLocationOfImpact(Vector3Float pLocationOfImpact)
{
    locationOfImpact = pLocationOfImpact;
    return this;
}

/** Getter for {@link CollisionElasticPdu#locationOfImpact}
  * @return value of interest */
public Vector3Float getLocationOfImpact()
{
    return locationOfImpact; 
}

/** Setter for {@link CollisionElasticPdu#collisionIntermediateResultXX}
  * @param pCollisionIntermediateResultXX new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCollisionIntermediateResultXX(float pCollisionIntermediateResultXX)
{
    collisionIntermediateResultXX = pCollisionIntermediateResultXX;
    return this;
}

/** Getter for {@link CollisionElasticPdu#collisionIntermediateResultXX}
  * @return value of interest */
public float getCollisionIntermediateResultXX()
{
    return collisionIntermediateResultXX; 
}

/** Setter for {@link CollisionElasticPdu#collisionIntermediateResultXY}
  * @param pCollisionIntermediateResultXY new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCollisionIntermediateResultXY(float pCollisionIntermediateResultXY)
{
    collisionIntermediateResultXY = pCollisionIntermediateResultXY;
    return this;
}

/** Getter for {@link CollisionElasticPdu#collisionIntermediateResultXY}
  * @return value of interest */
public float getCollisionIntermediateResultXY()
{
    return collisionIntermediateResultXY; 
}

/** Setter for {@link CollisionElasticPdu#collisionIntermediateResultXZ}
  * @param pCollisionIntermediateResultXZ new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCollisionIntermediateResultXZ(float pCollisionIntermediateResultXZ)
{
    collisionIntermediateResultXZ = pCollisionIntermediateResultXZ;
    return this;
}

/** Getter for {@link CollisionElasticPdu#collisionIntermediateResultXZ}
  * @return value of interest */
public float getCollisionIntermediateResultXZ()
{
    return collisionIntermediateResultXZ; 
}

/** Setter for {@link CollisionElasticPdu#collisionIntermediateResultYY}
  * @param pCollisionIntermediateResultYY new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCollisionIntermediateResultYY(float pCollisionIntermediateResultYY)
{
    collisionIntermediateResultYY = pCollisionIntermediateResultYY;
    return this;
}

/** Getter for {@link CollisionElasticPdu#collisionIntermediateResultYY}
  * @return value of interest */
public float getCollisionIntermediateResultYY()
{
    return collisionIntermediateResultYY; 
}

/** Setter for {@link CollisionElasticPdu#collisionIntermediateResultYZ}
  * @param pCollisionIntermediateResultYZ new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCollisionIntermediateResultYZ(float pCollisionIntermediateResultYZ)
{
    collisionIntermediateResultYZ = pCollisionIntermediateResultYZ;
    return this;
}

/** Getter for {@link CollisionElasticPdu#collisionIntermediateResultYZ}
  * @return value of interest */
public float getCollisionIntermediateResultYZ()
{
    return collisionIntermediateResultYZ; 
}

/** Setter for {@link CollisionElasticPdu#collisionIntermediateResultZZ}
  * @param pCollisionIntermediateResultZZ new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCollisionIntermediateResultZZ(float pCollisionIntermediateResultZZ)
{
    collisionIntermediateResultZZ = pCollisionIntermediateResultZZ;
    return this;
}

/** Getter for {@link CollisionElasticPdu#collisionIntermediateResultZZ}
  * @return value of interest */
public float getCollisionIntermediateResultZZ()
{
    return collisionIntermediateResultZZ; 
}

/** Setter for {@link CollisionElasticPdu#unitSurfaceNormal}
  * @param pUnitSurfaceNormal new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setUnitSurfaceNormal(Vector3Float pUnitSurfaceNormal)
{
    unitSurfaceNormal = pUnitSurfaceNormal;
    return this;
}

/** Getter for {@link CollisionElasticPdu#unitSurfaceNormal}
  * @return value of interest */
public Vector3Float getUnitSurfaceNormal()
{
    return unitSurfaceNormal; 
}

/** Setter for {@link CollisionElasticPdu#coefficientOfRestitution}
  * @param pCoefficientOfRestitution new value of interest
  * @return same object to permit progressive setters */
public CollisionElasticPdu setCoefficientOfRestitution(float pCoefficientOfRestitution)
{
    coefficientOfRestitution = pCoefficientOfRestitution;
    return this;
}

/** Getter for {@link CollisionElasticPdu#coefficientOfRestitution}
  * @return value of interest */
public float getCoefficientOfRestitution()
{
    return coefficientOfRestitution; 
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
       issuingEntityID.marshal(dos);
       collidingEntityID.marshal(dos);
       collisionEventID.marshal(dos);
       dos.writeShort(pad);
       contactVelocity.marshal(dos);
       dos.writeFloat(mass);
       locationOfImpact.marshal(dos);
       dos.writeFloat(collisionIntermediateResultXX);
       dos.writeFloat(collisionIntermediateResultXY);
       dos.writeFloat(collisionIntermediateResultXZ);
       dos.writeFloat(collisionIntermediateResultYY);
       dos.writeFloat(collisionIntermediateResultYZ);
       dos.writeFloat(collisionIntermediateResultZZ);
       unitSurfaceNormal.marshal(dos);
       dos.writeFloat(coefficientOfRestitution);
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
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param dis the InputStream
 * @return marshalled serialized size in bytes
 */
public int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += issuingEntityID.unmarshal(dis);
        uPosition += collidingEntityID.unmarshal(dis);
        uPosition += collisionEventID.unmarshal(dis);
        pad = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += contactVelocity.unmarshal(dis);
        mass = dis.readFloat();
        uPosition += 4;
        uPosition += locationOfImpact.unmarshal(dis);
        collisionIntermediateResultXX = dis.readFloat();
        uPosition += 4;
        collisionIntermediateResultXY = dis.readFloat();
        uPosition += 4;
        collisionIntermediateResultXZ = dis.readFloat();
        uPosition += 4;
        collisionIntermediateResultYY = dis.readFloat();
        uPosition += 4;
        collisionIntermediateResultYZ = dis.readFloat();
        uPosition += 4;
        collisionIntermediateResultZZ = dis.readFloat();
        uPosition += 4;
        uPosition += unitSurfaceNormal.unmarshal(dis);
        coefficientOfRestitution = dis.readFloat();
        uPosition += 4;
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
   issuingEntityID.marshal(byteBuffer);
   collidingEntityID.marshal(byteBuffer);
   collisionEventID.marshal(byteBuffer);
   byteBuffer.putShort( (short)pad);
   contactVelocity.marshal(byteBuffer);
   byteBuffer.putFloat( (float)mass);
   locationOfImpact.marshal(byteBuffer);
   byteBuffer.putFloat( (float)collisionIntermediateResultXX);
   byteBuffer.putFloat( (float)collisionIntermediateResultXY);
   byteBuffer.putFloat( (float)collisionIntermediateResultXZ);
   byteBuffer.putFloat( (float)collisionIntermediateResultYY);
   byteBuffer.putFloat( (float)collisionIntermediateResultYZ);
   byteBuffer.putFloat( (float)collisionIntermediateResultZZ);
   unitSurfaceNormal.marshal(byteBuffer);
   byteBuffer.putFloat( (float)coefficientOfRestitution);
}

/**
 * Unpacks a Pdu from the underlying data.
 * @throws java.nio.BufferUnderflowException if byteBuffer is too small
 * @see java.nio.ByteBuffer
 * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
 * @param byteBuffer The ByteBuffer at the position to begin reading
 * @return marshalled serialized size in bytes
 * @throws Exception ByteBuffer-generated exception
 */
public int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    issuingEntityID.unmarshal(byteBuffer);
    collidingEntityID.unmarshal(byteBuffer);
    collisionEventID.unmarshal(byteBuffer);
    pad = (short)(byteBuffer.getShort() & 0xFFFF);
    contactVelocity.unmarshal(byteBuffer);
    mass = byteBuffer.getFloat();
    locationOfImpact.unmarshal(byteBuffer);
    collisionIntermediateResultXX = byteBuffer.getFloat();
    collisionIntermediateResultXY = byteBuffer.getFloat();
    collisionIntermediateResultXZ = byteBuffer.getFloat();
    collisionIntermediateResultYY = byteBuffer.getFloat();
    collisionIntermediateResultYZ = byteBuffer.getFloat();
    collisionIntermediateResultZZ = byteBuffer.getFloat();
    unitSurfaceNormal.unmarshal(byteBuffer);
    coefficientOfRestitution = byteBuffer.getFloat();
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

     final CollisionElasticPdu rhs = (CollisionElasticPdu)obj;

     if( ! (issuingEntityID.equals( rhs.issuingEntityID) )) ivarsEqual = false;
     if( ! (collidingEntityID.equals( rhs.collidingEntityID) )) ivarsEqual = false;
     if( ! (collisionEventID.equals( rhs.collisionEventID) )) ivarsEqual = false;
     if( ! (pad == rhs.pad)) ivarsEqual = false;
     if( ! (contactVelocity.equals( rhs.contactVelocity) )) ivarsEqual = false;
     if( ! (mass == rhs.mass)) ivarsEqual = false;
     if( ! (locationOfImpact.equals( rhs.locationOfImpact) )) ivarsEqual = false;
     if( ! (collisionIntermediateResultXX == rhs.collisionIntermediateResultXX)) ivarsEqual = false;
     if( ! (collisionIntermediateResultXY == rhs.collisionIntermediateResultXY)) ivarsEqual = false;
     if( ! (collisionIntermediateResultXZ == rhs.collisionIntermediateResultXZ)) ivarsEqual = false;
     if( ! (collisionIntermediateResultYY == rhs.collisionIntermediateResultYY)) ivarsEqual = false;
     if( ! (collisionIntermediateResultYZ == rhs.collisionIntermediateResultYZ)) ivarsEqual = false;
     if( ! (collisionIntermediateResultZZ == rhs.collisionIntermediateResultZZ)) ivarsEqual = false;
     if( ! (unitSurfaceNormal.equals( rhs.unitSurfaceNormal) )) ivarsEqual = false;
     if( ! (coefficientOfRestitution == rhs.coefficientOfRestitution)) ivarsEqual = false;
    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" issuingEntityID: ").append(issuingEntityID).append("\n");
    sb.append(" collidingEntityID: ").append(collidingEntityID).append("\n");
    sb.append(" collisionEventID: ").append(collisionEventID).append("\n");
    sb.append(" pad: ").append(pad).append("\n");
    sb.append(" contactVelocity: ").append(contactVelocity).append("\n");
    sb.append(" mass: ").append(mass).append("\n");
    sb.append(" locationOfImpact: ").append(locationOfImpact).append("\n");
    sb.append(" collisionIntermediateResultXX: ").append(collisionIntermediateResultXX).append("\n");
    sb.append(" collisionIntermediateResultXY: ").append(collisionIntermediateResultXY).append("\n");
    sb.append(" collisionIntermediateResultXZ: ").append(collisionIntermediateResultXZ).append("\n");
    sb.append(" collisionIntermediateResultYY: ").append(collisionIntermediateResultYY).append("\n");
    sb.append(" collisionIntermediateResultYZ: ").append(collisionIntermediateResultYZ).append("\n");
    sb.append(" collisionIntermediateResultZZ: ").append(collisionIntermediateResultZZ).append("\n");
    sb.append(" unitSurfaceNormal: ").append(unitSurfaceNormal).append("\n");
    sb.append(" coefficientOfRestitution: ").append(coefficientOfRestitution).append("\n");

   return sb.toString();
 }
} // end of class