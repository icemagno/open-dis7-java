// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Z9B</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Z9B.createInstance()</code> or <code>new Z9B()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility helicopter = <code>21</code>; </li>
 *     <li> SubCategory: HarbinZ9  = <code>4</code>; </li>
 *     <li> Specific: Z9B  = <code>2</code>; </li>
 *     <li> Entity type uid: 30492; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ffcd140. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Utilityhelicopter
 * @see SubCategory

 */
public final class Z9B extends EntityType
{
    /** Default constructor */
    public Z9B()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 17006, Utility helicopter
        setSubCategory((byte)4); // uid 24752, Harbin Z-9
        setSpecific((byte)2); // uid 30492, Z-9B
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Z9B createInstance()
    {
            return new Z9B();
    }
}
