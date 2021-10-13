// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BETAB150DSHEconcretepiercing</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BETAB150DSHEconcretepiercing.createInstance()</code> or <code>new BETAB150DSHEconcretepiercing()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: BETAB150DSHEconcretepiercing  = <code>34</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 20886; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5b332439. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class BETAB150DSHEconcretepiercing extends EntityType
{
    /** Default constructor */
    public BETAB150DSHEconcretepiercing()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)34); // uid 20886, BETAB-150DS HE concrete-piercing
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BETAB150DSHEconcretepiercing createInstance()
    {
            return new BETAB150DSHEconcretepiercing();
    }
}
