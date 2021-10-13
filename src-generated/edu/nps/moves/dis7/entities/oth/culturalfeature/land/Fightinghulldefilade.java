// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Fightinghulldefilade</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Fightinghulldefilade.createInstance()</code> or <code>new Fightinghulldefilade()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Prepared positions = <code>7</code>; </li>
 *     <li> SubCategory: Fightinghulldefilade  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 21997; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@498a4d62. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Preparedpositions
 * @see SubCategory

 */
public final class Fightinghulldefilade extends EntityType
{
    /** Default constructor */
    public Fightinghulldefilade()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 21994, Prepared positions
        setSubCategory((byte)2); // uid 21997, Fighting, hull defilade
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Fightinghulldefilade createInstance()
    {
            return new Fightinghulldefilade();
    }
}
