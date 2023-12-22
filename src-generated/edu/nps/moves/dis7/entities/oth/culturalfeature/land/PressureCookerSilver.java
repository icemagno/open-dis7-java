/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PressureCookerSilver</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PressureCookerSilver.createInstance()</code> or <code>new PressureCookerSilver()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Appliances = <code>22</code>; </li>
 *     <li> SubCategory: Countertop  = <code>1</code>; </li>
 *     <li> Specific: PressureCooker  = <code>3</code>; </li>
 *     <li> Entity type uid: 26483; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@703cb756. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Appliances
 * @see SubCategory

 */
public final class PressureCookerSilver extends EntityType
{
    /** Default constructor */
    public PressureCookerSilver()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)22); // uid 26475, Appliances
        setSubCategory((byte)1); // uid 26476, Countertop
        setSpecific((byte)3); // uid 26481, Pressure Cooker
        setExtra((byte)2); // uid 26483, Pressure Cooker, Silver
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PressureCookerSilver createInstance()
    {
            return new PressureCookerSilver();
    }
}
