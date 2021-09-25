// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pak.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Saab2000AEWC</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Saab2000AEWC.createInstance()</code> or <code>new Saab2000AEWC()</code>. </p>
 * <ul>
 *     <li> Country: Pakistan (PAK) = <code>165</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Surveillance/C2 (Airborne Early Warning) = <code>8</code>; </li>
 *     <li> SubCategory: Saab2000AEWC  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24809; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@606fc505. </p>
 * @see Country#PAKISTAN_PAK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SurveillanceC2AirborneEarlyWarning
 * @see SubCategory

 */
public final class Saab2000AEWC extends EntityType
{
    /** Default constructor */
    public Saab2000AEWC()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 24808, Surveillance/C2 (Airborne Early Warning)
        setSubCategory((byte)1); // uid 24809, Saab 2000 AEW&C
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Saab2000AEWC createInstance()
    {
            return new Saab2000AEWC();
    }
}
