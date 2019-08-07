package edu.nps.moves.dis.jammers.DeceptionandNoise.GateStealerandNoise.NoiseandVGPO;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class NoiseandVGPO extends JammingTechnique
{
    public NoiseandVGPO()
    {
        setKind((byte)3); // Deception and Noise
        setCategory((byte)25); // Gate Stealer and Noise
        setSubCategory((byte)10); // Noise and VGPO
    }
}
