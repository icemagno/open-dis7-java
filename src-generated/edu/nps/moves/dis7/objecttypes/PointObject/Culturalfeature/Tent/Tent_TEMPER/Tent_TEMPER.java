package edu.nps.moves.dis7.objecttypes.PointObject.Culturalfeature.Tent.Tent_TEMPER;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class Tent_TEMPER extends ObjectType
{
    public Tent_TEMPER()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)5); // Tent
        setSubCategory((byte)6); // Tent, TEMPER
    }
}
