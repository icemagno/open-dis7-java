/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_185mmRemington87012Gauge</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_185mmRemington87012Gauge.createInstance()</code> or <code>new _185mmRemington87012Gauge()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Australian Army = <code>11</code>; </li>
 *     <li> SubCategory: ShotGuns  = <code>25</code>; </li>
 *     <li> Specific: _185mmRemington87012Gauge  = <code>50</code>; </li>
 *     <li> Entity type uid: 31489; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ea48b2e. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AustralianArmy
 * @see SubCategory

 */
public final class _185mmRemington87012Gauge extends EntityType
{
    /** Default constructor */
    public _185mmRemington87012Gauge()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 31462, Australian Army
        setSubCategory((byte)25); // uid 31488, Shot Guns
        setSpecific((byte)50); // uid 31489, 18.5mm Remington 870 12 Gauge
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _185mmRemington87012Gauge createInstance()
    {
            return new _185mmRemington87012Gauge();
    }
}
