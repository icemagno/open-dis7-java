// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mmr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_447YanPangAung</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_447YanPangAung.createInstance()</code> or <code>new _447YanPangAung()</code>. </p>
 * <ul>
 *     <li> Country: Myanmar (MMR) = <code>35</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: HainanClassType037  = <code>1</code>; </li>
 *     <li> Specific: _447YanPangAung  = <code>6</code>; </li>
 *     <li> Entity type uid: 32912; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@aa22f1c. </p>
 * @see Country#MYANMAR_MMR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _447YanPangAung extends EntityType
{
    /** Default constructor */
    public _447YanPangAung()
    {
        setCountry(Country.MYANMAR_MMR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 32905, Light/Patrol Craft
        setSubCategory((byte)1); // uid 32906, Hainan Class (Type 037)
        setSpecific((byte)6); // uid 32912, 447 Yan Pang Aung
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _447YanPangAung createInstance()
    {
            return new _447YanPangAung();
    }
}
