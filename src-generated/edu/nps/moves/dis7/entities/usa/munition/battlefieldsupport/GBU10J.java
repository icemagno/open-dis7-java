// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GBU10J</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GBU10J.createInstance()</code> or <code>new GBU10J()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: BLU109BBomb  = <code>20</code>; </li>
 *     <li> Specific: GBU10J  = <code>3</code>; </li>
 *     <li> Entity type uid: 19948; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ff03361. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class GBU10J extends EntityType
{
    /** Default constructor */
    public GBU10J()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 19887, Guided
        setSubCategory((byte)20); // uid 19945, BLU-109/B Bomb
        setSpecific((byte)3); // uid 19948, GBU-10J
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GBU10J createInstance()
    {
            return new GBU10J();
    }
}
