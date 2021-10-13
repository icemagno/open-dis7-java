// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>K72Sindhudurg</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>K72Sindhudurg.createInstance()</code> or <code>new K72Sindhudurg()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft(PC) = <code>7</code>; </li>
 *     <li> SubCategory: DurgNanuchkaIIClassFSG  = <code>4</code>; </li>
 *     <li> Specific: K72Sindhudurg  = <code>1</code>; </li>
 *     <li> Entity type uid: 18839; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@62ef27a8. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraftPC
 * @see SubCategory

 */
public final class K72Sindhudurg extends EntityType
{
    /** Default constructor */
    public K72Sindhudurg()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18833, Light/Patrol Craft(PC)
        setSubCategory((byte)4); // uid 18838, Durg (Nanuchka II) Class (FSG)
        setSpecific((byte)1); // uid 18839, K72 Sindhudurg
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static K72Sindhudurg createInstance()
    {
            return new K72Sindhudurg();
    }
}
