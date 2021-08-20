// autogenerated using string template dis7javalicense.txt

/**
 * Copyright (c) 2008-2021, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD open-source license, see project license.html and license.txt
 */


package edu.nps.moves.dis7.pdus;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * Fundamental IFF atc data. Section 6.2.45
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation - Application Protocols
 */
public class IFFFundamentalParameterData extends Object implements Serializable
{
   /** ERP */
   protected float  erp;

   /** frequency */
   protected float  frequency;

   /** pgrf */
   protected float  pgrf;

   /** Pulse width */
   protected float  pulseWidth;

   /** Burst length */
   protected int  burstLength;

   /** Applicable modes enumeration uid 339 */
   protected IFFApplicableModes applicableModes = IFFApplicableModes.values()[0];

   /** System-specific data */
   protected byte[]  systemSpecificData = new byte[3]; 


/** Constructor */
 public IFFFundamentalParameterData()
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

   marshalSize += 4;  // erp
   marshalSize += 4;  // frequency
   marshalSize += 4;  // pgrf
   marshalSize += 4;  // pulseWidth
   marshalSize += 4;  // burstLength
   marshalSize += applicableModes.getMarshalledSize();
   marshalSize += systemSpecificData.length * 1;

   return marshalSize;
}


/** Setter for {@link IFFFundamentalParameterData#erp}
  * @param pErp new value of interest
  * @return same object to permit progressive setters */
public IFFFundamentalParameterData setErp(float pErp)
{
    erp = pErp;
    return this;
}

/** Getter for {@link IFFFundamentalParameterData#erp}
  * @return value of interest */
public float getErp()
{
    return erp; 
}

/** Setter for {@link IFFFundamentalParameterData#frequency}
  * @param pFrequency new value of interest
  * @return same object to permit progressive setters */
public IFFFundamentalParameterData setFrequency(float pFrequency)
{
    frequency = pFrequency;
    return this;
}

/** Getter for {@link IFFFundamentalParameterData#frequency}
  * @return value of interest */
public float getFrequency()
{
    return frequency; 
}

/** Setter for {@link IFFFundamentalParameterData#pgrf}
  * @param pPgrf new value of interest
  * @return same object to permit progressive setters */
public IFFFundamentalParameterData setPgrf(float pPgrf)
{
    pgrf = pPgrf;
    return this;
}

/** Getter for {@link IFFFundamentalParameterData#pgrf}
  * @return value of interest */
public float getPgrf()
{
    return pgrf; 
}

/** Setter for {@link IFFFundamentalParameterData#pulseWidth}
  * @param pPulseWidth new value of interest
  * @return same object to permit progressive setters */
public IFFFundamentalParameterData setPulseWidth(float pPulseWidth)
{
    pulseWidth = pPulseWidth;
    return this;
}

/** Getter for {@link IFFFundamentalParameterData#pulseWidth}
  * @return value of interest */
public float getPulseWidth()
{
    return pulseWidth; 
}

/** Setter for {@link IFFFundamentalParameterData#burstLength}
  * @param pBurstLength new value of interest
  * @return same object to permit progressive setters */
public IFFFundamentalParameterData setBurstLength(int pBurstLength)
{
    burstLength = pBurstLength;
    return this;
}

/** Getter for {@link IFFFundamentalParameterData#burstLength}
  * @return value of interest */
public int getBurstLength()
{
    return burstLength; 
}

/** Setter for {@link IFFFundamentalParameterData#applicableModes}
  * @param pApplicableModes new value of interest
  * @return same object to permit progressive setters */
public IFFFundamentalParameterData setApplicableModes(IFFApplicableModes pApplicableModes)
{
    applicableModes = pApplicableModes;
    return this;
}

/** Getter for {@link IFFFundamentalParameterData#applicableModes}
  * @return value of interest */
public IFFApplicableModes getApplicableModes()
{
    return applicableModes; 
}

/** Setter for {@link IFFFundamentalParameterData#systemSpecificData}
  * @param pSystemSpecificData new value of interest
  * @return same object to permit progressive setters */
public IFFFundamentalParameterData setSystemSpecificData(byte[] pSystemSpecificData)
{
    systemSpecificData = pSystemSpecificData;
    return this;
}

/** Getter for {@link IFFFundamentalParameterData#systemSpecificData}
  * @return value of interest */
public byte[] getSystemSpecificData()
{
    return systemSpecificData; 
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
       dos.writeFloat(erp);
       dos.writeFloat(frequency);
       dos.writeFloat(pgrf);
       dos.writeFloat(pulseWidth);
       dos.writeInt(burstLength);
       applicableModes.marshal(dos);

       for(int idx = 0; idx < systemSpecificData.length; idx++)
           dos.writeByte(systemSpecificData[idx]);

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
        erp = dis.readFloat();
        uPosition += 4;
        frequency = dis.readFloat();
        uPosition += 4;
        pgrf = dis.readFloat();
        uPosition += 4;
        pulseWidth = dis.readFloat();
        uPosition += 4;
        burstLength = dis.readInt();
        uPosition += 4;
        applicableModes = IFFApplicableModes.unmarshalEnum(dis);
        uPosition += applicableModes.getMarshalledSize();
        for(int idx = 0; idx < systemSpecificData.length; idx++)
            systemSpecificData[idx] = dis.readByte();
        uPosition += (systemSpecificData.length * 1);
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
   byteBuffer.putFloat( (float)erp);
   byteBuffer.putFloat( (float)frequency);
   byteBuffer.putFloat( (float)pgrf);
   byteBuffer.putFloat( (float)pulseWidth);
   byteBuffer.putInt( (int)burstLength);
   applicableModes.marshal(byteBuffer);

   for(int idx = 0; idx < systemSpecificData.length; idx++)
       byteBuffer.put((byte)systemSpecificData[idx]);

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
    erp = byteBuffer.getFloat();
    frequency = byteBuffer.getFloat();
    pgrf = byteBuffer.getFloat();
    pulseWidth = byteBuffer.getFloat();
    burstLength = byteBuffer.getInt();
    applicableModes = IFFApplicableModes.unmarshalEnum(byteBuffer);
    for(int idx = 0; idx < systemSpecificData.length; idx++)
        systemSpecificData[idx] = byteBuffer.get();
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

     final IFFFundamentalParameterData rhs = (IFFFundamentalParameterData)obj;

     if( ! (erp == rhs.erp)) ivarsEqual = false;
     if( ! (frequency == rhs.frequency)) ivarsEqual = false;
     if( ! (pgrf == rhs.pgrf)) ivarsEqual = false;
     if( ! (pulseWidth == rhs.pulseWidth)) ivarsEqual = false;
     if( ! (burstLength == rhs.burstLength)) ivarsEqual = false;
     if( ! (applicableModes == rhs.applicableModes)) ivarsEqual = false;

     for(int idx = 0; idx < 3; idx++)
     {
          if(!(systemSpecificData[idx] == rhs.systemSpecificData[idx])) ivarsEqual = false;
     }

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()).append(":\n");

    sb.append(" erp: ").append(erp).append("\n");
    sb.append(" frequency: ").append(frequency).append("\n");
    sb.append(" pgrf: ").append(pgrf).append("\n");
    sb.append(" pulseWidth: ").append(pulseWidth).append("\n");
    sb.append(" burstLength: ").append(burstLength).append("\n");
    sb.append(" applicableModes: ").append(applicableModes).append("\n");
    sb.append(" systemSpecificData: ").append("\n");
    sb.append(Arrays.toString(systemSpecificData)).append("\n");

   return sb.toString();
 }
} // end of class
