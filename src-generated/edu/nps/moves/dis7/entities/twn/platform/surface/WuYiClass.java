// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WuYiClass</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WuYiClass.createInstance()</code> or <code>new WuYiClass()</code>. </p>
 * <ul>
 *     <li> Country: Taiwan, Province of China (TWN) = <code>208</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Combat Support Ship = <code>60</code>; </li>
 *     <li> SubCategory: WuYiClass  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19235; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5a6fa56e. </p>
 * @see Country#TAIWAN_PROVINCE_OF_CHINA_TWN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastCombatSupportShip
 * @see SubCategory

 */
public final class WuYiClass extends EntityType
{
    /** Default constructor */
    public WuYiClass()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)60); // uid 19234, Fast Combat Support Ship
        setSubCategory((byte)1); // uid 19235, Wu Yi Class
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WuYiClass createInstance()
    {
            return new WuYiClass();
    }
}
