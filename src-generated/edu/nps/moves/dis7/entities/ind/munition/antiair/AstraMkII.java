// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AstraMkII</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AstraMkII.createInstance()</code> or <code>new AstraMkII()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Astra  = <code>2</code>; </li>
 *     <li> Specific: AstraMkII  = <code>2</code>; </li>
 *     <li> Entity type uid: 28964; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e43f049. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class AstraMkII extends EntityType
{
    /** Default constructor */
    public AstraMkII()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21742, Guided
        setSubCategory((byte)2); // uid 28962, Astra
        setSpecific((byte)2); // uid 28964, Astra Mk.II
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AstraMkII createInstance()
    {
            return new AstraMkII();
    }
}
