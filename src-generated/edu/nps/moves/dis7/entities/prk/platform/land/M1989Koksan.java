// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1989Koksan</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1989Koksan.createInstance()</code> or <code>new M1989Koksan()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Democratic Peoples Republic of) (PRK) = <code>119</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: _170mmSelfPropelledGun  = <code>1</code>; </li>
 *     <li> Specific: M1989Koksan  = <code>2</code>; </li>
 *     <li> Entity type uid: 17753; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2a1edad4. </p>
 * @see Country#KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class M1989Koksan extends EntityType
{
    /** Default constructor */
    public M1989Koksan()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 17750, Self-Propelled Artillery
        setSubCategory((byte)1); // uid 17751, 170 mm Self Propelled Gun
        setSpecific((byte)2); // uid 17753, M1989 Koksan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1989Koksan createInstance()
    {
            return new M1989Koksan();
    }
}
