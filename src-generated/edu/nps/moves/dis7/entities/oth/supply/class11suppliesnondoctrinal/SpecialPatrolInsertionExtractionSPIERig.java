/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class11suppliesnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SpecialPatrolInsertionExtractionSPIERig</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SpecialPatrolInsertionExtractionSPIERig.createInstance()</code> or <code>new SpecialPatrolInsertionExtractionSPIERig()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_11_SUPPLIES_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Other = <code>1</code>; </li>
 *     <li> SubCategory: SpecialPatrolInsertionExtractionSPIERig  = <code>2</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 30809; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1c79d093. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see Other
 * @see SubCategory

 */
public final class SpecialPatrolInsertionExtractionSPIERig extends EntityType
{
    /** Default constructor */
    public SpecialPatrolInsertionExtractionSPIERig()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_11_SUPPLIES_NON_DOCTRINAL));

        setCategory((byte)1); // uid 30807, Other
        setSubCategory((byte)2); // uid 30809, Special Patrol Insertion/Extraction (SPIE) Rig
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SpecialPatrolInsertionExtractionSPIERig createInstance()
    {
            return new SpecialPatrolInsertionExtractionSPIERig();
    }
}
