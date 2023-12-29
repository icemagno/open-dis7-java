/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
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
 *  UID 790,
 * marshal size 32;
 * EEBeamShape has 12 enumerations total.
 * @see <a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Java Tutorials: Enum Types</a>
 * @see java.lang.Enum
 */
public enum EEBeamShape 
{
    // autogenerated using string template disenumfootnotecomment.txt

    /** Not Specified */
    // autogenerated using string template disenumpart2.txt
    NOT_SPECIFIED (0, "Not Specified"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Custom Lobes Only */
    // autogenerated using string template disenumpart2.txt
    CUSTOM_LOBES_ONLY (1, "Custom Lobes Only"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Omni (360 Degrees at Gain 1.0) */
    // autogenerated using string template disenumpart2.txt
    OMNI_360_DEGREES_AT_GAIN_10 (2, "Omni (360 Degrees at Gain 1.0)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Gaussian */
    // autogenerated using string template disenumpart2.txt
    GAUSSIAN (3, "Gaussian"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sine (Sinusoidal) */
    // autogenerated using string template disenumpart2.txt
    SINE_SINUSOIDAL (4, "Sine (Sinusoidal)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Sinc (SIN x / x) */
    // autogenerated using string template disenumpart2.txt
    SINC_SIN_X_X (5, "Sinc (SIN x / x)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** SincNormal (SIN(x * Pi)/x * Pi) */
    // autogenerated using string template disenumpart2.txt
    SINCNORMAL_SINX_x_PI_X_x_PI (6, "SincNormal (SIN(x * Pi)/x * Pi)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cosine */
    // autogenerated using string template disenumpart2.txt
    COSINE (7, "Cosine"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cosine2 (COS Squared) */
    // autogenerated using string template disenumpart2.txt
    COSINE2_COS_SQUARED (8, "Cosine2 (COS Squared)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** CosinePedestal (COS on a Pedastal) */
    // autogenerated using string template disenumpart2.txt
    COSINEPEDESTAL_COS_ON_A_PEDASTAL (9, "CosinePedestal (COS on a Pedastal)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Cosecant2 (CSC Squared) */
    // autogenerated using string template disenumpart2.txt
    COSECANT2_CSC_SQUARED (10, "Cosecant2 (CSC Squared)"),
    // autogenerated using string template disenumfootnotecomment.txt

    /** Square (Constant Amplitude for Entire Beamwidth) */
    // autogenerated using string template disenumpart2.txt
    SQUARE_CONSTANT_AMPLITUDE_FOR_ENTIRE_BEAMWIDTH (11, "Square (Constant Amplitude for Entire Beamwidth)");

    // autogenerated using string template disenumpart25.txt

    private int value;
    private final String description;

    /** Constructor */
    EEBeamShape(int value, String description)
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
    public static EEBeamShape getEnumForValue(int value)
    {
       for (EEBeamShape nextEnum : EEBeamShape.values())
       {
          if (nextEnum.getValue() == value)
              return nextEnum;
       }
       System.out.flush(); // ensure contiguous console outputs
       System.err.println("No corresponding enumeration found for value " + value + " of enum EEBeamShape");
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
    public static EEBeamShape unmarshalEnum (DataInputStream dis) throws Exception
    {
        return getEnumForValue(dis.readInt());
    } 

    /** Unmarshal enumeration value to ByteBuffer
     * @see <a href="https://en.wikipedia.org/wiki/Marshalling_(computer_science)" target="_blank">https://en.wikipedia.org/wiki/Marshalling_(computer_science)</a>
     * @param byteBuffer ByteBuffer for input
     * @return enumeration of interest */
    public static EEBeamShape unmarshalEnum (ByteBuffer byteBuffer)
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
        return "EEBeamShape: " + getValue() + " " + name();
    }
}