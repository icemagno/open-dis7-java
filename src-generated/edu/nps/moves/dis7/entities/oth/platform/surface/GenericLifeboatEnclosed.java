/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericLifeboatEnclosed</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericLifeboatEnclosed.createInstance()</code> or <code>new GenericLifeboatEnclosed()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Life-Saving Equipment = <code>101</code>; </li>
 *     <li> SubCategory: GenericLifeboat  = <code>1</code>; </li>
 *     <li> Specific: GenericLifeboatEnclosed  = <code>2</code>; </li>
 *     <li> Entity type uid: 30870; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@551de37d. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LifeSavingEquipment
 * @see SubCategory

 */
public final class GenericLifeboatEnclosed extends EntityType
{
    /** Default constructor */
    public GenericLifeboatEnclosed()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)101); // uid 30867, Life-Saving Equipment
        setSubCategory((byte)1); // uid 30868, Generic Lifeboat
        setSpecific((byte)2); // uid 30870, Generic Lifeboat Enclosed
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericLifeboatEnclosed createInstance()
    {
            return new GenericLifeboatEnclosed();
    }
}
