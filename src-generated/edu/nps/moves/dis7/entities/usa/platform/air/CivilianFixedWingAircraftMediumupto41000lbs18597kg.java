// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CivilianFixedWingAircraftMediumupto41000lbs18597kg</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CivilianFixedWingAircraftMediumupto41000lbs18597kg.createInstance()</code> or <code>new CivilianFixedWingAircraftMediumupto41000lbs18597kg()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg) = <code>86</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23796; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@115dcaea. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftMediumupto41000lbs18597kg

 */
public final class CivilianFixedWingAircraftMediumupto41000lbs18597kg extends EntityType
{
    /** Default constructor */
    public CivilianFixedWingAircraftMediumupto41000lbs18597kg()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)86); // uid 23796, Civilian Fixed Wing Aircraft, Medium (up to 41,000 lbs / 18,597 kg)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CivilianFixedWingAircraftMediumupto41000lbs18597kg createInstance()
    {
            return new CivilianFixedWingAircraftMediumupto41000lbs18597kg();
    }
}
