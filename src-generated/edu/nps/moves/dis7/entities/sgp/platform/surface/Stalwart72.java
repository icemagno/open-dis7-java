// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sgp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Stalwart72</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Stalwart72.createInstance()</code> or <code>new Stalwart72()</code>. </p>
 * <ul>
 *     <li> Country: Singapore (SGP) = <code>193</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: FormidableClass  = <code>1</code>; </li>
 *     <li> Specific: Stalwart72  = <code>5</code>; </li>
 *     <li> Entity type uid: 25358; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@11f406f8. </p>
 * @see Country#SINGAPORE_SGP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class Stalwart72 extends EntityType
{
    /** Default constructor */
    public Stalwart72()
    {
        setCountry(Country.SINGAPORE_SGP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 25352, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 25353, Formidable Class
        setSpecific((byte)5); // uid 25358, Stalwart 72
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Stalwart72 createInstance()
    {
            return new Stalwart72();
    }
}
