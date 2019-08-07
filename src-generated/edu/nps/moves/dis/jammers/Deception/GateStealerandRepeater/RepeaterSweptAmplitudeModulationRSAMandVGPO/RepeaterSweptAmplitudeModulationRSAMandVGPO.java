package edu.nps.moves.dis.jammers.Deception.GateStealerandRepeater.RepeaterSweptAmplitudeModulationRSAMandVGPO;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * Jamming technique uid: 284
 */
public class RepeaterSweptAmplitudeModulationRSAMandVGPO extends JammingTechnique
{
    public RepeaterSweptAmplitudeModulationRSAMandVGPO()
    {
        setKind((byte)2); // Deception
        setCategory((byte)80); // Gate Stealer and Repeater
        setSubCategory((byte)5); // Repeater Swept Amplitude Modulation (RSAM) and VGPO
    }
}
