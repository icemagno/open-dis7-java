/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OH58DKiowaKiowaWarrior</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OH58DKiowaKiowaWarrior.createInstance()</code> or <code>new OH58DKiowaKiowaWarrior()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Observation helicopter = <code>24</code>; </li>
 *     <li> SubCategory: BellModel406AHIP  = <code>2</code>; </li>
 *     <li> Specific: OH58DKiowaKiowaWarrior  = <code>1</code>; </li>
 *     <li> Entity type uid: 11180; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71c0b742. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Observationhelicopter
 * @see SubCategory

 */
public final class OH58DKiowaKiowaWarrior extends EntityType
{
    /** Default constructor */
    public OH58DKiowaKiowaWarrior()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)24); // uid 11174, Observation helicopter
        setSubCategory((byte)2); // uid 11179, Bell Model 406 AHIP
        setSpecific((byte)1); // uid 11180, OH-58D Kiowa/Kiowa Warrior
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OH58DKiowaKiowaWarrior createInstance()
    {
            return new OH58DKiowaKiowaWarrior();
    }
}
