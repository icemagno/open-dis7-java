package edu.nps.moves.dis7.jammers.Deception.Repeater.MultipleFrequencyRepeaterMFR;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class MultipleFrequencyRepeaterMFR extends JammingTechnique
{
    public MultipleFrequencyRepeaterMFR()
    {
        setKind((byte)2); // Deception
        setCategory((byte)130); // Repeater
        setSubCategory((byte)15); // Multiple Frequency Repeater (MFR)
    }
}
