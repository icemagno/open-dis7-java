// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F361IverHuitfeldt</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F361IverHuitfeldt.createInstance()</code> or <code>new F361IverHuitfeldt()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: IverHuitfeldtClass  = <code>1</code>; </li>
 *     <li> Specific: F361IverHuitfeldt  = <code>1</code>; </li>
 *     <li> Entity type uid: 25432; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@313ac989. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F361IverHuitfeldt extends EntityType
{
    /** Default constructor */
    public F361IverHuitfeldt()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 25430, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 25431, Iver Huitfeldt Class
        setSpecific((byte)1); // uid 25432, F361 Iver Huitfeldt
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F361IverHuitfeldt createInstance()
    {
            return new F361IverHuitfeldt();
    }
}
