// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1A1SA</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1A1SA.createInstance()</code> or <code>new M1A1SA()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: M1Abrams  = <code>1</code>; </li>
 *     <li> Specific: M1A1SA  = <code>13</code>; </li>
 *     <li> Entity type uid: 26159; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@261db982. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class M1A1SA extends EntityType
{
    /** Default constructor */
    public M1A1SA()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 10018, Tank
        setSubCategory((byte)1); // uid 10019, M1 Abrams
        setSpecific((byte)13); // uid 26159, M1A1 SA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1A1SA createInstance()
    {
            return new M1A1SA();
    }
}
