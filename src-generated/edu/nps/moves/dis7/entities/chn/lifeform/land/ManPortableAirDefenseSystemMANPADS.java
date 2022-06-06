// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ManPortableAirDefenseSystemMANPADS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ManPortableAirDefenseSystemMANPADS.createInstance()</code> or <code>new ManPortableAirDefenseSystemMANPADS()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Army = <code>11</code>; </li>
 *     <li> SubCategory: ManPortableAirDefenseSystemMANPADS  = <code>85</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 34294; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4b8a0d03. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Army
 * @see SubCategory

 */
public final class ManPortableAirDefenseSystemMANPADS extends EntityType
{
    /** Default constructor */
    public ManPortableAirDefenseSystemMANPADS()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 34293, Army
        setSubCategory((byte)85); // uid 34294, Man-Portable Air Defense System (MANPADS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ManPortableAirDefenseSystemMANPADS createInstance()
    {
            return new ManPortableAirDefenseSystemMANPADS();
    }
}