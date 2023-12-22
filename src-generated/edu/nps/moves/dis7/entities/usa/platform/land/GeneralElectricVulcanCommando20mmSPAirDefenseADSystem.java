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
 * <p> Entity class <b><code>GeneralElectricVulcanCommando20mmSPAirDefenseADSystem</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GeneralElectricVulcanCommando20mmSPAirDefenseADSystem.createInstance()</code> or <code>new GeneralElectricVulcanCommando20mmSPAirDefenseADSystem()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: SelfPropelledVSHORADGunMissileSystem  = <code>5</code>; </li>
 *     <li> Specific: GeneralElectricVulcanCommando20mmSPAirDefenseADSystem  = <code>3</code>; </li>
 *     <li> Entity type uid: 10708; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3fde2209. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class GeneralElectricVulcanCommando20mmSPAirDefenseADSystem extends EntityType
{
    /** Default constructor */
    public GeneralElectricVulcanCommando20mmSPAirDefenseADSystem()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)5); // uid 10705, Self -Propelled VSHORAD Gun / Missile System
        setSpecific((byte)3); // uid 10708, General Electric Vulcan-Commando 20 mm SP Air Defense (AD) System
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GeneralElectricVulcanCommando20mmSPAirDefenseADSystem createInstance()
    {
            return new GeneralElectricVulcanCommando20mmSPAirDefenseADSystem();
    }
}
