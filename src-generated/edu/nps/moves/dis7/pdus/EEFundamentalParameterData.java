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
 * Contains electromagnetic emission regeneration parameters that are variable throught a scenario. Section 6.2.22.
 * @see <a href="https://ieeexplore.ieee.org/document/6387564" target="_blank">IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols</a> 
 */
public class EEFundamentalParameterData extends Object implements Serializable
{
   /** center frequency of the emission in hertz. */
   protected float frequency;

   /** Bandwidth of the frequencies corresponding to the fequency field. */
   protected float frequencyRange;

   /** Effective radiated power for the emission in DdBm. For a radar noise jammer, indicates the peak of the transmitted power. */
   protected float effectiveRadiatedPower;

   /** Average repetition frequency of the emission in hertz. */
   protected float pulseRepetitionFrequency;

   /** Average pulse width  of the emission in microseconds. */
   protected float pulseWidth;


/** Constructor creates and configures a new instance object */
 public EEFundamentalParameterData()
 {
 }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 4;  // frequency
   marshalSize += 4;  // frequencyRange
   marshalSize += 4;  // effectiveRadiatedPower
   marshalSize += 4;  // pulseRepetitionFrequency
   marshalSize += 4;  // pulseWidth

   return marshalSize;
}


/** Setter for {@link EEFundamentalParameterData#frequency}
  * @param pFrequency new value of interest
  * @return same object to permit progressive setters */
public EEFundamentalParameterData setFrequency(float pFrequency)
{
    frequency = pFrequency;
    return this;
}
/** Getter for {@link EEFundamentalParameterData#frequency}
  * @return value of interest */
public float getFrequency()
{
    return frequency; 
}

/** Setter for {@link EEFundamentalParameterData#frequencyRange}
  * @param pFrequencyRange new value of interest
  * @return same object to permit progressive setters */
public EEFundamentalParameterData setFrequencyRange(float pFrequencyRange)
{
    frequencyRange = pFrequencyRange;
    return this;
}
/** Getter for {@link EEFundamentalParameterData#frequencyRange}
  * @return value of interest */
public float getFrequencyRange()
{
    return frequencyRange; 
}

/** Setter for {@link EEFundamentalParameterData#effectiveRadiatedPower}
  * @param pEffectiveRadiatedPower new value of interest
  * @return same object to permit progressive setters */
public EEFundamentalParameterData setEffectiveRadiatedPower(float pEffectiveRadiatedPower)
{
    effectiveRadiatedPower = pEffectiveRadiatedPower;
    return this;
}
/** Getter for {@link EEFundamentalParameterData#effectiveRadiatedPower}
  * @return value of interest */
public float getEffectiveRadiatedPower()
{
    return effectiveRadiatedPower; 
}

/** Setter for {@link EEFundamentalParameterData#pulseRepetitionFrequency}
  * @param pPulseRepetitionFrequency new value of interest
  * @return same object to permit progressive setters */
public EEFundamentalParameterData setPulseRepetitionFrequency(float pPulseRepetitionFrequency)
{
    pulseRepetitionFrequency = pPulseRepetitionFrequency;
    return this;
}
/** Getter for {@link EEFundamentalParameterData#pulseRepetitionFrequency}
  * @return value of interest */
public float getPulseRepetitionFrequency()
{
    return pulseRepetitionFrequency; 
}

/** Setter for {@link EEFundamentalParameterData#pulseWidth}
  * @param pPulseWidth new value of interest
  * @return same object to permit progressive setters */
public EEFundamentalParameterData setPulseWidth(float pPulseWidth)
{
    pulseWidth = pPulseWidth;
    return this;
}
/** Getter for {@link EEFundamentalParameterData#pulseWidth}
  * @return value of interest */
public float getPulseWidth()
{
    return pulseWidth; 
}

/**
 * Serializes an object to a DataOutputStream.
 * @throws java.lang.Exception if something goes wrong
 * @see java.io.DataOutputStream
 * @param dos the OutputStream
 */
public void marshal(DataOutputStream dos) throws Exception
{
    try 
    {
       dos.writeFloat(frequency);
       dos.writeFloat(frequencyRange);
       dos.writeFloat(effectiveRadiatedPower);
       dos.writeFloat(pulseRepetitionFrequency);
       dos.writeFloat(pulseWidth);
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
    try 
    {
        frequency = dis.readFloat();
        uPosition += 4;
        frequencyRange = dis.readFloat();
        uPosition += 4;
        effectiveRadiatedPower = dis.readFloat();
        uPosition += 4;
        pulseRepetitionFrequency = dis.readFloat();
        uPosition += 4;
        pulseWidth = dis.readFloat();
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
   byteBuffer.putFloat( (float)frequency);
   byteBuffer.putFloat( (float)frequencyRange);
   byteBuffer.putFloat( (float)effectiveRadiatedPower);
   byteBuffer.putFloat( (float)pulseRepetitionFrequency);
   byteBuffer.putFloat( (float)pulseWidth);
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
    try
    {
        // attribute frequency marked as not serialized
        frequency = byteBuffer.getFloat();
        // attribute frequencyRange marked as not serialized
        frequencyRange = byteBuffer.getFloat();
        // attribute effectiveRadiatedPower marked as not serialized
        effectiveRadiatedPower = byteBuffer.getFloat();
        // attribute pulseRepetitionFrequency marked as not serialized
        pulseRepetitionFrequency = byteBuffer.getFloat();
        // attribute pulseWidth marked as not serialized
        pulseWidth = byteBuffer.getFloat();
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

 /**
  * Compare all fields that contribute to the state, ignoring
  * transient and static fields, for <code>this</code> and the supplied object
  * @param obj the object to compare to
  * @return true if the objects are equal, false otherwise.
  */
 public boolean equalsImpl(Object obj)
 {
     boolean ivarsEqual = true;

     final EEFundamentalParameterData rhs = (EEFundamentalParameterData)obj;

     if( ! (frequency == rhs.frequency)) ivarsEqual = false;
     if( ! (frequencyRange == rhs.frequencyRange)) ivarsEqual = false;
     if( ! (effectiveRadiatedPower == rhs.effectiveRadiatedPower)) ivarsEqual = false;
     if( ! (pulseRepetitionFrequency == rhs.pulseRepetitionFrequency)) ivarsEqual = false;
     if( ! (pulseWidth == rhs.pulseWidth)) ivarsEqual = false;
    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb  = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(" frequency:").append(frequency); // writeOneToString
    sb.append(" frequencyRange:").append(frequencyRange); // writeOneToString
    sb.append(" effectiveRadiatedPower:").append(effectiveRadiatedPower); // writeOneToString
    sb.append(" pulseRepetitionFrequency:").append(pulseRepetitionFrequency); // writeOneToString
    sb.append(" pulseWidth:").append(pulseWidth); // writeOneToString

   return sb.toString();
 }
} // end of class
