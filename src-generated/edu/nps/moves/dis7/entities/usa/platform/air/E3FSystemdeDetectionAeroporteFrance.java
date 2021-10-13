// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>E3FSystemdeDetectionAeroporteFrance</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>E3FSystemdeDetectionAeroporteFrance.createInstance()</code> or <code>new E3FSystemdeDetectionAeroporteFrance()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance / C2 (Airborne Early Warning) = <code>8</code>; </li>
 *     <li> SubCategory: BoeingE3SentryAirborneWarningandControlSystemAWACS  = <code>4</code>; </li>
 *     <li> Specific: E3FSystemdeDetectionAeroporteFrance  = <code>5</code>; </li>
 *     <li> Entity type uid: 11042; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@43ac0a68. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceC2AirborneEarlyWarning
 * @see SubCategory

 */
public final class E3FSystemdeDetectionAeroporteFrance extends EntityType
{
    /** Default constructor */
    public E3FSystemdeDetectionAeroporteFrance()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 11029, Surveillance / C2 (Airborne Early Warning)
        setSubCategory((byte)4); // uid 11037, Boeing E-3 Sentry Airborne Warning and Control System (AWACS)
        setSpecific((byte)5); // uid 11042, E-3F System de Detection Aeroporte (France)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static E3FSystemdeDetectionAeroporteFrance createInstance()
    {
            return new E3FSystemdeDetectionAeroporteFrance();
    }
}
