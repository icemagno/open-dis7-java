/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Tu142BearFMod1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Tu142BearFMod1.createInstance()</code> or <code>new Tu142BearFMod1()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Bomber = <code>3</code>; </li>
 *     <li> SubCategory: Tu95orTu142Bear  = <code>5</code>; </li>
 *     <li> Specific: Tu142BearFMod1  = <code>6</code>; </li>
 *     <li> Entity type uid: 13343; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@11a8042c. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Bomber
 * @see SubCategory

 */
public final class Tu142BearFMod1 extends EntityType
{
    /** Default constructor */
    public Tu142BearFMod1()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)3); // uid 13309, Bomber
        setSubCategory((byte)5); // uid 13337, Tu-95 or Tu-142 Bear
        setSpecific((byte)6); // uid 13343, Tu-142 Bear F Mod 1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Tu142BearFMod1 createInstance()
    {
            return new Tu142BearFMod1();
    }
}
