/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SlingLoadAFVAUVM577A3</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SlingLoadAFVAUVM577A3.createInstance()</code> or <code>new SlingLoadAFVAUVM577A3()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Vehicles = <code>5</code>; </li>
 *     <li> SubCategory: SlingLoadArmouredFightingVehicleAFVArmouredUtiliityVehicleAUV  = <code>2</code>; </li>
 *     <li> Specific: SlingLoadAFVAUVM577A3  = <code>2</code>; </li>
 *     <li> Entity type uid: 30839; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65d23aa3. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadVehicles
 * @see SubCategory

 */
public final class SlingLoadAFVAUVM577A3 extends EntityType
{
    /** Default constructor */
    public SlingLoadAFVAUVM577A3()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)5); // uid 30829, Sling Load, Vehicles
        setSubCategory((byte)2); // uid 30837, Sling Load, Armoured Fighting Vehicle (AFV) / Armoured Utiliity Vehicle (AUV)
        setSpecific((byte)2); // uid 30839, Sling Load, AFV/AUV, M577A3
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SlingLoadAFVAUVM577A3 createInstance()
    {
            return new SlingLoadAFVAUVM577A3();
    }
}
