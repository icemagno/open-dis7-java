/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LTVCrossbowpedestalmountedweaponsystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LTVCrossbowpedestalmountedweaponsystem.createInstance()</code> or <code>new LTVCrossbowpedestalmountedweaponsystem()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SelfPropelledVSHORADGunMissileSystem  = <code>5</code>; </li>
 *     <li> Specific: LTVCrossbowpedestalmountedweaponsystem  = <code>6</code>; </li>
 *     <li> Entity type uid: 10711; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@79a201cf. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class LTVCrossbowpedestalmountedweaponsystem extends EntityType
{
    /** Default constructor */
    public LTVCrossbowpedestalmountedweaponsystem()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)5); // uid 10705, Self -Propelled VSHORAD Gun / Missile System
        setSpecific((byte)6); // uid 10711, LTV Crossbow pedestal-mounted weapon system
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LTVCrossbowpedestalmountedweaponsystem createInstance()
    {
            return new LTVCrossbowpedestalmountedweaponsystem();
    }
}
