/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>JointElectronicsTypeDesignationSystemJETDSNonspecificSeries</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>JointElectronicsTypeDesignationSystemJETDSNonspecificSeries.createInstance()</code> or <code>new JointElectronicsTypeDesignationSystemJETDSNonspecificSeries()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Tactical Air Navigation (TACAN) Transmitter/Receiver (Moving Platform Equipment) = <code>12</code>; </li>
 *     <li> SubCategory: JointElectronicsTypeDesignationSystemJETDSNonspecificSeries  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27006; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@181098bf. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TacticalAirNavigationTACANTransmitterReceiverMovingPlatformEquipment
 * @see SubCategory

 */
public final class JointElectronicsTypeDesignationSystemJETDSNonspecificSeries extends EntityType
{
    /** Default constructor */
    public JointElectronicsTypeDesignationSystemJETDSNonspecificSeries()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)12); // uid 27005, Tactical Air Navigation (TACAN) Transmitter/Receiver (Moving Platform Equipment)
        setSubCategory((byte)1); // uid 27006, Joint Electronics Type Designation System (JETDS) Non-specific Series
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static JointElectronicsTypeDesignationSystemJETDSNonspecificSeries createInstance()
    {
            return new JointElectronicsTypeDesignationSystemJETDSNonspecificSeries();
    }
}
