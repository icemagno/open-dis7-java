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
 * <p> Entity class <b><code>MTVRMK25CargowMk1940mmGrenadeLauncher</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MTVRMK25CargowMk1940mmGrenadeLauncher.createInstance()</code> or <code>new MTVRMK25CargowMk1940mmGrenadeLauncher()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MediumTacticalVehicleReplacementMTVR7Ton  = <code>39</code>; </li>
 *     <li> Specific: MTVRMK25Cargo  = <code>2</code>; </li>
 *     <li> Entity type uid: 33430; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4e3f2908. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MTVRMK25CargowMk1940mmGrenadeLauncher extends EntityType
{
    /** Default constructor */
    public MTVRMK25CargowMk1940mmGrenadeLauncher()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)39); // uid 25306, Medium Tactical Vehicle Replacement (MTVR) 7-Ton
        setSpecific((byte)2); // uid 25308, MTVR MK25 Cargo
        setExtra((byte)3); // uid 33430, MTVR MK25 Cargo w/Mk19 40mm Grenade Launcher
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MTVRMK25CargowMk1940mmGrenadeLauncher createInstance()
    {
            return new MTVRMK25CargowMk1940mmGrenadeLauncher();
    }
}
