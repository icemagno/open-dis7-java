/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Preparedposition.InfantryFightingPosition;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v30 (2022-04-17)
 *
 * ObjectType uid: 226
 */
public class OverheadCoveredInfantryPosition extends ObjectType
{
    /** Default constructor */
    public OverheadCoveredInfantryPosition()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(2)); // Prepared position
        setCategory((byte)2); // Infantry Fighting Position
        setSubCategory((byte)2); // Overhead Covered Infantry Position
    }
}
