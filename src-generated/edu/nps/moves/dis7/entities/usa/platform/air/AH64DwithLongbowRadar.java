// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AH64DwithLongbowRadar</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AH64DwithLongbowRadar.createInstance()</code> or <code>new AH64DwithLongbowRadar()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack helicopter = <code>20</code>; </li>
 *     <li> SubCategory: McDonnellDouglasAH64Apache  = <code>1</code>; </li>
 *     <li> Specific: AH64DwithLongbowRadar  = <code>4</code>; </li>
 *     <li> Entity type uid: 11061; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@467b0f6e. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Attackhelicopter
 * @see SubCategory

 */
public final class AH64DwithLongbowRadar extends EntityType
{
    /** Default constructor */
    public AH64DwithLongbowRadar()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)20); // uid 11056, Attack helicopter
        setSubCategory((byte)1); // uid 11057, McDonnell-Douglas AH-64 Apache
        setSpecific((byte)4); // uid 11061, AH-64D with Longbow Radar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AH64DwithLongbowRadar createInstance()
    {
            return new AH64DwithLongbowRadar();
    }
}
