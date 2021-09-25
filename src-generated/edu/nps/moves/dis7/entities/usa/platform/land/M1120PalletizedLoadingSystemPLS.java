// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1120PalletizedLoadingSystemPLS</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1120PalletizedLoadingSystemPLS.createInstance()</code> or <code>new M1120PalletizedLoadingSystemPLS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg  = <code>19</code>; </li>
 *     <li> Specific: M1120PalletizedLoadingSystemPLS  = <code>14</code>; </li>
 *     <li> Entity type uid: 23555; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4d9754a8. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class M1120PalletizedLoadingSystemPLS extends EntityType
{
    /** Default constructor */
    public M1120PalletizedLoadingSystemPLS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)19); // uid 10543, Oshkosh Heavy Expanded Mobility Tactical Truck (HEMTT) 8x8 9979-kg
        setSpecific((byte)14); // uid 23555, M1120 Palletized Loading System (PLS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1120PalletizedLoadingSystemPLS createInstance()
    {
            return new M1120PalletizedLoadingSystemPLS();
    }
}
