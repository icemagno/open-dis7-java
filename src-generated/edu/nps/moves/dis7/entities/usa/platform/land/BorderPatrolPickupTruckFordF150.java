// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BorderPatrolPickupTruckFordF150</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BorderPatrolPickupTruckFordF150.createInstance()</code> or <code>new BorderPatrolPickupTruckFordF150()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Utility/Emergency Truck = <code>84</code>; </li>
 *     <li> SubCategory: PolicePickupTruck  = <code>23</code>; </li>
 *     <li> Specific: PolicePickupTruckFordF150  = <code>1</code>; </li>
 *     <li> Entity type uid: 28321; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@32118208. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitUtilityEmergencyTruck
 * @see SubCategory

 */
public final class BorderPatrolPickupTruckFordF150 extends EntityType
{
    /** Default constructor */
    public BorderPatrolPickupTruckFordF150()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)84); // uid 24952, Single Unit Utility/Emergency Truck
        setSubCategory((byte)23); // uid 24953, Police, Pickup Truck
        setSpecific((byte)1); // uid 24954, Police Pickup Truck, Ford F-150
        setExtra((byte)1); // uid 28321, Border Patrol Pickup Truck, Ford F-150
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BorderPatrolPickupTruckFordF150 createInstance()
    {
            return new BorderPatrolPickupTruckFordF150();
    }
}
