/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AirbusHelicoptersH175</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AirbusHelicoptersH175.createInstance()</code> or <code>new AirbusHelicoptersH175()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg) = <code>91</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineConventionalTailRotor  = <code>12</code>; </li>
 *     <li> Specific: AirbusHelicoptersH175  = <code>2</code>; </li>
 *     <li> Entity type uid: 31745; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31ff43be. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterMediumupto20000lbs9072kg
 * @see SubCategory

 */
public final class AirbusHelicoptersH175 extends EntityType
{
    /** Default constructor */
    public AirbusHelicoptersH175()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 26604, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
        setSubCategory((byte)12); // uid 26605, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)2); // uid 31745, Airbus Helicopters H175
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AirbusHelicoptersH175 createInstance()
    {
            return new AirbusHelicoptersH175();
    }
}
