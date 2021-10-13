// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>McDonnellDouglasF4PhantomII1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>McDonnellDouglasF4PhantomII1.createInstance()</code> or <code>new McDonnellDouglasF4PhantomII1()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Reconnaissance = <code>7</code>; </li>
 *     <li> SubCategory: McDonnellDouglasF4PhantomII  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31137; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@10b9db7b. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Reconnaissance
 * @see SubCategory

 */
public final class McDonnellDouglasF4PhantomII1 extends EntityType
{
    /** Default constructor */
    public McDonnellDouglasF4PhantomII1()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 31136, Reconnaissance
        setSubCategory((byte)1); // uid 31137, McDonnell-Douglas F-4 Phantom II
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static McDonnellDouglasF4PhantomII1 createInstance()
    {
            return new McDonnellDouglasF4PhantomII1();
    }
}
