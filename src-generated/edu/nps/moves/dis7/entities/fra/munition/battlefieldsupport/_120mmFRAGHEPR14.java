// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_120mmFRAGHEPR14</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_120mmFRAGHEPR14.createInstance()</code> or <code>new _120mmFRAGHEPR14()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _120mmMortarAmmunition  = <code>13</code>; </li>
 *     <li> Specific: _120mmFRAGHEPR14  = <code>1</code>; </li>
 *     <li> Entity type uid: 21173; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@32ab408e. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _120mmFRAGHEPR14 extends EntityType
{
    /** Default constructor */
    public _120mmFRAGHEPR14()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21159, Ballistic
        setSubCategory((byte)13); // uid 21172, 120mm Mortar Ammunition
        setSpecific((byte)1); // uid 21173, 120mm FRAG-HE, PR14
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _120mmFRAGHEPR14 createInstance()
    {
            return new _120mmFRAGHEPR14();
    }
}
