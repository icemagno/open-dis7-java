// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANTPQ37FirefinderMobilePhasedArrayArtilleryLocatingRadar</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANTPQ37FirefinderMobilePhasedArrayArtilleryLocatingRadar.createInstance()</code> or <code>new ANTPQ37FirefinderMobilePhasedArrayArtilleryLocatingRadar()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: TowedVSHORADGunMissileSystem  = <code>6</code>; </li>
 *     <li> Specific: ANTPQ37FirefinderMobilePhasedArrayArtilleryLocatingRadar  = <code>6</code>; </li>
 *     <li> Entity type uid: 25392; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77c1e611. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class ANTPQ37FirefinderMobilePhasedArrayArtilleryLocatingRadar extends EntityType
{
    /** Default constructor */
    public ANTPQ37FirefinderMobilePhasedArrayArtilleryLocatingRadar()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)6); // uid 10720, Towed VSHORAD Gun / Missile System
        setSpecific((byte)6); // uid 25392, AN/TPQ-37 Firefinder Mobile Phased Array Artillery Locating Radar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANTPQ37FirefinderMobilePhasedArrayArtilleryLocatingRadar createInstance()
    {
            return new ANTPQ37FirefinderMobilePhasedArrayArtilleryLocatingRadar();
    }
}
