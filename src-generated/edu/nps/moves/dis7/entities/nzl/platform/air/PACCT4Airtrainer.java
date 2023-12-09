/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nzl.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PACCT4Airtrainer</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PACCT4Airtrainer.createInstance()</code> or <code>new PACCT4Airtrainer()</code>. </p>
 * <ul>
 *     <li> Country: New Zealand (NZL) = <code>156</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: PACCT4Airtrainer  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 29191; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6331250e. </p>
 * @see Country#NEW_ZEALAND_NZL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class PACCT4Airtrainer extends EntityType
{
    /** Default constructor */
    public PACCT4Airtrainer()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 29190, Trainer
        setSubCategory((byte)1); // uid 29191, PAC CT/4 Airtrainer
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PACCT4Airtrainer createInstance()
    {
            return new PACCT4Airtrainer();
    }
}
