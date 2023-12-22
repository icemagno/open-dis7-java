/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_762mmSR25MK111</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_762mmSR25MK111.createInstance()</code> or <code>new _762mmSR25MK111()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Australian Special Operations Command (SOCOMD) = <code>30</code>; </li>
 *     <li> SubCategory: SniperRifles  = <code>15</code>; </li>
 *     <li> Specific: _762mmSR25MK11  = <code>42</code>; </li>
 *     <li> Entity type uid: 31566; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17ec5e2a. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AustralianSpecialOperationsCommandSOCOMD
 * @see SubCategory

 */
public final class _762mmSR25MK111 extends EntityType
{
    /** Default constructor */
    public _762mmSR25MK111()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)30); // uid 31543, Australian Special Operations Command (SOCOMD)
        setSubCategory((byte)15); // uid 31565, Sniper Rifles
        setSpecific((byte)42); // uid 31566, 7.62mm SR-25 MK11
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _762mmSR25MK111 createInstance()
    {
            return new _762mmSR25MK111();
    }
}
