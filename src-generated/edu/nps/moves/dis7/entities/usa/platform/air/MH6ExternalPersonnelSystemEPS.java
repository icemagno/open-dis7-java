// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MH6ExternalPersonnelSystemEPS</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MH6ExternalPersonnelSystemEPS.createInstance()</code> or <code>new MH6ExternalPersonnelSystemEPS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Special Operations helicopter = <code>25</code>; </li>
 *     <li> SubCategory: McDonnellDouglas500530Defender  = <code>4</code>; </li>
 *     <li> Specific: MH6  = <code>1</code>; </li>
 *     <li> Entity type uid: 26403; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4f486211. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SpecialOperationshelicopter
 * @see SubCategory

 */
public final class MH6ExternalPersonnelSystemEPS extends EntityType
{
    /** Default constructor */
    public MH6ExternalPersonnelSystemEPS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)25); // uid 11184, Special Operations helicopter
        setSubCategory((byte)4); // uid 11201, McDonnell-Douglas 500/530 Defender
        setSpecific((byte)1); // uid 11202, MH-6
        setExtra((byte)1); // uid 26403, MH-6 External Personnel System (EPS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MH6ExternalPersonnelSystemEPS createInstance()
    {
            return new MH6ExternalPersonnelSystemEPS();
    }
}
