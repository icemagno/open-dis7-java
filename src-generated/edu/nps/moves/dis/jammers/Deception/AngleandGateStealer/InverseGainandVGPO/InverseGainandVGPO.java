package edu.nps.moves.dis.jammers.Deception.AngleandGateStealer.InverseGainandVGPO;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class InverseGainandVGPO extends JammingTechnique
{
    public InverseGainandVGPO()
    {
        setKind((byte)2); // Deception
        setCategory((byte)15); // Angle and Gate Stealer
        setSubCategory((byte)30); // Inverse Gain and VGPO
    }
}
