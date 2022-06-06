// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M1255StrykerCommandVehicleM1130DoubleVHullwM240</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M1255StrykerCommandVehicleM1130DoubleVHullwM240.createInstance()</code> or <code>new M1255StrykerCommandVehicleM1130DoubleVHullwM240()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: LightArmoredVehicleLAVStryker  = <code>5</code>; </li>
 *     <li> Specific: M1130StrykerCommandVehiclewM240  = <code>27</code>; </li>
 *     <li> Entity type uid: 33336; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@285583d4. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class M1255StrykerCommandVehicleM1130DoubleVHullwM240 extends EntityType
{
    /** Default constructor */
    public M1255StrykerCommandVehicleM1130DoubleVHullwM240()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 10115, Light Armored Vehicle (LAV) Stryker
        setSpecific((byte)27); // uid 10142, M1130 Stryker Command Vehicle w/M240
        setExtra((byte)2); // uid 33336, M1255 Stryker Command Vehicle (M1130 Double V-Hull) w/M240
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M1255StrykerCommandVehicleM1130DoubleVHullwM240 createInstance()
    {
            return new M1255StrykerCommandVehicleM1130DoubleVHullwM240();
    }
}