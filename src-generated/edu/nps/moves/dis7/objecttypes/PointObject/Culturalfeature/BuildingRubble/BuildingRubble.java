package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.BuildingRubble;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class BuildingRubble extends ObjectType
{
    public BuildingRubble()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)2); // Building Rubble
    }
}
