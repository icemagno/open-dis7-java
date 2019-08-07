package edu.nps.moves.dis.objecttypes.LinearObject.Obstaclebreach;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 227
 */
public class Obstaclebreach extends ObjectType
{
    public Obstaclebreach()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(7)); // Obstacle breach
    }
}
