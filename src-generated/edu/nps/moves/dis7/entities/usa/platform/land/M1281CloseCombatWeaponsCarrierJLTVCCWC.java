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
 * <p> Entity class <b><code>M1281CloseCombatWeaponsCarrierJLTVCCWC</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1281CloseCombatWeaponsCarrierJLTVCCWC.createInstance()</code> or <code>new M1281CloseCombatWeaponsCarrierJLTVCCWC()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: JointLightTacticalVehicleJLTV  = <code>30</code>; </li>
 *     <li> Specific: M1281CloseCombatWeaponsCarrierJLTVCCWC  = <code>4</code>; </li>
 *     <li> Entity type uid: 30486; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@261b9a37. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class M1281CloseCombatWeaponsCarrierJLTVCCWC extends EntityType
{
    /** Default constructor */
    public M1281CloseCombatWeaponsCarrierJLTVCCWC()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)30); // uid 30482, Joint Light Tactical Vehicle (JLTV)
        setSpecific((byte)4); // uid 30486, M1281 Close Combat Weapons Carrier (JLTV-CCWC)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1281CloseCombatWeaponsCarrierJLTVCCWC createInstance()
    {
            return new M1281CloseCombatWeaponsCarrierJLTVCCWC();
    }
}
