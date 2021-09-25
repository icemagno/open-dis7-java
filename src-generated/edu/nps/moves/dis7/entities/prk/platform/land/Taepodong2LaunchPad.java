// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Taepodong2LaunchPad</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Taepodong2LaunchPad.createInstance()</code> or <code>new Taepodong2LaunchPad()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Missile Defense Facility = <code>38</code>; </li>
 *     <li> SubCategory: Taepodong2LaunchPad  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27173; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5dbe30be. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MissileDefenseFacility
 * @see SubCategory

 */
public final class Taepodong2LaunchPad extends EntityType
{
    /** Default constructor */
    public Taepodong2LaunchPad()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)38); // uid 27172, Missile Defense Facility
        setSubCategory((byte)1); // uid 27173, Taepodong-2 Launch Pad
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Taepodong2LaunchPad createInstance()
    {
            return new Taepodong2LaunchPad();
    }
}
