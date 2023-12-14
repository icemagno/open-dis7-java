/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NZhM56heavyfloatingrailwayandroad</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NZhM56heavyfloatingrailwayandroad.createInstance()</code> or <code>new NZhM56heavyfloatingrailwayandroad()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Other = <code>0</code>; </li>
 *     <li> SubCategory: Bridges  = <code>1</code>; </li>
 *     <li> Specific: NZhM56heavyfloatingrailwayandroad  = <code>21</code>; </li>
 *     <li> Entity type uid: 12499; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f202d6d. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Other
 * @see SubCategory

 */
public final class NZhM56heavyfloatingrailwayandroad extends EntityType
{
    /** Default constructor */
    public NZhM56heavyfloatingrailwayandroad()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)0); // uid 12477, Other
        setSubCategory((byte)1); // uid 12478, Bridges
        setSpecific((byte)21); // uid 12499, NZhM-56 heavy floating railway and road
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NZhM56heavyfloatingrailwayandroad createInstance()
    {
            return new NZhM56heavyfloatingrailwayandroad();
    }
}
