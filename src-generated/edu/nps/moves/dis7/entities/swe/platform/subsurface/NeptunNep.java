// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NeptunNep</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NeptunNep.createInstance()</code> or <code>new NeptunNep()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: NackenA14Class  = <code>1</code>; </li>
 *     <li> Specific: NeptunNep  = <code>2</code>; </li>
 *     <li> Entity type uid: 27278; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@22587507. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class NeptunNep extends EntityType
{
    /** Default constructor */
    public NeptunNep()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 17502, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)1); // uid 17503, Nacken (A14) Class
        setSpecific((byte)2); // uid 27278, Neptun (Nep)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NeptunNep createInstance()
    {
            return new NeptunNep();
    }
}
