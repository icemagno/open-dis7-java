package edu.nps.moves.dis7.objecttypes.PointObject.Preparedposition.VehicleDefilade.FightingVehicle;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class FightingVehicle extends ObjectType
{
    public FightingVehicle()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(2)); // Prepared position
        setCategory((byte)1); // Vehicle Defilade
        setSubCategory((byte)2); // Fighting Vehicle
    }
}
