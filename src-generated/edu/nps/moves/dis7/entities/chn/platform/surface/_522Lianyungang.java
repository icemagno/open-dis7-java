// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_522Lianyungang</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_522Lianyungang.createInstance()</code> or <code>new _522Lianyungang()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: JiangweiIIClassType053H3  = <code>10</code>; </li>
 *     <li> Specific: _522Lianyungang  = <code>2</code>; </li>
 *     <li> Entity type uid: 25191; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@214b199c. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _522Lianyungang extends EntityType
{
    /** Default constructor */
    public _522Lianyungang()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17073, Guided Missile Frigate (FFG)
        setSubCategory((byte)10); // uid 25189, Jiangwei-II Class (Type 053H3)
        setSpecific((byte)2); // uid 25191, 522 Lianyungang
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _522Lianyungang createInstance()
    {
            return new _522Lianyungang();
    }
}
