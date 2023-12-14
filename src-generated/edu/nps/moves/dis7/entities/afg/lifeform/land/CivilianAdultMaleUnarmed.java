/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.afg.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CivilianAdultMaleUnarmed</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CivilianAdultMaleUnarmed.createInstance()</code> or <code>new CivilianAdultMaleUnarmed()</code>. </p>
 * <ul>
 *     <li> Country: Afghanistan (AFG) = <code>1</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Civilian = <code>130</code>; </li>
 *     <li> SubCategory: None  = <code>0</code>; </li>
 *     <li> Specific: CivilianUnarmed  = <code>0</code>; </li>
 *     <li> Entity type uid: 32759; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@111fe921. </p>
 * @see Country#AFGHANISTAN_AFG
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Civilian
 * @see SubCategory

 */
public final class CivilianAdultMaleUnarmed extends EntityType
{
    /** Default constructor */
    public CivilianAdultMaleUnarmed()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)130); // uid 32211, Civilian
        setSubCategory((byte)0); // uid 32755, None
        setSpecific((byte)0); // uid 32756, Civilian, Unarmed
        setExtra((byte)70); // uid 32759, Civilian Adult, Male (Unarmed)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CivilianAdultMaleUnarmed createInstance()
    {
            return new CivilianAdultMaleUnarmed();
    }
}
