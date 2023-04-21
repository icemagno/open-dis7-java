/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ViraatR22exHermesR12</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ViraatR22exHermesR12.createInstance()</code> or <code>new ViraatR22exHermesR12()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light Carrier = <code>12</code>; </li>
 *     <li> SubCategory: ViraatClassexCentaurClass  = <code>1</code>; </li>
 *     <li> Specific: ViraatR22exHermesR12  = <code>1</code>; </li>
 *     <li> Entity type uid: 26555; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3f6db3fb. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightCarrier
 * @see SubCategory

 */
public final class ViraatR22exHermesR12 extends EntityType
{
    /** Default constructor */
    public ViraatR22exHermesR12()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)12); // uid 26553, Light Carrier
        setSubCategory((byte)1); // uid 26554, Viraat Class (ex-Centaur Class)
        setSpecific((byte)1); // uid 26555, Viraat R22 (ex-Hermes R12)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ViraatR22exHermesR12 createInstance()
    {
            return new ViraatR22exHermesR12();
    }
}
