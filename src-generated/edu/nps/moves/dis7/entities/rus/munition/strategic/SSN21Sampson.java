// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SSN21Sampson</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SSN21Sampson.createInstance()</code> or <code>new SSN21Sampson()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>STRATEGIC</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: SSN21Sampson  = <code>8</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 20930; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6704df84. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class SSN21Sampson extends EntityType
{
    /** Default constructor */
    public SSN21Sampson()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)8); // uid 20930, SS-N-21 Sampson
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SSN21Sampson createInstance()
    {
            return new SSN21Sampson();
    }
}
