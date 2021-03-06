package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 205 marshal size 32<br>
 * Aggregate State-Formation
 */
public enum AggregateStateFormation 
{
    /** Other */
    OTHER (0, "Other"),
    /** Assembly */
    ASSEMBLY (1, "Assembly"),
    /** Vee */
    VEE (2, "Vee"),
    /** Wedge */
    WEDGE (3, "Wedge"),
    /** Line */
    LINE (4, "Line"),
    /** Column */
    COLUMN (5, "Column");

    private int value;
    private final String description;

    AggregateStateFormation(int value, String description)
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
      return 32;
    }

    public static AggregateStateFormation getEnumForValue(int i)
    {
       for(AggregateStateFormation val: AggregateStateFormation.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration AggregateStateFormation");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeInt(getValue());
    }

    public void marshal(ByteBuffer buff)
    {
        buff.putInt(getValue());
    }

    public static AggregateStateFormation unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readInt());
    } 

    public static AggregateStateFormation unmarshalEnum (ByteBuffer buff)
    {
        return getEnumForValue(buff.getInt());
    }

    public int getMarshalledSize()
    {
        return 4; // 32 bits
    }
    
    @Override
    public String toString()
    {
        return "AggregateStateFormation: " + name() + ": " + getValue();
    }
}
