/**
 * Copyright (c) 2008-2019, MOVES Institute, Naval Postgraduate School. All rights reserved.
 * This work is licensed under the BSD open source license, available at https://www.movesinstitute.org/licenses/bsd.html
 */

package edu.nps.moves.dis7;

import java.util.*;
import java.io.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * IEEE Std 1278.1-2012, IEEE Standard for Distributed Interactive Simulation—Application Protocols
 */
public class EmitterBeam extends Object implements Serializable
{
   protected byte  beamDataLength;

   protected byte  beamNumber;

   protected short  beamParameterIndex;

   protected EEFundamentalParameterData  fundamentalParameterData = new EEFundamentalParameterData(); 

   protected BeamData  beamData = new BeamData(); 

   /**  uid 78 */
   protected ElectromagneticEmissionBeamFunction beamFunction = ElectromagneticEmissionBeamFunction.values()[0];

   protected byte  numberOfTargets;

   /**  uid 79 */
   protected HighDensityTrackJam highDensityTrackJam = HighDensityTrackJam.values()[0];

   protected BeamStatus  beamStatus = new BeamStatus(); 

   protected JammingTechnique  jammingTechnique = new JammingTechnique(); 

   protected List< TrackJamData > trackJamData = new ArrayList< TrackJamData >();
 

/** Constructor */
 public EmitterBeam()
 {
 }

/** Returns the size of this serialized object in bytes*/
public int getMarshalledSize()
{
   int marshalSize = 0; 

   marshalSize += 1;  // beamDataLength
   marshalSize += 1;  // beamNumber
   marshalSize += 2;  // beamParameterIndex
   marshalSize += fundamentalParameterData.getMarshalledSize();
   marshalSize += beamData.getMarshalledSize();
   marshalSize += beamFunction.getMarshalledSize();
   marshalSize += 1;  // numberOfTargets
   marshalSize += highDensityTrackJam.getMarshalledSize();
   marshalSize += beamStatus.getMarshalledSize();
   marshalSize += jammingTechnique.getMarshalledSize();
   for(int idx=0; idx < trackJamData.size(); idx++)
   {
        TrackJamData listElement = trackJamData.get(idx);
        marshalSize += listElement.getMarshalledSize();
   }

   return marshalSize;
}


/** Setter for {@link EmitterBeam#beamDataLength}*/
public EmitterBeam setBeamDataLength(byte pBeamDataLength)
{
    beamDataLength = pBeamDataLength;
    return this;
}

/** Getter for {@link EmitterBeam#beamDataLength}*/
public byte getBeamDataLength()
{
    return beamDataLength; 
}

/** Setter for {@link EmitterBeam#beamNumber}*/
public EmitterBeam setBeamNumber(byte pBeamNumber)
{
    beamNumber = pBeamNumber;
    return this;
}

/** Getter for {@link EmitterBeam#beamNumber}*/
public byte getBeamNumber()
{
    return beamNumber; 
}

/** Setter for {@link EmitterBeam#beamParameterIndex}*/
public EmitterBeam setBeamParameterIndex(short pBeamParameterIndex)
{
    beamParameterIndex = pBeamParameterIndex;
    return this;
}

/** Getter for {@link EmitterBeam#beamParameterIndex}*/
public short getBeamParameterIndex()
{
    return beamParameterIndex; 
}

/** Setter for {@link EmitterBeam#fundamentalParameterData}*/
public EmitterBeam setFundamentalParameterData(EEFundamentalParameterData pFundamentalParameterData)
{
    fundamentalParameterData = pFundamentalParameterData;
    return this;
}

/** Getter for {@link EmitterBeam#fundamentalParameterData}*/
public EEFundamentalParameterData getFundamentalParameterData()
{
    return fundamentalParameterData; 
}

/** Setter for {@link EmitterBeam#beamData}*/
public EmitterBeam setBeamData(BeamData pBeamData)
{
    beamData = pBeamData;
    return this;
}

/** Getter for {@link EmitterBeam#beamData}*/
public BeamData getBeamData()
{
    return beamData; 
}

/** Setter for {@link EmitterBeam#beamFunction}*/
public EmitterBeam setBeamFunction(ElectromagneticEmissionBeamFunction pBeamFunction)
{
    beamFunction = pBeamFunction;
    return this;
}

/** Getter for {@link EmitterBeam#beamFunction}*/
public ElectromagneticEmissionBeamFunction getBeamFunction()
{
    return beamFunction; 
}

/** Setter for {@link EmitterBeam#highDensityTrackJam}*/
public EmitterBeam setHighDensityTrackJam(HighDensityTrackJam pHighDensityTrackJam)
{
    highDensityTrackJam = pHighDensityTrackJam;
    return this;
}

/** Getter for {@link EmitterBeam#highDensityTrackJam}*/
public HighDensityTrackJam getHighDensityTrackJam()
{
    return highDensityTrackJam; 
}

/** Setter for {@link EmitterBeam#beamStatus}*/
public EmitterBeam setBeamStatus(BeamStatus pBeamStatus)
{
    beamStatus = pBeamStatus;
    return this;
}

/** Getter for {@link EmitterBeam#beamStatus}*/
public BeamStatus getBeamStatus()
{
    return beamStatus; 
}

/** Setter for {@link EmitterBeam#jammingTechnique}*/
public EmitterBeam setJammingTechnique(JammingTechnique pJammingTechnique)
{
    jammingTechnique = pJammingTechnique;
    return this;
}

/** Getter for {@link EmitterBeam#jammingTechnique}*/
public JammingTechnique getJammingTechnique()
{
    return jammingTechnique; 
}

/** Setter for {@link EmitterBeam#trackJamData}*/
public EmitterBeam setTrackJamData(List<TrackJamData> pTrackJamData)
{
    trackJamData = pTrackJamData;
    return this;
}

/** Getter for {@link EmitterBeam#trackJamData}*/
public List<TrackJamData> getTrackJamData()
{
    return trackJamData; 
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
       dos.writeByte( (byte)beamDataLength);
       dos.writeByte( (byte)beamNumber);
       dos.writeShort( (short)beamParameterIndex);
       fundamentalParameterData.marshal(dos);
       beamData.marshal(dos);
       beamFunction.marshal(dos);
       dos.writeByte( (byte)trackJamData.size());
       highDensityTrackJam.marshal(dos);
       beamStatus.marshal(dos);
       jammingTechnique.marshal(dos);

       for(int idx = 0; idx < trackJamData.size(); idx++)
       {
            TrackJamData aTrackJamData = trackJamData.get(idx);
            aTrackJamData.marshal(dos);
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
    try 
    {
        beamDataLength = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamNumber = (byte)dis.readUnsignedByte();
        uPosition += 1;
        beamParameterIndex = (short)dis.readUnsignedShort();
        uPosition += 2;
        uPosition += fundamentalParameterData.unmarshal(dis);
        uPosition += beamData.unmarshal(dis);
        beamFunction = ElectromagneticEmissionBeamFunction.unmarshalEnum(dis);
        uPosition += beamFunction.getMarshalledSize();
        numberOfTargets = (byte)dis.readUnsignedByte();
        uPosition += 1;
        highDensityTrackJam = HighDensityTrackJam.unmarshalEnum(dis);
        uPosition += highDensityTrackJam.getMarshalledSize();
        uPosition += beamStatus.unmarshal(dis);
        uPosition += jammingTechnique.unmarshal(dis);
        for(int idx = 0; idx < numberOfTargets; idx++)
        {
            TrackJamData anX = new TrackJamData();
            uPosition += anX.unmarshal(dis);
            trackJamData.add(anX);
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
   buff.put( (byte)beamDataLength);
   buff.put( (byte)beamNumber);
   buff.putShort( (short)beamParameterIndex);
   fundamentalParameterData.marshal(buff);
   beamData.marshal(buff);
   beamFunction.marshal(buff);
   buff.put( (byte)trackJamData.size());
   highDensityTrackJam.marshal(buff);
   beamStatus.marshal(buff);
   jammingTechnique.marshal(buff);

   for(int idx = 0; idx < trackJamData.size(); idx++)
   {
        TrackJamData aTrackJamData = (TrackJamData)trackJamData.get(idx);
        aTrackJamData.marshal(buff);
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
    beamDataLength = (byte)(buff.get() & 0xFF);
    beamNumber = (byte)(buff.get() & 0xFF);
    beamParameterIndex = (short)(buff.getShort() & 0xFFFF);
    fundamentalParameterData.unmarshal(buff);
    beamData.unmarshal(buff);
    beamFunction = ElectromagneticEmissionBeamFunction.unmarshalEnum(buff);
    numberOfTargets = (byte)(buff.get() & 0xFF);
    highDensityTrackJam = HighDensityTrackJam.unmarshalEnum(buff);
    beamStatus.unmarshal(buff);
    jammingTechnique.unmarshal(buff);
    for(int idx = 0; idx < numberOfTargets; idx++)
    {
    TrackJamData anX = new TrackJamData();
    anX.unmarshal(buff);
    trackJamData.add(anX);
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

     final EmitterBeam rhs = (EmitterBeam)obj;

     if( ! (beamDataLength == rhs.beamDataLength)) ivarsEqual = false;
     if( ! (beamNumber == rhs.beamNumber)) ivarsEqual = false;
     if( ! (beamParameterIndex == rhs.beamParameterIndex)) ivarsEqual = false;
     if( ! (fundamentalParameterData.equals( rhs.fundamentalParameterData) )) ivarsEqual = false;
     if( ! (beamData.equals( rhs.beamData) )) ivarsEqual = false;
     if( ! (beamFunction == rhs.beamFunction)) ivarsEqual = false;
     if( ! (highDensityTrackJam == rhs.highDensityTrackJam)) ivarsEqual = false;
     if( ! (beamStatus.equals( rhs.beamStatus) )) ivarsEqual = false;
     if( ! (jammingTechnique.equals( rhs.jammingTechnique) )) ivarsEqual = false;

     for(int idx = 0; idx < trackJamData.size(); idx++)
        if( ! ( trackJamData.get(idx).equals(rhs.trackJamData.get(idx)))) ivarsEqual = false;

    return ivarsEqual;
 }

 @Override
 public String toString()
 {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName()+":\n");

    sb.append(" beamDataLength: ").append(beamDataLength).append("\n");
    sb.append(" beamNumber: ").append(beamNumber).append("\n");
    sb.append(" beamParameterIndex: ").append(beamParameterIndex).append("\n");
    sb.append(" fundamentalParameterData: ").append(fundamentalParameterData).append("\n");
    sb.append(" beamData: ").append(beamData).append("\n");
    sb.append(" beamFunction: ").append(beamFunction).append("\n");
    sb.append(" highDensityTrackJam: ").append(highDensityTrackJam).append("\n");
    sb.append(" beamStatus: ").append(beamStatus).append("\n");
    sb.append(" jammingTechnique: ").append(jammingTechnique).append("\n");
    sb.append(" trackJamData: ").append("\n");
    trackJamData.forEach(r->{ sb.append(r.getClass().getSimpleName()).append(": ").append(r).append("\n");});

   return sb.toString();
 }
} // end of class
