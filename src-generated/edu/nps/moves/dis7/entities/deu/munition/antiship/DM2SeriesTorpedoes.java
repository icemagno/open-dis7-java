// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DM2SeriesTorpedoes</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DM2SeriesTorpedoes.createInstance()</code> or <code>new DM2SeriesTorpedoes()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SHIP</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: DM2SeriesTorpedoes  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 21239; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@37e7c4cc. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class DM2SeriesTorpedoes extends EntityType
{
    /** Default constructor */
    public DM2SeriesTorpedoes()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21234, Guided
        setSubCategory((byte)5); // uid 21239, DM2 Series Torpedoes
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DM2SeriesTorpedoes createInstance()
    {
            return new DM2SeriesTorpedoes();
    }
}
