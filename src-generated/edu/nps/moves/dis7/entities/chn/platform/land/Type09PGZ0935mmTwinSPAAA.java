/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Type09PGZ0935mmTwinSPAAA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Type09PGZ0935mmTwinSPAAA.createInstance()</code> or <code>new Type09PGZ0935mmTwinSPAAA()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SelfPropelledVSHORADGunMissileSystem  = <code>4</code>; </li>
 *     <li> Specific: Type09PGZ0935mmTwinSPAAA  = <code>6</code>; </li>
 *     <li> Entity type uid: 33976; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f77e91b. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class Type09PGZ0935mmTwinSPAAA extends EntityType
{
    /** Default constructor */
    public Type09PGZ0935mmTwinSPAAA()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16937, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)4); // uid 16955, Self-Propelled VSHORAD Gun/Missile System
        setSpecific((byte)6); // uid 33976, Type 09 (PGZ09) 35mm Twin SPAAA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Type09PGZ0935mmTwinSPAAA createInstance()
    {
            return new Type09PGZ0935mmTwinSPAAA();
    }
}
