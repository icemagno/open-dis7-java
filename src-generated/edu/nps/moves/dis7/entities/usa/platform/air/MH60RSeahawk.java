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
 * <p> Entity class <b><code>MH60RSeahawk</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MH60RSeahawk.createInstance()</code> or <code>new MH60RSeahawk()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Anti-Submarine Warfare/patrol helicopter = <code>22</code>; </li>
 *     <li> SubCategory: SikorskyS70B  = <code>3</code>; </li>
 *     <li> Specific: MH60RSeahawk  = <code>9</code>; </li>
 *     <li> Entity type uid: 11152; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@47058864. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AntiSubmarineWarfarepatrolhelicopter
 * @see SubCategory

 */
public final class MH60RSeahawk extends EntityType
{
    /** Default constructor */
    public MH60RSeahawk()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 11133, Anti-Submarine Warfare/patrol helicopter
        setSubCategory((byte)3); // uid 11143, Sikorsky S-70B
        setSpecific((byte)9); // uid 11152, MH-60R Seahawk
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MH60RSeahawk createInstance()
    {
            return new MH60RSeahawk();
    }
}
