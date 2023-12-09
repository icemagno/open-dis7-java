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
 * <p> Entity class <b><code>BoeingP8MultiMissionMaritimeAircraftMMA</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BoeingP8MultiMissionMaritimeAircraftMMA.createInstance()</code> or <code>new BoeingP8MultiMissionMaritimeAircraftMMA()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine/patrol/observation = <code>5</code>; </li>
 *     <li> SubCategory: BoeingP8MultiMissionMaritimeAircraftMMA  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 10988; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4052b19f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarinepatrolobservation
 * @see SubCategory

 */
public final class BoeingP8MultiMissionMaritimeAircraftMMA extends EntityType
{
    /** Default constructor */
    public BoeingP8MultiMissionMaritimeAircraftMMA()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 10963, Anti-Submarine/patrol/observation
        setSubCategory((byte)5); // uid 10988, Boeing P-8 Multi-Mission Maritime Aircraft (MMA)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BoeingP8MultiMissionMaritimeAircraftMMA createInstance()
    {
            return new BoeingP8MultiMissionMaritimeAircraftMMA();
    }
}
