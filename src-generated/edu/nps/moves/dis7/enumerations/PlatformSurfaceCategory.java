package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

// autogenerated using string template disenumpart1.txt

/**
 * Generated from XML,
 *  UID 11,
 * marshal size 8,
 * PlatformSurfaceCategory
 */
public enum PlatformSurfaceCategory implements Category
{
// autogenerated using string template disenumfootnotecomment.txt

    /** Other */
// autogenerated using string template disenumpart2.txt

    OTHER (0, "Other"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Carrier */
// autogenerated using string template disenumpart2.txt

    CARRIER (1, "Carrier"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Command Ship/Cruiser */
// autogenerated using string template disenumpart2.txt

    COMMAND_SHIP_CRUISER (2, "Command Ship/Cruiser"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Guided Missile Cruiser */
// autogenerated using string template disenumpart2.txt

    GUIDED_MISSILE_CRUISER (3, "Guided Missile Cruiser"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Guided Missile Destroyer (DDG) */
// autogenerated using string template disenumpart2.txt

    GUIDED_MISSILE_DESTROYER_DDG (4, "Guided Missile Destroyer (DDG)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Destroyer (DD) */
// autogenerated using string template disenumpart2.txt

    DESTROYER_DD (5, "Destroyer (DD)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Guided Missile Frigate (FFG) */
// autogenerated using string template disenumpart2.txt

    GUIDED_MISSILE_FRIGATE_FFG (6, "Guided Missile Frigate (FFG)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Light/Patrol Craft */
// autogenerated using string template disenumpart2.txt

    LIGHT_PATROL_CRAFT (7, "Light/Patrol Craft"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Mine Countermeasure Ship/Craft */
// autogenerated using string template disenumpart2.txt

    MINE_COUNTERMEASURE_SHIP_CRAFT (8, "Mine Countermeasure Ship/Craft"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Dock Landing Ship */
// autogenerated using string template disenumpart2.txt

    DOCK_LANDING_SHIP (9, "Dock Landing Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Tank Landing Ship */
// autogenerated using string template disenumpart2.txt

    TANK_LANDING_SHIP (10, "Tank Landing Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Landing Craft */
// autogenerated using string template disenumpart2.txt

    LANDING_CRAFT (11, "Landing Craft"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Light Carrier */
// autogenerated using string template disenumpart2.txt

    LIGHT_CARRIER (12, "Light Carrier"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Cruiser/Helicopter Carrier */
// autogenerated using string template disenumpart2.txt

    CRUISER_HELICOPTER_CARRIER (13, "Cruiser/Helicopter Carrier"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Hydrofoil */
// autogenerated using string template disenumpart2.txt

    HYDROFOIL (14, "Hydrofoil"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Air Cushion/Surface Effect */
// autogenerated using string template disenumpart2.txt

    AIR_CUSHION_SURFACE_EFFECT (15, "Air Cushion/Surface Effect"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Auxiliary */
// autogenerated using string template disenumpart2.txt

    AUXILIARY (16, "Auxiliary"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Auxiliary, Merchant Marine */
// autogenerated using string template disenumpart2.txt

    AUXILIARY_MERCHANT_MARINE (17, "Auxiliary, Merchant Marine"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Utility */
// autogenerated using string template disenumpart2.txt

    UTILITY (18, "Utility"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Unmanned Surface Vehicle (USV) */
// autogenerated using string template disenumpart2.txt

    UNMANNED_SURFACE_VEHICLE_USV (19, "Unmanned Surface Vehicle (USV)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Littoral Combat Ships (LCS) */
// autogenerated using string template disenumpart2.txt

    LITTORAL_COMBAT_SHIPS_LCS (20, "Littoral Combat Ships (LCS)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Surveillance Ship */
// autogenerated using string template disenumpart2.txt

    SURVEILLANCE_SHIP (21, "Surveillance Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Frigate (including Corvette) */
// autogenerated using string template disenumpart2.txt

    LIVE_ENTITY_DETONATION (50, "Frigate (including Corvette)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Battleship */
// autogenerated using string template disenumpart2.txt

    CREATE_ENTITY_RELIABLE (51, "Battleship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Heavy Cruiser */
// autogenerated using string template disenumpart2.txt

    REMOVE_ENTITY_RELIABLE (52, "Heavy Cruiser"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Destroyer Tender */
// autogenerated using string template disenumpart2.txt

    START_RESUME_RELIABLE (53, "Destroyer Tender"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Amphibious Assault Ship */
// autogenerated using string template disenumpart2.txt

    STOP_FREEZE_RELIABLE (54, "Amphibious Assault Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Amphibious Cargo Ship */
// autogenerated using string template disenumpart2.txt

    ACKNOWLEDGE_RELIABLE (55, "Amphibious Cargo Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Amphibious Transport Dock */
// autogenerated using string template disenumpart2.txt

    ACTION_REQUEST_RELIABLE (56, "Amphibious Transport Dock"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Ammunition Ship */
// autogenerated using string template disenumpart2.txt

    ACTION_RESPONSE_RELIABLE (57, "Ammunition Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Combat Stores Ship */
// autogenerated using string template disenumpart2.txt

    DATA_QUERY_RELIABLE (58, "Combat Stores Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Surveillance Towed Array Sonar System (SURTASS) */
// autogenerated using string template disenumpart2.txt

    SET_DATA_RELIABLE (59, "Surveillance Towed Array Sonar System (SURTASS)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Fast Combat Support Ship */
// autogenerated using string template disenumpart2.txt

    DATA_RELIABLE (60, "Fast Combat Support Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Non-Combatant Ship */
// autogenerated using string template disenumpart2.txt

    EVENT_REPORT_RELIABLE (61, "Non-Combatant Ship"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Coast Guard Cutters */
// autogenerated using string template disenumpart2.txt

    COMMENT_RELIABLE (62, "Coast Guard Cutters"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Coast Guard Boats */
// autogenerated using string template disenumpart2.txt

    RECORD_RELIABLE (63, "Coast Guard Boats"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Fast Attack Craft */
// autogenerated using string template disenumpart2.txt

    SET_RECORD_RELIABLE	 (64, "Fast Attack Craft"),
// autogenerated using string template disdictenumcomment.txt

    /** PlatformSurfacePassengerVesselSubcategories */// autogenerated using string template disenumpart21.txt

    PASSENGER_VESSEL_GROUP_1_MERCHANT_2 (80, "Passenger Vessel (Group 1 Merchant)"),
// autogenerated using string template disdictenumcomment.txt

    /** PlatformSurfaceDryCargoShipSubcategories */// autogenerated using string template disenumpart21.txt

    DRY_CARGO_SHIP_GROUP_2_MERCHANT_2 (81, "Dry Cargo Ship (Group 2 Merchant)"),
// autogenerated using string template disdictenumcomment.txt

    /** PlatformSurfaceTankerSubcategories */// autogenerated using string template disenumpart21.txt

    TANKER_GROUP_3_MERCHANT_2 (82, "Tanker (Group 3 Merchant)"),
// autogenerated using string template disdictenumcomment.txt

    /** PlatformSurfaceSupportVesselSubcategories */// autogenerated using string template disenumpart21.txt

    SUPPORT_VESSEL_2 (83, "Support Vessel"),
// autogenerated using string template disdictenumcomment.txt

    /** PlatformSurfacePrivateMotorboatSubcategories */// autogenerated using string template disenumpart21.txt

    PRIVATE_MOTORBOAT_2 (84, "Private Motorboat"),
// autogenerated using string template disdictenumcomment.txt

    /** PlatformSurfacePrivateSailboatSubcategories */// autogenerated using string template disenumpart21.txt

    PRIVATE_SAILBOAT_2 (85, "Private Sailboat"),
// autogenerated using string template disdictenumcomment.txt

    /** PlatformSurfaceFishingVesselSubcategories */// autogenerated using string template disenumpart21.txt

    FISHING_VESSEL_2 (86, "Fishing Vessel"),
// autogenerated using string template disdictenumcomment.txt

    /** PlatformSurfaceOtherVesselsSubcategories */// autogenerated using string template disenumpart21.txt

    OTHER_VESSELS_2 (87, "Other Vessels"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Search and Rescue Vessels */
// autogenerated using string template disenumpart2.txt

    SEARCH_AND_RESCUE_VESSELS (100, "Search and Rescue Vessels"),
// autogenerated using string template disdictenumcomment.txt

    /** LifeSavingEquipment */// autogenerated using string template disenumpart21.txt

    LIFE_SAVING_EQUIPMENT_2 (101, "Life-Saving Equipment"),;

// autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformSurfaceCategory(int value, String description)
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
    public static PlatformSurfaceCategory getEnumForValue(int i)
    {
       for(PlatformSurfaceCategory val: PlatformSurfaceCategory.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No enumeration found for value " + i + " of enumeration PlatformSurfaceCategory");
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
    public static PlatformSurfaceCategory unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformSurfaceCategory unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
