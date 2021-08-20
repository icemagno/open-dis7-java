package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

// autogenerated using string template disenumpart1.txt

/**
 * Generated from XML,
 *  UID 602,
 * marshal size 8,
 * Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies
 */
public enum Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies implements Category
{
// autogenerated using string template disenumfootnotecomment.txt

    /** Other */
// autogenerated using string template disenumpart2.txt

    OTHER (1, "Other"),
// autogenerated using string template disenumfootnotecomment.txt

    /** A - Air */
// autogenerated using string template disenumpart2.txt

    A_AIR (2, "A - Air"),
// autogenerated using string template disenumfootnotecomment.txt

    /** B - Ground Support Materiel */
// autogenerated using string template disenumpart2.txt

    B_GROUND_SUPPORT_MATERIEL (3, "B - Ground Support Materiel"),
// autogenerated using string template disenumfootnotecomment.txt

    /** E - General Supplies */
// autogenerated using string template disenumpart2.txt

    E_GENERAL_SUPPLIES (4, "E - General Supplies"),
// autogenerated using string template disenumfootnotecomment.txt

    /** F - Clothing */
// autogenerated using string template disenumpart2.txt

    F_CLOTHING (5, "F - Clothing"),
// autogenerated using string template disenumfootnotecomment.txt

    /** G - Electronics */
// autogenerated using string template disenumpart2.txt

    G_ELECTRONICS (6, "G - Electronics"),
// autogenerated using string template disenumfootnotecomment.txt

    /** M - Weapons (Humans) */
// autogenerated using string template disenumpart2.txt

    M_WEAPONS_HUMANS (7, "M - Weapons (Humans)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** T - Industrial Supplies */
// autogenerated using string template disenumpart2.txt

    T_INDUSTRIAL_SUPPLIES (8, "T - Industrial Supplies"),;

// autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies(int value, String description)
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
    public static Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies getEnumForValue(int i)
    {
       for(Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies val: Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No enumeration found for value " + i + " of enumeration Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies");
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
    public static Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies unmarshalEnum (DataInputStream dis) throws Exception
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
    public static Class2SupplyCategoryClothingIndividualEquipmentToolsAdminSupplies unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
