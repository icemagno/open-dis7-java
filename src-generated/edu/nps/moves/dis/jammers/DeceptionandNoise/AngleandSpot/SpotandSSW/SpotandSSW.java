package edu.nps.moves.dis.jammers.DeceptionandNoise.AngleandSpot.SpotandSSW;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class SpotandSSW extends JammingTechnique
{
    public SpotandSSW()
    {
        setKind((byte)3); // Deception and Noise
        setCategory((byte)20); // Angle and Spot
        setSubCategory((byte)15); // Spot and SSW
    }
}
