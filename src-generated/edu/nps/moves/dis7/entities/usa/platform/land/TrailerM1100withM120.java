/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TrailerM1100withM120</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TrailerM1100withM120.createInstance()</code> or <code>new TrailerM1100withM120()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: _005ton  = <code>1</code>; </li>
 *     <li> Specific: TrailerM1100withM120  = <code>1</code>; </li>
 *     <li> Entity type uid: 22873; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5e593b08. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class TrailerM1100withM120 extends EntityType
{
    /** Default constructor */
    public TrailerM1100withM120()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 10616, Cargo Trailer
        setSubCategory((byte)1); // uid 10617, 0 - 0.5 ton
        setSpecific((byte)1); // uid 22873, Trailer, M1100 with M120
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TrailerM1100withM120 createInstance()
    {
            return new TrailerM1100withM120();
    }
}
