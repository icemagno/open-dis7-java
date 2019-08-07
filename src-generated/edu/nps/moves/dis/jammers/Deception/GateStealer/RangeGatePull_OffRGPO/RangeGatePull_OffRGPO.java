package edu.nps.moves.dis.jammers.Deception.GateStealer.RangeGatePull_OffRGPO;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class RangeGatePull_OffRGPO extends JammingTechnique
{
    public RangeGatePull_OffRGPO()
    {
        setKind((byte)2); // Deception
        setCategory((byte)75); // Gate Stealer
        setSubCategory((byte)10); // Range Gate Pull-Off (RGPO)
    }
}
