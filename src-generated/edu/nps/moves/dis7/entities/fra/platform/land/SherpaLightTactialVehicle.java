// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SherpaLightTactialVehicle</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SherpaLightTactialVehicle.createInstance()</code> or <code>new SherpaLightTactialVehicle()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: SherpaLightTactialVehicle  = <code>7</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31113; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@55740540. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class SherpaLightTactialVehicle extends EntityType
{
    /** Default constructor */
    public SherpaLightTactialVehicle()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 15674, Small Wheeled Utility Vehicle
        setSubCategory((byte)7); // uid 31113, Sherpa Light Tactial Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SherpaLightTactialVehicle createInstance()
    {
            return new SherpaLightTactialVehicle();
    }
}
