// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Threelevels</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Threelevels.createInstance()</code> or <code>new Threelevels()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Underground facility = <code>8</code>; </li>
 *     <li> SubCategory: Threelevels  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22009; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4fa5cc73. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Undergroundfacility
 * @see SubCategory

 */
public final class Threelevels extends EntityType
{
    /** Default constructor */
    public Threelevels()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)8); // uid 22005, Underground facility
        setSubCategory((byte)3); // uid 22009, Three levels
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Threelevels createInstance()
    {
            return new Threelevels();
    }
}
