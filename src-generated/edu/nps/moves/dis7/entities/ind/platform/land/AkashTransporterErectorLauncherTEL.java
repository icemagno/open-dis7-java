// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AkashTransporterErectorLauncherTEL</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AkashTransporterErectorLauncherTEL.createInstance()</code> or <code>new AkashTransporterErectorLauncherTEL()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense / Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: AkashSurfacetoAirMissileSAMsystem  = <code>1</code>; </li>
 *     <li> Specific: AkashTransporterErectorLauncherTEL  = <code>1</code>; </li>
 *     <li> Entity type uid: 31654; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c9c0d96. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class AkashTransporterErectorLauncherTEL extends EntityType
{
    /** Default constructor */
    public AkashTransporterErectorLauncherTEL()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 31652, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 31653, Akash Surface-to-Air Missile (SAM) system
        setSpecific((byte)1); // uid 31654, Akash Transporter Erector Launcher (TEL)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AkashTransporterErectorLauncherTEL createInstance()
    {
            return new AkashTransporterErectorLauncherTEL();
    }
}
