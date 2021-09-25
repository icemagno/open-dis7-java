// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.srb.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>UTVAKobac</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>UTVAKobac.createInstance()</code> or <code>new UTVAKobac()</code>. </p>
 * <ul>
 *     <li> Country: Serbia (SRB) = <code>276</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: UTVAKobac  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31867; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@329a1f8d. </p>
 * @see Country#SERBIA_SRB
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class UTVAKobac extends EntityType
{
    /** Default constructor */
    public UTVAKobac()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 31866, Attack/Strike
        setSubCategory((byte)1); // uid 31867, UTVA Kobac
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static UTVAKobac createInstance()
    {
            return new UTVAKobac();
    }
}
