/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LHD02Canberra</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LHD02Canberra.createInstance()</code> or <code>new LHD02Canberra()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Transport Dock = <code>56</code>; </li>
 *     <li> SubCategory: CanberraClassLandingHelicopterDock  = <code>1</code>; </li>
 *     <li> Specific: LHD02Canberra  = <code>1</code>; </li>
 *     <li> Entity type uid: 28652; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d8a00e3. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousTransportDock
 * @see SubCategory

 */
public final class LHD02Canberra extends EntityType
{
    /** Default constructor */
    public LHD02Canberra()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)56); // uid 28650, Amphibious Transport Dock
        setSubCategory((byte)1); // uid 28651, Canberra Class (Landing Helicopter Dock)
        setSpecific((byte)1); // uid 28652, LHD 02 Canberra
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LHD02Canberra createInstance()
    {
            return new LHD02Canberra();
    }
}
