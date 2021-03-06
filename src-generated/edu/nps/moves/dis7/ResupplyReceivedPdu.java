/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.5.7 Used to acknowledge the receipt of supplies by the receiving entity.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class ResupplyReceivedPdu extends LogisticsFamilyPdu implements Serializable
{
   /** Entity that is receiving service.  Shall be represented by Entity Identifier record (see 6.2.28) */
   protected EntityID  receivingEntityID = new EntityID(); 

   /** Entity that is supplying.  Shall be represented by Entity Identifier record (see 6.2.28) */
   protected EntityID  supplyingEntityID = new EntityID(); 

   /** How many supplies are taken by receiving entity */
   protected byte  numberOfSupplyTypes;

   /** padding */
   protected byte  padding1 = (byte)0;

   /** padding */
   protected short  padding2 = (short)0;

   /** A Reord that Specifies the type of supply and the amount of that supply for each of the supply types in numberOfSupplyTypes (see 6.2.85), Section 7.4.3 */
   protected List< SupplyQuantity > supplies = new ArrayList< SupplyQuantity >();
 

/** Constructor */
 public ResupplyReceivedPdu()
 {
    setPduType( DISPDUType.RESUPPLY_RECEIVED );
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += receivingEntityID.getMarshalledSize();
   marshalSize += supplyingEntityID.getMarshalledSize();
   marshalSize += 1;  // numberOfSupplyTypes
   marshalSize += 1;  // padding1
   marshalSize += 2;  // padding2
   for(int idx=0; idx < supplies.size(); idx++)
   {
        SupplyQuantity listElement = supplies.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link ResupplyReceivedPdu#receivingEntityID}*/
public ResupplyReceivedPdu setReceivingEntityID(EntityID pReceivingEntityID)
{
    receivingEntityID = pReceivingEntityID;
    return this;
}

/** Getter for {@link ResupplyReceivedPdu#receivingEntityID}*/
public EntityID getReceivingEntityID()
{
    return receivingEntityID; 
}

/** Setter for {@link ResupplyReceivedPdu#supplyingEntityID}*/
public ResupplyReceivedPdu setSupplyingEntityID(EntityID pSupplyingEntityID)
{
    supplyingEntityID = pSupplyingEntityID;
    return this;
}

/** Getter for {@link ResupplyReceivedPdu#supplyingEntityID}*/
public EntityID getSupplyingEntityID()
{
    return supplyingEntityID; 
}

/** Setter for {@link ResupplyReceivedPdu#padding1}*/
public ResupplyReceivedPdu setPadding1(byte pPadding1)
{
    padding1 = pPadding1;
    return this;
}

/** Getter for {@link ResupplyReceivedPdu#padding1}*/
public byte getPadding1()
{
    return padding1; 
}

/** Setter for {@link ResupplyReceivedPdu#padding2}*/
public ResupplyReceivedPdu setPadding2(short pPadding2)
{
    padding2 = pPadding2;
    return this;
}

/** Getter for {@link ResupplyReceivedPdu#padding2}*/
public short getPadding2()
{
    return padding2; 
}

/** Setter for {@link ResupplyReceivedPdu#supplies}*/
public ResupplyReceivedPdu setSupplies(List<SupplyQuantity> pSupplies)
{
    supplies = pSupplies;
    return this;
}

/** Getter for {@link ResupplyReceivedPdu#supplies}*/
public List<SupplyQuantity> getSupplies()
{
    return supplies; 
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
       receivingEntityID.marshal(dos);
       supplyingEntityID.marshal(dos);
       dos.writeByte( (byte)supplies.size());
       dos.writeByte( (byte)padding1);
       dos.writeShort( (short)padding2);

       for(int idx = 0; idx < supplies.size(); idx++)
       {
            SupplyQuantity aSupplyQuantity = supplies.get(idx);
            aSupplyQuantity.marshal(dos);
       }

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
        uPosition += receivingEntityID.unmarshal(dis);
        uPosition += supplyingEntityID.unmarshal(dis);
        numberOfSupplyTypes = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        padding2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        for(int idx = 0; idx < numberOfSupplyTypes; idx++)
        {
            SupplyQuantity anX = new SupplyQuantity();
            uPosition += anX.unmarshal(dis);
            supplies.add(anX);
        }

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
   receivingEntityID.marshal(buff);
   supplyingEntityID.marshal(buff);
   buff.put( (byte)supplies.size());
   buff.put( (byte)padding1);
   buff.putShort( (short)padding2);

   for(int idx = 0; idx < supplies.size(); idx++)
   {
        SupplyQuantity aSupplyQuantity = (SupplyQuantity)supplies.get(idx);
        aSupplyQuantity.marshal(buff);
   }

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

    receivingEntityID.unmarshal(buff);
    supplyingEntityID.unmarshal(buff);
    numberOfSupplyTypes = (byte)(buff.get() & 0xFF);
    padding1 = (byte)(buff.get() & 0xFF);
    padding2 = (short)(buff.getShort() & 0xFFFF);
    for(int idx = 0; idx < numberOfSupplyTypes; idx++)
    {
    SupplyQuantity anX = new SupplyQuantity();
    anX.unmarshal(buff);
    supplies.add(anX);
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

     final ResupplyReceivedPdu rhs = (ResupplyReceivedPdu)obj;

     if( ! (receivingEntityID.equals( rhs.receivingEntityID) )) ivarsEqual = false;
     if( ! (supplyingEntityID.equals( rhs.supplyingEntityID) )) ivarsEqual = false;
     if( ! (padding1 == rhs.padding1)) ivarsEqual = false;
     if( ! (padding2 == rhs.padding2)) ivarsEqual = false;

     for(int idx = 0; idx < supplies.size(); idx++)
        if( ! ( supplies.get(idx).equals(rhs.supplies.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" receivingEntityID: ").append(receivingEntityID).append("\n");
    sb.append(" supplyingEntityID: ").append(supplyingEntityID).append("\n");
    sb.append(" padding1: ").append(padding1).append("\n");
    sb.append(" padding2: ").append(padding2).append("\n");
    sb.append(" supplies: ").append("\n");
    supplies.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
