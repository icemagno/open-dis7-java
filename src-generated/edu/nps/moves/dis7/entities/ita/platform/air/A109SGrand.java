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
 * <p> Entity class <b><code>A109SGrand</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A109SGrand.createInstance()</code> or <code>new A109SGrand()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg) = <code>90</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineConventionalTailRotor  = <code>12</code>; </li>
 *     <li> Specific: AgustaWestlandAW109  = <code>1</code>; </li>
 *     <li> Entity type uid: 28506; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5fb97279. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterSmallupto7000lbs3175kg
 * @see SubCategory

 */
public final class A109SGrand extends EntityType
{
    /** Default constructor */
    public A109SGrand()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)90); // uid 28496, Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg)
        setSubCategory((byte)12); // uid 28497, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)1); // uid 28498, Agusta Westland AW109
        setExtra((byte)8); // uid 28506, A109S Grand
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A109SGrand createInstance()
    {
            return new A109SGrand();
    }
}
