/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Pinzgauer710M</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Pinzgauer710M.createInstance()</code> or <code>new Pinzgauer710M()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: PinzgauerHighMobilityAllTerrainVehicle  = <code>15</code>; </li>
 *     <li> Specific: Pinzgauer7104x4  = <code>1</code>; </li>
 *     <li> Entity type uid: 26321; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7c663eaf. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class Pinzgauer710M extends EntityType
{
    /** Default constructor */
    public Pinzgauer710M()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 14935, Large Wheeled Utility Vehicle
        setSubCategory((byte)15); // uid 26319, Pinzgauer High-Mobility All-Terrain Vehicle
        setSpecific((byte)1); // uid 26320, Pinzgauer 710 4x4
        setExtra((byte)1); // uid 26321, Pinzgauer 710M
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Pinzgauer710M createInstance()
    {
            return new Pinzgauer710M();
    }
}
