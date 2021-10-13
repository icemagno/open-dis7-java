// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>greaterthan5000gallons</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>greaterthan5000gallons.createInstance()</code> or <code>new greaterthan5000gallons()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fuel trailer = <code>15</code>; </li>
 *     <li> SubCategory: greaterthan5000gallons  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 16298; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@17503f6b. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Fueltrailer
 * @see SubCategory

 */
public final class greaterthan5000gallons extends EntityType
{
    /** Default constructor */
    public greaterthan5000gallons()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 16295, Fuel trailer
        setSubCategory((byte)3); // uid 16298, greater than 5000 gallons
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static greaterthan5000gallons createInstance()
    {
            return new greaterthan5000gallons();
    }
}
