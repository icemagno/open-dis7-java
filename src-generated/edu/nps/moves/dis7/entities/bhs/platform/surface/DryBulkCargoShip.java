/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bhs.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DryBulkCargoShip</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DryBulkCargoShip.createInstance()</code> or <code>new DryBulkCargoShip()</code>. </p>
 * <ul>
 *     <li> Country: Bahamas (BHS) = <code>15</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dry Cargo Ship (Group 2 Merchant) = <code>81</code>; </li>
 *     <li> SubCategory: DryBulkCargoShip  = <code>2</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 24562; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5bcab519. </p>
 * @see Country#BAHAMAS_BHS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DryCargoShipGroup2Merchant
 * @see SubCategory

 */
public final class DryBulkCargoShip extends EntityType
{
    /** Default constructor */
    public DryBulkCargoShip()
    {
        setCountry(Country.BAHAMAS_BHS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)81); // uid 24482, Dry Cargo Ship (Group 2 Merchant)
        setSubCategory((byte)2); // uid 24562, Dry Bulk Cargo Ship
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DryBulkCargoShip createInstance()
    {
            return new DryBulkCargoShip();
    }
}
