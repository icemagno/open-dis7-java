// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TAKR300BobHope</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TAKR300BobHope.createInstance()</code> or <code>new TAKR300BobHope()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary, Merchant Marine = <code>17</code>; </li>
 *     <li> SubCategory: TAKRBobHope  = <code>24</code>; </li>
 *     <li> Specific: TAKR300BobHope  = <code>1</code>; </li>
 *     <li> Entity type uid: 26372; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@c1e14f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AuxiliaryMerchantMarine
 * @see SubCategory

 */
public final class TAKR300BobHope extends EntityType
{
    /** Default constructor */
    public TAKR300BobHope()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 11770, Auxiliary, Merchant Marine
        setSubCategory((byte)24); // uid 26371, T-AKR Bob Hope
        setSpecific((byte)1); // uid 26372, T-AKR-300 Bob Hope
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TAKR300BobHope createInstance()
    {
            return new TAKR300BobHope();
    }
}
