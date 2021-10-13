// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M51Stage3Booster</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M51Stage3Booster.createInstance()</code> or <code>new M51Stage3Booster()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>STRATEGIC</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: M51SLBM  = <code>6</code>; </li>
 *     <li> Specific: M51Stage3Booster  = <code>6</code>; </li>
 *     <li> Entity type uid: 32472; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a1a412e. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class M51Stage3Booster extends EntityType
{
    /** Default constructor */
    public M51Stage3Booster()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21195, Guided
        setSubCategory((byte)6); // uid 29002, M51 SLBM
        setSpecific((byte)6); // uid 32472, M51 Stage 3 Booster
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M51Stage3Booster createInstance()
    {
            return new M51Stage3Booster();
    }
}
