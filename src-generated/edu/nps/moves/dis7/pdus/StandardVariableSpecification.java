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

/**
 * Does not work, and causes failure in anything it is embedded in. Section 6.2.83
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class StandardVariableSpecification extends Object implements Serializable
{
   /** Number of static variable records */
   protected short numberOfStandardVariableRecords;

   /** variable length list of standard variables, The class type and length here are WRONG and will cause the incorrect serialization of any class in whihc it is embedded. */
   protected List< StandardVariableRecord > standardVariables = new ArrayList<>();
 

/** Constructor creates and configures a new instance object */
 public StandardVariableSpecification()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public synchronized int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 2;  // numberOfStandardVariableRecords
   if (standardVariables != null)
       for (int idx=0; idx < standardVariables.size(); idx++)
       {
            StandardVariableRecord listElement = standardVariables.get(idx);
            marshalSize += listElement.getMarshalledSize();
       }

   return marshalSize;
}


/** Utility method to get size of field
 * @return size of field */
public short getNumberOfStandardVariableRecords()
{
    return (short)standardVariables.size(); 
}

/** Note that setting this value will not change the marshalled value. The list whose length this describes is used for that purpose.
 * The getnumberOfStandardVariableRecords method will also be based on the actual list length rather than this value. 
 * The method is simply here for java bean completeness.
 * @param pNumberOfStandardVariableRecords passed parameter
 * @return this object
 */
public synchronized StandardVariableSpecification setNumberOfStandardVariableRecords(short pNumberOfStandardVariableRecords)
{
    numberOfStandardVariableRecords = pNumberOfStandardVariableRecords;
    return this;
}

/** Setter for {@link StandardVariableSpecification#standardVariables}
  * @param pStandardVariables new value of interest
  * @return same object to permit progressive setters */
public synchronized StandardVariableSpecification setStandardVariables(List<StandardVariableRecord> pStandardVariables)
{
    standardVariables = pStandardVariables;
    return this;
}
/** Getter for {@link StandardVariableSpecification#standardVariables}
  * @return value of interest */
public List<StandardVariableRecord> getStandardVariables()
{
    return standardVariables; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public synchronized void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeShort(standardVariables.size());

       for (int idx = 0; idx < standardVariables.size(); idx++)
       {
            StandardVariableRecord aStandardVariableRecord = standardVariables.get(idx);
            aStandardVariableRecord.marshal(dos);
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
public synchronized int unmarshal(DataInputStream dis) throws Exception
{
    int uPosition = 0;
    try 
    {
        numberOfStandardVariableRecords = (short)dis.readUnsignedShort();
        uPosition += 2;
        for (int idx = 0; idx < numberOfStandardVariableRecords; idx++)
        {
            StandardVariableRecord anX = new StandardVariableRecord();
            uPosition += anX.unmarshal(dis);
            standardVariables.add(anX);
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
public synchronized void marshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
   byteBuffer.putShort( (short)standardVariables.size());

   for (int idx = 0; idx < standardVariables.size(); idx++)
   {
        StandardVariableRecord aStandardVariableRecord = standardVariables.get(idx);
        aStandardVariableRecord.marshal(byteBuffer);
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
public synchronized int unmarshal(java.nio.ByteBuffer byteBuffer) throws Exception
{
    try
    {
        // attribute numberOfStandardVariableRecords marked as not serialized
        numberOfStandardVariableRecords = (short)(byteBuffer.getShort() & 0xFFFF);
        // attribute standardVariables marked as not serialized
        for (int idx = 0; idx < numberOfStandardVariableRecords; idx++)
        {
        StandardVariableRecord anX = new StandardVariableRecord();
        anX.unmarshal(byteBuffer);
        standardVariables.add(anX);
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

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public synchronized boolean equalsImpl(Object obj)
 {
     final StandardVariableSpecification rhs = (StandardVariableSpecification)obj;

     if( ! (numberOfStandardVariableRecords == rhs.numberOfStandardVariableRecords)) return false;
     if( ! Objects.equals(standardVariables, rhs.standardVariables) ) return false;
    return true;
 }

 @Override
 public synchronized String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" numberOfStandardVariableRecords:").append(numberOfStandardVariableRecords); // writeOneToString
    sb.append(" standardVariables: ");
    standardVariables.forEach(r->{ sb2.append(" ").append(r);}); // writeList
    sb.append(sb2.toString().trim());
    // https://stackoverflow.com/questions/2242471/clearing-a-string-buffer-builder-after-loop
    sb2.setLength(0); // reset

   return sb.toString();
 }

 @Override
 public int hashCode()
 {
	 return Objects.hash(this.numberOfStandardVariableRecords,
	                     this.standardVariables);
 }
} // end of StandardVariableSpecification
