// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MHC58Blackhawk</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MHC58Blackhawk.createInstance()</code> or <code>new MHC58Blackhawk()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine countermeasure ship/craft = <code>8</code>; </li>
 *     <li> SubCategory: Ospreyclass  = <code>1</code>; </li>
 *     <li> Specific: MHC58Blackhawk  = <code>8</code>; </li>
 *     <li> Entity type uid: 11597; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@35d26ad2. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Minecountermeasureshipcraft
 * @see SubCategory

 */
public final class MHC58Blackhawk extends EntityType
{
    /** Default constructor */
    public MHC58Blackhawk()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 11588, Mine countermeasure ship/craft
        setSubCategory((byte)1); // uid 11589, Osprey class
        setSpecific((byte)8); // uid 11597, MHC 58 Blackhawk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MHC58Blackhawk createInstance()
    {
            return new MHC58Blackhawk();
    }
}
