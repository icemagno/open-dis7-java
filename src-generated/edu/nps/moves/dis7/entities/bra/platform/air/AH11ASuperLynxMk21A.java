// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AH11ASuperLynxMk21A</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AH11ASuperLynxMk21A.createInstance()</code> or <code>new AH11ASuperLynxMk21A()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/Patrol Helicopter = <code>22</code>; </li>
 *     <li> SubCategory: WestlandLynxNaval  = <code>2</code>; </li>
 *     <li> Specific: AH11ASuperLynxMk21A  = <code>1</code>; </li>
 *     <li> Entity type uid: 32177; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@675d3402. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarePatrolHelicopter
 * @see SubCategory

 */
public final class AH11ASuperLynxMk21A extends EntityType
{
    /** Default constructor */
    public AH11ASuperLynxMk21A()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 31996, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)2); // uid 32176, Westland Lynx (Naval)
        setSpecific((byte)1); // uid 32177, AH-11A Super Lynx Mk21A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AH11ASuperLynxMk21A createInstance()
    {
            return new AH11ASuperLynxMk21A();
    }
}
