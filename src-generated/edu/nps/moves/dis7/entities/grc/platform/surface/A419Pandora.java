/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A419Pandora</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A419Pandora.createInstance()</code> or <code>new A419Pandora()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Auxiliarytransportsclass  = <code>3</code>; </li>
 *     <li> Specific: A419Pandora  = <code>1</code>; </li>
 *     <li> Entity type uid: 23346; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1af687fe. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A419Pandora extends EntityType
{
    /** Default constructor */
    public A419Pandora()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 23337, Auxiliary
        setSubCategory((byte)3); // uid 23345, Auxiliary transports class
        setSpecific((byte)1); // uid 23346, A419 Pandora
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A419Pandora createInstance()
    {
            return new A419Pandora();
    }
}
