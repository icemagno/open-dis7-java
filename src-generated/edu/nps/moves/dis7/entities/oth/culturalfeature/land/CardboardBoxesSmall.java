// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CardboardBoxesSmall</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CardboardBoxesSmall.createInstance()</code> or <code>new CardboardBoxesSmall()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Obstacle = <code>5</code>; </li>
 *     <li> SubCategory: CardboardBoxes  = <code>21</code>; </li>
 *     <li> Specific: CardboardBoxesSmall  = <code>1</code>; </li>
 *     <li> Entity type uid: 23582; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2aac8ad7. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Obstacle
 * @see SubCategory

 */
public final class CardboardBoxesSmall extends EntityType
{
    /** Default constructor */
    public CardboardBoxesSmall()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)21); // uid 23581, Cardboard Boxes
        setSpecific((byte)1); // uid 23582, Cardboard Boxes Small
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CardboardBoxesSmall createInstance()
    {
            return new CardboardBoxesSmall();
    }
}
