// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.esp.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F81SantaMaria</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F81SantaMaria.createInstance()</code> or <code>new F81SantaMaria()</code>. </p>
 * <ul>
 *     <li> Country: Spain (ESP) = <code>198</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: SantaMariaClassFFG  = <code>3</code>; </li>
 *     <li> Specific: F81SantaMaria  = <code>1</code>; </li>
 *     <li> Entity type uid: 19010; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a2ef072. </p>
 * @see Country#SPAIN_ESP
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F81SantaMaria extends EntityType
{
    /** Default constructor */
    public F81SantaMaria()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 19005, Guided Missile Frigate (FFG)
        setSubCategory((byte)3); // uid 19009, Santa Maria Class (FFG)
        setSpecific((byte)1); // uid 19010, F81 Santa Maria
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F81SantaMaria createInstance()
    {
            return new F81SantaMaria();
    }
}
