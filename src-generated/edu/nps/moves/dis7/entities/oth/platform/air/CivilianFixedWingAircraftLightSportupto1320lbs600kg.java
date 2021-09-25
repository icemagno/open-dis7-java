// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CivilianFixedWingAircraftLightSportupto1320lbs600kg</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CivilianFixedWingAircraftLightSportupto1320lbs600kg.createInstance()</code> or <code>new CivilianFixedWingAircraftLightSportupto1320lbs600kg()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Light Sport (up to 1320 lbs / 600 kg) = <code>84</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24691; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@678040b3. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftLightSportupto1320lbs600kg

 */
public final class CivilianFixedWingAircraftLightSportupto1320lbs600kg extends EntityType
{
    /** Default constructor */
    public CivilianFixedWingAircraftLightSportupto1320lbs600kg()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)84); // uid 24691, Civilian Fixed Wing Aircraft, Light Sport (up to 1320 lbs / 600 kg)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CivilianFixedWingAircraftLightSportupto1320lbs600kg createInstance()
    {
            return new CivilianFixedWingAircraftLightSportupto1320lbs600kg();
    }
}
