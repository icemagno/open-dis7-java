// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HMMWVANTSQ219TESSATCOM</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HMMWVANTSQ219TESSATCOM.createInstance()</code> or <code>new HMMWVANTSQ219TESSATCOM()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: HighMobilityMultipurposeWheeledVehicleHMMWVHumvee  = <code>1</code>; </li>
 *     <li> Specific: HMMWVANTSQ219TESSATCOM  = <code>29</code>; </li>
 *     <li> Entity type uid: 23002; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7c1447b5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class HMMWVANTSQ219TESSATCOM extends EntityType
{
    /** Default constructor */
    public HMMWVANTSQ219TESSATCOM()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 10348, Small Wheeled Utility Vehicle
        setSubCategory((byte)1); // uid 10349, High Mobility Multipurpose Wheeled Vehicle (HMMWV) Humvee
        setSpecific((byte)29); // uid 23002, HMMWV AN/TSQ-219 TES SATCOM
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HMMWVANTSQ219TESSATCOM createInstance()
    {
            return new HMMWVANTSQ219TESSATCOM();
    }
}
