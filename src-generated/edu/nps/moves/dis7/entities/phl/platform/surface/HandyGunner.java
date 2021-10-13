// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.phl.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HandyGunner</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HandyGunner.createInstance()</code> or <code>new HandyGunner()</code>. </p>
 * <ul>
 *     <li> Country: Philippines (PHL) = <code>173</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Non-Combatant Ship = <code>61</code>; </li>
 *     <li> SubCategory: ContainerClass  = <code>1</code>; </li>
 *     <li> Specific: HandyGunner  = <code>3</code>; </li>
 *     <li> Entity type uid: 19320; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@778ca8ef. </p>
 * @see Country#PHILIPPINES_PHL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see NonCombatantShip
 * @see SubCategory

 */
public final class HandyGunner extends EntityType
{
    /** Default constructor */
    public HandyGunner()
    {
        setCountry(Country.PHILIPPINES_PHL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)61); // uid 19316, Non-Combatant Ship
        setSubCategory((byte)1); // uid 19317, Container Class
        setSpecific((byte)3); // uid 19320, Handy Gunner
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HandyGunner createInstance()
    {
            return new HandyGunner();
    }
}
