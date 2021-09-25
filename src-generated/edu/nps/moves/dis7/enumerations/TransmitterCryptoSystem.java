// autogenerated using string template disenumpart1.txt

package edu.nps.moves.dis7.enumerations;

import java.nio.ByteBuffer;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import edu.nps.moves.dis7.pdus.*;

/**
 * This <code>enum</code> type is generated from XML,
 *  UID 166,
 * marshal size 16;
 * TransmitterCryptoSystem has 14 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum TransmitterCryptoSystem 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** No Encryption Device */
    // autogenerated using string template disenumpart2.txt
    NO_ENCRYPTION_DEVICE (0, "No Encryption Device"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** KY-28 */
    // autogenerated using string template disenumpart2.txt
    KY_28 (1, "KY-28"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** KY-58 */
    // autogenerated using string template disenumpart2.txt
    KY_58 (2, "KY-58"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Narrow Spectrum Secure Voice (NSVE) */
    // autogenerated using string template disenumpart2.txt
    NARROW_SPECTRUM_SECURE_VOICE_NSVE (3, "Narrow Spectrum Secure Voice (NSVE)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Wide Spectrum Secure Voice (WSVE) */
    // autogenerated using string template disenumpart2.txt
    WIDE_SPECTRUM_SECURE_VOICE_WSVE (4, "Wide Spectrum Secure Voice (WSVE)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** SINCGARS ICOM */
    // autogenerated using string template disenumpart2.txt
    SINCGARS_ICOM (5, "SINCGARS ICOM"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** KY-75 */
    // autogenerated using string template disenumpart2.txt
    KY_75 (6, "KY-75"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** KY-100 */
    // autogenerated using string template disenumpart2.txt
    KY_100 (7, "KY-100"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** KY-57 */
    // autogenerated using string template disenumpart2.txt
    KY_57 (8, "KY-57"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** KYV-5 */
    // autogenerated using string template disenumpart2.txt
    KYV_5 (9, "KYV-5"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Link 11 KG-40A-P (NTDS) */
    // autogenerated using string template disenumpart2.txt
    LINK_11_KG_40A_P_NTDS (10, "Link 11 KG-40A-P (NTDS)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Link 11B KG-40A-S */
    // autogenerated using string template disenumpart2.txt
    LINK_11B_KG_40A_S (11, "Link 11B KG-40A-S"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Link 11 KG-40AR */
    // autogenerated using string template disenumpart2.txt
    LINK_11_KG_40AR (12, "Link 11 KG-40AR"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** KGV-135A */
    // autogenerated using string template disenumpart2.txt
    KGV_135A (13, "KGV-135A");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    TransmitterCryptoSystem(int value, String description)
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
    public static TransmitterCryptoSystem getEnumForValue(int value)
    {
       for (TransmitterCryptoSystem nextEnum : TransmitterCryptoSystem.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum TransmitterCryptoSystem");
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
    public static TransmitterCryptoSystem unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readUnsignedShort());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @throws Exception unmarshalling input-output error
     * @return enumeration of interest */
    public static TransmitterCryptoSystem unmarshalEnum (ByteBuffer byteBuffer) throws Exception
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
        return "TransmitterCryptoSystem " + getValue() + " " + name(); 
    }
}
