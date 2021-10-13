// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SH14</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SH14.createInstance()</code> or <code>new SH14()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/Patrol Helicopter = <code>22</code>; </li>
 *     <li> SubCategory: WestlandLynx  = <code>1</code>; </li>
 *     <li> Specific: SH14  = <code>1</code>; </li>
 *     <li> Entity type uid: 28199; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@16afbd92. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarePatrolHelicopter
 * @see SubCategory

 */
public final class SH14 extends EntityType
{
    /** Default constructor */
    public SH14()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 28197, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)1); // uid 28198, Westland Lynx
        setSpecific((byte)1); // uid 28199, SH-14
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SH14 createInstance()
    {
            return new SH14();
    }
}
