package edu.nps.moves.dis7.jammers.Noise.RepeaterNoise.NarrowbandRepeaterNoise;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class NarrowbandRepeaterNoise extends JammingTechnique
{
    public NarrowbandRepeaterNoise()
    {
        setKind((byte)1); // Noise
        setCategory((byte)70); // Repeater Noise
        setSubCategory((byte)5); // Narrowband Repeater Noise
    }
}
