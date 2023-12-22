/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.hkg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Accurate</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Accurate.createInstance()</code> or <code>new Accurate()</code>. </p>
 * <ul>
 *     <li> Country: Hong Kong (HKG) = <code>95</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dry Cargo Ship (Group 2 Merchant) = <code>81</code>; </li>
 *     <li> SubCategory: DryBulkCargoShip  = <code>2</code>; </li>
 *     <li> Specific: Accurate  = <code>1</code>; </li>
 *     <li> Entity type uid: 24591; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@277f7dd3. </p>
 * @see Country#HONG_KONG_HKG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DryCargoShipGroup2Merchant
 * @see SubCategory

 */
public final class Accurate extends EntityType
{
    /** Default constructor */
    public Accurate()
    {
        setCountry(Country.HONG_KONG_HKG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24589, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)2); // uid 24590, Dry Bulk Cargo Ship
        setSpecific((byte)1); // uid 24591, Accurate
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Accurate createInstance()
    {
            return new Accurate();
    }
}
