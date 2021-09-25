// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 607,
 * marshal size 8;
 * Class7SupplyCategoryMajorItems has 23 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum Class7SupplyCategoryMajorItems implements Category
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (1, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** A - Air (Not used, as described in Air Domain) */
    // autogenerated using string template disenumpart2.txt
    A_AIR_NOT_USED_AS_DESCRIBED_IN_AIR_DOMAIN (2, "A - Air (Not used, as described in Air Domain)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** B - Ground Support Materiel */
    // autogenerated using string template disenumpart2.txt
    B_GROUND_SUPPORT_MATERIEL (3, "B - Ground Support Materiel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** D - Admin Vehicles (Not used, as described in Land Domain) */
    // autogenerated using string template disenumpart2.txt
    D_ADMIN_VEHICLES_NOT_USED_AS_DESCRIBED_IN_LAND_DOMAIN (4, "D - Admin Vehicles (Not used, as described in Land Domain)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** G - Electronics */
    // autogenerated using string template disenumpart2.txt
    G_ELECTRONICS (5, "G - Electronics"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** J - Racks, Adaptors, Pylons */
    // autogenerated using string template disenumpart2.txt
    J_RACKS_ADAPTORS_PYLONS (6, "J - Racks, Adaptors, Pylons"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** K - Tactical Vehicles (Not used, as described in Land Domain) */
    // autogenerated using string template disenumpart2.txt
    K_TACTICAL_VEHICLES_NOT_USED_AS_DESCRIBED_IN_LAND_DOMAIN (7, "K - Tactical Vehicles (Not used, as described in Land Domain)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** L - Missiles (Not used, as described in Munition Domain) */
    // autogenerated using string template disenumpart2.txt
    L_MISSILES_NOT_USED_AS_DESCRIBED_IN_MUNITION_DOMAIN (8, "L - Missiles (Not used, as described in Munition Domain)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** M - Weapons */
    // autogenerated using string template disenumpart2.txt
    M_WEAPONS (9, "M - Weapons"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** N - Special Weapons */
    // autogenerated using string template disenumpart2.txt
    N_SPECIAL_WEAPONS (10, "N - Special Weapons"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** X - Aircraft Engines */
    // autogenerated using string template disenumpart2.txt
    X_AIRCRAFT_ENGINES (11, "X - Aircraft Engines"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Drop Tank */
    // autogenerated using string template disenumpart2.txt
    DROP_TANK (20, "Drop Tank"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Conformal Fuel Tank */
    // autogenerated using string template disenumpart2.txt
    CONFORMAL_FUEL_TANK (21, "Conformal Fuel Tank"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Luggage Pod */
    // autogenerated using string template disenumpart2.txt
    LUGGAGE_POD (22, "Luggage Pod"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ECM Pod */
    // autogenerated using string template disenumpart2.txt
    ECM_POD (23, "ECM Pod"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Para-Drogue */
    // autogenerated using string template disenumpart2.txt
    PARA_DROGUE (24, "Para-Drogue"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Targeting Pod */
    // autogenerated using string template disenumpart2.txt
    TARGETING_POD (25, "Targeting Pod"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fairing */
    // autogenerated using string template disenumpart2.txt
    FAIRING (26, "Fairing"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Air Refuelling Pod */
    // autogenerated using string template disenumpart2.txt
    AIR_REFUELLING_POD (27, "Air Refuelling Pod"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Heavy Airdrop */
    // autogenerated using string template disenumpart2.txt
    IDENTIFICATION_FRIEND_OR_FOE (28, "Heavy Airdrop"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Container Delivery System (CDS) Airdrop */
    // autogenerated using string template disenumpart2.txt
    CONTAINER_DELIVERY_SYSTEM_CDS_AIRDROP (29, "Container Delivery System (CDS) Airdrop"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Rocket Pod/Launcher */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Rocket Pod/Launcher"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tactical Pod */
    // autogenerated using string template disenumpart2.txt
    TACTICAL_POD (31, "Tactical Pod");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    Class7SupplyCategoryMajorItems(int value, String description)
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

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static Class7SupplyCategoryMajorItems getEnumForValue(int value)
    {
       for (Class7SupplyCategoryMajorItems nextEnum : Class7SupplyCategoryMajorItems.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum Class7SupplyCategoryMajorItems");
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
    public static Class7SupplyCategoryMajorItems unmarshalEnum (DataInputStream dis) throws Exception
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
    public static Class7SupplyCategoryMajorItems unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
