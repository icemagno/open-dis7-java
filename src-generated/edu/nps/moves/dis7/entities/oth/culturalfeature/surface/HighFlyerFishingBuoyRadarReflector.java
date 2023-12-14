/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HighFlyerFishingBuoyRadarReflector</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HighFlyerFishingBuoyRadarReflector.createInstance()</code> or <code>new HighFlyerFishingBuoyRadarReflector()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Buoy = <code>2</code>; </li>
 *     <li> SubCategory: FishingBuoys  = <code>7</code>; </li>
 *     <li> Specific: HighFlyerFishingBuoyRadarReflector  = <code>6</code>; </li>
 *     <li> Entity type uid: 27180; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6e67a8c0. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Buoy
 * @see SubCategory

 */
public final class HighFlyerFishingBuoyRadarReflector extends EntityType
{
    /** Default constructor */
    public HighFlyerFishingBuoyRadarReflector()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 22125, Buoy
        setSubCategory((byte)7); // uid 27174, Fishing Buoys
        setSpecific((byte)6); // uid 27180, High Flyer Fishing Buoy (Radar Reflector)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HighFlyerFishingBuoyRadarReflector createInstance()
    {
            return new HighFlyerFishingBuoyRadarReflector();
    }
}
