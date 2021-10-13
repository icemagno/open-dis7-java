// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DD925TeYangexSarsfieldDD837Taiwan</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DD925TeYangexSarsfieldDD837Taiwan.createInstance()</code> or <code>new DD925TeYangexSarsfieldDD837Taiwan()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer = <code>5</code>; </li>
 *     <li> SubCategory: GearingWuChinIIIConversionFRAMIClass  = <code>3</code>; </li>
 *     <li> Specific: DD925TeYangexSarsfieldDD837Taiwan  = <code>4</code>; </li>
 *     <li> Entity type uid: 11494; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37a0ec3c. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Destroyer
 * @see SubCategory

 */
public final class DD925TeYangexSarsfieldDD837Taiwan extends EntityType
{
    /** Default constructor */
    public DD925TeYangexSarsfieldDD837Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 11456, Destroyer
        setSubCategory((byte)3); // uid 11490, Gearing (Wu Chin III Conversion) (FRAM I) Class
        setSpecific((byte)4); // uid 11494, DD 925 Te Yang (ex. Sarsfield DD 837) (Taiwan)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DD925TeYangexSarsfieldDD837Taiwan createInstance()
    {
            return new DD925TeYangexSarsfieldDD837Taiwan();
    }
}
