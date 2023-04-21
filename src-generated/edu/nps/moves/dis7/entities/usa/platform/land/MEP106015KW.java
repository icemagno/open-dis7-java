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
 * <p> Entity class <b><code>MEP106015KW</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MEP106015KW.createInstance()</code> or <code>new MEP106015KW()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Generator trailer = <code>16</code>; </li>
 *     <li> SubCategory: _0100kW  = <code>1</code>; </li>
 *     <li> Specific: MEP106015KW  = <code>27</code>; </li>
 *     <li> Entity type uid: 33496; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2c26ba07. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Generatortrailer
 * @see SubCategory

 */
public final class MEP106015KW extends EntityType
{
    /** Default constructor */
    public MEP106015KW()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)16); // uid 10630, Generator trailer
        setSubCategory((byte)1); // uid 10631, 0 - 100 kW
        setSpecific((byte)27); // uid 33496, MEP 1060, 15KW
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MEP106015KW createInstance()
    {
            return new MEP106015KW();
    }
}
