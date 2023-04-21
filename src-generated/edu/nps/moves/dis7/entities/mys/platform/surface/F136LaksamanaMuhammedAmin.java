/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mys.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F136LaksamanaMuhammedAmin</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F136LaksamanaMuhammedAmin.createInstance()</code> or <code>new F136LaksamanaMuhammedAmin()</code>. </p>
 * <ul>
 *     <li> Country: Malaysia (MYS) = <code>132</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: LaksamanaClass  = <code>1</code>; </li>
 *     <li> Specific: F136LaksamanaMuhammedAmin  = <code>3</code>; </li>
 *     <li> Entity type uid: 27461; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@742d4e15. </p>
 * @see Country#MALAYSIA_MYS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class F136LaksamanaMuhammedAmin extends EntityType
{
    /** Default constructor */
    public F136LaksamanaMuhammedAmin()
    {
        setCountry(Country.MALAYSIA_MYS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27457, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 27458, Laksamana Class
        setSpecific((byte)3); // uid 27461, F136 Laksamana Muhammed Amin
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F136LaksamanaMuhammedAmin createInstance()
    {
            return new F136LaksamanaMuhammedAmin();
    }
}
