// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HEType83</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HEType83.createInstance()</code> or <code>new HEType83()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _152mm  = <code>17</code>; </li>
 *     <li> Specific: HEType83  = <code>7</code>; </li>
 *     <li> Entity type uid: 21534; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@382d71c7. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class HEType83 extends EntityType
{
    /** Default constructor */
    public HEType83()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21465, Ballistic
        setSubCategory((byte)17); // uid 21527, 152 mm
        setSpecific((byte)7); // uid 21534, HE Type 83
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HEType83 createInstance()
    {
            return new HEType83();
    }
}
