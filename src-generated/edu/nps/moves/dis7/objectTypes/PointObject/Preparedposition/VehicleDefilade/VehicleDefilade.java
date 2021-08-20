// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Preparedposition.VehicleDefilade;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class VehicleDefilade extends ObjectType
{
    /** Default constructor */
    public VehicleDefilade()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(2)); // Prepared position
        setCategory((byte)1); // Vehicle Defilade
    }
}
