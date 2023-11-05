/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HuchuanclassType025026fastattacktorpedo2201</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HuchuanclassType025026fastattacktorpedo2201.createInstance()</code> or <code>new HuchuanclassType025026fastattacktorpedo2201()</code>. </p>
 * <ul>
 *     <li> Country: China, People's Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Hydrofoil = <code>14</code>; </li>
 *     <li> SubCategory: HuchuanclassType025026fastattacktorpedo  = <code>1</code>; </li>
 *     <li> Specific: _2201  = <code>5</code>; </li>
 *     <li> Entity type uid: 17222; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5b7a5baa. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Hydrofoil
 * @see SubCategory

 */
public final class HuchuanclassType025026fastattacktorpedo2201 extends EntityType
{
    /** Default constructor */
    public HuchuanclassType025026fastattacktorpedo2201()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)14); // uid 17216, Hydrofoil
        setSubCategory((byte)1); // uid 17217, Huchuan class Type 025/026 (fast attack-torpedo)
        setSpecific((byte)5); // uid 17222, 2201
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HuchuanclassType025026fastattacktorpedo2201 createInstance()
    {
            return new HuchuanclassType025026fastattacktorpedo2201();
    }
}
