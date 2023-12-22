/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LeonardoAgustaWestlandAW139</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LeonardoAgustaWestlandAW139.createInstance()</code> or <code>new LeonardoAgustaWestlandAW139()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg) = <code>91</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineConventionalTailRotor  = <code>12</code>; </li>
 *     <li> Specific: LeonardoAgustaWestlandAW139  = <code>1</code>; </li>
 *     <li> Entity type uid: 32094; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3c291aad. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterMediumupto20000lbs9072kg
 * @see SubCategory

 */
public final class LeonardoAgustaWestlandAW139 extends EntityType
{
    /** Default constructor */
    public LeonardoAgustaWestlandAW139()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 32092, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
        setSubCategory((byte)12); // uid 32093, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)1); // uid 32094, Leonardo (AgustaWestland) AW139
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LeonardoAgustaWestlandAW139 createInstance()
    {
            return new LeonardoAgustaWestlandAW139();
    }
}
