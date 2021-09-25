// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prt.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SSConventionalAttackTorpedoPatrol</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SSConventionalAttackTorpedoPatrol.createInstance()</code> or <code>new SSConventionalAttackTorpedoPatrol()</code>. </p>
 * <ul>
 *     <li> Country: Portugal (PRT) = <code>176</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack - Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23099; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3c443976. </p>
 * @see Country#PORTUGAL_PRT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol

 */
public final class SSConventionalAttackTorpedoPatrol extends EntityType
{
    /** Default constructor */
    public SSConventionalAttackTorpedoPatrol()
    {
        setCountry(Country.PORTUGAL_PRT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23099, SS (Conventional Attack - Torpedo, Patrol)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SSConventionalAttackTorpedoPatrol createInstance()
    {
            return new SSConventionalAttackTorpedoPatrol();
    }
}
