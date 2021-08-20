// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.ArealObject.Obstacle.Minefield;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 *
 * ObjectType uid: 228
 */
public class Minefield extends ObjectType
{
    /** Default constructor */
    public Minefield()
    {
        setDomain(PlatformDomain.getEnumForValue(0));
        setObjectKind(ObjectKind.getEnumForValue(1)); // Obstacle
        setCategory((byte)1); // Minefield
    }
}
