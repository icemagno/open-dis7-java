// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Obstacle.Barrier;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 226
 */
public class BarrierJerseyPlastic extends ObjectType
{
    /** Default constructor */
    public BarrierJerseyPlastic()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)4); // Barrier
        setSubCategory((byte)7); // Barrier, Jersey, Plastic
    }
}
