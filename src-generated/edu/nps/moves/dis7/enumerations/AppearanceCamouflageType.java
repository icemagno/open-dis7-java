package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 384 marshal size 2<br>
 * Appearance-Camouflage Type
 */
public enum AppearanceCamouflageType 
{
    /** Desert Camouflage */
    DESERT_CAMOUFLAGE (0, "Desert Camouflage"),
    /** Winter Camouflage */
    WINTER_CAMOUFLAGE (1, "Winter Camouflage"),
    /** Forest Camouflage */
    FOREST_CAMOUFLAGE (2, "Forest Camouflage"),
    /** Other */
    OTHER (3, "Other");

    private int value;
    private final String description;

    AppearanceCamouflageType(int value, String description)
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
      return 2;
    }

    public static AppearanceCamouflageType getEnumForValue(int i)
    {
       for(AppearanceCamouflageType val: AppearanceCamouflageType.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AppearanceCamouflageType");
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

    public static AppearanceCamouflageType unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static AppearanceCamouflageType unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "AppearanceCamouflageType: " + name() + ": " + getValue(); 
    }
}
