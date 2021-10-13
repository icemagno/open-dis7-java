// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DD912ChienYangexJamesEKyesDD787Taiwan</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DD912ChienYangexJamesEKyesDD787Taiwan.createInstance()</code> or <code>new DD912ChienYangexJamesEKyesDD787Taiwan()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer = <code>5</code>; </li>
 *     <li> SubCategory: GearingWuChinIIIConversionFRAMIClass  = <code>3</code>; </li>
 *     <li> Specific: DD912ChienYangexJamesEKyesDD787Taiwan  = <code>1</code>; </li>
 *     <li> Entity type uid: 11491; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@317890ea. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Destroyer
 * @see SubCategory

 */
public final class DD912ChienYangexJamesEKyesDD787Taiwan extends EntityType
{
    /** Default constructor */
    public DD912ChienYangexJamesEKyesDD787Taiwan()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)5); // uid 11456, Destroyer
        setSubCategory((byte)3); // uid 11490, Gearing (Wu Chin III Conversion) (FRAM I) Class
        setSpecific((byte)1); // uid 11491, DD 912 Chien Yang (ex. James E. Kyes DD 787) (Taiwan)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DD912ChienYangexJamesEKyesDD787Taiwan createInstance()
    {
            return new DD912ChienYangexJamesEKyesDD787Taiwan();
    }
}
