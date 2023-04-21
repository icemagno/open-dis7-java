/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PvBv2062AT90mm</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PvBv2062AT90mm.createInstance()</code> or <code>new PvBv2062AT90mm()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Tracked Utility Vehicle = <code>9</code>; </li>
 *     <li> SubCategory: Bandvagn206Bv206  = <code>1</code>; </li>
 *     <li> Specific: PvBv2062AT90mm  = <code>3</code>; </li>
 *     <li> Entity type uid: 27650; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35a60674. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeTrackedUtilityVehicle
 * @see SubCategory

 */
public final class PvBv2062AT90mm extends EntityType
{
    /** Default constructor */
    public PvBv2062AT90mm()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)9); // uid 27646, Large Tracked Utility Vehicle
        setSubCategory((byte)1); // uid 27647, Bandvagn 206 (Bv 206)
        setSpecific((byte)3); // uid 27650, PvBv 2062 AT 90mm
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PvBv2062AT90mm createInstance()
    {
            return new PvBv2062AT90mm();
    }
}
