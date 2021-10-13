// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Wiesel2LeFlaSysOzelotlaunchervehicle</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Wiesel2LeFlaSysOzelotlaunchervehicle.createInstance()</code> or <code>new Wiesel2LeFlaSysOzelotlaunchervehicle()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air Defense/Missile Defense Unit Equipment = <code>28</code>; </li>
 *     <li> SubCategory: Wiesel2LeFlaSysSAM  = <code>3</code>; </li>
 *     <li> Specific: Wiesel2LeFlaSysOzelotlaunchervehicle  = <code>3</code>; </li>
 *     <li> Entity type uid: 22772; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5038d0b5. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AirDefenseMissileDefenseUnitEquipment
 * @see SubCategory

 */
public final class Wiesel2LeFlaSysOzelotlaunchervehicle extends EntityType
{
    /** Default constructor */
    public Wiesel2LeFlaSysOzelotlaunchervehicle()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 16321, Air Defense/Missile Defense Unit Equipment
        setSubCategory((byte)3); // uid 22769, Wiesel 2 LeFlaSys (SAM)
        setSpecific((byte)3); // uid 22772, Wiesel 2 LeFlaSys Ozelot launcher vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Wiesel2LeFlaSysOzelotlaunchervehicle createInstance()
    {
            return new Wiesel2LeFlaSysOzelotlaunchervehicle();
    }
}
