// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TAGOS11Audacious</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TAGOS11Audacious.createInstance()</code> or <code>new TAGOS11Audacious()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance Towed Array Sonar System (SURTASS) = <code>59</code>; </li>
 *     <li> SubCategory: StalwartClassOceanSurveillance  = <code>8</code>; </li>
 *     <li> Specific: TAGOS11Audacious  = <code>11</code>; </li>
 *     <li> Entity type uid: 12073; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77b5148c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceTowedArraySonarSystemSURTASS
 * @see SubCategory

 */
public final class TAGOS11Audacious extends EntityType
{
    /** Default constructor */
    public TAGOS11Audacious()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)59); // uid 12049, Surveillance Towed Array Sonar System (SURTASS)
        setSubCategory((byte)8); // uid 12062, Stalwart Class (Ocean Surveillance)
        setSpecific((byte)11); // uid 12073, TAGOS 11 Audacious
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TAGOS11Audacious createInstance()
    {
            return new TAGOS11Audacious();
    }
}
