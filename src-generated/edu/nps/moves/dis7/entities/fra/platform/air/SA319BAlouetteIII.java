// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SA319BAlouetteIII</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SA319BAlouetteIII.createInstance()</code> or <code>new SA319BAlouetteIII()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility Helicopter = <code>21</code>; </li>
 *     <li> SubCategory: AerospatialeSA316AlouetteIII  = <code>3</code>; </li>
 *     <li> Specific: SA319BAlouetteIII  = <code>4</code>; </li>
 *     <li> Entity type uid: 26333; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@10d307f1. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityHelicopter
 * @see SubCategory

 */
public final class SA319BAlouetteIII extends EntityType
{
    /** Default constructor */
    public SA319BAlouetteIII()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 15827, Utility Helicopter
        setSubCategory((byte)3); // uid 15831, Aerospatiale SA 316 Alouette III
        setSpecific((byte)4); // uid 26333, SA 319B Alouette III
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SA319BAlouetteIII createInstance()
    {
            return new SA319BAlouetteIII();
    }
}
