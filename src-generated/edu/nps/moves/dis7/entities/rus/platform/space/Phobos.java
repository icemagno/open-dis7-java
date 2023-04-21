/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Phobos</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Phobos.createInstance()</code> or <code>new Phobos()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Manned = <code>1</code>; </li>
 *     <li> SubCategory: Spacevehicles  = <code>3</code>; </li>
 *     <li> Specific: Phobos  = <code>3</code>; </li>
 *     <li> Entity type uid: 14838; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@c755b2. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Manned
 * @see SubCategory

 */
public final class Phobos extends EntityType
{
    /** Default constructor */
    public Phobos()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 14828, Manned
        setSubCategory((byte)3); // uid 14835, Space vehicles
        setSpecific((byte)3); // uid 14838, Phobos
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Phobos createInstance()
    {
            return new Phobos();
    }
}
