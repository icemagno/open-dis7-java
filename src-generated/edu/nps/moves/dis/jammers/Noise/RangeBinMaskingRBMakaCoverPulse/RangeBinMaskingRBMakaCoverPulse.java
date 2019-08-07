package edu.nps.moves.dis.jammers.Noise.RangeBinMaskingRBMakaCoverPulse;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class RangeBinMaskingRBMakaCoverPulse extends JammingTechnique
{
    public RangeBinMaskingRBMakaCoverPulse()
    {
        setKind((byte)1); // Noise
        setCategory((byte)65); // Range Bin Masking (RBM) (aka Cover Pulse)
    }
}
