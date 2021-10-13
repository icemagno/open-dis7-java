// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S302Utstein</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S302Utstein.createInstance()</code> or <code>new S302Utstein()</code>. </p>
 * <ul>
 *     <li> Country: Norway (NOR) = <code>163</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS(Conventional Attack-Torpedo Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: UlaClass  = <code>2</code>; </li>
 *     <li> Specific: S302Utstein  = <code>3</code>; </li>
 *     <li> Entity type uid: 27619; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2575f671. </p>
 * @see Country#NORWAY_NOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S302Utstein extends EntityType
{
    /** Default constructor */
    public S302Utstein()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18989, SS(Conventional Attack-Torpedo Patrol)
        setSubCategory((byte)2); // uid 18997, Ula Class
        setSpecific((byte)3); // uid 27619, S302 Utstein
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S302Utstein createInstance()
    {
            return new S302Utstein();
    }
}
