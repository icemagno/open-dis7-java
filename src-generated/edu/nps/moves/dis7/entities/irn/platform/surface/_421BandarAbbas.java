// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_421BandarAbbas</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_421BandarAbbas.createInstance()</code> or <code>new _421BandarAbbas()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Combat Stores Ship = <code>58</code>; </li>
 *     <li> SubCategory: FleetSupplyShip  = <code>1</code>; </li>
 *     <li> Specific: _421BandarAbbas  = <code>1</code>; </li>
 *     <li> Entity type uid: 18156; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@26bab2f1. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CombatStoresShip
 * @see SubCategory

 */
public final class _421BandarAbbas extends EntityType
{
    /** Default constructor */
    public _421BandarAbbas()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)58); // uid 18154, Combat Stores Ship
        setSubCategory((byte)1); // uid 18155, Fleet Supply Ship
        setSpecific((byte)1); // uid 18156, 421 Bandar Abbas
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _421BandarAbbas createInstance()
    {
            return new _421BandarAbbas();
    }
}
