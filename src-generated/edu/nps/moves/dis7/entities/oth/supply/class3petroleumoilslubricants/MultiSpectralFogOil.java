/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class3petroleumoilslubricants;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MultiSpectralFogOil</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MultiSpectralFogOil.createInstance()</code> or <code>new MultiSpectralFogOil()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_3_PETROLEUM_OILS_LUBRICANTS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: P - Packaged POL = <code>4</code>; </li>
 *     <li> SubCategory: Fogoil  = <code>2</code>; </li>
 *     <li> Specific: MultiSpectralFogOil  = <code>1</code>; </li>
 *     <li> Entity type uid: 30686; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1c135f63. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see PPackagedPOL
 * @see SubCategory

 */
public final class MultiSpectralFogOil extends EntityType
{
    /** Default constructor */
    public MultiSpectralFogOil()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_3_PETROLEUM_OILS_LUBRICANTS));

        setCategory((byte)4); // uid 30683, P - Packaged POL
        setSubCategory((byte)2); // uid 30685, Fog oil
        setSpecific((byte)1); // uid 30686, Multi-Spectral Fog Oil
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MultiSpectralFogOil createInstance()
    {
            return new MultiSpectralFogOil();
    }
}
