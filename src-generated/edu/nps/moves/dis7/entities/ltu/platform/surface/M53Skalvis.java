/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ltu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M53Skalvis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M53Skalvis.createInstance()</code> or <code>new M53Skalvis()</code>. </p>
 * <ul>
 *     <li> Country: Lithuania (LTU) = <code>255</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: HuntClass  = <code>2</code>; </li>
 *     <li> Specific: M53Skalvis  = <code>1</code>; </li>
 *     <li> Entity type uid: 31795; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@721eb7df. </p>
 * @see Country#LITHUANIA_LTU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M53Skalvis extends EntityType
{
    /** Default constructor */
    public M53Skalvis()
    {
        setCountry(Country.LITHUANIA_LTU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27782, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 31794, Hunt Class
        setSpecific((byte)1); // uid 31795, M53 Skalvis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M53Skalvis createInstance()
    {
            return new M53Skalvis();
    }
}
