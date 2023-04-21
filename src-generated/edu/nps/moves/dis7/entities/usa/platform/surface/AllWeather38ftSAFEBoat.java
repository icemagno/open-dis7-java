/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AllWeather38ftSAFEBoat</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AllWeather38ftSAFEBoat.createInstance()</code> or <code>new AllWeather38ftSAFEBoat()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Private Motorboat = <code>84</code>; </li>
 *     <li> SubCategory: MediumMotorboatupto39ft119m  = <code>2</code>; </li>
 *     <li> Specific: USCustomsandBorderPatrolCBPInterceptorClass  = <code>1</code>; </li>
 *     <li> Entity type uid: 28478; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@283ab206. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PrivateMotorboat
 * @see SubCategory

 */
public final class AllWeather38ftSAFEBoat extends EntityType
{
    /** Default constructor */
    public AllWeather38ftSAFEBoat()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 26437, Private Motorboat
        setSubCategory((byte)2); // uid 28475, Medium Motorboat (up to 39ft/11.9m)
        setSpecific((byte)1); // uid 28476, U.S. Customs and Border Patrol (CBP) Interceptor Class
        setExtra((byte)2); // uid 28478, All-Weather 38ft SAFE Boat
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AllWeather38ftSAFEBoat createInstance()
    {
            return new AllWeather38ftSAFEBoat();
    }
}
