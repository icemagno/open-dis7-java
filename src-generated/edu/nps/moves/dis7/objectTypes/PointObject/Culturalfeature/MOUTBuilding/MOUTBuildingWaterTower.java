/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template objecttype.txt

package edu.nps.moves.dis7.objectTypes.PointObject.Culturalfeature.MOUTBuilding;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)
 *
 * ObjectType uid: 226
 */
public class MOUTBuildingWaterTower extends ObjectType
{
    /** Default constructor */
    public MOUTBuildingWaterTower()
    {
        setDomain(PlatformDomain.getEnumForValue(1));
        setObjectKind(ObjectKind.getEnumForValue(3)); // Cultural feature
        setCategory((byte)7); // MOUT Building
        setSubCategory((byte)8); // MOUT Building, Water Tower
    }
}
