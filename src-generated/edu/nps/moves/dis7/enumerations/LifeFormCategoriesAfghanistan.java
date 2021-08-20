package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

// autogenerated using string template disenumpart1.txt

/**
 * Generated from XML,
 *  UID 501,
 * marshal size 8,
 * LifeFormCategoriesAfghanistan
 */
public enum LifeFormCategoriesAfghanistan 
{
// autogenerated using string template disenumfootnotecomment.txt

    /** Afghan National Army (ANA) */
// autogenerated using string template disenumpart2.txt

    AFGHAN_NATIONAL_ARMY_ANA (11, "Afghan National Army (ANA)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Afghan Air Force (AAF) */
// autogenerated using string template disenumpart2.txt

    AFGHAN_AIR_FORCE_AAF (13, "Afghan Air Force (AAF)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** National Directorate of Security (NDS) */
// autogenerated using string template disenumpart2.txt

    CREATE_ENTITY_RELIABLE (51, "National Directorate of Security (NDS)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Afghan National Police (ANP) */
// autogenerated using string template disenumpart2.txt

    REMOVE_ENTITY_RELIABLE (52, "Afghan National Police (ANP)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Afghan Border Police (ABP) */
// autogenerated using string template disenumpart2.txt

    START_RESUME_RELIABLE (53, "Afghan Border Police (ABP)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Afghan National Civil Order Police (ANCOP) */
// autogenerated using string template disenumpart2.txt

    STOP_FREEZE_RELIABLE (54, "Afghan National Civil Order Police (ANCOP)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Afghan Public Protection Force (APPF) */
// autogenerated using string template disenumpart2.txt

    ACKNOWLEDGE_RELIABLE (55, "Afghan Public Protection Force (APPF)"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Non-Military National Government Agencies */
// autogenerated using string template disenumpart2.txt

    NON_MILITARY_NATIONAL_GOVERNMENT_AGENCIES (70, "Non-Military National Government Agencies"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Terrorist Combatant */
// autogenerated using string template disenumpart2.txt

    TERRORIST_COMBATANT (101, "Terrorist Combatant"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Humanitarian Organizations */
// autogenerated using string template disenumpart2.txt

    HUMANITARIAN_ORGANIZATIONS (120, "Humanitarian Organizations"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Red Crescent */
// autogenerated using string template disenumpart2.txt

    RED_CRESCENT (121, "Red Crescent"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Civilian */
// autogenerated using string template disenumpart2.txt

    CIVILIAN (130, "Civilian"),
// autogenerated using string template disenumfootnotecomment.txt

    /** Press */
// autogenerated using string template disenumpart2.txt

    PRESS (133, "Press"),;

// autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    LifeFormCategoriesAfghanistan(int value, String description)
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
    public static LifeFormCategoriesAfghanistan getEnumForValue(int i)
    {
       for(LifeFormCategoriesAfghanistan val: LifeFormCategoriesAfghanistan.values()) {
          if(val.getValue()==i)
              return val;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No enumeration found for value " + i + " of enumeration LifeFormCategoriesAfghanistan");
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
    public static LifeFormCategoriesAfghanistan unmarshalEnum (DataInputStream dis) throws Exception
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
    public static LifeFormCategoriesAfghanistan unmarshalEnum(ByteBuffer byteBuffer) throws Exception
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
