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
 * <p> Entity class <b><code>SHFTriBandAdvancedRangeExtensionTerminalSTARTANTSC143</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SHFTriBandAdvancedRangeExtensionTerminalSTARTANTSC143.createInstance()</code> or <code>new SHFTriBandAdvancedRangeExtensionTerminalSTARTANTSC143()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Communications Facility = <code>33</code>; </li>
 *     <li> SubCategory: MobileSubscriberEquipmentMSEPlatform  = <code>1</code>; </li>
 *     <li> Specific: SHFTriBandAdvancedRangeExtensionTerminalSTARTANTSC143  = <code>13</code>; </li>
 *     <li> Entity type uid: 23485; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34136bd1. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CommunicationsFacility
 * @see SubCategory

 */
public final class SHFTriBandAdvancedRangeExtensionTerminalSTARTANTSC143 extends EntityType
{
    /** Default constructor */
    public SHFTriBandAdvancedRangeExtensionTerminalSTARTANTSC143()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)33); // uid 10746, Communications Facility
        setSubCategory((byte)1); // uid 23472, Mobile Subscriber Equipment (MSE) Platform
        setSpecific((byte)13); // uid 23485, SHF, Tri-Band, Advanced Range Extension Terminal (STAR-T), AN/TSC-143
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SHFTriBandAdvancedRangeExtensionTerminalSTARTANTSC143 createInstance()
    {
            return new SHFTriBandAdvancedRangeExtensionTerminalSTARTANTSC143();
    }
}
