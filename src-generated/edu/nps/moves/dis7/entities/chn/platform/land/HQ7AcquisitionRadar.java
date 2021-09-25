// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HQ7AcquisitionRadar</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HQ7AcquisitionRadar.createInstance()</code> or <code>new HQ7AcquisitionRadar()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: HQ7SAMSystem  = <code>6</code>; </li>
 *     <li> Specific: HQ7AcquisitionRadar  = <code>1</code>; </li>
 *     <li> Entity type uid: 24036; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1068e947. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class HQ7AcquisitionRadar extends EntityType
{
    /** Default constructor */
    public HQ7AcquisitionRadar()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16937, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)6); // uid 24035, HQ-7 SAM System
        setSpecific((byte)1); // uid 24036, HQ-7 Acquisition Radar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HQ7AcquisitionRadar createInstance()
    {
            return new HQ7AcquisitionRadar();
    }
}
