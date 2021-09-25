// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nor.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2.createInstance()</code> or <code>new NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2()</code>. </p>
 * <ul>
 *     <li> Country: Norway (NOR) = <code>163</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30282; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@77b7ffa4. </p>
 * @see Country#NORWAY_NOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2 extends EntityType
{
    /** Default constructor */
    public NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 30278, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)2); // uid 30282, Norwegian Advanced Surface to Air Missile System 2 (NASAMS 2)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2 createInstance()
    {
            return new NorwegianAdvancedSurfacetoAirMissileSystem2NASAMS2();
    }
}
