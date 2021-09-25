// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class1subsistence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Bread</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Bread.createInstance()</code> or <code>new Bread()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_1_SUBSISTENCE</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: S - Other Non-Refrigerated = <code>5</code>; </li>
 *     <li> SubCategory: Bread  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30653; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7d4d65f5. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SOtherNonRefrigerated
 * @see SubCategory

 */
public final class Bread extends EntityType
{
    /** Default constructor */
    public Bread()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_1_SUBSISTENCE));

        setCategory((byte)5); // uid 30652, S - Other Non-Refrigerated
        setSubCategory((byte)1); // uid 30653, Bread
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Bread createInstance()
    {
            return new Bread();
    }
}
