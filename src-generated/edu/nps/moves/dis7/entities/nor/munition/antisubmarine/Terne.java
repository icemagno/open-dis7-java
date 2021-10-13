// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nor.munition.antisubmarine;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Terne</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Terne.createInstance()</code> or <code>new Terne()</code>. </p>
 * <ul>
 *     <li> Country: Norway (NOR) = <code>163</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SUBMARINE</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: Terne  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27020; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5bec3e0. </p>
 * @see Country#NORWAY_NOR
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class Terne extends EntityType
{
    /** Default constructor */
    public Terne()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SUBMARINE));

        setCategory((byte)2); // uid 27019, Ballistic
        setSubCategory((byte)1); // uid 27020, Terne
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Terne createInstance()
    {
            return new Terne();
    }
}
