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
 * 9.4.4 Communicate information about an entity’s articulated and attached parts.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class ArticulatedPartsPdu extends LiveEntityFamilyPdu implements Serializable
{

   /** The name of this PDU type */
   public static final String NAME = "ArticulatedPartsPdu";
   
   /** liveEntityId is an undescribed parameter... */
   protected EntityID  liveEntityId = new EntityID(); 

   /** numberOfParameterRecords is an undescribed parameter... */
   protected byte numberOfParameterRecords;

   /** variableParameters is an undescribed parameter... */
   protected List< VariableParameter > variableParameters = new ArrayList<>();
 

/** Constructor creates and configures a new instance object */
 public ArticulatedPartsPdu()
 {
    setPduType( DisPduType.ARTICULATED_PARTS );
 }
/** copy method creates a deep copy of current object using preferred marshalling method
 * @return deep copy of PDU */
 public synchronized ArticulatedPartsPdu copy()
 {
     return copyDataOutputStream();
 }
/** Creates a "deep copy" of current object using ByteBuffer methods.
 * @return deep copy of PDU */
 public synchronized ArticulatedPartsPdu copyByteBuffer()
 {
     ArticulatedPartsPdu newCopy = new ArticulatedPartsPdu();
     ByteBuffer byteBuffer = ByteBuffer.allocate(400);
     try
     {
         this.marshal(byteBuffer);      // working
         newCopy.unmarshal(byteBuffer); // not working
     }
     catch (Exception e)
     {
         System.err.println("ArticulatedPartsPdu deep copy() marshall/unmarshall ByteBuffer exception " + e.getMessage());
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
 public synchronized ArticulatedPartsPdu copyDataOutputStream()
 {
     ArticulatedPartsPdu newCopy = new ArticulatedPartsPdu();
     try
     {
         this.marshal(dataOutputStream);
         byte[] byteArrayDOS = byteArrayOutputStream.toByteArray();
         newCopy.unmarshal(ByteBuffer.wrap(byteArrayDOS));
     }
     catch (Exception e)
     {
         System.err.println("ArticulatedPartsPdu deep copy() marshall/unmarshall DataOutputStream exception " + e.getMessage());
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
            System.err.println("ArticulatedPartsPdu copyDataOutputStream() flush IOException: " + ioe.getMessage());
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
   if (liveEntityId != null)
       marshalSize += liveEntityId.getMarshalledSize();
   marshalSize += 1;  // numberOfParameterRecords
   if (variableParameters != null)
       for (int idx=0; idx < variableParameters.size(); idx++)
       {
            VariableParameter listElement = variableParameters.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Setter for {@link ArticulatedPartsPdu#liveEntityId}
  * @param pLiveEntityId new value of interest
  * @return same object to permit progressive setters */
public synchronized ArticulatedPartsPdu setLiveEntityId(EntityID pLiveEntityId)
{
    liveEntityId = pLiveEntityId;
    return this;
}
/** Getter for {@link ArticulatedPartsPdu#liveEntityId}
  * @return value of interest */
public EntityID getLiveEntityId()
{
    return liveEntityId;
}


/** Setter for {@link ArticulatedPartsPdu#variableParameters}
  * @param pVariableParameters new value of interest
  * @return same object to permit progressive setters */
public synchronized ArticulatedPartsPdu setVariableParameters(List<VariableParameter> pVariableParameters)
{
    variableParameters = pVariableParameters;
    return this;
}
/** Getter for {@link ArticulatedPartsPdu#variableParameters}
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
       liveEntityId.marshal(dos);
       dos.writeByte(variableParameters.size());

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
        uPosition += liveEntityId.unmarshal(dis);
        numberOfParameterRecords = (byte)dis.readUnsignedByte();
        uPosition += 1;
        for (int idx = 0; idx < numberOfParameterRecords; idx++)
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
   liveEntityId.marshal(byteBuffer);
   byteBuffer.put( (byte)variableParameters.size());

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
        // attribute liveEntityId marked as not serialized
        liveEntityId.unmarshal(byteBuffer);
        // attribute numberOfParameterRecords marked as not serialized
        numberOfParameterRecords = (byte)(byteBuffer.get() & 0xFF);
        // attribute variableParameters marked as not serialized
        for (int idx = 0; idx < numberOfParameterRecords; idx++)
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
     final ArticulatedPartsPdu rhs = (ArticulatedPartsPdu)obj;

     if( ! Objects.equals(liveEntityId, rhs.liveEntityId) ) return false;
     if( ! Objects.equals(variableParameters, rhs.variableParameters) ) return false;
    return super.equalsImpl(rhs);
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" liveEntityId:").append(liveEntityId); // writeOneToString
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
	 return Objects.hash(this.liveEntityId,
	                     this.numberOfParameterRecords,
	                     this.variableParameters);
 }
} // end of ArticulatedPartsPdu
