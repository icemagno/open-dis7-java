/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RBS15Klauncher</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RBS15Klauncher.createInstance()</code> or <code>new RBS15Klauncher()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: RBS15Klauncher  = <code>2</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 17475; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6198e9b5. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class RBS15Klauncher extends EntityType
{
    /** Default constructor */
    public RBS15Klauncher()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 17473, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 17475, RBS-15K launcher
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RBS15Klauncher createInstance()
    {
            return new RBS15Klauncher();
    }
}
