/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DD128Haruyuki</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DD128Haruyuki.createInstance()</code> or <code>new DD128Haruyuki()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer (DD) = <code>5</code>; </li>
 *     <li> SubCategory: HatsuyukiClassDD  = <code>4</code>; </li>
 *     <li> Specific: DD128Haruyuki  = <code>7</code>; </li>
 *     <li> Entity type uid: 26260; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3569edd5. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DestroyerDD
 * @see SubCategory

 */
public final class DD128Haruyuki extends EntityType
{
    /** Default constructor */
    public DD128Haruyuki()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 18890, Destroyer (DD)
        setSubCategory((byte)4); // uid 18894, Hatsuyuki Class (DD)
        setSpecific((byte)7); // uid 26260, DD-128 Haruyuki
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DD128Haruyuki createInstance()
    {
            return new DD128Haruyuki();
    }
}
