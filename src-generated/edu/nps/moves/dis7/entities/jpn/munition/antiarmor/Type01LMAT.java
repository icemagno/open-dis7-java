// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Type01LMAT</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Type01LMAT.createInstance()</code> or <code>new Type01LMAT()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Type01LMAT  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29031; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1ea930eb. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Type01LMAT extends EntityType
{
    /** Default constructor */
    public Type01LMAT()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)1); // uid 29030, Guided
        setSubCategory((byte)1); // uid 29031, Type 01 LMAT
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Type01LMAT createInstance()
    {
            return new Type01LMAT();
    }
}
