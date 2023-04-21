/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TidalLagoonPowerStation</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TidalLagoonPowerStation.createInstance()</code> or <code>new TidalLagoonPowerStation()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Electrical Power Installation = <code>7</code>; </li>
 *     <li> SubCategory: TidalPowerStation  = <code>2</code>; </li>
 *     <li> Specific: TidalLagoonPowerStation  = <code>4</code>; </li>
 *     <li> Entity type uid: 29782; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@148b6f95. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ElectricalPowerInstallation
 * @see SubCategory

 */
public final class TidalLagoonPowerStation extends EntityType
{
    /** Default constructor */
    public TidalLagoonPowerStation()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 29775, Electrical Power Installation
        setSubCategory((byte)2); // uid 29778, Tidal Power Station
        setSpecific((byte)4); // uid 29782, Tidal Lagoon Power Station
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TidalLagoonPowerStation createInstance()
    {
            return new TidalLagoonPowerStation();
    }
}
