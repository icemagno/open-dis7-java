package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.*;

/**
 * Generated from XML, SISO-REF-010-v25, 2018-08-29<br>
 * UID 18 marshal size 8<br>
 * Life Forms-Subcategory-U.K. Weapons
 */
public enum LifeFormsSubcategoryUKWeapons implements SubCategory
{
    /** LAW 80 */
    LAW_80 (1, "LAW 80"),
    /** Blowpipe */
    BLOWPIPE (2, "Blowpipe"),
    /** Javelin */
    JAVELIN (3, "Javelin"),
    /** 51-mm mortar */
    $51_MM_MORTAR (4, "51-mm mortar"),
    /** SLR 7.62-mm rifle */
    SLR_762_MM_RIFLE (5, "SLR 7.62-mm rifle"),
    /** Sterling 9-mm submachine gun */
    STERLING_9_MM_SUBMACHINE_GUN (6, "Sterling 9-mm submachine gun"),
    /** L7A2 general purpose MG */
    L7A2_GENERAL_PURPOSE_MG (7, "L7A2 general purpose MG"),
    /** L6 Wombat Recoilless rifle, */
    L6_WOMBAT_RECOILLESS_RIFLE_ (8, "L6 Wombat Recoilless rifle,"),
    /** Carl Gustav 89-mm recoilless rifle */
    CARL_GUSTAV_89_MM_RECOILLESS_RIFLE (9, "Carl Gustav 89-mm recoilless rifle"),
    /** SA80 Individual/light support weapon */
    SA80_INDIVIDUAL_LIGHT_SUPPORT_WEAPON (10, "SA80 Individual/light support weapon"),
    /** Trigat */
    TRIGAT (11, "Trigat"),
    /** Milan AT missile */
    MILAN_AT_MISSILE (12, "Milan AT missile");

    private int value;
    private final String description;

    LifeFormsSubcategoryUKWeapons(int value, String description)
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
      return 8;
    }

    public static LifeFormsSubcategoryUKWeapons getEnumForValue(int i)
    {
       for(LifeFormsSubcategoryUKWeapons val: LifeFormsSubcategoryUKWeapons.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.err.println("No enumeration found for value " + i + " of enumeration LifeFormsSubcategoryUKWeapons");
       return null;
    }


    public void marshal(DataOutputStream dos) throws IOException
    {
        dos.writeByte(getValue());
    }
    
    public void marshal(ByteBuffer buff) throws Exception
    {
        buff.put((byte)getValue());
    }

    public static LifeFormsSubcategoryUKWeapons unmarshalEnum (DataInputStream dis) throws Exception
    {
       /* try {
            value = dis.readUnsignedByte();
        }
        catch(IOException ex) {
            showError(ex);
        } */
        
        return getEnumForValue((int)dis.readByte());
    } 

    public static LifeFormsSubcategoryUKWeapons unmarshalEnum(ByteBuffer buff) throws Exception
    {
        /*
        try {
            value = (int)buff.get();
        }
        catch(Exception ex) {
            showError(ex);
        }
        */
        return getEnumForValue((int)buff.get());
    }

    public int getMarshalledSize()
    {
        return 1; // 8 bits
    }
    
    @Override
    public String toString()
    {
        return "LifeFormsSubcategoryUKWeapons: " + name() + ": " + getValue(); 
    }
}
