package edu.nps.moves.dis7.objecttypes.PointObject.Obstacle.Barrier.Barrier_HESCOBasket_Large;

import edu.nps.moves.dis7.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class Barrier_HESCOBasket_Large extends ObjectType
{
    public Barrier_HESCOBasket_Large()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)4); // Barrier
        setSubCategory((byte)4); // Barrier, HESCO Basket, Large
    }
}
