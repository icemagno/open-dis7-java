package edu.nps.moves.dis7.jammers.Noise.SpotNoise.BlinkingSpotNoise;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class BlinkingSpotNoise extends JammingTechnique
{
    public BlinkingSpotNoise()
    {
        setKind((byte)1); // Noise
        setCategory((byte)75); // Spot Noise
        setSubCategory((byte)10); // Blinking Spot Noise
    }
}
