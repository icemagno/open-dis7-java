// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LargeWheeledUtilityVehiclegreaterthan125tons</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LargeWheeledUtilityVehiclegreaterthan125tons.createInstance()</code> or <code>new LargeWheeledUtilityVehiclegreaterthan125tons()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle (greater than 1.25 tons) = <code>7</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 16279; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@311bf055. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehiclegreaterthan125tons

 */
public final class LargeWheeledUtilityVehiclegreaterthan125tons extends EntityType
{
    /** Default constructor */
    public LargeWheeledUtilityVehiclegreaterthan125tons()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 16279, Large Wheeled Utility Vehicle (greater than 1.25 tons)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LargeWheeledUtilityVehiclegreaterthan125tons createInstance()
    {
            return new LargeWheeledUtilityVehiclegreaterthan125tons();
    }
}
