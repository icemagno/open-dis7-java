package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 376 marshal size 2<br>
 * Component Visual Damage Status-Surface Damage
 */
public enum ComponentVisualDamageStatusSurfaceDamage 
{
    /** Normal Appearance */
    NORMAL_APPEARANCE (0, "Normal Appearance"),
    /** Light Charring */
    LIGHT_CHARRING (1, "Light Charring"),
    /** Heavy Charring */
    HEAVY_CHARRING (2, "Heavy Charring"),
    /** One or More Holes Burned Completely through Surface */
    ONE_OR_MORE_HOLES_BURNED_COMPLETELY_THROUGH_SURFACE (3, "One or More Holes Burned Completely through Surface");

    private int value;
    private final String description;

    ComponentVisualDamageStatusSurfaceDamage(int value, String description)
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

    public static ComponentVisualDamageStatusSurfaceDamage getEnumForValue(int i)
    {
       for(ComponentVisualDamageStatusSurfaceDamage val: ComponentVisualDamageStatusSurfaceDamage.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration ComponentVisualDamageStatusSurfaceDamage");
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

    public static ComponentVisualDamageStatusSurfaceDamage unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static ComponentVisualDamageStatusSurfaceDamage unmarshalEnum(ByteBuffer buff) throws Exception
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
        return "ComponentVisualDamageStatusSurfaceDamage: " + name() + ": " + getValue(); 
    }
}
