/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class2clothingindividualequipmenttoolsadminsupplies;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RopeYellow85m170ft</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RopeYellow85m170ft.createInstance()</code> or <code>new RopeYellow85m170ft()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_2_CLOTHING_INDIVIDUAL_EQUIPMENT_TOOLS_ADMIN_SUPPLIES</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: B - Ground Support Materiel = <code>3</code>; </li>
 *     <li> SubCategory: Rope  = <code>4</code>; </li>
 *     <li> Specific: RopeYellow85m170ft  = <code>1</code>; </li>
 *     <li> Entity type uid: 31920; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@14499b52. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see BGroundSupportMateriel
 * @see SubCategory

 */
public final class RopeYellow85m170ft extends EntityType
{
    /** Default constructor */
    public RopeYellow85m170ft()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_2_CLOTHING_INDIVIDUAL_EQUIPMENT_TOOLS_ADMIN_SUPPLIES));

        setCategory((byte)3); // uid 30659, B - Ground Support Materiel
        setSubCategory((byte)4); // uid 31919, Rope
        setSpecific((byte)1); // uid 31920, Rope Yellow 85m/170ft
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RopeYellow85m170ft createInstance()
    {
            return new RopeYellow85m170ft();
    }
}
