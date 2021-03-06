package edu.nps.moves.dis7.jammers.Deception.AngleandVelocity.InverseGainandVBM;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class InverseGainandVBM extends JammingTechnique
{
    public InverseGainandVBM()
    {
        setKind((byte)2); // Deception
        setCategory((byte)30); // Angle and Velocity
        setSubCategory((byte)5); // Inverse Gain and VBM
    }
}
