/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_333Sovershennyy</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_333Sovershennyy.createInstance()</code> or <code>new _333Sovershennyy()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: SteregushchiyClassProject20380  = <code>13</code>; </li>
 *     <li> Specific: _333Sovershennyy  = <code>5</code>; </li>
 *     <li> Entity type uid: 31459; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6cf0a747. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class _333Sovershennyy extends EntityType
{
    /** Default constructor */
    public _333Sovershennyy()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 14715, Frigate
        setSubCategory((byte)13); // uid 28123, Steregushchiy Class (Project 20380)
        setSpecific((byte)5); // uid 31459, 333 Sovershennyy
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _333Sovershennyy createInstance()
    {
            return new _333Sovershennyy();
    }
}
