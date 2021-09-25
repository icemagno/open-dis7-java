// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ValiantWMEC621</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ValiantWMEC621.createInstance()</code> or <code>new ValiantWMEC621()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Cutters = <code>62</code>; </li>
 *     <li> SubCategory: RelianceClassWMEC  = <code>4</code>; </li>
 *     <li> Specific: ValiantWMEC621  = <code>11</code>; </li>
 *     <li> Entity type uid: 12145; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1310fcb0. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardCutters
 * @see SubCategory

 */
public final class ValiantWMEC621 extends EntityType
{
    /** Default constructor */
    public ValiantWMEC621()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)62); // uid 12104, Coast Guard Cutters
        setSubCategory((byte)4); // uid 12134, Reliance Class (WMEC)
        setSpecific((byte)11); // uid 12145, Valiant (WMEC 621)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ValiantWMEC621 createInstance()
    {
            return new ValiantWMEC621();
    }
}
