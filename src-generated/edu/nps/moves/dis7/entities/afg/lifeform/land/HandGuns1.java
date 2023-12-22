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
 * <p> Entity class <b><code>HandGuns1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HandGuns1.createInstance()</code> or <code>new HandGuns1()</code>. </p>
 * <ul>
 *     <li> Country: Afghanistan (AFG) = <code>1</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Afghan Border Police (ABP) = <code>53</code>; </li>
 *     <li> SubCategory: HandGuns  = <code>80</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 32197; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3749c2b. </p>
 * @see Country#AFGHANISTAN_AFG
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AfghanBorderPoliceABP
 * @see SubCategory

 */
public final class HandGuns1 extends EntityType
{
    /** Default constructor */
    public HandGuns1()
    {
        setCountry(Country.AFGHANISTAN_AFG);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)53); // uid 32196, Afghan Border Police (ABP)
        setSubCategory((byte)80); // uid 32197, Hand Guns
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HandGuns1 createInstance()
    {
            return new HandGuns1();
    }
}
