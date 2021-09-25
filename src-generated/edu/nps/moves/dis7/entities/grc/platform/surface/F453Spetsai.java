// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.grc.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F453Spetsai</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F453Spetsai.createInstance()</code> or <code>new F453Spetsai()</code>. </p>
 * <ul>
 *     <li> Country: Greece (GRC) = <code>82</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: Hydraclass  = <code>1</code>; </li>
 *     <li> Specific: F453Spetsai  = <code>2</code>; </li>
 *     <li> Entity type uid: 23351; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3fed2870. </p>
 * @see Country#GREECE_GRC
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F453Spetsai extends EntityType
{
    /** Default constructor */
    public F453Spetsai()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 23348, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 23349, Hydra class
        setSpecific((byte)2); // uid 23351, F453 Spetsai
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F453Spetsai createInstance()
    {
            return new F453Spetsai();
    }
}
