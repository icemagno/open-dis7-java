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
 * <p> Entity class <b><code>RedPlasticPencilFlare</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RedPlasticPencilFlare.createInstance()</code> or <code>new RedPlasticPencilFlare()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Signal/Illumination Flare = <code>7</code>; </li>
 *     <li> SubCategory: SignalFlare  = <code>1</code>; </li>
 *     <li> Specific: RedPlasticPencilFlare  = <code>2</code>; </li>
 *     <li> Entity type uid: 24965; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@e895e3e. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SignalIlluminationFlare
 * @see SubCategory

 */
public final class RedPlasticPencilFlare extends EntityType
{
    /** Default constructor */
    public RedPlasticPencilFlare()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 24824, Signal/Illumination Flare
        setSubCategory((byte)1); // uid 24963, Signal Flare
        setSpecific((byte)2); // uid 24965, Red Plastic Pencil Flare
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RedPlasticPencilFlare createInstance()
    {
            return new RedPlasticPencilFlare();
    }
}
