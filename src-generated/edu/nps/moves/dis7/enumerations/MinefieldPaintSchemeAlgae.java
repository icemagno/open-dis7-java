package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 424 marshal size 2<br>
 * Minefield Paint Scheme-Algae
 */
public enum MinefieldPaintSchemeAlgae 
{
    /** None */
    NONE (0, "None"),
    /** Light */
    LIGHT (1, "Light"),
    /** Moderate */
    MODERATE (2, "Moderate"),
    /** Heavy */
    HEAVY (3, "Heavy");

    private int value;
    private final String description;

    MinefieldPaintSchemeAlgae(int value, String description)
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

    public static MinefieldPaintSchemeAlgae getEnumForValue(int i)
    {
       for(MinefieldPaintSchemeAlgae val: MinefieldPaintSchemeAlgae.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration MinefieldPaintSchemeAlgae");
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

    public static MinefieldPaintSchemeAlgae unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static MinefieldPaintSchemeAlgae unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "MinefieldPaintSchemeAlgae: " + name() + ": " + getValue(); 
    }
}
