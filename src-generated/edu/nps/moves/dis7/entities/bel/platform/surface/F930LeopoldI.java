// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bel.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F930LeopoldI</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F930LeopoldI.createInstance()</code> or <code>new F930LeopoldI()</code>. </p>
 * <ul>
 *     <li> Country: Belgium (BEL) = <code>21</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: KarelDoormanClass  = <code>1</code>; </li>
 *     <li> Specific: F930LeopoldI  = <code>1</code>; </li>
 *     <li> Entity type uid: 23322; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@52af6cff. </p>
 * @see Country#BELGIUM_BEL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F930LeopoldI extends EntityType
{
    /** Default constructor */
    public F930LeopoldI()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23320, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23321, Karel Doorman Class
        setSpecific((byte)1); // uid 23322, F930 Leopold I
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F930LeopoldI createInstance()
    {
            return new F930LeopoldI();
    }
}
