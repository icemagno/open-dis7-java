/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nzl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANZACClassMeko200</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANZACClassMeko200.createInstance()</code> or <code>new ANZACClassMeko200()</code>. </p>
 * <ul>
 *     <li> Country: New Zealand (NZL) = <code>156</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: ANZACClassMeko200  = <code>1</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 31742; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@60e5272. </p>
 * @see Country#NEW_ZEALAND_NZL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class ANZACClassMeko200 extends EntityType
{
    /** Default constructor */
    public ANZACClassMeko200()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 31741, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 31742, ANZAC Class (Meko 200)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANZACClassMeko200 createInstance()
    {
            return new ANZACClassMeko200();
    }
}
