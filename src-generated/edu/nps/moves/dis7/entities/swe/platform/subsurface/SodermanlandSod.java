// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SodermanlandSod</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SodermanlandSod.createInstance()</code> or <code>new SodermanlandSod()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: SodermanlandA17ModifiedClass  = <code>3</code>; </li>
 *     <li> Specific: SodermanlandSod  = <code>1</code>; </li>
 *     <li> Entity type uid: 27287; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4a734c04. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class SodermanlandSod extends EntityType
{
    /** Default constructor */
    public SodermanlandSod()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17502, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)3); // uid 27286, Sodermanland (A17 Modified) Class
        setSpecific((byte)1); // uid 27287, Sodermanland (Sod)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SodermanlandSod createInstance()
    {
            return new SodermanlandSod();
    }
}
