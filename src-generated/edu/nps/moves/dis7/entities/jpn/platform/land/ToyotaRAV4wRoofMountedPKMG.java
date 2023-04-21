/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ToyotaRAV4wRoofMountedPKMG</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ToyotaRAV4wRoofMountedPKMG.createInstance()</code> or <code>new ToyotaRAV4wRoofMountedPKMG()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Car = <code>81</code>; </li>
 *     <li> SubCategory: SportsUtilityVehicleSUVEconomyCompactSmall  = <code>112</code>; </li>
 *     <li> Specific: ToyotaRAV4  = <code>1</code>; </li>
 *     <li> Entity type uid: 24872; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7e70bd39. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Car
 * @see SubCategory

 */
public final class ToyotaRAV4wRoofMountedPKMG extends EntityType
{
    /** Default constructor */
    public ToyotaRAV4wRoofMountedPKMG()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24863, Car
        setSubCategory((byte)112); // uid 24870, Sports Utility Vehicle (SUV), Economy/Compact (Small)
        setSpecific((byte)1); // uid 24871, Toyota RAV-4
        setExtra((byte)1); // uid 24872, Toyota RAV-4 w/ Roof-Mounted PK MG
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ToyotaRAV4wRoofMountedPKMG createInstance()
    {
            return new ToyotaRAV4wRoofMountedPKMG();
    }
}
