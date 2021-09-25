// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mmr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>JianghuIIClassType053H1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>JianghuIIClassType053H1.createInstance()</code> or <code>new JianghuIIClassType053H1()</code>. </p>
 * <ul>
 *     <li> Country: Myanmar (MMR) = <code>35</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: JianghuIIClassType053H1  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 26767; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7689ddef. </p>
 * @see Country#MYANMAR_MMR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class JianghuIIClassType053H1 extends EntityType
{
    /** Default constructor */
    public JianghuIIClassType053H1()
    {
        setCountry(Country.MYANMAR_MMR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 26766, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 26767, Jianghu-II Class (Type 053H1)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static JianghuIIClassType053H1 createInstance()
    {
            return new JianghuIIClassType053H1();
    }
}
