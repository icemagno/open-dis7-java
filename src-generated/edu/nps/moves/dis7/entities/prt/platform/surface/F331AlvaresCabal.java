/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F331AlvaresCabal</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F331AlvaresCabal.createInstance()</code> or <code>new F331AlvaresCabal()</code>. </p>
 * <ul>
 *     <li> Country: Portugal (PRT) = <code>176</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: VascoDaGamaMeko200Class  = <code>1</code>; </li>
 *     <li> Specific: F331AlvaresCabal  = <code>2</code>; </li>
 *     <li> Entity type uid: 23093; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@64138b0c. </p>
 * @see Country#PORTUGAL_PRT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F331AlvaresCabal extends EntityType
{
    /** Default constructor */
    public F331AlvaresCabal()
    {
        setCountry(Country.PORTUGAL_PRT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23090, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23091, Vasco Da Gama (Meko 200) Class
        setSpecific((byte)2); // uid 23093, F331 Alvares Cabal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F331AlvaresCabal createInstance()
    {
            return new F331AlvaresCabal();
    }
}
