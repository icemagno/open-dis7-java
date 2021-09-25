// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_793HaiLungTaiwan</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_793HaiLungTaiwan.createInstance()</code> or <code>new _793HaiLungTaiwan()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: HaiLungClass  = <code>2</code>; </li>
 *     <li> Specific: _793HaiLungTaiwan  = <code>1</code>; </li>
 *     <li> Entity type uid: 18951; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@344344fa. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class _793HaiLungTaiwan extends EntityType
{
    /** Default constructor */
    public _793HaiLungTaiwan()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18948, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)2); // uid 18950, Hai Lung Class
        setSpecific((byte)1); // uid 18951, 793 Hai Lung (Taiwan)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _793HaiLungTaiwan createInstance()
    {
            return new _793HaiLungTaiwan();
    }
}
