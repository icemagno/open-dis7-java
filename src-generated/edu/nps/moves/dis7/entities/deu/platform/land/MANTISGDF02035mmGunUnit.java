// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MANTISGDF02035mmGunUnit</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MANTISGDF02035mmGunUnit.createInstance()</code> or <code>new MANTISGDF02035mmGunUnit()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: ModularAutomaticandNetworkCapableTargetingandInterceptionSystemMANTISNBSCRAM  = <code>5</code>; </li>
 *     <li> Specific: MANTISGDF02035mmGunUnit  = <code>3</code>; </li>
 *     <li> Entity type uid: 28083; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2eea88a1. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class MANTISGDF02035mmGunUnit extends EntityType
{
    /** Default constructor */
    public MANTISGDF02035mmGunUnit()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)5); // uid 28080, Modular, Automatic and Network Capable Targeting and Interception System (MANTIS) / NBS-C-RAM
        setSpecific((byte)3); // uid 28083, MANTIS GDF-020 (35 mm Gun Unit)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MANTISGDF02035mmGunUnit createInstance()
    {
            return new MANTISGDF02035mmGunUnit();
    }
}
