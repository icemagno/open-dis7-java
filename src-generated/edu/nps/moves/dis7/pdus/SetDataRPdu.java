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
 * 5.12.4.10 Serves the same function as the Set Data PDU but with the addition of reliability service levels.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class SetDataRPdu extends SimulationManagementWithReliabilityFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "SetDataRPdu";
   
   /** level of reliability service used for this transaction uid 74 */
   protected RequiredReliabilityService requiredReliabilityService = RequiredReliabilityService.values()[0];

   /** padding */
   protected byte pad1;

   /** padding */
   protected short pad2;

   /** request ID provides a unique identifier */
   protected int requestID;

   /** Fixed datum record count */
   protected int numberOfFixedDatumRecords;

   /** variable datum record count */
   protected int numberOfVariableDatumRecords;

   /** Fixed datum records */
   protected List< FixedDatum > fixedDatumRecords = new ArrayList<>();
 
   /** Variable datum records */
   protected List< VariableDatum > variableDatumRecords = new ArrayList<>();
 

/** Constructor creates and configures a new instance object */
 public SetDataRPdu()
 {
    setPduType( DisPduType.SET_DATA_RELIABLE );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized SetDataRPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized SetDataRPdu copyByteBuffer()
 {
     SetDataRPdu newCopy = new SetDataRPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("SetDataRPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized SetDataRPdu copyDataOutputStream()
 {
     SetDataRPdu newCopy = new SetDataRPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("SetDataRPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("SetDataRPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (requiredReliabilityService != null)
       marshalSize += requiredReliabilityService.getMarshalledSize();
   marshalSize += 1;  // pad1
   marshalSize += 2;  // pad2
   marshalSize += 4;  // requestID
   marshalSize += 4;  // numberOfFixedDatumRecords
   marshalSize += 4;  // numberOfVariableDatumRecords
   if (fixedDatumRecords != null)
       for (int idx=0; idx < fixedDatumRecords.size(); idx++)
       {
            FixedDatum listElement = fixedDatumRecords.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }
   if (variableDatumRecords != null)
       for (int idx=0; idx < variableDatumRecords.size(); idx++)
       {
            VariableDatum listElement = variableDatumRecords.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link SetDataRPdu#requiredReliabilityService}
  * @param pRequiredReliabilityService new value of interest
  * @return same object to permit progressive setters */
public synchronized SetDataRPdu setRequiredReliabilityService(RequiredReliabilityService pRequiredReliabilityService)
{
    requiredReliabilityService = pRequiredReliabilityService;
    return this;
}
/** Getter for {@link SetDataRPdu#requiredReliabilityService}
  * @return value of interest */
public RequiredReliabilityService getRequiredReliabilityService()
{
    return requiredReliabilityService; 
}

/** Setter for {@link SetDataRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetDataRPdu setPad1(byte pPad1)
{
    pad1 = pPad1;
    return this;
}
/** Utility setter for {@link SetDataRPdu#pad1}
  * @param pPad1 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetDataRPdu setPad1(int pPad1){
    pad1 = (byte) pPad1;
    return this;
}
/** Getter for {@link SetDataRPdu#pad1}
  * @return value of interest */
public byte getPad1()
{
    return pad1; 
}

/** Setter for {@link SetDataRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetDataRPdu setPad2(short pPad2)
{
    pad2 = pPad2;
    return this;
}
/** Utility setter for {@link SetDataRPdu#pad2}
  * @param pPad2 new value of interest
  * @return same object to permit progressive setters */
public synchronized SetDataRPdu setPad2(int pPad2){
    pad2 = (short) pPad2;
    return this;
}
/** Getter for {@link SetDataRPdu#pad2}
  * @return value of interest */
public short getPad2()
{
    return pad2; 
}

/** Setter for {@link SetDataRPdu#requestID}
  * @param pRequestID new value of interest
  * @return same object to permit progressive setters */
public synchronized SetDataRPdu setRequestID(int pRequestID)
{
    requestID = pRequestID;
    return this;
}
/** Getter for {@link SetDataRPdu#requestID}
  * @return value of interest */
public int getRequestID()
{
    return requestID; 
}

/** Setter for {@link SetDataRPdu#fixedDatumRecords}
  * @param pFixedDatumRecords new value of interest
  * @return same object to permit progressive setters */
public synchronized SetDataRPdu setFixedDatumRecords(List<FixedDatum> pFixedDatumRecords)
{
    fixedDatumRecords = pFixedDatumRecords;
    return this;
}
/** Getter for {@link SetDataRPdu#fixedDatumRecords}
  * @return value of interest */
public List<FixedDatum> getFixedDatumRecords()
{
    return fixedDatumRecords; 
}

/** Setter for {@link SetDataRPdu#variableDatumRecords}
  * @param pVariableDatumRecords new value of interest
  * @return same object to permit progressive setters */
public synchronized SetDataRPdu setVariableDatumRecords(List<VariableDatum> pVariableDatumRecords)
{
    variableDatumRecords = pVariableDatumRecords;
    return this;
}
/** Getter for {@link SetDataRPdu#variableDatumRecords}
  * @return value of interest */
public List<VariableDatum> getVariableDatumRecords()
{
    return variableDatumRecords; 
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
       requiredReliabilityService.marshal(dos);
       dos.writeByte(pad1);
       dos.writeShort(pad2);
       dos.writeInt(requestID);
       dos.writeInt(fixedDatumRecords.size());
       dos.writeInt(variableDatumRecords.size());

       for (int idx = 0; idx < fixedDatumRecords.size(); idx++)
       {
            FixedDatum aFixedDatum = fixedDatumRecords.get(idx);
            aFixedDatum.marshal(dos);
       }


       for (int idx = 0; idx < variableDatumRecords.size(); idx++)
       {
            VariableDatum aVariableDatum = variableDatumRecords.get(idx);
            aVariableDatum.marshal(dos);
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
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(dis);
        uPosition += requiredReliabilityService.getMarshalledSize();
        pad1 = (byte)dis.readUnsignedByte();
        uPosition += 1;
        pad2 = (short)dis.readUnsignedShort();
        uPosition += 2;
        requestID = dis.readInt();
        uPosition += 4;
        numberOfFixedDatumRecords = dis.readInt();
        uPosition += 4;
        numberOfVariableDatumRecords = dis.readInt();
        uPosition += 4;
        for (int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
            FixedDatum anX = new FixedDatum();
            uPosition += anX.unmarshal(dis);
            fixedDatumRecords.add(anX);
        }

        for (int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
            VariableDatum anX = new VariableDatum();
            uPosition += anX.unmarshal(dis);
            variableDatumRecords.add(anX);
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
   requiredReliabilityService.marshal(byteBuffer);
   byteBuffer.put( (byte)pad1);
   byteBuffer.putShort( (short)pad2);
   byteBuffer.putInt( (int)requestID);
   byteBuffer.putInt( (int)fixedDatumRecords.size());
   byteBuffer.putInt( (int)variableDatumRecords.size());

   for (int idx = 0; idx < fixedDatumRecords.size(); idx++)
   {
        FixedDatum aFixedDatum = fixedDatumRecords.get(idx);
        aFixedDatum.marshal(byteBuffer);
   }


   for (int idx = 0; idx < variableDatumRecords.size(); idx++)
   {
        VariableDatum aVariableDatum = variableDatumRecords.get(idx);
        aVariableDatum.marshal(byteBuffer);
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
        // attribute requiredReliabilityService marked as not serialized
        requiredReliabilityService = RequiredReliabilityService.unmarshalEnum(byteBuffer);
        // attribute pad1 marked as not serialized
        pad1 = (byte)(byteBuffer.get() & 0xFF);
        // attribute pad2 marked as not serialized
        pad2 = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute requestID marked as not serialized
        requestID = byteBuffer.getInt();
        // attribute numberOfFixedDatumRecords marked as not serialized
        numberOfFixedDatumRecords = byteBuffer.getInt();
        // attribute numberOfVariableDatumRecords marked as not serialized
        numberOfVariableDatumRecords = byteBuffer.getInt();
        // attribute fixedDatumRecords marked as not serialized
        for (int idx = 0; idx < numberOfFixedDatumRecords; idx++)
        {
        FixedDatum anX = new FixedDatum();
        anX.unmarshal(byteBuffer);
        fixedDatumRecords.add(anX);
        }

        // attribute variableDatumRecords marked as not serialized
        for (int idx = 0; idx < numberOfVariableDatumRecords; idx++)
        {
        VariableDatum anX = new VariableDatum();
        anX.unmarshal(byteBuffer);
        variableDatumRecords.add(anX);
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

     final SetDataRPdu rhs = (SetDataRPdu)obj;

     if( ! (requiredReliabilityService == rhs.requiredReliabilityService)) ivarsEqual = false;
     if( ! (pad1 == rhs.pad1)) ivarsEqual = false;
     if( ! (pad2 == rhs.pad2)) ivarsEqual = false;
     if( ! (requestID == rhs.requestID)) ivarsEqual = false;

     for (int idx = 0; idx < fixedDatumRecords.size(); idx++)
        if( ! ( fixedDatumRecords.get(idx).equals(rhs.fixedDatumRecords.get(idx)))) ivarsEqual = false;


     for (int idx = 0; idx < variableDatumRecords.size(); idx++)
        if( ! ( variableDatumRecords.get(idx).equals(rhs.variableDatumRecords.get(idx)))) ivarsEqual = false;

    return ivarsEqual && super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" requiredReliabilityService:").append(requiredReliabilityService); // writeOneToString
    sb.append(" pad1:").append(pad1); // writeOneToString
    sb.append(" pad2:").append(pad2); // writeOneToString
    sb.append(" requestID:").append(requestID); // writeOneToString
    sb.append(" fixedDatumRecords: ");
    fixedDatumRecords.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset
    sb.append(" variableDatumRecords: ");
    variableDatumRecords.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }
} // end of class
