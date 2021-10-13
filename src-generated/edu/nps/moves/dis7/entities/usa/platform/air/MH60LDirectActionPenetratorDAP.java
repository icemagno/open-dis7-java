// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MH60LDirectActionPenetratorDAP</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MH60LDirectActionPenetratorDAP.createInstance()</code> or <code>new MH60LDirectActionPenetratorDAP()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Special Operations helicopter = <code>25</code>; </li>
 *     <li> SubCategory: SikorskyS70A  = <code>1</code>; </li>
 *     <li> Specific: MH60L  = <code>4</code>; </li>
 *     <li> Entity type uid: 23568; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@36776c32. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SpecialOperationshelicopter
 * @see SubCategory

 */
public final class MH60LDirectActionPenetratorDAP extends EntityType
{
    /** Default constructor */
    public MH60LDirectActionPenetratorDAP()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)25); // uid 11184, Special Operations helicopter
        setSubCategory((byte)1); // uid 11185, Sikorsky S-70A
        setSpecific((byte)4); // uid 11189, MH-60L
        setExtra((byte)1); // uid 23568, MH-60L Direct Action Penetrator (DAP)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MH60LDirectActionPenetratorDAP createInstance()
    {
            return new MH60LDirectActionPenetratorDAP();
    }
}
