package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.MOUTBuilding.MOUTBuilding_Church;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class MOUTBuilding_Church extends ObjectType
{
    public MOUTBuilding_Church()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)7); // MOUT Building
        setSubCategory((byte)14); // MOUT Building, Church
    }
}
