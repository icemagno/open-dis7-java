/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.ArealObject.Obstacle.Other;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v30 (2022-04-17)
 *
 * ObjectType uid: 228
 */
public class Other extends ObjectType
{
    /** Default constructor */
    public Other()
    {
        setDomain(PlatformDomain.getEnumForValue(0));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)0); // Other
    }
}
