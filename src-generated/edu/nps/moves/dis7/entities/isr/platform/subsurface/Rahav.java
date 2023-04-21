/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Rahav</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Rahav.createInstance()</code> or <code>new Rahav()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSG (Conventional Guided Missile) = <code>4</code>; </li>
 *     <li> SubCategory: GalVickersType540Class  = <code>1</code>; </li>
 *     <li> Specific: Rahav  = <code>3</code>; </li>
 *     <li> Entity type uid: 18253; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2c7d121c. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSGConventionalGuidedMissile
 * @see SubCategory

 */
public final class Rahav extends EntityType
{
    /** Default constructor */
    public Rahav()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 18249, SSG (Conventional Guided Missile)
        setSubCategory((byte)1); // uid 18250, Gal (Vickers Type 540) Class
        setSpecific((byte)3); // uid 18253, Rahav
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Rahav createInstance()
    {
            return new Rahav();
    }
}
