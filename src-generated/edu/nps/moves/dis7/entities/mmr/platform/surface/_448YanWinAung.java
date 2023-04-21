/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mmr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_448YanWinAung</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_448YanWinAung.createInstance()</code> or <code>new _448YanWinAung()</code>. </p>
 * <ul>
 *     <li> Country: Myanmar (MMR) = <code>35</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: HainanClassType037  = <code>1</code>; </li>
 *     <li> Specific: _448YanWinAung  = <code>7</code>; </li>
 *     <li> Entity type uid: 32913; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1bdbf9be. </p>
 * @see Country#MYANMAR_MMR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _448YanWinAung extends EntityType
{
    /** Default constructor */
    public _448YanWinAung()
    {
        setCountry(Country.MYANMAR_MMR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 32905, Light/Patrol Craft
        setSubCategory((byte)1); // uid 32906, Hainan Class (Type 037)
        setSpecific((byte)7); // uid 32913, 448 Yan Win Aung
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _448YanWinAung createInstance()
    {
            return new _448YanWinAung();
    }
}
