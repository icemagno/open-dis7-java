package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 422 marshal size 7<br>
 * Minefield Fusing-Fuse Type
 */
public enum MinefieldFusingFuseType 
{
    /** No Fuse */
    NO_FUSE (0, "No Fuse"),
    /** Other */
    OTHER (1, "Other"),
    /** Pressure */
    PRESSURE (2, "Pressure"),
    /** Magnetic */
    MAGNETIC (3, "Magnetic"),
    /** Tilt Rod */
    TILT_ROD (4, "Tilt Rod"),
    /** Command */
    COMMAND (5, "Command"),
    /** Trip Wire */
    TRIP_WIRE (6, "Trip Wire");

    private int value;
    private final String description;

    MinefieldFusingFuseType(int value, String description)
    {
        this.value = value;
        this.description = description;
    }

    public int getValue()
    {
        return value;
    }

    public String getDescription()
    {
        return description;
    }
    
    public static int getEnumBitWidth()
    {
      return 7;
    }

    public static MinefieldFusingFuseType getEnumForValue(int i)
    {
       for(MinefieldFusingFuseType val: MinefieldFusingFuseType.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration MinefieldFusingFuseType");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    public void marshal(ByteBuffer buff) throws Exception
    {
        buff.put((byte)getValue());
    }

    public static MinefieldFusingFuseType unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static MinefieldFusingFuseType unmarshalEnum(ByteBuffer buff) throws Exception
    {
        /*
        try {
            value = (int)buff.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue((int)buff.get());
    }

    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
    @Override
    public String toString()
    {
        return "MinefieldFusingFuseType: " + name() + ": " + getValue(); 
    }
}
