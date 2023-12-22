/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M750SemiTrailerVanPartsStorage6ton</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M750SemiTrailerVanPartsStorage6ton.createInstance()</code> or <code>new M750SemiTrailerVanPartsStorage6ton()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Maintenance equipment trailer = <code>20</code>; </li>
 *     <li> SubCategory: ToolsPartsTrailer  = <code>3</code>; </li>
 *     <li> Specific: M750SemiTrailerVanPartsStorage6ton  = <code>5</code>; </li>
 *     <li> Entity type uid: 33195; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24fba488. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Maintenanceequipmenttrailer
 * @see SubCategory

 */
public final class M750SemiTrailerVanPartsStorage6ton extends EntityType
{
    /** Default constructor */
    public M750SemiTrailerVanPartsStorage6ton()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)20); // uid 10646, Maintenance equipment trailer
        setSubCategory((byte)3); // uid 10649, Tools/Parts Trailer
        setSpecific((byte)5); // uid 33195, M750 Semi-Trailer, Van, Parts Storage, 6-ton
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M750SemiTrailerVanPartsStorage6ton createInstance()
    {
            return new M750SemiTrailerVanPartsStorage6ton();
    }
}
