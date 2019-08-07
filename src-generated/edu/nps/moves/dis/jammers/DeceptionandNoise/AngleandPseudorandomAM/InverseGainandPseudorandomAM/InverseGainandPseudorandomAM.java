package edu.nps.moves.dis.jammers.DeceptionandNoise.AngleandPseudorandomAM.InverseGainandPseudorandomAM;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class InverseGainandPseudorandomAM extends JammingTechnique
{
    public InverseGainandPseudorandomAM()
    {
        setKind((byte)3); // Deception and Noise
        setCategory((byte)15); // Angle and Pseudorandom AM
        setSubCategory((byte)5); // Inverse Gain and Pseudorandom AM
    }
}
