/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_1D22LaserTargetDesignator</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_1D22LaserTargetDesignator.createInstance()</code> or <code>new _1D22LaserTargetDesignator()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Electro-Optical = <code>5</code>; </li>
 *     <li> SubCategory: MissileGuidance  = <code>60</code>; </li>
 *     <li> Specific: _1D22LaserTargetDesignator  = <code>2</code>; </li>
 *     <li> Entity type uid: 23720; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c0ece6d. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectroOptical
 * @see SubCategory

 */
public final class _1D22LaserTargetDesignator extends EntityType
{
    /** Default constructor */
    public _1D22LaserTargetDesignator()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 23715, Electro-Optical
        setSubCategory((byte)60); // uid 23718, Missile Guidance
        setSpecific((byte)2); // uid 23720, 1D22 Laser Target Designator
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _1D22LaserTargetDesignator createInstance()
    {
            return new _1D22LaserTargetDesignator();
    }
}
