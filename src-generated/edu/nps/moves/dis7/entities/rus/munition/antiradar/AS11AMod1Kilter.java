// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.antiradar;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AS11AMod1Kilter</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AS11AMod1Kilter.createInstance()</code> or <code>new AS11AMod1Kilter()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_RADAR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: AS11Kilter  = <code>4</code>; </li>
 *     <li> Specific: AS11AMod1Kilter  = <code>1</code>; </li>
 *     <li> Entity type uid: 20514; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@58c42c8c. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class AS11AMod1Kilter extends EntityType
{
    /** Default constructor */
    public AS11AMod1Kilter()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_RADAR));

        setCategory((byte)1); // uid 20509, Guided
        setSubCategory((byte)4); // uid 20513, AS-11 Kilter
        setSpecific((byte)1); // uid 20514, AS-11A, Mod 1 Kilter
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AS11AMod1Kilter createInstance()
    {
            return new AS11AMod1Kilter();
    }
}
