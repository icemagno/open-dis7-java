package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 123 marshal size 8<br>
 * Subcategories for Subsurface Category 203 - Crustacean
 */
public enum SubcategoriesforSubsurfaceCategory203Crustacean implements SubCategory
{
    /** Shrimp */
    SHRIMP (1, "Shrimp"),
    /** Snapping Shrimp */
    SNAPPING_SHRIMP (2, "Snapping Shrimp"),
    /** Crayfish */
    CRAYFISH (10, "Crayfish"),
    /** Lobster */
    LOBSTER (20, "Lobster"),
    /** Crab */
    CRAB (30, "Crab");

    private int value;
    private final String description;

    SubcategoriesforSubsurfaceCategory203Crustacean(int value, String description)
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

    public static SubcategoriesforSubsurfaceCategory203Crustacean getEnumForValue(int i)
    {
       for(SubcategoriesforSubsurfaceCategory203Crustacean val: SubcategoriesforSubsurfaceCategory203Crustacean.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration SubcategoriesforSubsurfaceCategory203Crustacean");
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

    public static SubcategoriesforSubsurfaceCategory203Crustacean unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static SubcategoriesforSubsurfaceCategory203Crustacean unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "SubcategoriesforSubsurfaceCategory203Crustacean: " + name() + ": " + getValue(); 
    }
}
