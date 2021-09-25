// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Aviationfuelsupport</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Aviationfuelsupport.createInstance()</code> or <code>new Aviationfuelsupport()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: KrAZ255B6x67500kgtruck  = <code>13</code>; </li>
 *     <li> Specific: Aviationfuelsupport  = <code>2</code>; </li>
 *     <li> Entity type uid: 12906; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59712875. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class Aviationfuelsupport extends EntityType
{
    /** Default constructor */
    public Aviationfuelsupport()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 12867, Large Wheeled Utility Vehicle
        setSubCategory((byte)13); // uid 12904, KrAZ-255B 6x6 7500-kg truck
        setSpecific((byte)2); // uid 12906, Aviation fuel support
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Aviationfuelsupport createInstance()
    {
            return new Aviationfuelsupport();
    }
}
