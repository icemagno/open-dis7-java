package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 97 marshal size 8<br>
 * IFF-System Type 1-Operational Parameter 1
 */
public enum IFFSystemType1OperationalParameter1 
{
    /** No Operational Parameter 1 Data */
    NO_OPERATIONAL_PARAMETER_1_DATA (0, "No Operational Parameter 1 Data");

    private int value;
    private final String description;

    IFFSystemType1OperationalParameter1(int value, String description)
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
      return 8;
    }

    public static IFFSystemType1OperationalParameter1 getEnumForValue(int i)
    {
       for(IFFSystemType1OperationalParameter1 val: IFFSystemType1OperationalParameter1.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration IFFSystemType1OperationalParameter1");
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

    public static IFFSystemType1OperationalParameter1 unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static IFFSystemType1OperationalParameter1 unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "IFFSystemType1OperationalParameter1: " + name() + ": " + getValue(); 
    }
}
