/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Tu22M3BackfireC</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Tu22M3BackfireC.createInstance()</code> or <code>new Tu22M3BackfireC()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Bomber = <code>3</code>; </li>
 *     <li> SubCategory: Tu26Tu22MBackfire  = <code>3</code>; </li>
 *     <li> Specific: Tu22M3BackfireC  = <code>3</code>; </li>
 *     <li> Entity type uid: 13330; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3bbf9027. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Bomber
 * @see SubCategory

 */
public final class Tu22M3BackfireC extends EntityType
{
    /** Default constructor */
    public Tu22M3BackfireC()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)3); // uid 13309, Bomber
        setSubCategory((byte)3); // uid 13327, Tu-26 (Tu-22M) Backfire
        setSpecific((byte)3); // uid 13330, Tu-22M-3 Backfire C
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Tu22M3BackfireC createInstance()
    {
            return new Tu22M3BackfireC();
    }
}
