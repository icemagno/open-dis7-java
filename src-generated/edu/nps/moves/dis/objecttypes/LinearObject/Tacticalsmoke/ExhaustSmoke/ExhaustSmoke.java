package edu.nps.moves.dis.objecttypes.LinearObject.Tacticalsmoke.ExhaustSmoke;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 227
 */
public class ExhaustSmoke extends ObjectType
{
    public ExhaustSmoke()
    {
        setDomain(PlatformDomain.getEnumForValue(0));
        setObjectKind(ObjectKind.getEnumForValue(5)); // Tactical smoke
        setCategory((byte)1); // Exhaust Smoke
    }
}
