package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

// autogenerated using string template disenumpart1.txt

/**
 * Generated from XML,
 *  UID 61,
 * marshal size 16,
 * MunitionDescriptorFuse
 */
public enum MunitionDescriptorFuse 
{
// autogenerated using string template disenumfootnotecomment.txt

    /** Other */
// autogenerated using string template disenumpart2.txt

    OTHER (0000, "Other"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Intelligent Influence */
// autogenerated using string template disenumpart2.txt

    INTELLIGENT_INFLUENCE (0010, "Intelligent Influence"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Sensor */
// autogenerated using string template disenumpart2.txt

    SENSOR (0020, "Sensor"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Self-destruct */
// autogenerated using string template disenumpart2.txt

    SELF_DESTRUCT (0030, "Self-destruct"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Ultra Quick */
// autogenerated using string template disenumpart2.txt

    ULTRA_QUICK (0040, "Ultra Quick"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Body */
// autogenerated using string template disenumpart2.txt

    BODY (0050, "Body"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Deep Intrusion */
// autogenerated using string template disenumpart2.txt

    DEEP_INTRUSION (0060, "Deep Intrusion"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Multifunction */
// autogenerated using string template disenumpart2.txt

    MULTIFUNCTION (0100, "Multifunction"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Point Detonation (PD) */
// autogenerated using string template disenumpart2.txt

    POINT_DETONATION_PD (0200, "Point Detonation (PD)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Base Detonation (BD) */
// autogenerated using string template disenumpart2.txt

    BASE_DETONATION_BD (0300, "Base Detonation (BD)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact */
// autogenerated using string template disenumpart2.txt

    CONTACT (1000, "Contact"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Instant (Impact) */
// autogenerated using string template disenumpart2.txt

    CONTACT_INSTANT_IMPACT (1100, "Contact, Instant (Impact)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Delayed */
// autogenerated using string template disenumpart2.txt

    CONTACT_DELAYED (1200, "Contact, Delayed"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 10 ms Delay */
// autogenerated using string template disenumpart2.txt

    _10_MS_DELAY (1201, "10 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 20 ms Delay */
// autogenerated using string template disenumpart2.txt

    _20_MS_DELAY (1202, "20 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 50 ms Delay */
// autogenerated using string template disenumpart2.txt

    _50_MS_DELAY (1205, "50 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 60 ms Delay */
// autogenerated using string template disenumpart2.txt

    _60_MS_DELAY (1206, "60 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 100 ms Delay */
// autogenerated using string template disenumpart2.txt

    _100_MS_DELAY (1210, "100 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 125 ms Delay */
// autogenerated using string template disenumpart2.txt

    _125_MS_DELAY (1212, "125 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 250 ms Delay */
// autogenerated using string template disenumpart2.txt

    _250_MS_DELAY (1225, "250 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 5 ms Delay */
// autogenerated using string template disenumpart2.txt

    _5_MS_DELAY (1250, "5 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 15 ms Delay */
// autogenerated using string template disenumpart2.txt

    _15_MS_DELAY (1251, "15 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 25 ms Delay */
// autogenerated using string template disenumpart2.txt

    _25_MS_DELAY (1252, "25 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 30 ms Delay */
// autogenerated using string template disenumpart2.txt

    _30_MS_DELAY (1253, "30 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 35 ms Delay */
// autogenerated using string template disenumpart2.txt

    _35_MS_DELAY (1254, "35 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 40 ms Delay */
// autogenerated using string template disenumpart2.txt

    _40_MS_DELAY (1255, "40 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 45 ms Delay */
// autogenerated using string template disenumpart2.txt

    _45_MS_DELAY (1256, "45 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 90 ms Delay */
// autogenerated using string template disenumpart2.txt

    _90_MS_DELAY (1257, "90 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 120 ms Delay */
// autogenerated using string template disenumpart2.txt

    _120_MS_DELAY (1258, "120 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 180 ms Delay */
// autogenerated using string template disenumpart2.txt

    _180_MS_DELAY (1259, "180 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 240 ms Delay */
// autogenerated using string template disenumpart2.txt

    _240_MS_DELAY (1260, "240 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Electronic (Oblique Contact) */
// autogenerated using string template disenumpart2.txt

    CONTACT_ELECTRONIC_OBLIQUE_CONTACT (1300, "Contact, Electronic (Oblique Contact)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Graze */
// autogenerated using string template disenumpart2.txt

    CONTACT_GRAZE (1400, "Contact, Graze"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Crush */
// autogenerated using string template disenumpart2.txt

    CONTACT_CRUSH (1500, "Contact, Crush"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Hydrostatic */
// autogenerated using string template disenumpart2.txt

    CONTACT_HYDROSTATIC (1600, "Contact, Hydrostatic"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Mechanical */
// autogenerated using string template disenumpart2.txt

    CONTACT_MECHANICAL (1700, "Contact, Mechanical"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Chemical */
// autogenerated using string template disenumpart2.txt

    CONTACT_CHEMICAL (1800, "Contact, Chemical"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Piezoelectric */
// autogenerated using string template disenumpart2.txt

    CONTACT_PIEZOELECTRIC (1900, "Contact, Piezoelectric"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Point Initiating */
// autogenerated using string template disenumpart2.txt

    CONTACT_POINT_INITIATING (1910, "Contact, Point Initiating"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Point Initiating, Base Detonating */
// autogenerated using string template disenumpart2.txt

    CONTACT_POINT_INITIATING_BASE_DETONATING (1920, "Contact, Point Initiating, Base Detonating"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Base Detonating */
// autogenerated using string template disenumpart2.txt

    CONTACT_BASE_DETONATING (1930, "Contact, Base Detonating"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Ballistic Cap and Base */
// autogenerated using string template disenumpart2.txt

    CONTACT_BALLISTIC_CAP_AND_BASE (1940, "Contact, Ballistic Cap and Base"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Base */
// autogenerated using string template disenumpart2.txt

    CONTACT_BASE (1950, "Contact, Base"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Nose */
// autogenerated using string template disenumpart2.txt

    CONTACT_NOSE (1960, "Contact, Nose"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Fitted in Standoff Probe */
// autogenerated using string template disenumpart2.txt

    CONTACT_FITTED_IN_STANDOFF_PROBE (1970, "Contact, Fitted in Standoff Probe"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Contact, Non-aligned */
// autogenerated using string template disenumpart2.txt

    CONTACT_NON_ALIGNED (1980, "Contact, Non-aligned"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed */
// autogenerated using string template disenumpart2.txt

    TIMED (2000, "Timed"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Programmable */
// autogenerated using string template disenumpart2.txt

    TIMED_PROGRAMMABLE (2100, "Timed, Programmable"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Burnout */
// autogenerated using string template disenumpart2.txt

    TIMED_BURNOUT (2200, "Timed, Burnout"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Pyrotechnic */
// autogenerated using string template disenumpart2.txt

    TIMED_PYROTECHNIC (2300, "Timed, Pyrotechnic"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Electronic */
// autogenerated using string template disenumpart2.txt

    TIMED_ELECTRONIC (2400, "Timed, Electronic"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Base Delay */
// autogenerated using string template disenumpart2.txt

    TIMED_BASE_DELAY (2500, "Timed, Base Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Reinforced Nose Impact Delay */
// autogenerated using string template disenumpart2.txt

    TIMED_REINFORCED_NOSE_IMPACT_DELAY (2600, "Timed, Reinforced Nose Impact Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Short Delay Impact */
// autogenerated using string template disenumpart2.txt

    TIMED_SHORT_DELAY_IMPACT (2700, "Timed, Short Delay Impact"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 10 ms Delay */
// autogenerated using string template disenumpart2.txt

    _10_MS_DELAY_2 (2701, "10 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 20 ms Delay */
// autogenerated using string template disenumpart2.txt

    _20_MS_DELAY_2 (2702, "20 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 50 ms Delay */
// autogenerated using string template disenumpart2.txt

    _50_MS_DELAY_2 (2705, "50 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 60 ms Delay */
// autogenerated using string template disenumpart2.txt

    _60_MS_DELAY_2 (2706, "60 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 100 ms Delay */
// autogenerated using string template disenumpart2.txt

    _100_MS_DELAY_2 (2710, "100 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 125 ms Delay */
// autogenerated using string template disenumpart2.txt

    _125_MS_DELAY_2 (2712, "125 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** 250 ms Delay */
// autogenerated using string template disenumpart2.txt

    _250_MS_DELAY_2 (2725, "250 ms Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Nose Mounted Variable Delay */
// autogenerated using string template disenumpart2.txt

    TIMED_NOSE_MOUNTED_VARIABLE_DELAY (2800, "Timed, Nose Mounted Variable Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Long Delay Side */
// autogenerated using string template disenumpart2.txt

    TIMED_LONG_DELAY_SIDE (2900, "Timed, Long Delay Side"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Selectable Delay */
// autogenerated using string template disenumpart2.txt

    TIMED_SELECTABLE_DELAY (2910, "Timed, Selectable Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Impact */
// autogenerated using string template disenumpart2.txt

    TIMED_IMPACT (2920, "Timed, Impact"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Timed, Sequence */
// autogenerated using string template disenumpart2.txt

    TIMED_SEQUENCE (2930, "Timed, Sequence"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Proximity */
// autogenerated using string template disenumpart2.txt

    PROXIMITY (3000, "Proximity"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Proximity, Active Laser */
// autogenerated using string template disenumpart2.txt

    PROXIMITY_ACTIVE_LASER (3100, "Proximity, Active Laser"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Proximity, Magnetic (Magpolarity) */
// autogenerated using string template disenumpart2.txt

    PROXIMITY_MAGNETIC_MAGPOLARITY (3200, "Proximity, Magnetic (Magpolarity)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Proximity, Active Radar (Doppler Radar) */
// autogenerated using string template disenumpart2.txt

    PROXIMITY_ACTIVE_RADAR_DOPPLER_RADAR (3300, "Proximity, Active Radar (Doppler Radar)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Proximity, Radio Frequency (RF) */
// autogenerated using string template disenumpart2.txt

    PROXIMITY_RADIO_FREQUENCY_RF (3400, "Proximity, Radio Frequency (RF)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Proximity, Programmable */
// autogenerated using string template disenumpart2.txt

    PROXIMITY_PROGRAMMABLE (3500, "Proximity, Programmable"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Proximity, Programmable, Prefragmented */
// autogenerated using string template disenumpart2.txt

    PROXIMITY_PROGRAMMABLE_PREFRAGMENTED (3600, "Proximity, Programmable, Prefragmented"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Proximity, Infrared */
// autogenerated using string template disenumpart2.txt

    PROXIMITY_INFRARED (3700, "Proximity, Infrared"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Command */
// autogenerated using string template disenumpart2.txt

    COMMAND (4000, "Command"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Command, Electronic, Remotely Set */
// autogenerated using string template disenumpart2.txt

    COMMAND_ELECTRONIC_REMOTELY_SET (4100, "Command, Electronic, Remotely Set"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Altitude */
// autogenerated using string template disenumpart2.txt

    ALTITUDE (5000, "Altitude"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Altitude, Radio Altimeter */
// autogenerated using string template disenumpart2.txt

    ALTITUDE_RADIO_ALTIMETER (5100, "Altitude, Radio Altimeter"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Altitude, Air Burst */
// autogenerated using string template disenumpart2.txt

    ALTITUDE_AIR_BURST (5200, "Altitude, Air Burst"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Depth */
// autogenerated using string template disenumpart2.txt

    DEPTH (6000, "Depth"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Acoustic */
// autogenerated using string template disenumpart2.txt

    ACOUSTIC (7000, "Acoustic"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Pressure */
// autogenerated using string template disenumpart2.txt

    PRESSURE (8000, "Pressure"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Pressure, Delay */
// autogenerated using string template disenumpart2.txt

    PRESSURE_DELAY (8010, "Pressure, Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Inert */
// autogenerated using string template disenumpart2.txt

    INERT (8100, "Inert"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Dummy */
// autogenerated using string template disenumpart2.txt

    DUMMY (8110, "Dummy"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Practice */
// autogenerated using string template disenumpart2.txt

    PRACTICE (8120, "Practice"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Plug Representing */
// autogenerated using string template disenumpart2.txt

    PLUG_REPRESENTING (8130, "Plug Representing"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Training */
// autogenerated using string template disenumpart2.txt

    TRAINING (8150, "Training"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Pyrotechnic */
// autogenerated using string template disenumpart2.txt

    PYROTECHNIC (9000, "Pyrotechnic"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Pyrotechnic, Delay */
// autogenerated using string template disenumpart2.txt

    PYROTECHNIC_DELAY (9010, "Pyrotechnic, Delay"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Electro-optical */
// autogenerated using string template disenumpart2.txt

    ELECTRO_OPTICAL (9100, "Electro-optical"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Electromechanical */
// autogenerated using string template disenumpart2.txt

    ELECTROMECHANICAL (9110, "Electromechanical"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Electromechanical, Nose */
// autogenerated using string template disenumpart2.txt

    ELECTROMECHANICAL_NOSE (9120, "Electromechanical, Nose"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Strikerless */
// autogenerated using string template disenumpart2.txt

    STRIKERLESS (9200, "Strikerless"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Strikerless, Nose Impact */
// autogenerated using string template disenumpart2.txt

    STRIKERLESS_NOSE_IMPACT (9210, "Strikerless, Nose Impact"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Strikerless, Compression-Ignition */
// autogenerated using string template disenumpart2.txt

    STRIKERLESS_COMPRESSION_IGNITION (9220, "Strikerless, Compression-Ignition"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Compression-Ignition */
// autogenerated using string template disenumpart2.txt

    COMPRESSION_IGNITION (9300, "Compression-Ignition"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Compression-Ignition, Strikerless, Nose Impact */
// autogenerated using string template disenumpart2.txt

    COMPRESSION_IGNITION_STRIKERLESS_NOSE_IMPACT (9310, "Compression-Ignition, Strikerless, Nose Impact"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Percussion */
// autogenerated using string template disenumpart2.txt

    PERCUSSION (9400, "Percussion"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Percussion, Instantaneous */
// autogenerated using string template disenumpart2.txt

    PERCUSSION_INSTANTANEOUS (9410, "Percussion, Instantaneous"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Electronic */
// autogenerated using string template disenumpart2.txt

    ELECTRONIC (9500, "Electronic"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Electronic, Internally Mounted */
// autogenerated using string template disenumpart2.txt

    ELECTRONIC_INTERNALLY_MOUNTED (9510, "Electronic, Internally Mounted"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Electronic, Range Setting */
// autogenerated using string template disenumpart2.txt

    ELECTRONIC_RANGE_SETTING (9520, "Electronic, Range Setting"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Electronic, Programmed */
// autogenerated using string template disenumpart2.txt

    ELECTRONIC_PROGRAMMED (9530, "Electronic, Programmed"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Mechanical */
// autogenerated using string template disenumpart2.txt

    MECHANICAL (9600, "Mechanical"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Mechanical, Nose */
// autogenerated using string template disenumpart2.txt

    MECHANICAL_NOSE (9610, "Mechanical, Nose"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Mechanical, Tail */
// autogenerated using string template disenumpart2.txt

    MECHANICAL_TAIL (9620, "Mechanical, Tail"),;

// autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    MunitionDescriptorFuse(int value, String description)
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
      return 16;
    }

    /** provide enumeration for a given value
     * @param i integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static MunitionDescriptorFuse getEnumForValue(int i)
    {
       for(MunitionDescriptorFuse val: MunitionDescriptorFuse.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No enumeration found for value " + i + " of enumeration MunitionDescriptorFuse");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

// autogenerated using string template disenumpart3_16.txt

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output
     * @throws IOException input-output error */
    public void marshal(ByteBuffer byteBuffer) throws Exception
    {
        byteBuffer.putShort((short)getValue());
    }
    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static MunitionDescriptorFuse unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static MunitionDescriptorFuse unmarshalEnum (ByteBuffer byteBuffer) throws Exception
    {
        return getEnumForValue(byteBuffer.getShort());
    }   

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
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
        return "MunitionDescriptorFuse " + getValue() + " " + name(); 
    }
}
