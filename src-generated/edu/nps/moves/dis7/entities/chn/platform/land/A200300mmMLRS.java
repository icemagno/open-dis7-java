// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A200300mmMLRS</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A200300mmMLRS.createInstance()</code> or <code>new A200300mmMLRS()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Self-Propelled Artillery = <code>4</code>; </li>
 *     <li> SubCategory: A100300mm8x8MultipleLaunchRocketSystemMLRS  = <code>28</code>; </li>
 *     <li> Specific: A200300mmMLRS  = <code>2</code>; </li>
 *     <li> Entity type uid: 31963; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@12c8a2c0. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SelfPropelledArtillery
 * @see SubCategory

 */
public final class A200300mmMLRS extends EntityType
{
    /** Default constructor */
    public A200300mmMLRS()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 16884, Self-Propelled Artillery
        setSubCategory((byte)28); // uid 31961, A-100 300mm 8x8 Multiple Launch Rocket System (MLRS)
        setSpecific((byte)2); // uid 31963, A-200 300mm MLRS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A200300mmMLRS createInstance()
    {
            return new A200300mmMLRS();
    }
}
