package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 432 marshal size 8<br>
 * Platform-Land-Multiple Unit Cargo Truck Subcategories<br>
 * Subcategories for Land Platform Category 85
 */
public enum PlatformLandMultipleUnitCargoTruckSubcategories implements SubCategory
{

    /** Other */
    OTHER (0, "Other"),
    /** Tractor Trailer */
    TRACTOR_TRAILER (1, "Tractor Trailer"),
    /** Tanker */
    TANKER (2, "Tanker");

    private int value;
    private final String description;

    PlatformLandMultipleUnitCargoTruckSubcategories(int value, String description)
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

    public static PlatformLandMultipleUnitCargoTruckSubcategories getEnumForValue(int i)
    {
       for(PlatformLandMultipleUnitCargoTruckSubcategories val: PlatformLandMultipleUnitCargoTruckSubcategories.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration PlatformLandMultipleUnitCargoTruckSubcategories");
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

    public static PlatformLandMultipleUnitCargoTruckSubcategories unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static PlatformLandMultipleUnitCargoTruckSubcategories unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "PlatformLandMultipleUnitCargoTruckSubcategories: " + name() + ": " + getValue(); 
    }
}
