/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 310,
 * marshal size 16;
 * ExplosiveMaterialCategories has 45 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum ExplosiveMaterialCategories 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** No Statement */
    // autogenerated using string template disenumpart2.txt
    NO_STATEMENT (0, "No Statement"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** AVGAS (Aviation Gas) */
    // autogenerated using string template disenumpart2.txt
    AVGAS_AVIATION_GAS (10, "AVGAS (Aviation Gas)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Jet Fuel (Unspecified) */
    // autogenerated using string template disenumpart2.txt
    JET_FUEL_UNSPECIFIED (11, "Jet Fuel (Unspecified)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JP-4 (F-40/JET B) */
    // autogenerated using string template disenumpart2.txt
    JP_4_F_40_JET_B (12, "JP-4 (F-40/JET B)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JP-5 (F-44/JET A) */
    // autogenerated using string template disenumpart2.txt
    JP_5_F_44_JET_A (13, "JP-5 (F-44/JET A)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JP-7 */
    // autogenerated using string template disenumpart2.txt
    JP_7 (14, "JP-7"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JP-8 (F-34/JET A-1) */
    // autogenerated using string template disenumpart2.txt
    JP_8_F_34_JET_A_1 (15, "JP-8 (F-34/JET A-1)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JP-10 Missile Fuel */
    // autogenerated using string template disenumpart2.txt
    JP_10_MISSILE_FUEL (16, "JP-10 Missile Fuel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** JPTS */
    // autogenerated using string template disenumpart2.txt
    JPTS (17, "JPTS"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Jet A */
    // autogenerated using string template disenumpart2.txt
    JET_A (18, "Jet A"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Jet A-1 */
    // autogenerated using string template disenumpart2.txt
    JET_A_1 (19, "Jet A-1"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Jet B */
    // autogenerated using string template disenumpart2.txt
    JET_B (20, "Jet B"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Jet Biofuel */
    // autogenerated using string template disenumpart2.txt
    JET_BIOFUEL (21, "Jet Biofuel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gasoline/Petrol (Unspecified Octane) */
    // autogenerated using string template disenumpart2.txt
    GASOLINE_PETROL_UNSPECIFIED_OCTANE (151, "Gasoline/Petrol (Unspecified Octane)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Diesel Fuel (Unspecified Grade) */
    // autogenerated using string template disenumpart2.txt
    DIESEL_FUEL_UNSPECIFIED_GRADE (152, "Diesel Fuel (Unspecified Grade)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Ethanol */
    // autogenerated using string template disenumpart2.txt
    ETHANOL (153, "Ethanol"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** E85 Ethanol */
    // autogenerated using string template disenumpart2.txt
    E85_ETHANOL (154, "E85 Ethanol"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Fuel Oil */
    // autogenerated using string template disenumpart2.txt
    FUEL_OIL (155, "Fuel Oil"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Kerosene */
    // autogenerated using string template disenumpart2.txt
    KEROSENE (156, "Kerosene"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Crude Oil (Unspecified) */
    // autogenerated using string template disenumpart2.txt
    CRUDE_OIL_UNSPECIFIED (157, "Crude Oil (Unspecified)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Light Crude Oil */
    // autogenerated using string template disenumpart2.txt
    LIGHT_CRUDE_OIL (158, "Light Crude Oil"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Liquid Petroleum Gas (LPG) */
    // autogenerated using string template disenumpart2.txt
    LIQUID_PETROLEUM_GAS_LPG (159, "Liquid Petroleum Gas (LPG)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** RP-1 Rocket Fuel */
    // autogenerated using string template disenumpart2.txt
    RP_1_ROCKET_FUEL (160, "RP-1 Rocket Fuel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** LH-2 Rocket Fuel */
    // autogenerated using string template disenumpart2.txt
    LH_2_ROCKET_FUEL (161, "LH-2 Rocket Fuel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** LOX Rocket Fuel */
    // autogenerated using string template disenumpart2.txt
    LOX_ROCKET_FUEL (162, "LOX Rocket Fuel"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Alcohol */
    // autogenerated using string template disenumpart2.txt
    ALCOHOL (164, "Alcohol"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Hydrogen (Liquid) */
    // autogenerated using string template disenumpart2.txt
    HYDROGEN_LIQUID (166, "Hydrogen (Liquid)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Nitroglycerin (NG) */
    // autogenerated using string template disenumpart2.txt
    NITROGLYCERIN_NG (301, "Nitroglycerin (NG)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** ANFO */
    // autogenerated using string template disenumpart2.txt
    ANFO (302, "ANFO"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dynamite */
    // autogenerated using string template disenumpart2.txt
    DYNAMITE (451, "Dynamite"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** TNT */
    // autogenerated using string template disenumpart2.txt
    TNT (452, "TNT"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** RDX */
    // autogenerated using string template disenumpart2.txt
    RDX (453, "RDX"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** PETN */
    // autogenerated using string template disenumpart2.txt
    PETN (454, "PETN"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** HMX */
    // autogenerated using string template disenumpart2.txt
    HMX (455, "HMX"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** C-4 */
    // autogenerated using string template disenumpart2.txt
    C_4 (456, "C-4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Composition C-4 */
    // autogenerated using string template disenumpart2.txt
    COMPOSITION_C_4 (457, "Composition C-4"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Natural Gas (NG) */
    // autogenerated using string template disenumpart2.txt
    NATURAL_GAS_NG (601, "Natural Gas (NG)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Butane */
    // autogenerated using string template disenumpart2.txt
    BUTANE (602, "Butane"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Propane */
    // autogenerated using string template disenumpart2.txt
    PROPANE (603, "Propane"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Helium */
    // autogenerated using string template disenumpart2.txt
    HELIUM (604, "Helium"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Hydrogen (Gaseous) */
    // autogenerated using string template disenumpart2.txt
    HYDROGEN_GASEOUS (605, "Hydrogen (Gaseous)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Dust (Unspecified Type) */
    // autogenerated using string template disenumpart2.txt
    DUST_UNSPECIFIED_TYPE (801, "Dust (Unspecified Type)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Grain Dust */
    // autogenerated using string template disenumpart2.txt
    GRAIN_DUST (802, "Grain Dust"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Flour Dust */
    // autogenerated using string template disenumpart2.txt
    FLOUR_DUST (803, "Flour Dust"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sugar Dust */
    // autogenerated using string template disenumpart2.txt
    SUGAR_DUST (804, "Sugar Dust");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    ExplosiveMaterialCategories(int value, String description)
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
    public static ExplosiveMaterialCategories getEnumForValue(int value)
    {
       for (ExplosiveMaterialCategories nextEnum : ExplosiveMaterialCategories.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum ExplosiveMaterialCategories");
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
    public static ExplosiveMaterialCategories unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static ExplosiveMaterialCategories unmarshalEnum (ByteBuffer byteBuffer) throws Exception
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
   * Provide name
   * @return  name
   */
    public String getName()
    {
        return name();
    }

  /**
   * Provide simple identifier
   * @return ID number and name
   */
    @Override
    public String toString()
    {
        return "ExplosiveMaterialCategories " + getValue() + " " + name(); 
    }
}
