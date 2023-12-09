/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.png.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GuardianClassPacificPatrolBoatsPPBR</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GuardianClassPacificPatrolBoatsPPBR.createInstance()</code> or <code>new GuardianClassPacificPatrolBoatsPPBR()</code>. </p>
 * <ul>
 *     <li> Country: Papua New Guinea (PNG) = <code>169</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: GuardianClassPacificPatrolBoatsPPBR  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31698; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@cb0f763. </p>
 * @see Country#PAPUA_NEW_GUINEA_PNG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class GuardianClassPacificPatrolBoatsPPBR extends EntityType
{
    /** Default constructor */
    public GuardianClassPacificPatrolBoatsPPBR()
    {
        setCountry(Country.PAPUA_NEW_GUINEA_PNG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26739, Light/Patrol Craft
        setSubCategory((byte)2); // uid 31698, Guardian Class, Pacific Patrol Boats (PPB-R)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GuardianClassPacificPatrolBoatsPPBR createInstance()
    {
            return new GuardianClassPacificPatrolBoatsPPBR();
    }
}
