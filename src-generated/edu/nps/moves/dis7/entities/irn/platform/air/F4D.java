// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F4D</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F4D.createInstance()</code> or <code>new F4D()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: McDonnellDouglasF4PhantomII  = <code>3</code>; </li>
 *     <li> Specific: F4D  = <code>1</code>; </li>
 *     <li> Entity type uid: 31134; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63dd899. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class F4D extends EntityType
{
    /** Default constructor */
    public F4D()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 30039, Attack/Strike
        setSubCategory((byte)3); // uid 31133, McDonnell-Douglas F-4 Phantom II
        setSpecific((byte)1); // uid 31134, F-4D
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F4D createInstance()
    {
            return new F4D();
    }
}
