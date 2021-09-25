// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 80,
 * marshal size 16;
 * DesignatorSystemName has 91 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum DesignatorSystemName 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Not Specified */
    // autogenerated using string template disenumpart2.txt
    NOT_SPECIFIED (0, "Not Specified"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-4 */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_4 (1000, "AN/AAQ-4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-7 */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_7 (1100, "AN/AAQ-7"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-8 */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_8 (1200, "AN/AAQ-8"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-14 LANTIRN */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_14_LANTIRN (1300, "AN/AAQ-14 LANTIRN"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-19 */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_19 (1400, "AN/AAQ-19"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-22A; SAFIRE */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_22A_SAFIRE (1500, "AN/AAQ-22A; SAFIRE"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-22B; SAFIRE LP */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_22B_SAFIRE_LP (1600, "AN/AAQ-22B; SAFIRE LP"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-22C; Star SAFIRE I */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_22C_STAR_SAFIRE_I (1700, "AN/AAQ-22C; Star SAFIRE I"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-22D; BRITE Star */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_22D_BRITE_STAR (1800, "AN/AAQ-22D; BRITE Star"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-24(V) DIRCM; Nemesis */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_24V_DIRCM_NEMESIS (1900, "AN/AAQ-24(V) DIRCM; Nemesis"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-25 LTS */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_25_LTS (2000, "AN/AAQ-25 LTS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-28(V) LITENING II */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_28V_LITENING_II (2100, "AN/AAQ-28(V) LITENING II"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-30 */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_30 (2200, "AN/AAQ-30"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-32 */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_32 (2300, "AN/AAQ-32"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-33; Sniper */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_33_SNIPER (2400, "AN/AAQ-33; Sniper"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-37 */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_37 (2500, "AN/AAQ-37"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-38 */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_38 (2600, "AN/AAQ-38"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-32 */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_32 (2700, "AN/AAS-32"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-35V */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_35V (2800, "AN/AAS-35V"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-37 */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_37 (2900, "AN/AAS-37"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-38 */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_38 (3000, "AN/AAS-38"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-44(V) */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_44V (3100, "AN/AAS-44(V)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-46 */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_46 (3200, "AN/AAS-46"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-49 */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_49 (3300, "AN/AAS-49"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-51 */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_51 (3400, "AN/AAS-51"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-52; MTS-A */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_52_MTS_A (3500, "AN/AAS-52; MTS-A"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/ALQ-10 */
    // autogenerated using string template disenumpart2.txt
    AN_ALQ_10 (3600, "AN/ALQ-10"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/ASQ-228 */
    // autogenerated using string template disenumpart2.txt
    AN_ASQ_228 (3700, "AN/ASQ-228"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AVQ-25 */
    // autogenerated using string template disenumpart2.txt
    AN_AVQ_25 (4400, "AN/AVQ-25"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AVQ-26 */
    // autogenerated using string template disenumpart2.txt
    AN_AVQ_26 (4500, "AN/AVQ-26"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/GVS-5 */
    // autogenerated using string template disenumpart2.txt
    AN_GVS_5 (4600, "AN/GVS-5"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/PED-1 LLDR */
    // autogenerated using string template disenumpart2.txt
    AN_PED_1_LLDR (4700, "AN/PED-1 LLDR"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TADS LRF/D */
    // autogenerated using string template disenumpart2.txt
    TADS_LRF_D (4800, "TADS LRF/D"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** MMS LRF/D */
    // autogenerated using string template disenumpart2.txt
    MMS_LRF_D (4900, "MMS LRF/D"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AH-1 C-NITE */
    // autogenerated using string template disenumpart2.txt
    AH_1_C_NITE (5000, "AH-1 C-NITE"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** MATES */
    // autogenerated using string template disenumpart2.txt
    MATES (5100, "MATES"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TCV 115 */
    // autogenerated using string template disenumpart2.txt
    TCV_115 (5200, "TCV 115"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TIM */
    // autogenerated using string template disenumpart2.txt
    TIM (5300, "TIM"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TMS 303 */
    // autogenerated using string template disenumpart2.txt
    TMS_303 (5400, "TMS 303"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TMY 303 */
    // autogenerated using string template disenumpart2.txt
    TMY_303 (5500, "TMY 303"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ALRAD */
    // autogenerated using string template disenumpart2.txt
    ALRAD (5600, "ALRAD"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** RFTDL */
    // autogenerated using string template disenumpart2.txt
    RFTDL (5700, "RFTDL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** VVLR */
    // autogenerated using string template disenumpart2.txt
    VVLR (5800, "VVLR"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** P0705 HELL */
    // autogenerated using string template disenumpart2.txt
    P0705_HELL (6000, "P0705 HELL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** P0708 PULSE */
    // autogenerated using string template disenumpart2.txt
    P0708_PULSE (6100, "P0708 PULSE"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HELD */
    // autogenerated using string template disenumpart2.txt
    HELD (6200, "HELD"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TYPE 105 */
    // autogenerated using string template disenumpart2.txt
    TYPE_105 (6300, "TYPE 105"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TYPE 118 */
    // autogenerated using string template disenumpart2.txt
    TYPE_118 (6400, "TYPE 118"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TYPE 121 */
    // autogenerated using string template disenumpart2.txt
    TYPE_121 (6500, "TYPE 121"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TYPE 126 */
    // autogenerated using string template disenumpart2.txt
    TYPE_126 (6600, "TYPE 126"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TYPE 629 */
    // autogenerated using string template disenumpart2.txt
    TYPE_629 (6700, "TYPE 629"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CLDS */
    // autogenerated using string template disenumpart2.txt
    CLDS (6800, "CLDS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TAV-38 */
    // autogenerated using string template disenumpart2.txt
    TAV_38 (6900, "TAV-38"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TMV 630 */
    // autogenerated using string template disenumpart2.txt
    TMV_630 (7000, "TMV 630"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ALTM 1020 */
    // autogenerated using string template disenumpart2.txt
    ALTM_1020 (7100, "ALTM 1020"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ALATS */
    // autogenerated using string template disenumpart2.txt
    ALATS (7200, "ALATS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dark Star/LAMPS */
    // autogenerated using string template disenumpart2.txt
    DARK_STAR_LAMPS (7300, "Dark Star/LAMPS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** GLTD II */
    // autogenerated using string template disenumpart2.txt
    GLTD_II (7400, "GLTD II"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** MBT-ELRF */
    // autogenerated using string template disenumpart2.txt
    MBT_ELRF (7500, "MBT-ELRF"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Mark VII */
    // autogenerated using string template disenumpart2.txt
    MARK_VII (7600, "Mark VII"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** SIRE V */
    // autogenerated using string template disenumpart2.txt
    SIRE_V (7700, "SIRE V"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-16B */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_16B (7800, "AN/AAQ-16B"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-16D; AESOP */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_16D_AESOP (7900, "AN/AAQ-16D; AESOP"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-21; Star SAFIRE III */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_21_STAR_SAFIRE_III (8000, "AN/AAQ-21; Star SAFIRE III"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-22E; BRITE Star */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_22E_BRITE_STAR (8100, "AN/AAQ-22E; BRITE Star"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAQ-36; Star SAFIRE II */
    // autogenerated using string template disenumpart2.txt
    AN_AAQ_36_STAR_SAFIRE_II (8200, "AN/AAQ-36; Star SAFIRE II"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-38A; Nite Hawk */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_38A_NITE_HAWK (8300, "AN/AAS-38A; Nite Hawk"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-38B; Nite Hawk */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_38B_NITE_HAWK (8400, "AN/AAS-38B; Nite Hawk"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-44C(V) */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_44CV (8500, "AN/AAS-44C(V)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/AAS-53; CSP */
    // autogenerated using string template disenumpart2.txt
    AN_AAS_53_CSP (8600, "AN/AAS-53; CSP"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/ASQ-28 ATFLIR */
    // autogenerated using string template disenumpart2.txt
    AN_ASQ_28_ATFLIR (8700, "AN/ASQ-28 ATFLIR"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/DAS-1; MTS-B */
    // autogenerated using string template disenumpart2.txt
    AN_DAS_1_MTS_B (8800, "AN/DAS-1; MTS-B"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/PAQ-1 LTD */
    // autogenerated using string template disenumpart2.txt
    AN_PAQ_1_LTD (8900, "AN/PAQ-1 LTD"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/PAQ-3 MULE */
    // autogenerated using string template disenumpart2.txt
    AN_PAQ_3_MULE (9000, "AN/PAQ-3 MULE"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/PEQ-1; SOFLAM */
    // autogenerated using string template disenumpart2.txt
    AN_PEQ_1_SOFLAM (9090, "AN/PEQ-1; SOFLAM"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/PEQ-3 */
    // autogenerated using string template disenumpart2.txt
    AN_PEQ_3 (9100, "AN/PEQ-3"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/PEQ-15; ATPIAL */
    // autogenerated using string template disenumpart2.txt
    AN_PEQ_15_ATPIAL (9140, "AN/PEQ-15; ATPIAL"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/PEQ-18; IZLID 1000P */
    // autogenerated using string template disenumpart2.txt
    AN_PEQ_18_IZLID_1000P (9150, "AN/PEQ-18; IZLID 1000P"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/TVQ-2 G/VLLD */
    // autogenerated using string template disenumpart2.txt
    AN_TVQ_2_G_VLLD (9200, "AN/TVQ-2 G/VLLD"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/ZSQ-2(V)1 EOS */
    // autogenerated using string template disenumpart2.txt
    AN_ZSQ_2V1_EOS (9300, "AN/ZSQ-2(V)1 EOS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AN/ZSQ-2(V)2 EOS */
    // autogenerated using string template disenumpart2.txt
    AN_ZSQ_2V2_EOS (9400, "AN/ZSQ-2(V)2 EOS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CIRCM */
    // autogenerated using string template disenumpart2.txt
    CIRCM (9500, "CIRCM"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Guardian */
    // autogenerated using string template disenumpart2.txt
    GUARDIAN (9600, "Guardian"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** IZLID 200P */
    // autogenerated using string template disenumpart2.txt
    IZLID_200P (9700, "IZLID 200P"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** IZLID 1000P-W */
    // autogenerated using string template disenumpart2.txt
    IZLID_1000P_W (9800, "IZLID 1000P-W"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** MMS */
    // autogenerated using string template disenumpart2.txt
    MMS (9900, "MMS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** M-TADS/PNVS; Arrowhead */
    // autogenerated using string template disenumpart2.txt
    M_TADS_PNVS_ARROWHEAD (10000, "M-TADS/PNVS; Arrowhead"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** RBS-70 */
    // autogenerated using string template disenumpart2.txt
    RBS_70 (10100, "RBS-70"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** RBS-90 */
    // autogenerated using string template disenumpart2.txt
    RBS_90 (10200, "RBS-90"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TADS/PNVS */
    // autogenerated using string template disenumpart2.txt
    TADS_PNVS (10300, "TADS/PNVS");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    DesignatorSystemName(int value, String description)
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

    /** 
     * Provide enumeration for a given value
     * @param value integer value of interest
     * @return enumeration corresponding to numeric value
     */
    public static DesignatorSystemName getEnumForValue(int value)
    {
       for (DesignatorSystemName nextEnum : DesignatorSystemName.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum DesignatorSystemName");
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
    public static DesignatorSystemName unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static DesignatorSystemName unmarshalEnum (ByteBuffer byteBuffer) throws Exception
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
        return "DesignatorSystemName " + getValue() + " " + name(); 
    }
}
