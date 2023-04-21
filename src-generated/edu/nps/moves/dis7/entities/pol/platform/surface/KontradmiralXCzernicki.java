/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KontradmiralXCzernicki</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KontradmiralXCzernicki.createInstance()</code> or <code>new KontradmiralXCzernicki()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: Project890Class  = <code>3</code>; </li>
 *     <li> Specific: KontradmiralXCzernicki  = <code>1</code>; </li>
 *     <li> Entity type uid: 24220; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@765df79d. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class KontradmiralXCzernicki extends EntityType
{
    /** Default constructor */
    public KontradmiralXCzernicki()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23062, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 24219, Project 890 Class
        setSpecific((byte)1); // uid 24220, Kontradmiral X Czernicki
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KontradmiralXCzernicki createInstance()
    {
            return new KontradmiralXCzernicki();
    }
}
