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
 *  7.2.2. Represents the position and state of one entity in the world. See 5.3.2.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class EntityStatePdu extends EntityInformationInteractionFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "EntityStatePdu";
   
   /** Unique ID for an entity that is tied to this state information */
   protected EntityID  entityID = new EntityID(); 

   /** What force this entity is affiliated with, eg red, blue, neutral, etc uid 6 */
   protected ForceID forceId = ForceID.values()[0];

   /** How many variable parameters are in the variable length list. In earlier versions of DIS these were known as articulation parameters */
   protected byte numberOfVariableParameters;

   /** Describes the type of entity in the world */
   protected EntityType  entityType = new EntityType(); 

   /** alternativeEntityType is an undescribed parameter... */
   protected EntityType  alternativeEntityType = new EntityType(); 

   /** Describes the speed of the entity in the world */
   protected Vector3Float  entityLinearVelocity = new Vector3Float(); 

   /** describes the location of the entity in the world */
   protected Vector3Double  entityLocation = new Vector3Double(); 

   /** describes the orientation of the entity, in euler angles with units of radians */
   protected EulerAngles  entityOrientation = new EulerAngles(); 

   /** a series of bit flags that are used to help draw the entity, such as smoking, on fire, etc. */
   protected int entityAppearance;

   /** parameters used for dead reckoning */
   protected DeadReckoningParameters  deadReckoningParameters = new DeadReckoningParameters(); 

   /** 11 characters that can be used for entity identification, debugging, or to draw unique strings on the side of entities in the world */
   protected EntityMarking  marking = new EntityMarking(); 

   /** a series of bit flags uid 55 */
   protected EntityCapabilities capabilities = new LandPlatformCapabilities();

   /** variable length list of variable parameters. In earlier DIS versions this was articulation parameters. */
   protected List< VariableParameter > variableParameters = new ArrayList<>();
 

/** Constructor creates and configures a new instance object */
 public EntityStatePdu()
 {
    setPduType( DisPduType.ENTITY_STATE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized EntityStatePdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized EntityStatePdu copyByteBuffer()
 {
     EntityStatePdu newCopy = new EntityStatePdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("EntityStatePdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized EntityStatePdu copyDataOutputStream()
 {
     EntityStatePdu newCopy = new EntityStatePdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("EntityStatePdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("EntityStatePdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (entityID != null)
       marshalSize += entityID.getMarshalledSize();
   if (forceId != null)
       marshalSize += forceId.getMarshalledSize();
   marshalSize += 1;  // numberOfVariableParameters
   if (entityType != null)
       marshalSize += entityType.getMarshalledSize();
   if (alternativeEntityType != null)
       marshalSize += alternativeEntityType.getMarshalledSize();
   if (entityLinearVelocity != null)
       marshalSize += entityLinearVelocity.getMarshalledSize();
   if (entityLocation != null)
       marshalSize += entityLocation.getMarshalledSize();
   if (entityOrientation != null)
       marshalSize += entityOrientation.getMarshalledSize();
   marshalSize += 4;  // entityAppearance
   if (deadReckoningParameters != null)
       marshalSize += deadReckoningParameters.getMarshalledSize();
   if (marking != null)
       marshalSize += marking.getMarshalledSize();
   if (capabilities != null)
       marshalSize += capabilities.getMarshalledSize();
   if (variableParameters != null)
       for (int idx=0; idx < variableParameters.size(); idx++)
       {
            VariableParameter listElement = variableParameters.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link EntityStatePdu#entityID}
  * @param pEntityID new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setEntityID(EntityID pEntityID)
{
    entityID = pEntityID;
    return this;
}
/** Getter for {@link EntityStatePdu#entityID}
  * @return value of interest */
public EntityID getEntityID()
{
    return entityID;
}


/** Setter for {@link EntityStatePdu#forceId}
  * @param pForceId new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setForceId(ForceID pForceId)
{
    forceId = pForceId;
    return this;
}
/** Getter for {@link EntityStatePdu#forceId}
  * @return value of interest */
public ForceID getForceId()
{
    return forceId; 
}

/** Setter for {@link EntityStatePdu#entityType}
  * @param pEntityType new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setEntityType(EntityType pEntityType)
{
    entityType = pEntityType;
    return this;
}
/** Getter for {@link EntityStatePdu#entityType}
  * @return value of interest */
public EntityType getEntityType()
{
    return entityType;
}


/** Setter for {@link EntityStatePdu#alternativeEntityType}
  * @param pAlternativeEntityType new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setAlternativeEntityType(EntityType pAlternativeEntityType)
{
    alternativeEntityType = pAlternativeEntityType;
    return this;
}
/** Getter for {@link EntityStatePdu#alternativeEntityType}
  * @return value of interest */
public EntityType getAlternativeEntityType()
{
    return alternativeEntityType;
}


/** Setter for {@link EntityStatePdu#entityLinearVelocity}
  * @param pEntityLinearVelocity new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setEntityLinearVelocity(Vector3Float pEntityLinearVelocity)
{
    entityLinearVelocity = pEntityLinearVelocity;
    return this;
}
/** Getter for {@link EntityStatePdu#entityLinearVelocity}
  * @return value of interest */
public Vector3Float getEntityLinearVelocity()
{
    return entityLinearVelocity;
}


/** Setter for {@link EntityStatePdu#entityLocation}
  * @param pEntityLocation new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setEntityLocation(Vector3Double pEntityLocation)
{
    entityLocation = pEntityLocation;
    return this;
}
/** Getter for {@link EntityStatePdu#entityLocation}
  * @return value of interest */
public Vector3Double getEntityLocation()
{
    return entityLocation;
}


/** Setter for {@link EntityStatePdu#entityOrientation}
  * @param pEntityOrientation new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setEntityOrientation(EulerAngles pEntityOrientation)
{
    entityOrientation = pEntityOrientation;
    return this;
}
/** Getter for {@link EntityStatePdu#entityOrientation}
  * @return value of interest */
public EulerAngles getEntityOrientation()
{
    return entityOrientation;
}


/** Setter for {@link EntityStatePdu#entityAppearance}
  * @param pEntityAppearance new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setEntityAppearance(int pEntityAppearance)
{
    entityAppearance = pEntityAppearance;
    return this;
}
/** Getter for {@link EntityStatePdu#entityAppearance}
  * @return value of interest */
public int getEntityAppearance()
{
    return entityAppearance; 
}

/** Setter for {@link EntityStatePdu#deadReckoningParameters}
  * @param pDeadReckoningParameters new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setDeadReckoningParameters(DeadReckoningParameters pDeadReckoningParameters)
{
    deadReckoningParameters = pDeadReckoningParameters;
    return this;
}
/** Getter for {@link EntityStatePdu#deadReckoningParameters}
  * @return value of interest */
public DeadReckoningParameters getDeadReckoningParameters()
{
    return deadReckoningParameters;
}


/** Setter for {@link EntityStatePdu#marking}
  * @param pMarking new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setMarking(EntityMarking pMarking)
{
    marking = pMarking;
    return this;
}
/** Getter for {@link EntityStatePdu#marking}
  * @return value of interest */
public EntityMarking getMarking()
{
    return marking;
}


/** Setter for {@link EntityStatePdu#capabilities}
  * @param pCapabilities new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setCapabilities(EntityCapabilities pCapabilities)
{
    capabilities = pCapabilities;
    return this;
}
/** Getter for {@link EntityStatePdu#capabilities}
  * @return value of interest */
public EntityCapabilities getCapabilities()
{
    return capabilities; 
}

/** Setter for {@link EntityStatePdu#variableParameters}
  * @param pVariableParameters new value of interest
  * @return same object to permit progressive setters */
public synchronized EntityStatePdu setVariableParameters(List<VariableParameter> pVariableParameters)
{
    variableParameters = pVariableParameters;
    return this;
}
/** Getter for {@link EntityStatePdu#variableParameters}
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
@Override
public synchronized void marshal(DataOutputStream dos) throws Exception
{
    super.marshal(dos);
    try 
    {
       entityID.marshal(dos);
       forceId.marshal(dos);
       dos.writeByte(variableParameters.size());
       entityType.marshal(dos);
       alternativeEntityType.marshal(dos);
       entityLinearVelocity.marshal(dos);
       entityLocation.marshal(dos);
       entityOrientation.marshal(dos);
       dos.writeInt(entityAppearance);
       deadReckoningParameters.marshal(dos);
       marking.marshal(dos);
       capabilities.marshal(dos);

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
@Override
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    uPosition += super.unmarshal(dis);

    try 
    {
        uPosition += entityID.unmarshal(dis);
        forceId = ForceID.unmarshalEnum(dis);
        uPosition += forceId.getMarshalledSize();
        numberOfVariableParameters = (byte)dis.readUnsignedByte();
        uPosition += 1;
        uPosition += entityType.unmarshal(dis);
        uPosition += alternativeEntityType.unmarshal(dis);
        uPosition += entityLinearVelocity.unmarshal(dis);
        uPosition += entityLocation.unmarshal(dis);
        uPosition += entityOrientation.unmarshal(dis);
        entityAppearance = dis.readInt();
        uPosition += 4;
        uPosition += deadReckoningParameters.unmarshal(dis);
        uPosition += marking.unmarshal(dis);
        uPosition += capabilities.unmarshal(dis);
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
@Override
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   super.marshal(byteBuffer);
   entityID.marshal(byteBuffer);
   forceId.marshal(byteBuffer);
   byteBuffer.put( (byte)variableParameters.size());
   entityType.marshal(byteBuffer);
   alternativeEntityType.marshal(byteBuffer);
   entityLinearVelocity.marshal(byteBuffer);
   entityLocation.marshal(byteBuffer);
   entityOrientation.marshal(byteBuffer);
   byteBuffer.putInt( (int)entityAppearance);
   deadReckoningParameters.marshal(byteBuffer);
   marking.marshal(byteBuffer);
   capabilities.marshal(byteBuffer);

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
@Override
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    super.unmarshal(byteBuffer);

    try
    {
        // attribute entityID marked as not serialized
        entityID.unmarshal(byteBuffer);
        // attribute forceId marked as not serialized
        forceId = ForceID.unmarshalEnum(byteBuffer);
        // attribute numberOfVariableParameters marked as not serialized
        numberOfVariableParameters = (byte)(byteBuffer.get() & 0xFF);
        // attribute entityType marked as not serialized
        entityType.unmarshal(byteBuffer);
        // attribute alternativeEntityType marked as not serialized
        alternativeEntityType.unmarshal(byteBuffer);
        // attribute entityLinearVelocity marked as not serialized
        entityLinearVelocity.unmarshal(byteBuffer);
        // attribute entityLocation marked as not serialized
        entityLocation.unmarshal(byteBuffer);
        // attribute entityOrientation marked as not serialized
        entityOrientation.unmarshal(byteBuffer);
        // attribute entityAppearance marked as not serialized
        entityAppearance = byteBuffer.getInt();
        // attribute deadReckoningParameters marked as not serialized
        deadReckoningParameters.unmarshal(byteBuffer);
        // attribute marking marked as not serialized
        marking.unmarshal(byteBuffer);
        // attribute capabilities marked as not serialized
        capabilities.unmarshal(byteBuffer);
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
     final EntityStatePdu rhs = (EntityStatePdu)obj;

     if( ! Objects.equals(entityID, rhs.entityID) ) return false;
     if( ! (forceId == rhs.forceId)) return false;
     if( ! Objects.equals(entityType, rhs.entityType) ) return false;
     if( ! Objects.equals(alternativeEntityType, rhs.alternativeEntityType) ) return false;
     if( ! Objects.equals(entityLinearVelocity, rhs.entityLinearVelocity) ) return false;
     if( ! Objects.equals(entityLocation, rhs.entityLocation) ) return false;
     if( ! Objects.equals(entityOrientation, rhs.entityOrientation) ) return false;
     if( ! (entityAppearance == rhs.entityAppearance)) return false;
     if( ! Objects.equals(deadReckoningParameters, rhs.deadReckoningParameters) ) return false;
     if( ! Objects.equals(marking, rhs.marking) ) return false;
     if( ! Objects.equals(capabilities, rhs.capabilities) ) return false;
     if( ! Objects.equals(variableParameters, rhs.variableParameters) ) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" entityID:").append(entityID); // writeOneToString
    sb.append(" forceId:").append(forceId); // writeOneToString
    sb.append(" entityType:").append(entityType); // writeOneToString
    sb.append(" alternativeEntityType:").append(alternativeEntityType); // writeOneToString
    sb.append(" entityLinearVelocity:").append(entityLinearVelocity); // writeOneToString
    sb.append(" entityLocation:").append(entityLocation); // writeOneToString
    sb.append(" entityOrientation:").append(entityOrientation); // writeOneToString
    sb.append(" entityAppearance:").append(entityAppearance); // writeOneToString
    sb.append(" deadReckoningParameters:").append(deadReckoningParameters); // writeOneToString
    sb.append(" marking:").append(marking); // writeOneToString
    sb.append(" capabilities:").append(capabilities); // writeOneToString
    sb.append(" variableParameters: ");
    variableParameters.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.entityID,
	                     this.forceId,
	                     this.numberOfVariableParameters,
	                     this.entityType,
	                     this.alternativeEntityType,
	                     this.entityLinearVelocity,
	                     this.entityLocation,
	                     this.entityOrientation,
	                     this.entityAppearance,
	                     this.deadReckoningParameters,
	                     this.marking,
	                     this.capabilities,
	                     this.variableParameters);
 }
    // writeEntityStateUtilityMethods

  /** Direction enumerations */
  public enum Direction
  {
      /** NORTH direction along Y axis */
      NORTH, 
      /** NORTHEAST direction */
      NORTHEAST, 
      /** EAST direction along X axis */
      EAST, 
      /** SOUTHEAST direction */
      SOUTHEAST, 
      /** SOUTH direction along -Y axis */
      SOUTH, 
      /** SOUTHWEST direction */
      SOUTHWEST, 
      /** WEST direction along -X axis */
      WEST, 
      /** NORTHWEST direction */
      NORTHWEST
  }

  /** Utility method to set entity linear velocity using speed and direction
    * @param speed in meters/second
    * @param direction using Directions enumerations
    * @see Direction
    * @return same object to permit progressive setters */
  public final synchronized EntityStatePdu setEntityLinearVelocity (float speed, Direction direction)
  {
      float xFactor = 0.0f;
      float yFactor = 0.0f;
      switch (direction)
      {
          case NORTH:
              xFactor =  0.0f;   yFactor =  1.0f;
              break;
              
          case EAST:
              xFactor =  1.0f;   yFactor =  0.0f;
              break;
              
          case SOUTH:
              xFactor =  0.0f;   yFactor = -1.0f;
              break;
              
          case WEST:
              xFactor = -1.0f;   yFactor =  0.0f;
              break;
          case NORTHEAST:
              xFactor =  0.7071f;   yFactor =  0.7071f;
              break;
              
          case SOUTHEAST:
              xFactor = -0.7071f;   yFactor =  0.7071f;
              break;
              
          case SOUTHWEST:
              xFactor = -0.7071f;   yFactor = -0.7071f;
              break;
              
          case NORTHWEST:
              xFactor =  0.7071f;   yFactor = -0.7071f;
              break;
          default:
              System.err.println("*** unexpected internal error, encountered illegal EntityStatePdu Direction");
              
      }
      Vector3Float newVelocity = new Vector3Float().setX(xFactor*speed).setY(yFactor*speed).setZ(getEntityLinearVelocity().z);
      setEntityLinearVelocity(newVelocity);
      return this;
    }
   /** Setter for {@link EntityStatePdu#entityLocation}
     * @param x location
     * @param y location
     * @param z location
     * @return same object to permit progressive setters */
   public synchronized EntityStatePdu setEntityLocation(double x, double y, double z)
   {
       // TODO autogenerate such utility constructors
       entityLocation = new Vector3Double().setX(x).setY(y).setZ(z);
       return this;
   }
   /** Advance location using linear velocities for a single timestep
    * @param timestep duration of travel
    * @return same object to permit progressive setters */
    public EntityStatePdu advanceEntityLocation(double timestep)
    {
        Vector3Double location = getEntityLocation();
        Vector3Float  velocity = getEntityLinearVelocity();
        setEntityLocation(location.getX() + velocity.getX() * timestep,
                          location.getY() + velocity.getY() * timestep,
                          location.getZ() + velocity.getZ() * timestep);
       return this;
    }
    /** Setter for {@link EntityStatePdu#entityOrientation}
      * @param phi new value of interest
      * @param theta new value of interest
      * @param psi new value of interest
      * @return same object to permit progressive setters */
    public synchronized EntityStatePdu setEntityOrientation(float phi, float theta, float psi)
    {
        // TODO autogenerate such utility constructors
        EulerAngles pEntityOrientation = new EulerAngles();
        pEntityOrientation = pEntityOrientation.setPhi(phi).setTheta(theta).setPsi(psi);
        entityOrientation = pEntityOrientation;
        return this;
    }
   /** Marking utility to clear character values
    * @return same object to permit progressive setters */
    public synchronized EntityStatePdu clearMarking()
   {
       byte[] emptyByteArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
       marking.setCharacters(emptyByteArray);
       return this;
   }
    /** Marking utility to set character values, 11 characters maximum
    *@param newMarking new 11-character string to assign as marking value
    * @return same object to permit progressive setters */
   public synchronized EntityStatePdu setMarking(String newMarking)
   {
       if ((newMarking == null) || newMarking.isEmpty())
           clearMarking();
       else if (newMarking.length() > 11)
           System.err.println ("*** marking '" + newMarking + "' is greater than 11 characters, truncating");
       newMarking = String.format("%11s", newMarking);
       marking.setCharacters(newMarking.getBytes());
           
       return this;
   }
   /** Marking utility to get character values as a string
    * @return 11-character String value corresponding to marking */
   public String getMarkingString()
   {
       return new String(marking.getCharacters());
   }


} // end of EntityStatePdu
