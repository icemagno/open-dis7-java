/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>IvecoACTL6x6FuelTankerSM6640</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>IvecoACTL6x6FuelTankerSM6640.createInstance()</code> or <code>new IvecoACTL6x6FuelTankerSM6640()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Small Wheeled Utility Vehicle = <code>6</code>; </li>
 *     <li> SubCategory: IvecoACTL6x6  = <code>4</code>; </li>
 *     <li> Specific: IvecoACTL6x6FuelTankerSM6640  = <code>1</code>; </li>
 *     <li> Entity type uid: 36263; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@70d2e40b. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SmallWheeledUtilityVehicle
 * @see SubCategory

 */
public final class IvecoACTL6x6FuelTankerSM6640 extends EntityType
{
    /** Default constructor */
    public IvecoACTL6x6FuelTankerSM6640()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 35885, Small Wheeled Utility Vehicle
        setSubCategory((byte)4); // uid 36262, Iveco ACTL (6x6)
        setSpecific((byte)1); // uid 36263, Iveco ACTL (6x6), Fuel Tanker SM 66.40
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static IvecoACTL6x6FuelTankerSM6640 createInstance()
    {
            return new IvecoACTL6x6FuelTankerSM6640();
    }
}