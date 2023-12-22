/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.radio.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TypicalDAFIFDerivedILSGlideslopeTransmitter</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TypicalDAFIFDerivedILSGlideslopeTransmitter.createInstance()</code> or <code>new TypicalDAFIFDerivedILSGlideslopeTransmitter()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Radio = <code>7</code>; </li>
 *     <li> Category: Instrumented Landing System (ILS) Glideslope = <code>4</code>; </li>
 *     <li> SubCategory: ILSGlideslopeOther  = <code>0</code>; </li>
 *     <li> Specific: TypicalDAFIFDerivedILSGlideslopeTransmitter  = <code>3</code>; </li>
 *     <li> Entity type uid: 22206; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@77b22b05. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#RADIO
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see InstrumentedLandingSystemILSGlideslope
 * @see SubCategory

 */
public final class TypicalDAFIFDerivedILSGlideslopeTransmitter extends EntityType
{
    /** Default constructor */
    public TypicalDAFIFDerivedILSGlideslopeTransmitter()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.RADIO);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 22204, Instrumented Landing System (ILS) Glideslope
        setSubCategory((byte)0); // uid 22205, ILS Glideslope, Other
        setSpecific((byte)3); // uid 22206, Typical DAFIF Derived ILS Glideslope Transmitter
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TypicalDAFIFDerivedILSGlideslopeTransmitter createInstance()
    {
            return new TypicalDAFIFDerivedILSGlideslopeTransmitter();
    }
}
