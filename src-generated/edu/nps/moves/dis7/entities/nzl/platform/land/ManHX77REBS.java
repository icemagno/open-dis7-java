/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nzl.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ManHX77REBS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ManHX77REBS.createInstance()</code> or <code>new ManHX77REBS()</code>. </p>
 * <ul>
 *     <li> Country: New Zealand (NZL) = <code>156</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MANHX778x8NZ  = <code>1</code>; </li>
 *     <li> Specific: ManHX77REBS  = <code>1</code>; </li>
 *     <li> Entity type uid: 31943; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b152928. </p>
 * @see Country#NEW_ZEALAND_NZL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class ManHX77REBS extends EntityType
{
    /** Default constructor */
    public ManHX77REBS()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 31941, Large Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 31942, MAN HX77 - 8x8 (NZ)
        setSpecific((byte)1); // uid 31943, Man HX77 (REBS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ManHX77REBS createInstance()
    {
            return new ManHX77REBS();
    }
}
