// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class4constructionmaterials;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NailsBox</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NailsBox.createInstance()</code> or <code>new NailsBox()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_4_CONSTRUCTION_MATERIALS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: A - Construction = <code>2</code>; </li>
 *     <li> SubCategory: NailsBox  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30691; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@57f2e67. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see AConstruction
 * @see SubCategory

 */
public final class NailsBox extends EntityType
{
    /** Default constructor */
    public NailsBox()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_4_CONSTRUCTION_MATERIALS));

        setCategory((byte)2); // uid 30690, A - Construction
        setSubCategory((byte)1); // uid 30691, Nails, Box
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NailsBox createInstance()
    {
            return new NailsBox();
    }
}
