/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EC225FirefightingSAR</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EC225FirefightingSAR.createInstance()</code> or <code>new EC225FirefightingSAR()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg) = <code>92</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineConventionalTailRotor  = <code>12</code>; </li>
 *     <li> Specific: AirbusHelicoptersEC225SuperPumaMkIIPLUS  = <code>1</code>; </li>
 *     <li> Entity type uid: 28595; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@45efd90f. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterLargeabove20000lbs9072kg
 * @see SubCategory

 */
public final class EC225FirefightingSAR extends EntityType
{
    /** Default constructor */
    public EC225FirefightingSAR()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)92); // uid 28591, Civilian Helicopter, Large (above 20,000 lbs / 9,072 kg)
        setSubCategory((byte)12); // uid 28592, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)1); // uid 28593, Airbus Helicopters EC225 Super Puma Mk II+
        setExtra((byte)2); // uid 28595, EC225 Firefighting/SAR
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EC225FirefightingSAR createInstance()
    {
            return new EC225FirefightingSAR();
    }
}
