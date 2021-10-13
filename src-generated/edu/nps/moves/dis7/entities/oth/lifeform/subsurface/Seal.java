// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Seal</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Seal.createInstance()</code> or <code>new Seal()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Mammal = <code>201</code>; </li>
 *     <li> SubCategory: Seal  = <code>120</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32274; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@121ddca4. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Mammal
 * @see SubCategory

 */
public final class Seal extends EntityType
{
    /** Default constructor */
    public Seal()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)201); // uid 32270, Mammal
        setSubCategory((byte)120); // uid 32274, Seal
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Seal createInstance()
    {
            return new Seal();
    }
}
