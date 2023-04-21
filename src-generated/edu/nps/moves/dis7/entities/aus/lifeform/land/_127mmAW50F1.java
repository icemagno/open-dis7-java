/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_127mmAW50F1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_127mmAW50F1.createInstance()</code> or <code>new _127mmAW50F1()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Australian Special Operations Command (SOCOMD) = <code>30</code>; </li>
 *     <li> SubCategory: AntiMaterielRifleAMR  = <code>17</code>; </li>
 *     <li> Specific: _127mmAW50F  = <code>11</code>; </li>
 *     <li> Entity type uid: 31570; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4cf230bf. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AustralianSpecialOperationsCommandSOCOMD
 * @see SubCategory

 */
public final class _127mmAW50F1 extends EntityType
{
    /** Default constructor */
    public _127mmAW50F1()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)30); // uid 31543, Australian Special Operations Command (SOCOMD)
        setSubCategory((byte)17); // uid 31569, Anti-Materiel Rifle (AMR)
        setSpecific((byte)11); // uid 31570, 12.7mm AW50F
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _127mmAW50F1 createInstance()
    {
            return new _127mmAW50F1();
    }
}
