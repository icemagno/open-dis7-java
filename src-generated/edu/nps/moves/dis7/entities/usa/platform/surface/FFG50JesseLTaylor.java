// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FFG50JesseLTaylor</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FFG50JesseLTaylor.createInstance()</code> or <code>new FFG50JesseLTaylor()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: OliverPerryClass  = <code>1</code>; </li>
 *     <li> Specific: FFG50JesseLTaylor  = <code>40</code>; </li>
 *     <li> Entity type uid: 11539; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@50110971. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigate
 * @see SubCategory

 */
public final class FFG50JesseLTaylor extends EntityType
{
    /** Default constructor */
    public FFG50JesseLTaylor()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 11498, Guided Missile Frigate
        setSubCategory((byte)1); // uid 11499, Oliver Perry Class
        setSpecific((byte)40); // uid 11539, FFG 50 Jesse L. Taylor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FFG50JesseLTaylor createInstance()
    {
            return new FFG50JesseLTaylor();
    }
}
