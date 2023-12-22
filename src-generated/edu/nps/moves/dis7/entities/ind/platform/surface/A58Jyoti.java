/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A58Jyoti</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A58Jyoti.createInstance()</code> or <code>new A58Jyoti()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: JyotiClassReplenishmentTankerAOR  = <code>2</code>; </li>
 *     <li> Specific: A58Jyoti  = <code>1</code>; </li>
 *     <li> Entity type uid: 18851; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@132ddbab. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A58Jyoti extends EntityType
{
    /** Default constructor */
    public A58Jyoti()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18847, Auxiliary
        setSubCategory((byte)2); // uid 18850, Jyoti Class (Replenishment Tanker ) (AOR)
        setSpecific((byte)1); // uid 18851, A58 Jyoti
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A58Jyoti createInstance()
    {
            return new A58Jyoti();
    }
}
