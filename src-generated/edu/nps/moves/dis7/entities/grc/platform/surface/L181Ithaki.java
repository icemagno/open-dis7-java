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
 * <p> Entity class <b><code>L181Ithaki</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L181Ithaki.createInstance()</code> or <code>new L181Ithaki()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Cushion/Surface Effect = <code>15</code>; </li>
 *     <li> SubCategory: ZubrClass  = <code>1</code>; </li>
 *     <li> Specific: L181Ithaki  = <code>2</code>; </li>
 *     <li> Entity type uid: 23334; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@78fb9a67. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirCushionSurfaceEffect
 * @see SubCategory

 */
public final class L181Ithaki extends EntityType
{
    /** Default constructor */
    public L181Ithaki()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 23331, Air Cushion/Surface Effect
        setSubCategory((byte)1); // uid 23332, Zubr Class
        setSpecific((byte)2); // uid 23334, L181 Ithaki
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L181Ithaki createInstance()
    {
            return new L181Ithaki();
    }
}
