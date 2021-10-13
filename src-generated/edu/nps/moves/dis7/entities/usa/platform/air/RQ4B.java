// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RQ4B</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RQ4B.createInstance()</code> or <code>new RQ4B()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: GlobalHawkUAV  = <code>6</code>; </li>
 *     <li> Specific: RQ4B  = <code>3</code>; </li>
 *     <li> Entity type uid: 32650; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@33bb3f86. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class RQ4B extends EntityType
{
    /** Default constructor */
    public RQ4B()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 11232, Unmanned
        setSubCategory((byte)6); // uid 11242, Global Hawk UAV
        setSpecific((byte)3); // uid 32650, RQ-4B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RQ4B createInstance()
    {
            return new RQ4B();
    }
}
