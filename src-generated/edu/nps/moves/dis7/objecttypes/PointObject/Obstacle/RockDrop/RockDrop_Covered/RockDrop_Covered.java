package edu.nps.moves.dis7.objecttypes.PointObject.Obstacle.RockDrop.RockDrop_Covered;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class RockDrop_Covered extends ObjectType
{
    public RockDrop_Covered()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)5); // Rock Drop
        setSubCategory((byte)1); // Rock Drop, Covered
    }
}
