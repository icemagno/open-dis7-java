// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tur.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F245Orucreis</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F245Orucreis.createInstance()</code> or <code>new F245Orucreis()</code>. </p>
 * <ul>
 *     <li> Country: Turkey (TUR) = <code>218</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: Barbarosclass  = <code>1</code>; </li>
 *     <li> Specific: F245Orucreis  = <code>2</code>; </li>
 *     <li> Entity type uid: 23256; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1fb2d5e. </p>
 * @see Country#TURKEY_TUR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F245Orucreis extends EntityType
{
    /** Default constructor */
    public F245Orucreis()
    {
        setCountry(Country.TURKEY_TUR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23253, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23254, Barbaros class
        setSpecific((byte)2); // uid 23256, F245 Orucreis
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F245Orucreis createInstance()
    {
            return new F245Orucreis();
    }
}
