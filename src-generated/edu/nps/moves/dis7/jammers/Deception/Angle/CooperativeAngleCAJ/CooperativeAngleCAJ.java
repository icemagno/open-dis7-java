package edu.nps.moves.dis7.jammers.Deception.Angle.CooperativeAngleCAJ;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class CooperativeAngleCAJ extends JammingTechnique
{
    public CooperativeAngleCAJ()
    {
        setKind((byte)2); // Deception
        setCategory((byte)10); // Angle
        setSubCategory((byte)10); // Cooperative Angle (CAJ)
    }
}
