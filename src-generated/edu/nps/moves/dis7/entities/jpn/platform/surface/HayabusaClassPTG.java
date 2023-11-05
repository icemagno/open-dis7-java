/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HayabusaClassPTG</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HayabusaClassPTG.createInstance()</code> or <code>new HayabusaClassPTG()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: HayabusaClassPTG  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 33635; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@d816dde. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class HayabusaClassPTG extends EntityType
{
    /** Default constructor */
    public HayabusaClassPTG()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 33634, Light/Patrol Craft
        setSubCategory((byte)1); // uid 33635, Hayabusa Class (PTG)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HayabusaClassPTG createInstance()
    {
            return new HayabusaClassPTG();
    }
}
