// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LCS4Coronado</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LCS4Coronado.createInstance()</code> or <code>new LCS4Coronado()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Littoral Combat Ships (LCS) = <code>20</code>; </li>
 *     <li> SubCategory: LCSIndependenceClass  = <code>2</code>; </li>
 *     <li> Specific: LCS4Coronado  = <code>2</code>; </li>
 *     <li> Entity type uid: 26927; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23e3f5cd. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LittoralCombatShipsLCS
 * @see SubCategory

 */
public final class LCS4Coronado extends EntityType
{
    /** Default constructor */
    public LCS4Coronado()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)20); // uid 26921, Littoral Combat Ships (LCS)
        setSubCategory((byte)2); // uid 26923, LCS Independence Class
        setSpecific((byte)2); // uid 26927, LCS 4 Coronado
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LCS4Coronado createInstance()
    {
            return new LCS4Coronado();
    }
}
