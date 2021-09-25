// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AS15ATu95BearHwnuclearwarhead</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AS15ATu95BearHwnuclearwarhead.createInstance()</code> or <code>new AS15ATu95BearHwnuclearwarhead()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>STRATEGIC</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: AS15Kent  = <code>11</code>; </li>
 *     <li> Specific: AS15ATu95BearHwnuclearwarhead  = <code>1</code>; </li>
 *     <li> Entity type uid: 20934; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1412682c. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class AS15ATu95BearHwnuclearwarhead extends EntityType
{
    /** Default constructor */
    public AS15ATu95BearHwnuclearwarhead()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)11); // uid 20933, AS-15 Kent
        setSpecific((byte)1); // uid 20934, AS-15A (Tu-95 Bear-H) w/nuclear warhead
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AS15ATu95BearHwnuclearwarhead createInstance()
    {
            return new AS15ATu95BearHwnuclearwarhead();
    }
}
