// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pak.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S132Shushuk</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S132Shushuk.createInstance()</code> or <code>new S132Shushuk()</code>. </p>
 * <ul>
 *     <li> Country: Pakistan (PAK) = <code>165</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: HangorDaphneClass  = <code>3</code>; </li>
 *     <li> Specific: S132Shushuk  = <code>2</code>; </li>
 *     <li> Entity type uid: 27244; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f95cd51. </p>
 * @see Country#PAKISTAN_PAK
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S132Shushuk extends EntityType
{
    /** Default constructor */
    public S132Shushuk()
    {
        setCountry(Country.PAKISTAN_PAK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 27234, SS (Conventional Attack - Torpedo, Patrol)
        setSubCategory((byte)3); // uid 27242, Hangor / Daphne Class
        setSpecific((byte)2); // uid 27244, S132 Shushuk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S132Shushuk createInstance()
    {
            return new S132Shushuk();
    }
}
