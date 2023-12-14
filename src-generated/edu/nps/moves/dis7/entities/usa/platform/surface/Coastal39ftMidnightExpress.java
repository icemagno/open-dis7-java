/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Coastal39ftMidnightExpress</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Coastal39ftMidnightExpress.createInstance()</code> or <code>new Coastal39ftMidnightExpress()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other Vessels = <code>87</code>; </li>
 *     <li> SubCategory: GoFastBoat  = <code>1</code>; </li>
 *     <li> Specific: USCustomsandBorderPatrolCBPInterceptorClass  = <code>1</code>; </li>
 *     <li> Entity type uid: 28472; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@45287377. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see OtherVessels
 * @see SubCategory

 */
public final class Coastal39ftMidnightExpress extends EntityType
{
    /** Default constructor */
    public Coastal39ftMidnightExpress()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)87); // uid 28469, Other Vessels
        setSubCategory((byte)1); // uid 28470, Go-Fast Boat
        setSpecific((byte)1); // uid 28471, U.S. Customs and Border Patrol (CBP) Interceptor Class
        setExtra((byte)1); // uid 28472, Coastal 39ft Midnight Express
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Coastal39ftMidnightExpress createInstance()
    {
            return new Coastal39ftMidnightExpress();
    }
}
