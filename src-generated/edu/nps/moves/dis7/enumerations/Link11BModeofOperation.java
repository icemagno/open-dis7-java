package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * Generated from XML, SISO-REF-010-v28, 2020-05-07<br>
 * UID 738 marshal size 16<br>
 * Link11BModeofOperation
 */
public enum Link11BModeofOperation 
{
    /** No Statement */
    NO_STATEMENT (0, "No Statement"),
    /** Full Transmission of Data */
    FULL_TRANSMISSION_OF_DATA (1, "Full Transmission of Data"),
    /** Limited Transmission of Data */
    LIMITED_TRANSMISSION_OF_DATA (2, "Limited Transmission of Data"),
    /** Receive only */
    RECEIVE_ONLY (3, "Receive only");

    private int value;
    private final String description;

    Link11BModeofOperation(int value, String description)
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

    public static Link11BModeofOperation getEnumForValue(int i)
    {
       for(Link11BModeofOperation val: Link11BModeofOperation.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration Link11BModeofOperation");
       return null;
    }

 
   public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.putShort((short)getValue());
    }

    public static Link11BModeofOperation unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    public static Link11BModeofOperation unmarshalEnum (ByteBuffer byteBuffer) throws Exception
    {
        return getEnumForValue(byteBuffer.getShort());
    }   

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * See <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 2; // 16 bits
    }
    
  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        return "Link11BModeofOperation " + getValue() + " " + name(); 
    }
}