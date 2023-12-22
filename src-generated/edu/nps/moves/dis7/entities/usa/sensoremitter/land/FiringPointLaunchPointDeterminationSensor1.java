/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FiringPointLaunchPointDeterminationSensor1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FiringPointLaunchPointDeterminationSensor1.createInstance()</code> or <code>new FiringPointLaunchPointDeterminationSensor1()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Passive = <code>3</code>; </li>
 *     <li> SubCategory: FiringPointLaunchPointDeterminationSensor  = <code>8</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 22357; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7378c4a4. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFPassive
 * @see SubCategory

 */
public final class FiringPointLaunchPointDeterminationSensor1 extends EntityType
{
    /** Default constructor */
    public FiringPointLaunchPointDeterminationSensor1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 22356, RF Passive
        setSubCategory((byte)8); // uid 22357, Firing Point/Launch Point Determination Sensor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FiringPointLaunchPointDeterminationSensor1 createInstance()
    {
            return new FiringPointLaunchPointDeterminationSensor1();
    }
}
