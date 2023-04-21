/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_556mmColtM4SpecialOperationsPeculiarModificationSOPMOD</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_556mmColtM4SpecialOperationsPeculiarModificationSOPMOD.createInstance()</code> or <code>new _556mmColtM4SpecialOperationsPeculiarModificationSOPMOD()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: U.S. Army (USA) = <code>11</code>; </li>
 *     <li> SubCategory: AssaultRifles  = <code>5</code>; </li>
 *     <li> Specific: _556mmColtM4SpecialOperationsPeculiarModificationSOPMOD  = <code>43</code>; </li>
 *     <li> Entity type uid: 32673; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e6acec2. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see USArmyUSA
 * @see SubCategory

 */
public final class _556mmColtM4SpecialOperationsPeculiarModificationSOPMOD extends EntityType
{
    /** Default constructor */
    public _556mmColtM4SpecialOperationsPeculiarModificationSOPMOD()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32666, U.S. Army (USA)
        setSubCategory((byte)5); // uid 32669, Assault Rifles
        setSpecific((byte)43); // uid 32673, 5.56mm Colt M4 Special Operations Peculiar Modification (SOPMOD)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _556mmColtM4SpecialOperationsPeculiarModificationSOPMOD createInstance()
    {
            return new _556mmColtM4SpecialOperationsPeculiarModificationSOPMOD();
    }
}
