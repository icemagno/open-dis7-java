// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class1subsistence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MREMenu01</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MREMenu01.createInstance()</code> or <code>new MREMenu01()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_1_SUBSISTENCE</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: C - Combat Rations = <code>3</code>; </li>
 *     <li> SubCategory: MealReadytoEatMREUSA  = <code>1</code>; </li>
 *     <li> Specific: MREMenu01  = <code>1</code>; </li>
 *     <li> Entity type uid: 30647; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@615bad16. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see CCombatRations
 * @see SubCategory

 */
public final class MREMenu01 extends EntityType
{
    /** Default constructor */
    public MREMenu01()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_1_SUBSISTENCE));

        setCategory((byte)3); // uid 30645, C - Combat Rations
        setSubCategory((byte)1); // uid 30646, Meal Ready to Eat (MRE) - USA
        setSpecific((byte)1); // uid 30647, MRE - Menu 01
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MREMenu01 createInstance()
    {
            return new MREMenu01();
    }
}
