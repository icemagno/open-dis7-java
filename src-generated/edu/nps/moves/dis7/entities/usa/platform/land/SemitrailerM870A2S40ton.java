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
 * <p> Entity class <b><code>SemitrailerM870A2S40ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SemitrailerM870A2S40ton.createInstance()</code> or <code>new SemitrailerM870A2S40ton()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Heavy equipment transport trailer = <code>19</code>; </li>
 *     <li> SubCategory: SemitrailerM870A140ton  = <code>2</code>; </li>
 *     <li> Specific: SemitrailerM870A2S40ton  = <code>1</code>; </li>
 *     <li> Entity type uid: 33510; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6ad179b4. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Heavyequipmenttransporttrailer
 * @see SubCategory

 */
public final class SemitrailerM870A2S40ton extends EntityType
{
    /** Default constructor */
    public SemitrailerM870A2S40ton()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 10644, Heavy equipment transport trailer
        setSubCategory((byte)2); // uid 22918, Semi-trailer, M870A1, 40-ton
        setSpecific((byte)1); // uid 33510, Semi-trailer, M870A2S, 40-ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SemitrailerM870A2S40ton createInstance()
    {
            return new SemitrailerM870A2S40ton();
    }
}
