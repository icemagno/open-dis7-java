/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SS26IskanderMissileResupplyVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SS26IskanderMissileResupplyVehicle.createInstance()</code> or <code>new SS26IskanderMissileResupplyVehicle()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: IskanderSS26TEL  = <code>54</code>; </li>
 *     <li> Specific: SS26IskanderMissileResupplyVehicle  = <code>1</code>; </li>
 *     <li> Entity type uid: 36278; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2c6aed22. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class SS26IskanderMissileResupplyVehicle extends EntityType
{
    /** Default constructor */
    public SS26IskanderMissileResupplyVehicle()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 12745, Self-Propelled Artillery
        setSubCategory((byte)54); // uid 25243, Iskander SS-26 TEL
        setSpecific((byte)1); // uid 36278, SS-26 Iskander Missile Resupply Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SS26IskanderMissileResupplyVehicle createInstance()
    {
            return new SS26IskanderMissileResupplyVehicle();
    }
}