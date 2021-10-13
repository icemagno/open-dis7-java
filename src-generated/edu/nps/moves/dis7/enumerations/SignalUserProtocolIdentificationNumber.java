// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 177,
 * marshal size 32;
 * SignalUserProtocolIdentificationNumber has 35 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum SignalUserProtocolIdentificationNumber 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** CCSIL */
    // autogenerated using string template disenumpart2.txt
    CCSIL (1, "CCSIL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** A2ATD SINCGARS ERF */
    // autogenerated using string template disenumpart2.txt
    A2ATD_SINCGARS_ERF (5, "A2ATD SINCGARS ERF"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** A2ATD CAC2 */
    // autogenerated using string template disenumpart2.txt
    A2ATD_CAC2 (6, "A2ATD CAC2"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Battle Command */
    // autogenerated using string template disenumpart2.txt
    BATTLE_COMMAND (20, "Battle Command"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AFIWC IADS Track Report */
    // autogenerated using string template disenumpart2.txt
    SUPPLEMENTAL_EMISSION_ENTITY_STATE (30, "AFIWC IADS Track Report"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AFIWC IADS Comm C2 Message */
    // autogenerated using string template disenumpart2.txt
    AFIWC_IADS_COMM_C2_MESSAGE (31, "AFIWC IADS Comm C2 Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AFIWC IADS Ground Control Interceptor (GCI) Command */
    // autogenerated using string template disenumpart2.txt
    AFIWC_IADS_GROUND_CONTROL_INTERCEPTOR_GCI_COMMAND (32, "AFIWC IADS Ground Control Interceptor (GCI) Command"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AFIWC Voice Text Message */
    // autogenerated using string template disenumpart2.txt
    AFIWC_VOICE_TEXT_MESSAGE (35, "AFIWC Voice Text Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ModSAF Text Radio */
    // autogenerated using string template disenumpart2.txt
    MODSAF_TEXT_RADIO (177, "ModSAF Text Radio"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CCTT SINCGARS ERF-LOCKOUT */
    // autogenerated using string template disenumpart2.txt
    CCTT_SINCGARS_ERF_LOCKOUT (200, "CCTT SINCGARS ERF-LOCKOUT"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CCTT SINCGARS ERF-HOPSET */
    // autogenerated using string template disenumpart2.txt
    CCTT_SINCGARS_ERF_HOPSET (201, "CCTT SINCGARS ERF-HOPSET"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CCTT SINCGARS OTAR */
    // autogenerated using string template disenumpart2.txt
    CCTT_SINCGARS_OTAR (202, "CCTT SINCGARS OTAR"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CCTT SINCGARS DATA */
    // autogenerated using string template disenumpart2.txt
    CCTT_SINCGARS_DATA (203, "CCTT SINCGARS DATA"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ModSAF FWA Forward Air Controller */
    // autogenerated using string template disenumpart2.txt
    MODSAF_FWA_FORWARD_AIR_CONTROLLER (546, "ModSAF FWA Forward Air Controller"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ModSAF Threat ADA C3 */
    // autogenerated using string template disenumpart2.txt
    MODSAF_THREAT_ADA_C3 (832, "ModSAF Threat ADA C3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** F-16 MTC AFAPD Protocol */
    // autogenerated using string template disenumpart2.txt
    F_16_MTC_AFAPD_PROTOCOL (1000, "F-16 MTC AFAPD Protocol"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** F-16 MTC IDL Protocol */
    // autogenerated using string template disenumpart2.txt
    F_16_MTC_IDL_PROTOCOL (1100, "F-16 MTC IDL Protocol"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Automatic Identification System (AIS) */
    // autogenerated using string template disenumpart2.txt
    AUTOMATIC_IDENTIFICATION_SYSTEM_AIS (1371, "Automatic Identification System (AIS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ModSAF Artillery Fire Control */
    // autogenerated using string template disenumpart2.txt
    MODSAF_ARTILLERY_FIRE_CONTROL (4570, "ModSAF Artillery Fire Control"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AGTS */
    // autogenerated using string template disenumpart2.txt
    AGTS (5361, "AGTS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GC3 */
    // autogenerated using string template disenumpart2.txt
    GC3 (6000, "GC3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** WNCP data */
    // autogenerated using string template disenumpart2.txt
    WNCP_DATA (6010, "WNCP data"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Spoken text message */
    // autogenerated using string template disenumpart2.txt
    SPOKEN_TEXT_MESSAGE (6020, "Spoken text message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Longbow IDM message */
    // autogenerated using string template disenumpart2.txt
    LONGBOW_IDM_MESSAGE (6661, "Longbow IDM message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Comanche IDM message */
    // autogenerated using string template disenumpart2.txt
    COMANCHE_IDM_MESSAGE (6662, "Comanche IDM message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Longbow Airborne TACFIRE Message */
    // autogenerated using string template disenumpart2.txt
    LONGBOW_AIRBORNE_TACFIRE_MESSAGE (6663, "Longbow Airborne TACFIRE Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Longbow Ground TACFIRE Message */
    // autogenerated using string template disenumpart2.txt
    LONGBOW_GROUND_TACFIRE_MESSAGE (6664, "Longbow Ground TACFIRE Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Longbow AFAPD Message */
    // autogenerated using string template disenumpart2.txt
    LONGBOW_AFAPD_MESSAGE (6665, "Longbow AFAPD Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Longbow ERF message */
    // autogenerated using string template disenumpart2.txt
    LONGBOW_ERF_MESSAGE (6666, "Longbow ERF message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** VMF IDM */
    // autogenerated using string template disenumpart2.txt
    VMF_IDM (7000, "VMF IDM"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CSAR Radio Survivor Message */
    // autogenerated using string template disenumpart2.txt
    CSAR_RADIO_SURVIVOR_MESSAGE (7010, "CSAR Radio Survivor Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CSAR Radio Interrogator Message */
    // autogenerated using string template disenumpart2.txt
    CSAR_RADIO_INTERROGATOR_MESSAGE (7020, "CSAR Radio Interrogator Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Image File Transfer Message */
    // autogenerated using string template disenumpart2.txt
    IMAGE_FILE_TRANSFER_MESSAGE (7030, "Image File Transfer Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Geotag Data Message */
    // autogenerated using string template disenumpart2.txt
    GEOTAG_DATA_MESSAGE (7040, "Geotag Data Message"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Tactical Video Regeneration Data */
    // autogenerated using string template disenumpart2.txt
    TACTICAL_VIDEO_REGENERATION_DATA (7050, "Tactical Video Regeneration Data");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    SignalUserProtocolIdentificationNumber(int value, String description)
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
      return 32;
    }

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static SignalUserProtocolIdentificationNumber getEnumForValue(int value)
    {
       for (SignalUserProtocolIdentificationNumber nextEnum : SignalUserProtocolIdentificationNumber.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum SignalUserProtocolIdentificationNumber");
       System.err.flush(); // ensure contiguous console outputs
       return null;
    }

    // autogenerated using string template disenumpart3_32.txt

    /** Marshal value to DataOutputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dos DataOutputStream for output
     * @throws IOException input-output error */
    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeInt(getValue());
    }

    /** Marshal value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for output */
    public void marshal(ByteBuffer byteBuffer)
    {
        byteBuffer.putInt(getValue());
    }

    /** Unmarshal value to DataInputStream
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param dis DataInputStream for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static SignalUserProtocolIdentificationNumber unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readInt());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @return enumeration of interest */
    public static SignalUserProtocolIdentificationNumber unmarshalEnum (ByteBuffer byteBuffer)
    {
        return getEnumForValue(byteBuffer.getInt());
    }

  /**
   * Returns size of this serialized (marshalled) object in bytes
   * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
   * @return serialized size in bytes
   */
    public int getMarshalledSize()
    {
        return 4; // 32 bits
    }
    
    @Override
    public String toString()
    {
        return "SignalUserProtocolIdentificationNumber: " + getValue() + " " + name();
    }
}
