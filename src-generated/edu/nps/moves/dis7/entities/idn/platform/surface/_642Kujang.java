/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_642Kujang</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_642Kujang.createInstance()</code> or <code>new _642Kujang()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Attack Craft = <code>64</code>; </li>
 *     <li> SubCategory: KCR40FastAttackMissileBoat  = <code>2</code>; </li>
 *     <li> Specific: _642Kujang  = <code>2</code>; </li>
 *     <li> Entity type uid: 29630; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63cd604c. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastAttackCraft
 * @see SubCategory

 */
public final class _642Kujang extends EntityType
{
    /** Default constructor */
    public _642Kujang()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29615, Fast Attack Craft
        setSubCategory((byte)2); // uid 29628, KCR-40 (Fast Attack Missile Boat)
        setSpecific((byte)2); // uid 29630, 642 Kujang
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _642Kujang createInstance()
    {
            return new _642Kujang();
    }
}
