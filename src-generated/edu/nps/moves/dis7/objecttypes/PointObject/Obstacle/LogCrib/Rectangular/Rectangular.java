package edu.nps.moves.dis7.objecttypes.PointObject.Obstacle.LogCrib.Rectangular;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class Rectangular extends ObjectType
{
    public Rectangular()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)2); // Log Crib
        setSubCategory((byte)1); // Rectangular
    }
}
