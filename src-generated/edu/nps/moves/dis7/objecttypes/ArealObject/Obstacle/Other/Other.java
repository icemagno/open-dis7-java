package edu.nps.moves.dis7.objecttypes.ArealObject.Obstacle.Other;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 228
 */
public class Other extends ObjectType
{
    public Other()
    {
        setDomain(PlatformDomain.getEnumForValue(0));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)0); // Other
    }
}
