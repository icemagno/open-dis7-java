// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.syr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SelfPropelledArtillery</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SelfPropelledArtillery.createInstance()</code> or <code>new SelfPropelledArtillery()</code>. </p>
 * <ul>
 *     <li> Country: Syrian Arab Republic (SYR) = <code>207</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31702; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3804a9a8. </p>
 * @see Country#SYRIAN_ARAB_REPUBLIC_SYR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery

 */
public final class SelfPropelledArtillery extends EntityType
{
    /** Default constructor */
    public SelfPropelledArtillery()
    {
        setCountry(Country.SYRIAN_ARAB_REPUBLIC_SYR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 31702, Self-Propelled Artillery
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SelfPropelledArtillery createInstance()
    {
            return new SelfPropelledArtillery();
    }
}
