// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SuperFledermausRadar</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SuperFledermausRadar.createInstance()</code> or <code>new SuperFledermausRadar()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: OerlikonGDFSkyguardSkyshieldSystem  = <code>1</code>; </li>
 *     <li> Specific: SuperFledermausRadar  = <code>5</code>; </li>
 *     <li> Entity type uid: 28904; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@26f46fa6. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class SuperFledermausRadar extends EntityType
{
    /** Default constructor */
    public SuperFledermausRadar()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 19039, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 19040, Oerlikon GDF Skyguard Skyshield System
        setSpecific((byte)5); // uid 28904, Super Fledermaus Radar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SuperFledermausRadar createInstance()
    {
            return new SuperFledermausRadar();
    }
}
