package edu.nps.moves.dis7.jammers.DeceptionandNoise.AngleandSpot.InverseGainandSpotNoise;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class InverseGainandSpotNoise extends JammingTechnique
{
    public InverseGainandSpotNoise()
    {
        setKind((byte)3); // Deception and Noise
        setCategory((byte)20); // Angle and Spot
        setSubCategory((byte)10); // Inverse Gain and Spot Noise
    }
}
