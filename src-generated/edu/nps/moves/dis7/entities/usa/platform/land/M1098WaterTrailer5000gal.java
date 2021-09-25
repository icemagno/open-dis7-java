// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1098WaterTrailer5000gal</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1098WaterTrailer5000gal.createInstance()</code> or <code>new M1098WaterTrailer5000gal()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Water trailer = <code>17</code>; </li>
 *     <li> SubCategory: _10015000gallons  = <code>2</code>; </li>
 *     <li> Specific: M1098WaterTrailer5000gal  = <code>2</code>; </li>
 *     <li> Entity type uid: 25271; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@36e43829. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Watertrailer
 * @see SubCategory

 */
public final class M1098WaterTrailer5000gal extends EntityType
{
    /** Default constructor */
    public M1098WaterTrailer5000gal()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)17); // uid 10633, Water trailer
        setSubCategory((byte)2); // uid 10636, 1001- 5000 gallons
        setSpecific((byte)2); // uid 25271, M1098 Water Trailer (5000 gal)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1098WaterTrailer5000gal createInstance()
    {
            return new M1098WaterTrailer5000gal();
    }
}
