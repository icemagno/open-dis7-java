/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CRV7M156SMOKEWhitePhosphorus</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CRV7M156SMOKEWhitePhosphorus.createInstance()</code> or <code>new CRV7M156SMOKEWhitePhosphorus()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _70mm275in  = <code>1</code>; </li>
 *     <li> Specific: CRV7M156_SMOKEWhitePhosphorus  = <code>9</code>; </li>
 *     <li> Entity type uid: 21770; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@44b9c7c4. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class CRV7M156SMOKEWhitePhosphorus extends EntityType
{
    /** Default constructor */
    public CRV7M156SMOKEWhitePhosphorus()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21760, Ballistic
        setSubCategory((byte)1); // uid 21761, 70 mm(2.75in)
        setSpecific((byte)9); // uid 21770, CRV7 M156: SMOKE (White Phosphorus)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CRV7M156SMOKEWhitePhosphorus createInstance()
    {
            return new CRV7M156SMOKEWhitePhosphorus();
    }
}
