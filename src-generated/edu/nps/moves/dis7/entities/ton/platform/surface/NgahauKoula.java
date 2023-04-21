/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ton.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NgahauKoula</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NgahauKoula.createInstance()</code> or <code>new NgahauKoula()</code>. </p>
 * <ul>
 *     <li> Country: Tonga (TON) = <code>213</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: GuardianClassPacificPatrolBoatsPPBR  = <code>2</code>; </li>
 *     <li> Specific: NgahauKoula  = <code>1</code>; </li>
 *     <li> Entity type uid: 32548; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d68b571. </p>
 * @see Country#TONGA_TON
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class NgahauKoula extends EntityType
{
    /** Default constructor */
    public NgahauKoula()
    {
        setCountry(Country.TONGA_TON);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26717, Light/Patrol Craft
        setSubCategory((byte)2); // uid 32547, Guardian Class, Pacific Patrol Boats (PPB-R)
        setSpecific((byte)1); // uid 32548, Ngahau Koula
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NgahauKoula createInstance()
    {
            return new NgahauKoula();
    }
}
