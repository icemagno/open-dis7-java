// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HainanclassType037fastattackpatrol302</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HainanclassType037fastattackpatrol302.createInstance()</code> or <code>new HainanclassType037fastattackpatrol302()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: HainanclassType037fastattackpatrol  = <code>6</code>; </li>
 *     <li> Specific: _302  = <code>3</code>; </li>
 *     <li> Entity type uid: 17136; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23282c25. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class HainanclassType037fastattackpatrol302 extends EntityType
{
    /** Default constructor */
    public HainanclassType037fastattackpatrol302()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17120, Light/Patrol Craft
        setSubCategory((byte)6); // uid 17133, Hainan class Type 037 (fast attack patrol)
        setSpecific((byte)3); // uid 17136, 302
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HainanclassType037fastattackpatrol302 createInstance()
    {
            return new HainanclassType037fastattackpatrol302();
    }
}
