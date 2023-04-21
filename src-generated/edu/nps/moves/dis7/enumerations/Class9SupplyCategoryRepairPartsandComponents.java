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
 *  UID 609,
 * marshal size 8;
 * Class9SupplyCategoryRepairPartsandComponents has 10 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum Class9SupplyCategoryRepairPartsandComponents implements Category
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

    /** D - Admin Vehicles */
    // autogenerated using string template disenumpart2.txt
    D_ADMIN_VEHICLES (4, "D - Admin Vehicles"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** G - Electronics */
    // autogenerated using string template disenumpart2.txt
    G_ELECTRONICS (5, "G - Electronics"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** K - Tactical Vehicles, Any repair part for a modelled function of a platform, not related to Mobility, Firepower, Sensor, or Communications, e.g. Bulldozer Blade, Crane, Winch, Mine Plow, etc. */
    // autogenerated using string template disenumpart2.txt
    K_TACTICAL_VEHICLES (6, "K - Tactical Vehicles"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** L - Missiles */
    // autogenerated using string template disenumpart2.txt
    L_MISSILES (7, "L - Missiles"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** M - Weapons */
    // autogenerated using string template disenumpart2.txt
    M_WEAPONS (8, "M - Weapons"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** N - Special Weapons */
    // autogenerated using string template disenumpart2.txt
    N_SPECIAL_WEAPONS (9, "N - Special Weapons"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** X - Aircraft Engines */
    // autogenerated using string template disenumpart2.txt
    X_AIRCRAFT_ENGINES (10, "X - Aircraft Engines");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    Class9SupplyCategoryRepairPartsandComponents(int value, String description)
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
    public static Class9SupplyCategoryRepairPartsandComponents getEnumForValue(int value)
    {
       for (Class9SupplyCategoryRepairPartsandComponents nextEnum : Class9SupplyCategoryRepairPartsandComponents.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum Class9SupplyCategoryRepairPartsandComponents");
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
    public static Class9SupplyCategoryRepairPartsandComponents unmarshalEnum (DataInputStream dis) throws Exception
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
    public static Class9SupplyCategoryRepairPartsandComponents unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
   * Provide name
   * @return  name
   */
    public String getName()
    {
        return name();
    }

    
  /**
   * Provide simple identifier
   * @return class name, value and name
   */
    @Override
    public String toString()
    {
        String padding = new String();
        if (this.getClass().getName().endsWith("DisPduType") && (getValue() < 10))
            padding = "0"; // leading zero for column spacing
        String result = this.getClass().getSimpleName() + " " + padding + getValue() + " " + name();
        if (getTRACE())
            System.out.println ("*** enum " + this.getClass().getSimpleName() + " name=" + name() + ", value=" + getValue() + "; " +
               result); // debug diagnostic
        return result;
    }
}
