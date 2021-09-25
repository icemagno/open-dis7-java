// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TornadoIDSASSTA2</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TornadoIDSASSTA2.createInstance()</code> or <code>new TornadoIDSASSTA2()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: PanaviaTornadoInterdictionStrikeIDS  = <code>2</code>; </li>
 *     <li> Specific: TornadoIDSASSTA2  = <code>6</code>; </li>
 *     <li> Entity type uid: 28087; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@19b843ba. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class TornadoIDSASSTA2 extends EntityType
{
    /** Default constructor */
    public TornadoIDSASSTA2()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 16333, Attack/Strike
        setSubCategory((byte)2); // uid 16340, Panavia Tornado Interdiction/Strike (IDS)
        setSpecific((byte)6); // uid 28087, Tornado IDS ASST A2
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TornadoIDSASSTA2 createInstance()
    {
            return new TornadoIDSASSTA2();
    }
}
