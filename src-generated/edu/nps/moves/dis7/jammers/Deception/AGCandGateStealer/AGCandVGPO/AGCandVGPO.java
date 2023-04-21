/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template jammertechnique.txt

package edu.nps.moves.dis7.jammers.Deception.AGCandGateStealer.AGCandVGPO;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v30 (2022-04-17)
 *
 * Jamming technique uid: 284
 */
public class AGCandVGPO extends JammingTechnique
{
    /** Default constructor */
    public AGCandVGPO()
    {
        setKind((byte)2); // Deception
        setCategory((byte)40); // AGC and Gate Stealer
        setSubCategory((byte)10); // AGC and VGPO
    }
}
