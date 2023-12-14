/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RavenAerostarTIF25K</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RavenAerostarTIF25K.createInstance()</code> or <code>new RavenAerostarTIF25K()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Lighter than Air, Balloon = <code>100</code>; </li>
 *     <li> SubCategory: Gasfilledtethered  = <code>2</code>; </li>
 *     <li> Specific: RavenAerostarTIF25K  = <code>1</code>; </li>
 *     <li> Entity type uid: 26936; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f3c0399. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianLighterthanAirBalloon
 * @see SubCategory

 */
public final class RavenAerostarTIF25K extends EntityType
{
    /** Default constructor */
    public RavenAerostarTIF25K()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)100); // uid 26934, Civilian Lighter than Air, Balloon
        setSubCategory((byte)2); // uid 26935, Gas-filled, tethered
        setSpecific((byte)1); // uid 26936, Raven Aerostar TIF-25K
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RavenAerostarTIF25K createInstance()
    {
            return new RavenAerostarTIF25K();
    }
}
