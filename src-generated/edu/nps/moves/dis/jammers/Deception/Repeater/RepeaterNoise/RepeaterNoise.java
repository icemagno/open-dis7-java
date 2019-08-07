package edu.nps.moves.dis.jammers.Deception.Repeater.RepeaterNoise;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class RepeaterNoise extends JammingTechnique
{
    public RepeaterNoise()
    {
        setKind((byte)2); // Deception
        setCategory((byte)130); // Repeater
        setSubCategory((byte)10); // Repeater Noise
    }
}
