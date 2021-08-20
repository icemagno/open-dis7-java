package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

// autogenerated using string template disenumpart1withfootnote.txt

/**
 * Generated from XML,
 *  UID 442, marshal size 8,
 * PlatformSurfaceDryCargoShipSubcategories
 * Subcategories for Surface Platform Category 81.
 */
public enum PlatformSurfaceDryCargoShipSubcategories implements SubCategory
{

// autogenerated using string template disenumfootnotecomment.txt

    /** Common Dry Cargo Ship */
// autogenerated using string template disenumpart2.txt

    COMMON_DRY_CARGO_SHIP (1, "Common Dry Cargo Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Dry Bulk Cargo Ship */
// autogenerated using string template disenumpart2.txt

    DRY_BULK_CARGO_SHIP (2, "Dry Bulk Cargo Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Container Ship */
// autogenerated using string template disenumpart2.txt

    CONTAINER_SHIP (3, "Container Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Reefer Ship (Refrigerator Ship) */
// autogenerated using string template disenumpart2.txt

    REEFER_SHIP_REFRIGERATOR_SHIP (4, "Reefer Ship (Refrigerator Ship)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Ro-Ro Ship (Roll-on/Roll-off Ship) */
// autogenerated using string template disenumpart2.txt

    RO_RO_SHIP_ROLL_ON_ROLL_OFF_SHIP (5, "Ro-Ro Ship (Roll-on/Roll-off Ship)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Barge */
// autogenerated using string template disenumpart2.txt

    BARGE (6, "Barge"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Heavy Lift Ship */
// autogenerated using string template disenumpart2.txt

    HEAVY_LIFT_SHIP (7, "Heavy Lift Ship"),;

// autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformSurfaceDryCargoShipSubcategories(int value, String description)
    {
        this.value = value;
        this.description = description;
    }
    /** Provide enumeration value
      * @return integer value */
    public int getValue()
    {
        return value;
    }

    /** Provide enumeration description
     * @return description
     */
    public String getDescription()
    {
        return description;
    }

    /** bit width for this enumeration
     * @return number of bits wide
     */
    public static int getEnumBitWidth()
    {
      return 8;
    }

    /** provide enumeration for a given value
     * @param i integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static PlatformSurfaceDryCargoShipSubcategories getEnumForValue(int i)
    {
       for(PlatformSurfaceDryCargoShipSubcategories val: PlatformSurfaceDryCargoShipSubcategories.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No enumeration found for value " + i + " of enumeration PlatformSurfaceDryCargoShipSubcategories");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

// autogenerated using string template disenumpart3_8.txt

    private boolean TRACE = false;

    /** Set tracing on/off for this object 
     * @param value whether tracing is on or off */
    public void setTRACE (boolean value)
    {
        TRACE = value;
    }

    /** Whether tracing is on or off for this object
     * @return whether tracing is on or off */
    public boolean getTRACE ()
    {
        return TRACE;
    }

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.put((byte)getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static PlatformSurfaceDryCargoShipSubcategories unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue(dis.readByte());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static PlatformSurfaceDryCargoShipSubcategories unmarshalEnum(ByteBuffer byteBuffer) throws Exception
    {
        /*
        try {
            value = (int)byteBuffer.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue(byteBuffer.get());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        String padding = new String();
        if (this.getClass().getName().endsWith("DisPduType") && (getValue() < 10))
            padding = "0"; // leading zero for column spacing
        String result = "DisPduType " + padding + getValue() + " " + name();
        if (getTRACE())
            System.out.println ("*** enum " + this.getClass().getName() + " name=" + name() + ", value=" + getValue() + "; " +
               result); // debug diagnostic
        return result;
    }
}
