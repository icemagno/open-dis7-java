/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>WDIRedSARNightBallLight</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>WDIRedSARNightBallLight.createInstance()</code> or <code>new WDIRedSARNightBallLight()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: SAR Night Light (SRNL) = <code>13</code>; </li>
 *     <li> SubCategory: LEDSRNL  = <code>1</code>; </li>
 *     <li> Specific: WDIRedSARNightBallLight  = <code>1</code>; </li>
 *     <li> Entity type uid: 31836; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@583030bd. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SARNightLightSRNL
 * @see SubCategory

 */
public final class WDIRedSARNightBallLight extends EntityType
{
    /** Default constructor */
    public WDIRedSARNightBallLight()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)13); // uid 31834, SAR Night Light (SRNL)
        setSubCategory((byte)1); // uid 31835, LED SRNL
        setSpecific((byte)1); // uid 31836, WDI Red SAR Night Ball Light
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static WDIRedSARNightBallLight createInstance()
    {
            return new WDIRedSARNightBallLight();
    }
}
