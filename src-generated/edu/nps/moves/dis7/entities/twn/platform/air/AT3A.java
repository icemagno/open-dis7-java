/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.twn.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AT3A</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AT3A.createInstance()</code> or <code>new AT3A()</code>. </p>
 * <ul>
 *     <li> Country: Taiwan, Province of China (TWN) = <code>208</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: AIDCAT3TzuChung  = <code>1</code>; </li>
 *     <li> Specific: AT3A  = <code>1</code>; </li>
 *     <li> Entity type uid: 29225; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@59b65dce. </p>
 * @see Country#TAIWAN_PROVINCE_OF_CHINA_TWN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class AT3A extends EntityType
{
    /** Default constructor */
    public AT3A()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 29223, Trainer
        setSubCategory((byte)1); // uid 29224, AIDC AT-3 Tzu Chung
        setSpecific((byte)1); // uid 29225, AT-3A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AT3A createInstance()
    {
            return new AT3A();
    }
}
