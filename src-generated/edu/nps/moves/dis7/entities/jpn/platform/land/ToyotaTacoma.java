// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ToyotaTacoma</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ToyotaTacoma.createInstance()</code> or <code>new ToyotaTacoma()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Cargo Truck = <code>83</code>; </li>
 *     <li> SubCategory: PickupTruckExtendedCab  = <code>5</code>; </li>
 *     <li> Specific: ToyotaTacoma  = <code>1</code>; </li>
 *     <li> Entity type uid: 24899; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c8bca63. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitCargoTruck
 * @see SubCategory

 */
public final class ToyotaTacoma extends EntityType
{
    /** Default constructor */
    public ToyotaTacoma()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24879, Single Unit Cargo Truck
        setSubCategory((byte)5); // uid 24898, Pickup Truck, Extended Cab
        setSpecific((byte)1); // uid 24899, Toyota Tacoma
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ToyotaTacoma createInstance()
    {
            return new ToyotaTacoma();
    }
}
