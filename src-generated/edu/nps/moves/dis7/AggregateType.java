/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Identifies the type and organization of an aggregate. Section 6.2.5
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class AggregateType extends Object implements Serializable
{
   /** Grouping criterion used to group the aggregate. Enumeration from EBV document uid 206 */
   protected AggregateStateAggregateKind aggregateKind = AggregateStateAggregateKind.values()[0];

   /** Domain of entity (air, surface, subsurface, space, etc) Zero means domain does not apply. uid 8 */
   protected PlatformDomain domain = PlatformDomain.values()[0];

   /** country to which the design of the entity is attributed uid 29 */
   protected Country country = Country.values()[0];

   /** category of entity */
   protected byte  category;

   /** subcategory of entity uid 208 */
   protected AggregateStateSubcategory subcategory = AggregateStateSubcategory.values()[0];

   /** specific info based on subcategory field. specific is a reserved word in sql. uid 209 */
   protected AggregateStateSpecific specificInfo = AggregateStateSpecific.values()[0];

   protected byte  extra;


/** Constructor */
 public AggregateType()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += aggregateKind.getMarshalledSize();
   marshalSize += domain.getMarshalledSize();
   marshalSize += country.getMarshalledSize();
   marshalSize += 1;  // category
   marshalSize += subcategory.getMarshalledSize();
   marshalSize += specificInfo.getMarshalledSize();
   marshalSize += 1;  // extra

   return marshalSize;
}


/** Setter for {@link AggregateType#aggregateKind}*/
public AggregateType setAggregateKind(AggregateStateAggregateKind pAggregateKind)
{
    aggregateKind = pAggregateKind;
    return this;
}

/** Getter for {@link AggregateType#aggregateKind}*/
public AggregateStateAggregateKind getAggregateKind()
{
    return aggregateKind; 
}

/** Setter for {@link AggregateType#domain}*/
public AggregateType setDomain(PlatformDomain pDomain)
{
    domain = pDomain;
    return this;
}

/** Getter for {@link AggregateType#domain}*/
public PlatformDomain getDomain()
{
    return domain; 
}

/** Setter for {@link AggregateType#country}*/
public AggregateType setCountry(Country pCountry)
{
    country = pCountry;
    return this;
}

/** Getter for {@link AggregateType#country}*/
public Country getCountry()
{
    return country; 
}

/** Setter for {@link AggregateType#category}*/
public AggregateType setCategory(byte pCategory)
{
    category = pCategory;
    return this;
}

/** Getter for {@link AggregateType#category}*/
public byte getCategory()
{
    return category; 
}

/** Setter for {@link AggregateType#subcategory}*/
public AggregateType setSubcategory(AggregateStateSubcategory pSubcategory)
{
    subcategory = pSubcategory;
    return this;
}

/** Getter for {@link AggregateType#subcategory}*/
public AggregateStateSubcategory getSubcategory()
{
    return subcategory; 
}

/** Setter for {@link AggregateType#specificInfo}*/
public AggregateType setSpecificInfo(AggregateStateSpecific pSpecificInfo)
{
    specificInfo = pSpecificInfo;
    return this;
}

/** Getter for {@link AggregateType#specificInfo}*/
public AggregateStateSpecific getSpecificInfo()
{
    return specificInfo; 
}

/** Setter for {@link AggregateType#extra}*/
public AggregateType setExtra(byte pExtra)
{
    extra = pExtra;
    return this;
}

/** Getter for {@link AggregateType#extra}*/
public byte getExtra()
{
    return extra; 
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
       aggregateKind.marshal(dos);
       domain.marshal(dos);
       country.marshal(dos);
       dos.writeByte( (byte)category);
       subcategory.marshal(dos);
       specificInfo.marshal(dos);
       dos.writeByte( (byte)extra);
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
        aggregateKind = AggregateStateAggregateKind.unmarshalEnum(dis);
        uPosition += aggregateKind.getMarshalledSize();
        domain = PlatformDomain.unmarshalEnum(dis);
        uPosition += domain.getMarshalledSize();
        country = Country.unmarshalEnum(dis);
        uPosition += country.getMarshalledSize();
        category = (byte)dis.readUnsignedByte();
        uPosition += 1;
        subcategory = AggregateStateSubcategory.unmarshalEnum(dis);
        uPosition += subcategory.getMarshalledSize();
        specificInfo = AggregateStateSpecific.unmarshalEnum(dis);
        uPosition += specificInfo.getMarshalledSize();
        extra = (byte)dis.readUnsignedByte();
        uPosition += 1;
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
   aggregateKind.marshal(buff);
   domain.marshal(buff);
   country.marshal(buff);
   buff.put( (byte)category);
   subcategory.marshal(buff);
   specificInfo.marshal(buff);
   buff.put( (byte)extra);
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
    aggregateKind = AggregateStateAggregateKind.unmarshalEnum(buff);
    domain = PlatformDomain.unmarshalEnum(buff);
    country = Country.unmarshalEnum(buff);
    category = (byte)(buff.get() & 0xFF);
    subcategory = AggregateStateSubcategory.unmarshalEnum(buff);
    specificInfo = AggregateStateSpecific.unmarshalEnum(buff);
    extra = (byte)(buff.get() & 0xFF);
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

     final AggregateType rhs = (AggregateType)obj;

     if( ! (aggregateKind == rhs.aggregateKind)) ivarsEqual = false;
     if( ! (domain == rhs.domain)) ivarsEqual = false;
     if( ! (country == rhs.country)) ivarsEqual = false;
     if( ! (category == rhs.category)) ivarsEqual = false;
     if( ! (subcategory == rhs.subcategory)) ivarsEqual = false;
     if( ! (specificInfo == rhs.specificInfo)) ivarsEqual = false;
     if( ! (extra == rhs.extra)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" aggregateKind: ").append(aggregateKind).append("\n");
    sb.append(" domain: ").append(domain).append("\n");
    sb.append(" country: ").append(country).append("\n");
    sb.append(" category: ").append(category).append("\n");
    sb.append(" subcategory: ").append(subcategory).append("\n");
    sb.append(" specificInfo: ").append(specificInfo).append("\n");
    sb.append(" extra: ").append(extra).append("\n");

   return sb.toString();
 }
} // end of class
