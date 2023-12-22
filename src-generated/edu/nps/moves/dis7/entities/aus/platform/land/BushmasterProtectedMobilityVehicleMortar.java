/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BushmasterProtectedMobilityVehicleMortar</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BushmasterProtectedMobilityVehicleMortar.createInstance()</code> or <code>new BushmasterProtectedMobilityVehicleMortar()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armoured Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: BushmasterProtectedMobilityVehicle  = <code>2</code>; </li>
 *     <li> Specific: BushmasterProtectedMobilityVehicleMortar  = <code>2</code>; </li>
 *     <li> Entity type uid: 28607; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3f102e87. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmouredUtilityVehicle
 * @see SubCategory

 */
public final class BushmasterProtectedMobilityVehicleMortar extends EntityType
{
    /** Default constructor */
    public BushmasterProtectedMobilityVehicleMortar()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 26906, Armoured Utility Vehicle
        setSubCategory((byte)2); // uid 26912, Bushmaster Protected Mobility Vehicle
        setSpecific((byte)2); // uid 28607, Bushmaster Protected Mobility Vehicle - Mortar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BushmasterProtectedMobilityVehicleMortar createInstance()
    {
            return new BushmasterProtectedMobilityVehicleMortar();
    }
}
