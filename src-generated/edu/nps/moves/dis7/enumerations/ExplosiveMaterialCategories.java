package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 310 marshal size 16<br>
 * Explosive Material Categories
 */
public enum ExplosiveMaterialCategories 
{
    /** No Statement */
    NO_STATEMENT (0, "No Statement"),
    /** AVGAS (Aviation Gas) */
    AVGAS_AVIATION_GAS (10, "AVGAS (Aviation Gas)"),
    /** Jet Fuel (Unspecified) */
    JET_FUEL_UNSPECIFIED (11, "Jet Fuel (Unspecified)"),
    /** JP-4 (F-40/JET B) */
    JP_4_F_40_JET_B (12, "JP-4 (F-40/JET B)"),
    /** JP-5 (F-44/JET A) */
    JP_5_F_44_JET_A (13, "JP-5 (F-44/JET A)"),
    /** JP-7 */
    JP_7 (14, "JP-7"),
    /** JP-8 (F-34/JET A-1) */
    JP_8_F_34_JET_A_1 (15, "JP-8 (F-34/JET A-1)"),
    /** JP-10 Missile Fuel */
    JP_10_MISSILE_FUEL (16, "JP-10 Missile Fuel"),
    /** JPTS */
    JPTS (17, "JPTS"),
    /** Jet A */
    JET_A (18, "Jet A"),
    /** Jet A-1 */
    JET_A_1 (19, "Jet A-1"),
    /** Jet B */
    JET_B (20, "Jet B"),
    /** Jet Biofuel */
    JET_BIOFUEL (21, "Jet Biofuel"),
    /** Gasoline/Petrol (Unspecified Octane) */
    GASOLINE_PETROL_UNSPECIFIED_OCTANE (151, "Gasoline/Petrol (Unspecified Octane)"),
    /** Diesel Fuel (Unspecified Grade) */
    DIESEL_FUEL_UNSPECIFIED_GRADE (152, "Diesel Fuel (Unspecified Grade)"),
    /** Ethanol */
    ETHANOL (153, "Ethanol"),
    /** E85 Ethanol */
    E85_ETHANOL (154, "E85 Ethanol"),
    /** Fuel Oil */
    FUEL_OIL (155, "Fuel Oil"),
    /** Kerosene */
    KEROSENE (156, "Kerosene"),
    /** Crude Oil (Unspecified) */
    CRUDE_OIL_UNSPECIFIED (157, "Crude Oil (Unspecified)"),
    /** Light Crude Oil */
    LIGHT_CRUDE_OIL (158, "Light Crude Oil"),
    /** Liquid Petroleum Gas (LPG) */
    LIQUID_PETROLEUM_GAS_LPG (159, "Liquid Petroleum Gas (LPG)"),
    /** RP-1 Rocket Fuel */
    RP_1_ROCKET_FUEL (160, "RP-1 Rocket Fuel"),
    /** LH-2 Rocket Fuel */
    LH_2_ROCKET_FUEL (161, "LH-2 Rocket Fuel"),
    /** LOX Rocket Fuel */
    LOX_ROCKET_FUEL (162, "LOX Rocket Fuel"),
    /** Alcohol */
    ALCOHOL (164, "Alcohol"),
    /** Hydrogen (Liquid) */
    HYDROGEN_LIQUID (166, "Hydrogen (Liquid)"),
    /** Nitroglycerin (NG) */
    NITROGLYCERIN_NG (301, "Nitroglycerin (NG)"),
    /** ANFO */
    ANFO (302, "ANFO"),
    /** Dynamite */
    DYNAMITE (451, "Dynamite"),
    /** TNT */
    TNT (452, "TNT"),
    /** RDX */
    RDX (453, "RDX"),
    /** PETN */
    PETN (454, "PETN"),
    /** HMX */
    HMX (455, "HMX"),
    /** C-4 */
    C_4 (456, "C-4"),
    /** Composition C-4 */
    COMPOSITION_C_4 (457, "Composition C-4"),
    /** Natural Gas (NG) */
    NATURAL_GAS_NG (601, "Natural Gas (NG)"),
    /** Butane */
    BUTANE (602, "Butane"),
    /** Propane */
    PROPANE (603, "Propane"),
    /** Helium */
    HELIUM (604, "Helium"),
    /** Hydrogen (Gaseous) */
    HYDROGEN_GASEOUS (605, "Hydrogen (Gaseous)"),
    /** Dust (Unspecified Type) */
    DUST_UNSPECIFIED_TYPE (801, "Dust (Unspecified Type)"),
    /** Grain Dust */
    GRAIN_DUST (802, "Grain Dust"),
    /** Flour Dust */
    FLOUR_DUST (803, "Flour Dust"),
    /** Sugar Dust */
    SUGAR_DUST (804, "Sugar Dust");

    private int value;
    private final String description;

    ExplosiveMaterialCategories(int value, String description)
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

    public static ExplosiveMaterialCategories getEnumForValue(int i)
    {
       for(ExplosiveMaterialCategories val: ExplosiveMaterialCategories.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration ExplosiveMaterialCategories");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeShort(getValue());
    }

    public void marshal(ByteBuffer buff) throws Exception
    {
        buff.putShort((short)getValue());
    }

    public static ExplosiveMaterialCategories unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue((int)dis.readUnsignedShort());
    } 

    public static ExplosiveMaterialCategories unmarshalEnum (ByteBuffer buff) throws Exception
    {
        return getEnumForValue((int)buff.getShort());
    }   

    public int getMarshalledSize()
    {
        return 2; // 16 bits
    }
    
    @Override
    public String toString()
    {
        return "ExplosiveMaterialCategories: " + name() + ": " + getValue(); 
    }
}
