// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SupportTankerAOTL</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SupportTankerAOTL.createInstance()</code> or <code>new SupportTankerAOTL()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SupportTankerAOTL  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18854; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@77825085. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class SupportTankerAOTL extends EntityType
{
    /** Default constructor */
    public SupportTankerAOTL()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18847, Auxiliary
        setSubCategory((byte)4); // uid 18854, Support Tanker (AOTL)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SupportTankerAOTL createInstance()
    {
            return new SupportTankerAOTL();
    }
}
