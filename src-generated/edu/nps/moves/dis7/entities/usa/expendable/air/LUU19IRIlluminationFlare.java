/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LUU19IRIlluminationFlare</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LUU19IRIlluminationFlare.createInstance()</code> or <code>new LUU19IRIlluminationFlare()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Signal/Illumination Flare = <code>7</code>; </li>
 *     <li> SubCategory: IlluminationFlare  = <code>2</code>; </li>
 *     <li> Specific: LUU19IRIlluminationFlare  = <code>4</code>; </li>
 *     <li> Entity type uid: 24829; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a8656a2. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SignalIlluminationFlare
 * @see SubCategory

 */
public final class LUU19IRIlluminationFlare extends EntityType
{
    /** Default constructor */
    public LUU19IRIlluminationFlare()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 24824, Signal/Illumination Flare
        setSubCategory((byte)2); // uid 24825, Illumination Flare
        setSpecific((byte)4); // uid 24829, LUU-19 IR Illumination Flare
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LUU19IRIlluminationFlare createInstance()
    {
            return new LUU19IRIlluminationFlare();
    }
}
