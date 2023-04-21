/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>IL220UCMCBRadar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>IL220UCMCBRadar.createInstance()</code> or <code>new IL220UCMCBRadar()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: Firingpointlaunchpointlocation  = <code>8</code>; </li>
 *     <li> Specific: IL220UCMCBRadar  = <code>1</code>; </li>
 *     <li> Entity type uid: 22851; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4f6ff62. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class IL220UCMCBRadar extends EntityType
{
    /** Default constructor */
    public IL220UCMCBRadar()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22411, RF Active
        setSubCategory((byte)8); // uid 22850, Firing point/launch point location
        setSpecific((byte)1); // uid 22851, IL-220U CM/CB Radar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static IL220UCMCBRadar createInstance()
    {
            return new IL220UCMCBRadar();
    }
}
