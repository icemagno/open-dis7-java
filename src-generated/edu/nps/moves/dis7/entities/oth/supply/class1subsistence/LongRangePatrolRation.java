/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class1subsistence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LongRangePatrolRation</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LongRangePatrolRation.createInstance()</code> or <code>new LongRangePatrolRation()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_1_SUBSISTENCE</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: C - Combat Rations = <code>3</code>; </li>
 *     <li> SubCategory: MealReadytoEatMREUSA  = <code>1</code>; </li>
 *     <li> Specific: LongRangePatrolRation  = <code>5</code>; </li>
 *     <li> Entity type uid: 30651; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7535f28. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see CCombatRations
 * @see SubCategory

 */
public final class LongRangePatrolRation extends EntityType
{
    /** Default constructor */
    public LongRangePatrolRation()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_1_SUBSISTENCE));

        setCategory((byte)3); // uid 30645, C - Combat Rations
        setSubCategory((byte)1); // uid 30646, Meal Ready to Eat (MRE) - USA
        setSpecific((byte)5); // uid 30651, Long Range Patrol Ration
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LongRangePatrolRation createInstance()
    {
            return new LongRangePatrolRation();
    }
}
