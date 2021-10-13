// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MackMC3ArtilleryTractor</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MackMC3ArtilleryTractor.createInstance()</code> or <code>new MackMC3ArtilleryTractor()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: MackMC36x6HeavyUtilityTruck  = <code>6</code>; </li>
 *     <li> Specific: MackMC3ArtilleryTractor  = <code>4</code>; </li>
 *     <li> Entity type uid: 31288; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6a6824be. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class MackMC3ArtilleryTractor extends EntityType
{
    /** Default constructor */
    public MackMC3ArtilleryTractor()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 29715, Large Wheeled Utility Vehicle
        setSubCategory((byte)6); // uid 31284, Mack MC3 6x6 Heavy Utility Truck
        setSpecific((byte)4); // uid 31288, Mack MC3 Artillery Tractor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MackMC3ArtilleryTractor createInstance()
    {
            return new MackMC3ArtilleryTractor();
    }
}
