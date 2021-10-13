// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HH60JJayhawk</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HH60JJayhawk.createInstance()</code> or <code>new HH60JJayhawk()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/patrol helicopter = <code>22</code>; </li>
 *     <li> SubCategory: SikorskyS70B  = <code>3</code>; </li>
 *     <li> Specific: HH60JJayhawk  = <code>4</code>; </li>
 *     <li> Entity type uid: 11147; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5974b7e8. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarepatrolhelicopter
 * @see SubCategory

 */
public final class HH60JJayhawk extends EntityType
{
    /** Default constructor */
    public HH60JJayhawk()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 11133, Anti-Submarine Warfare/patrol helicopter
        setSubCategory((byte)3); // uid 11143, Sikorsky S-70B
        setSpecific((byte)4); // uid 11147, HH-60J Jayhawk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HH60JJayhawk createInstance()
    {
            return new HH60JJayhawk();
    }
}
