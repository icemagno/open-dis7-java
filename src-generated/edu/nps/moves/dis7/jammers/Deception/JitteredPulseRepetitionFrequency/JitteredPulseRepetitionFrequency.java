package edu.nps.moves.dis7.jammers.Deception.JitteredPulseRepetitionFrequency;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class JitteredPulseRepetitionFrequency extends JammingTechnique
{
    public JitteredPulseRepetitionFrequency()
    {
        setKind((byte)2); // Deception
        setCategory((byte)95); // Jittered Pulse Repetition Frequency
    }
}
