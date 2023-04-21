/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1078A1P2TruckCargoLMTVwEquipwMk19</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1078A1P2TruckCargoLMTVwEquipwMk19.createInstance()</code> or <code>new M1078A1P2TruckCargoLMTVwEquipwMk19()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: StewartampStevensonFamilyofMediumTacticalVehiclesFMTV  = <code>12</code>; </li>
 *     <li> Specific: M1078TruckCargo_LMTVwEquip  = <code>1</code>; </li>
 *     <li> Entity type uid: 34463; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7f85217c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class M1078A1P2TruckCargoLMTVwEquipwMk19 extends EntityType
{
    /** Default constructor */
    public M1078A1P2TruckCargoLMTVwEquipwMk19()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)12); // uid 10481, Stewart &amp; Stevenson Family of Medium Tactical Vehicles (FMTV)
        setSpecific((byte)1); // uid 10482, M1078 Truck, Cargo; LMTV w/ Equip
        setExtra((byte)12); // uid 34463, M1078A1P2 Truck, Cargo; LMTV w/ Equip, w/ Mk19
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1078A1P2TruckCargoLMTVwEquipwMk19 createInstance()
    {
            return new M1078A1P2TruckCargoLMTVwEquipwMk19();
    }
}
