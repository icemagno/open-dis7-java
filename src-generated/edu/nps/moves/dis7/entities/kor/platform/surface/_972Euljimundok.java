/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_972Euljimundok</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_972Euljimundok.createInstance()</code> or <code>new _972Euljimundok()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer (DDG) = <code>4</code>; </li>
 *     <li> SubCategory: KwanggaetoDaewangKDX1Class  = <code>1</code>; </li>
 *     <li> Specific: _972Euljimundok  = <code>2</code>; </li>
 *     <li> Entity type uid: 23148; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a10c1b5. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyerDDG
 * @see SubCategory

 */
public final class _972Euljimundok extends EntityType
{
    /** Default constructor */
    public _972Euljimundok()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 23145, Guided Missile Destroyer (DDG)
        setSubCategory((byte)1); // uid 23146, Kwanggaeto Daewang (KDX-1) Class
        setSpecific((byte)2); // uid 23148, 972 Euljimundok
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _972Euljimundok createInstance()
    {
            return new _972Euljimundok();
    }
}
