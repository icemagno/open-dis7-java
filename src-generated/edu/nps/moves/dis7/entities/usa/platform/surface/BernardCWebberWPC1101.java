// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BernardCWebberWPC1101</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BernardCWebberWPC1101.createInstance()</code> or <code>new BernardCWebberWPC1101()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Cutters = <code>62</code>; </li>
 *     <li> SubCategory: SentinelClassWPC  = <code>10</code>; </li>
 *     <li> Specific: BernardCWebberWPC1101  = <code>1</code>; </li>
 *     <li> Entity type uid: 28460; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1a9ec80e. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardCutters
 * @see SubCategory

 */
public final class BernardCWebberWPC1101 extends EntityType
{
    /** Default constructor */
    public BernardCWebberWPC1101()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 12104, Coast Guard Cutters
        setSubCategory((byte)10); // uid 28459, Sentinel Class (WPC)
        setSpecific((byte)1); // uid 28460, Bernard C. Webber (WPC-1101)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BernardCWebberWPC1101 createInstance()
    {
            return new BernardCWebberWPC1101();
    }
}
