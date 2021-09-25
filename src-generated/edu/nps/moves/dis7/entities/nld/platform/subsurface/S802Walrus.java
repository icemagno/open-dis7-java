// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S802Walrus</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S802Walrus.createInstance()</code> or <code>new S802Walrus()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: WalrusClass  = <code>1</code>; </li>
 *     <li> Specific: S802Walrus  = <code>1</code>; </li>
 *     <li> Entity type uid: 23284; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30c31dd7. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S802Walrus extends EntityType
{
    /** Default constructor */
    public S802Walrus()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18948, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 18949, Walrus Class
        setSpecific((byte)1); // uid 23284, S802 Walrus
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S802Walrus createInstance()
    {
            return new S802Walrus();
    }
}
