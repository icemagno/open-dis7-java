// autogenerated using string template disenumpart1withfootnote.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 431, marshal size 8;
 * PlatformLandSingleUnitUtilityEmergencyTruckSubcategories has 45 enumerations total.
 * Subcategories for Land Platform Category 84
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum PlatformLandSingleUnitUtilityEmergencyTruckSubcategories implements SubCategory
{

    // autogenerated using string template disenumfootnotecomment.txt

    /** Other */
    // autogenerated using string template disenumpart2.txt
    OTHER (0, "Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ambulance Truck */
    // autogenerated using string template disenumpart2.txt
    AMBULANCE_TRUCK (1, "Ambulance Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fire/Paramedic Truck */
    // autogenerated using string template disenumpart2.txt
    FIRE_PARAMEDIC_TRUCK (2, "Fire/Paramedic Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ambulance, Advanced Life Support */
    // autogenerated using string template disenumpart2.txt
    AMBULANCE_ADVANCED_LIFE_SUPPORT (3, "Ambulance, Advanced Life Support"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ambulance Pickup Truck */
    // autogenerated using string template disenumpart2.txt
    AMBULANCE_PICKUP_TRUCK (4, "Ambulance Pickup Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fire Engine */
    // autogenerated using string template disenumpart2.txt
    FIRE_ENGINE (10, "Fire Engine"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aerial Ladder Fire Engine */
    // autogenerated using string template disenumpart2.txt
    AERIAL_LADDER_FIRE_ENGINE (11, "Aerial Ladder Fire Engine"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Airport Fire Engine */
    // autogenerated using string template disenumpart2.txt
    AIRPORT_FIRE_ENGINE (12, "Airport Fire Engine"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wildland Fire Engine */
    // autogenerated using string template disenumpart2.txt
    WILDLAND_FIRE_ENGINE (13, "Wildland Fire Engine"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fire Chief */
    // autogenerated using string template disenumpart2.txt
    FIRE_CHIEF (14, "Fire Chief"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Police Paddy Wagon */
    // autogenerated using string template disenumpart2.txt
    POLICE_PADDY_WAGON (20, "Police Paddy Wagon"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Police, SWAT */
    // autogenerated using string template disenumpart2.txt
    POLICE_SWAT (21, "Police, SWAT"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Police, Bomb Squad */
    // autogenerated using string template disenumpart2.txt
    POLICE_BOMB_SQUAD (22, "Police, Bomb Squad"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Police, Pickup Truck */
    // autogenerated using string template disenumpart2.txt
    POLICE_PICKUP_TRUCK (23, "Police, Pickup Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Hazmat */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "Hazmat"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Normal Hook and Chain */
    // autogenerated using string template disenumpart2.txt
    WRECKER_NORMAL_HOOK_AND_CHAIN (40, "Wrecker, Normal Hook and Chain"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Normal Boom */
    // autogenerated using string template disenumpart2.txt
    WRECKER_NORMAL_BOOM (41, "Wrecker, Normal Boom"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Normal Wheel Lift */
    // autogenerated using string template disenumpart2.txt
    WRECKER_NORMAL_WHEEL_LIFT (42, "Wrecker, Normal Wheel Lift"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Normal Flatbed */
    // autogenerated using string template disenumpart2.txt
    WRECKER_NORMAL_FLATBED (43, "Wrecker, Normal Flatbed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Normal Integrated */
    // autogenerated using string template disenumpart2.txt
    WRECKER_NORMAL_INTEGRATED (44, "Wrecker, Normal Integrated"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Heavy Hook and Chain */
    // autogenerated using string template disenumpart2.txt
    WRECKER_HEAVY_HOOK_AND_CHAIN (45, "Wrecker, Heavy Hook and Chain"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Heavy Boom */
    // autogenerated using string template disenumpart2.txt
    TIME_SPACE_POSITION_INFORMATION (46, "Wrecker, Heavy Boom"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Heavy Wheel Lift */
    // autogenerated using string template disenumpart2.txt
    WRECKER_HEAVY_WHEEL_LIFT (47, "Wrecker, Heavy Wheel Lift"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Heavy Flatbed */
    // autogenerated using string template disenumpart2.txt
    WRECKER_HEAVY_FLATBED (48, "Wrecker, Heavy Flatbed"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wrecker, Heavy Integrated */
    // autogenerated using string template disenumpart2.txt
    LIVE_ENTITY_FIRE (49, "Wrecker, Heavy Integrated"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Postal Truck */
    // autogenerated using string template disenumpart2.txt
    DATA_RELIABLE (60, "Postal Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Street Sweeper */
    // autogenerated using string template disenumpart2.txt
    STREET_SWEEPER (70, "Street Sweeper"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Street Sweeper, Three Wheeled */
    // autogenerated using string template disenumpart2.txt
    STREET_SWEEPER_THREE_WHEELED (71, "Street Sweeper, Three Wheeled"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Waste Collection, Other */
    // autogenerated using string template disenumpart2.txt
    WASTE_COLLECTION_OTHER (80, "Waste Collection, Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Waste Collection, Front Loader */
    // autogenerated using string template disenumpart2.txt
    WASTE_COLLECTION_FRONT_LOADER (81, "Waste Collection, Front Loader"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Waste Collection, Rear Loader */
    // autogenerated using string template disenumpart2.txt
    WASTE_COLLECTION_REAR_LOADER (82, "Waste Collection, Rear Loader"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Waste Collection, Automated Side Loader */
    // autogenerated using string template disenumpart2.txt
    WASTE_COLLECTION_AUTOMATED_SIDE_LOADER (83, "Waste Collection, Automated Side Loader"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Waste Collection, Pneumatic Collection */
    // autogenerated using string template disenumpart2.txt
    WASTE_COLLECTION_PNEUMATIC_COLLECTION (84, "Waste Collection, Pneumatic Collection"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Waste Collection, Grapple */
    // autogenerated using string template disenumpart2.txt
    WASTE_COLLECTION_GRAPPLE (85, "Waste Collection, Grapple"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Utility Truck */
    // autogenerated using string template disenumpart2.txt
    UTILITY_TRUCK (90, "Utility Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Utility Truck w/ Boom */
    // autogenerated using string template disenumpart2.txt
    UTILITY_TRUCK_W_BOOM (91, "Utility Truck w/ Boom"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aerial Work Platform, Other */
    // autogenerated using string template disenumpart2.txt
    AERIAL_WORK_PLATFORM_OTHER (100, "Aerial Work Platform, Other"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aerial Work Platform, Scissor Lift */
    // autogenerated using string template disenumpart2.txt
    AERIAL_WORK_PLATFORM_SCISSOR_LIFT (101, "Aerial Work Platform, Scissor Lift"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Aerial Work Platform, Telescoping */
    // autogenerated using string template disenumpart2.txt
    AERIAL_WORK_PLATFORM_TELESCOPING (102, "Aerial Work Platform, Telescoping"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Maintenance Truck */
    // autogenerated using string template disenumpart2.txt
    MAINTENANCE_TRUCK (120, "Maintenance Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Decontamination Truck */
    // autogenerated using string template disenumpart2.txt
    DECONTAMINATION_TRUCK (121, "Decontamination Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Water Cannon Truck */
    // autogenerated using string template disenumpart2.txt
    WATER_CANNON_TRUCK (122, "Water Cannon Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Water Purification Truck */
    // autogenerated using string template disenumpart2.txt
    WATER_PURIFICATION_TRUCK (123, "Water Purification Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Smoke Generator Truck */
    // autogenerated using string template disenumpart2.txt
    SMOKE_GENERATOR_TRUCK (124, "Smoke Generator Truck"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Auto Rickshaw */
    // autogenerated using string template disenumpart2.txt
    AUTO_RICKSHAW (150, "Auto Rickshaw");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    PlatformLandSingleUnitUtilityEmergencyTruckSubcategories(int value, String description)
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
    public static PlatformLandSingleUnitUtilityEmergencyTruckSubcategories getEnumForValue(int value)
    {
       for (PlatformLandSingleUnitUtilityEmergencyTruckSubcategories nextEnum : PlatformLandSingleUnitUtilityEmergencyTruckSubcategories.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum PlatformLandSingleUnitUtilityEmergencyTruckSubcategories");
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
    public static PlatformLandSingleUnitUtilityEmergencyTruckSubcategories unmarshalEnum (DataInputStream dis) throws Exception
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
    public static PlatformLandSingleUnitUtilityEmergencyTruckSubcategories unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
