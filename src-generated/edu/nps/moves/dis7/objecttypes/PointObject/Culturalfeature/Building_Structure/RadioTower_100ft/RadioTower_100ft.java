package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.Building_Structure.RadioTower_100ft;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class RadioTower_100ft extends ObjectType
{
    public RadioTower_100ft()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)1); // Building / Structure
        setSubCategory((byte)12); // Radio Tower, 100ft
    }
}
