// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M997A1AmbulancewAddOnArmor</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M997A1AmbulancewAddOnArmor.createInstance()</code> or <code>new M997A1AmbulancewAddOnArmor()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: HighMobilityMultipurposeWheeledVehicleHMMWVHumvee  = <code>1</code>; </li>
 *     <li> Specific: M997MaxiAmbulance4Litter  = <code>12</code>; </li>
 *     <li> Entity type uid: 25629; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3138953b. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class M997A1AmbulancewAddOnArmor extends EntityType
{
    /** Default constructor */
    public M997A1AmbulancewAddOnArmor()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 10349, High Mobility Multipurpose Wheeled Vehicle (HMMWV) Humvee
        setSpecific((byte)12); // uid 10361, M997 Maxi-Ambulance (4-Litter)
        setExtra((byte)1); // uid 25629, M997A1 Ambulance w/ Add-On Armor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M997A1AmbulancewAddOnArmor createInstance()
    {
            return new M997A1AmbulancewAddOnArmor();
    }
}
