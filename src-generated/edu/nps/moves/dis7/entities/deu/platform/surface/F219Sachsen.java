// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F219Sachsen</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F219Sachsen.createInstance()</code> or <code>new F219Sachsen()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate = <code>6</code>; </li>
 *     <li> SubCategory: SachsenClassType124FFG  = <code>3</code>; </li>
 *     <li> Specific: F219Sachsen  = <code>1</code>; </li>
 *     <li> Entity type uid: 16413; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@13b3d178. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigate
 * @see SubCategory

 */
public final class F219Sachsen extends EntityType
{
    /** Default constructor */
    public F219Sachsen()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 16397, Guided Missile Frigate
        setSubCategory((byte)3); // uid 16412, Sachsen Class (Type 124) (FFG)
        setSpecific((byte)1); // uid 16413, F219 Sachsen
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F219Sachsen createInstance()
    {
            return new F219Sachsen();
    }
}
