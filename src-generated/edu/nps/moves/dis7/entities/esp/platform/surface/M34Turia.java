/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M34Turia</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M34Turia.createInstance()</code> or <code>new M34Turia()</code>. </p>
 * <ul>
 *     <li> Country: Spain (ESP) = <code>198</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship = <code>8</code>; </li>
 *     <li> SubCategory: SeguraClassMinehuntersMHC  = <code>1</code>; </li>
 *     <li> Specific: M34Turia  = <code>4</code>; </li>
 *     <li> Entity type uid: 33786; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7da39774. </p>
 * @see Country#SPAIN_ESP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShip
 * @see SubCategory

 */
public final class M34Turia extends EntityType
{
    /** Default constructor */
    public M34Turia()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 19021, Mine Countermeasure Ship
        setSubCategory((byte)1); // uid 19022, Segura Class (Minehunters) (MHC)
        setSpecific((byte)4); // uid 33786, M34 Turia
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M34Turia createInstance()
    {
            return new M34Turia();
    }
}
