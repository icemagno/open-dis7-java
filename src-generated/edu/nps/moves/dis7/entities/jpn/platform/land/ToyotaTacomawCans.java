/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ToyotaTacomawCans</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ToyotaTacomawCans.createInstance()</code> or <code>new ToyotaTacomawCans()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Single Unit Cargo Truck = <code>83</code>; </li>
 *     <li> SubCategory: PickupTruckExtendedCab  = <code>5</code>; </li>
 *     <li> Specific: ToyotaTacoma  = <code>1</code>; </li>
 *     <li> Entity type uid: 24902; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1e7f2e0f. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SingleUnitCargoTruck
 * @see SubCategory

 */
public final class ToyotaTacomawCans extends EntityType
{
    /** Default constructor */
    public ToyotaTacomawCans()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)83); // uid 24879, Single Unit Cargo Truck
        setSubCategory((byte)5); // uid 24898, Pickup Truck, Extended Cab
        setSpecific((byte)1); // uid 24899, Toyota Tacoma
        setExtra((byte)3); // uid 24902, Toyota Tacoma w/ Cans
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ToyotaTacomawCans createInstance()
    {
            return new ToyotaTacomawCans();
    }
}
