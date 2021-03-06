package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 470 marshal size 16<br>
 * Link 11/11B Mode of Operation
 */
public enum Link1111BModeofOperation 
{
    /** No Statement */
    NO_STATEMENT (0, "No Statement"),
    /** Net Sync */
    NET_SYNC (1, "Net Sync"),
    /** Net Test */
    NET_TEST (2, "Net Test"),
    /** Roll Call */
    ROLL_CALL (3, "Roll Call"),
    /** Short Broadcast */
    SHORT_BROADCAST (4, "Short Broadcast"),
    /** Broadcast */
    BROADCAST (5, "Broadcast");

    private int value;
    private final String description;

    Link1111BModeofOperation(int value, String description)
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
      return 16;
    }

    public static Link1111BModeofOperation getEnumForValue(int i)
    {
       for(Link1111BModeofOperation val: Link1111BModeofOperation.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration Link1111BModeofOperation");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    public void marshal(ByteBuffer buff) throws Exception
    {
        buff.putShort((short)getValue());
    }

    public static Link1111BModeofOperation unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue((int)dis.readUnsignedShort());
    } 

    public static Link1111BModeofOperation unmarshalEnum (ByteBuffer buff) throws Exception
    {
        return getEnumForValue((int)buff.getShort());
    }   

    public int getMarshalledSize()
    {
        return 2; // 16 bits
    }
    
    @Override
    public String toString()
    {
        return "Link1111BModeofOperation: " + name() + ": " + getValue(); 
    }
}
