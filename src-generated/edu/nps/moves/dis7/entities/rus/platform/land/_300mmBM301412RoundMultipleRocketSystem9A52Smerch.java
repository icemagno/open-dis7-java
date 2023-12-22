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
 * <p> Entity class <b><code>_300mmBM301412RoundMultipleRocketSystem9A52Smerch</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_300mmBM301412RoundMultipleRocketSystem9A52Smerch.createInstance()</code> or <code>new _300mmBM301412RoundMultipleRocketSystem9A52Smerch()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: _300mmBM301412RoundMultipleRocketSystem9A52Smerch  = <code>29</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 12782; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@61d34b4. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class _300mmBM301412RoundMultipleRocketSystem9A52Smerch extends EntityType
{
    /** Default constructor */
    public _300mmBM301412RoundMultipleRocketSystem9A52Smerch()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 12745, Self-Propelled Artillery
        setSubCategory((byte)29); // uid 12782, 300-mm BM-30 14/12-Round Multiple Rocket System (9A52 Smerch)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _300mmBM301412RoundMultipleRocketSystem9A52Smerch createInstance()
    {
            return new _300mmBM301412RoundMultipleRocketSystem9A52Smerch();
    }
}
