/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.lva.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M06Talivaldis</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M06Talivaldis.createInstance()</code> or <code>new M06Talivaldis()</code>. </p>
 * <ul>
 *     <li> Country: Latvia (LVA) = <code>254</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: AlkmaarTripartiteClass  = <code>3</code>; </li>
 *     <li> Specific: M06Talivaldis  = <code>3</code>; </li>
 *     <li> Entity type uid: 28304; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d782abe. </p>
 * @see Country#LATVIA_LVA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M06Talivaldis extends EntityType
{
    /** Default constructor */
    public M06Talivaldis()
    {
        setCountry(Country.LATVIA_LVA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27786, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 28301, Alkmaar (Tripartite) Class
        setSpecific((byte)3); // uid 28304, M-06 Talivaldis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M06Talivaldis createInstance()
    {
            return new M06Talivaldis();
    }
}
