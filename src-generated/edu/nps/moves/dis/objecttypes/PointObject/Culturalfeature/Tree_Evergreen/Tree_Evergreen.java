package edu.nps.moves.dis.objecttypes.PointObject.Culturalfeature.Tree_Evergreen;

import edu.nps.moves.dis.*;
import edu.nps.moves.dis.enumerations.*;

/**
 * SISO-REF-010-v25, 2018-08-29
 *
 * ObjectType uid: 226
 */
public class Tree_Evergreen extends ObjectType
{
    public Tree_Evergreen()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)11); // Tree, Evergreen
    }
}
