// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HLVWRecovery</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HLVWRecovery.createInstance()</code> or <code>new HLVWRecovery()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: HeavyLogisticsVehicleWheeledHLVW  = <code>2</code>; </li>
 *     <li> Specific: HLVWRecovery  = <code>2</code>; </li>
 *     <li> Entity type uid: 31023; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31610302. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class HLVWRecovery extends EntityType
{
    /** Default constructor */
    public HLVWRecovery()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 27893, Large Wheeled Utility Vehicle
        setSubCategory((byte)2); // uid 31021, Heavy Logistics Vehicle Wheeled (HLVW)
        setSpecific((byte)2); // uid 31023, HLVW Recovery
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HLVWRecovery createInstance()
    {
            return new HLVWRecovery();
    }
}
