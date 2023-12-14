/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>VoiceTransmissionReceptionOther</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>VoiceTransmissionReceptionOther.createInstance()</code> or <code>new VoiceTransmissionReceptionOther()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Voice Transmission/Reception = <code>1</code>; </li>
 *     <li> SubCategory: VoiceTransmissionReceptionOther  = <code>0</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 22202; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2890e479. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see VoiceTransmissionReception
 * @see SubCategory

 */
public final class VoiceTransmissionReceptionOther extends EntityType
{
    /** Default constructor */
    public VoiceTransmissionReceptionOther()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 22201, Voice Transmission/Reception
        setSubCategory((byte)0); // uid 22202, Voice Transmission/Reception, Other
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static VoiceTransmissionReceptionOther createInstance()
    {
            return new VoiceTransmissionReceptionOther();
    }
}
