package edu.nps.moves.dis.jammers.Deception.AngleandFalseTarget.RangeFalseTargetsRFTandInverseGain;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class RangeFalseTargetsRFTandInverseGain extends JammingTechnique
{
    public RangeFalseTargetsRFTandInverseGain()
    {
        setKind((byte)2); // Deception
        setCategory((byte)20); // Angle and False Target
        setSubCategory((byte)10); // Range False Targets (RFT) and Inverse Gain
    }
}
