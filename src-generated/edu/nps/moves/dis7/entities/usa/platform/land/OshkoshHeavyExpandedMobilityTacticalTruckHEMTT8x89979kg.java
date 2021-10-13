// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg.createInstance()</code> or <code>new OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg  = <code>19</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 10543; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@67022ea. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg extends EntityType
{
    /** Default constructor */
    public OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)19); // uid 10543, Oshkosh Heavy Expanded Mobility Tactical Truck (HEMTT) 8x8 9979-kg
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg createInstance()
    {
            return new OshkoshHeavyExpandedMobilityTacticalTruckHEMTT8x89979kg();
    }
}
