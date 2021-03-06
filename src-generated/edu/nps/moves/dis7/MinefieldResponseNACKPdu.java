/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * 5.10.5 Contains information about the requesting entity and the PDU(s) that were not received in response to a query.
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class MinefieldResponseNACKPdu extends MinefieldFamilyPdu implements Serializable
{
   /** Minefield ID */
   protected MinefieldIdentifier  minefieldID = new MinefieldIdentifier(); 

   /** entity ID making the request */
   protected SimulationIdentifier  requestingEntityID = new SimulationIdentifier(); 

   /** request ID */
   protected byte  requestID;

   /** how many pdus were missing */
   protected byte  numberOfMissingPdus;

   /** PDU sequence numbers that were missing */
   protected byte[]  missingPduSequenceNumbers = new byte[0]; 


/** Constructor */
 public MinefieldResponseNACKPdu()
 {
    setPduType( DISPDUType.MINEFIELD_RESPONSE_NACK );
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize = super.getMarshalledSize();
   marshalSize += minefieldID.getMarshalledSize();
   marshalSize += requestingEntityID.getMarshalledSize();
   marshalSize += 1;  // requestID
   marshalSize += 1;  // numberOfMissingPdus
   marshalSize += missingPduSequenceNumbers.length * 1;

   return marshalSize;
}


/** Setter for {@link MinefieldResponseNACKPdu#minefieldID}*/
public MinefieldResponseNACKPdu setMinefieldID(MinefieldIdentifier pMinefieldID)
{
    minefieldID = pMinefieldID;
    return this;
}

/** Getter for {@link MinefieldResponseNACKPdu#minefieldID}*/
public MinefieldIdentifier getMinefieldID()
{
    return minefieldID; 
}

/** Setter for {@link MinefieldResponseNACKPdu#requestingEntityID}*/
public MinefieldResponseNACKPdu setRequestingEntityID(SimulationIdentifier pRequestingEntityID)
{
    requestingEntityID = pRequestingEntityID;
    return this;
}

/** Getter for {@link MinefieldResponseNACKPdu#requestingEntityID}*/
public SimulationIdentifier getRequestingEntityID()
{
    return requestingEntityID; 
}

/** Setter for {@link MinefieldResponseNACKPdu#requestID}*/
public MinefieldResponseNACKPdu setRequestID(byte pRequestID)
{
    requestID = pRequestID;
    return this;
}

/** Getter for {@link MinefieldResponseNACKPdu#requestID}*/
public byte getRequestID()
{
    return requestID; 
}

/** Setter for {@link MinefieldResponseNACKPdu#missingPduSequenceNumbers}*/
public MinefieldResponseNACKPdu setMissingPduSequenceNumbers(byte[] pMissingPduSequenceNumbers)
{
    missingPduSequenceNumbers = pMissingPduSequenceNumbers;
    return this;
}

/** Getter for {@link MinefieldResponseNACKPdu#missingPduSequenceNumbers}*/
public byte[] getMissingPduSequenceNumbers()
{
    return missingPduSequenceNumbers; 
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
       minefieldID.marshal(dos);
       requestingEntityID.marshal(dos);
       dos.writeByte( (byte)requestID);
       dos.writeByte( (byte)missingPduSequenceNumbers.length);

       for(int idx = 0; idx < missingPduSequenceNumbers.length; idx++)
           dos.writeByte(missingPduSequenceNumbers[idx]);

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
        uPosition += minefieldID.unmarshal(dis);
        uPosition += requestingEntityID.unmarshal(dis);
        requestID = (byte)dis.readUnsignedByte();
        uPosition += 1;
        numberOfMissingPdus = (byte)dis.readUnsignedByte();
        uPosition += 1;
        for(int idx = 0; idx < missingPduSequenceNumbers.length; idx++)
            missingPduSequenceNumbers[idx] = dis.readByte();
        uPosition += (missingPduSequenceNumbers.length * 1);
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
   minefieldID.marshal(buff);
   requestingEntityID.marshal(buff);
   buff.put( (byte)requestID);
   buff.put( (byte)missingPduSequenceNumbers.length);

   for(int idx = 0; idx < missingPduSequenceNumbers.length; idx++)
       buff.put((byte)missingPduSequenceNumbers[idx]);

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

    minefieldID.unmarshal(buff);
    requestingEntityID.unmarshal(buff);
    requestID = (byte)(buff.get() & 0xFF);
    numberOfMissingPdus = (byte)(buff.get() & 0xFF);
    for(int idx = 0; idx < missingPduSequenceNumbers.length; idx++)
        missingPduSequenceNumbers[idx] = buff.get();
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

     final MinefieldResponseNACKPdu rhs = (MinefieldResponseNACKPdu)obj;

     if( ! (minefieldID.equals( rhs.minefieldID) )) ivarsEqual = false;
     if( ! (requestingEntityID.equals( rhs.requestingEntityID) )) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;

     for(int idx = 0; idx < 0; idx++)
     {
          if(!(missingPduSequenceNumbers[idx] == rhs.missingPduSequenceNumbers[idx])) ivarsEqual = false;
     }

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" minefieldID: ").append(minefieldID).append("\n");
    sb.append(" requestingEntityID: ").append(requestingEntityID).append("\n");
    sb.append(" requestID: ").append(requestID).append("\n");
    sb.append(" missingPduSequenceNumbers: ").append("\n");
    sb.append(Arrays.toString(missingPduSequenceNumbers)).append("\n");

   return sb.toString();
 }
} // end of class
