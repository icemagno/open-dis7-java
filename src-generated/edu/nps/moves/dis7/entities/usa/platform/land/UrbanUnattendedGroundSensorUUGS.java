// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>UrbanUnattendedGroundSensorUUGS</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>UrbanUnattendedGroundSensorUUGS.createInstance()</code> or <code>new UrbanUnattendedGroundSensorUUGS()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Warning System = <code>23</code>; </li>
 *     <li> SubCategory: UrbanUnattendedGroundSensorUUGS  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 10657; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5d94a2dc. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see WarningSystem
 * @see SubCategory

 */
public final class UrbanUnattendedGroundSensorUUGS extends EntityType
{
    /** Default constructor */
    public UrbanUnattendedGroundSensorUUGS()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)23); // uid 10653, Warning System
        setSubCategory((byte)4); // uid 10657, Urban Unattended Ground Sensor (U-UGS)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static UrbanUnattendedGroundSensorUUGS createInstance()
    {
            return new UrbanUnattendedGroundSensorUUGS();
    }
}
