// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CH53GAwdoorgunsMG3</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CH53GAwdoorgunsMG3.createInstance()</code> or <code>new CH53GAwdoorgunsMG3()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility Helicopter = <code>21</code>; </li>
 *     <li> SubCategory: SikorskyS65A  = <code>9</code>; </li>
 *     <li> Specific: CH53GA  = <code>4</code>; </li>
 *     <li> Entity type uid: 28037; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7c3fdb62. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityHelicopter
 * @see SubCategory

 */
public final class CH53GAwdoorgunsMG3 extends EntityType
{
    /** Default constructor */
    public CH53GAwdoorgunsMG3()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 16366, Utility Helicopter
        setSubCategory((byte)9); // uid 28025, Sikorsky S-65A
        setSpecific((byte)4); // uid 28036, CH-53GA
        setExtra((byte)1); // uid 28037, CH-53GA w/ doorguns MG3
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CH53GAwdoorgunsMG3 createInstance()
    {
            return new CH53GAwdoorgunsMG3();
    }
}
