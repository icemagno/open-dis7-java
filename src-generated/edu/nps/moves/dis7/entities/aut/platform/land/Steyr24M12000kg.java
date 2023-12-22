/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aut.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Steyr24M12000kg</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Steyr24M12000kg.createInstance()</code> or <code>new Steyr24M12000kg()</code>. </p>
 * <ul>
 *     <li> Country: Austria (AUT) = <code>14</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle - (greater than 1.25 tons) = <code>7</code>; </li>
 *     <li> SubCategory: Steyr14916x6  = <code>1</code>; </li>
 *     <li> Specific: Steyr24M12000kg  = <code>1</code>; </li>
 *     <li> Entity type uid: 24134; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5f341870. </p>
 * @see Country#AUSTRIA_AUT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehiclegreaterthan125tons
 * @see SubCategory

 */
public final class Steyr24M12000kg extends EntityType
{
    /** Default constructor */
    public Steyr24M12000kg()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 24132, Large Wheeled Utility Vehicle - (greater than 1.25 tons)
        setSubCategory((byte)1); // uid 24133, Steyr 1491 (6x6)
        setSpecific((byte)1); // uid 24134, Steyr 24 M, 12000 kg
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Steyr24M12000kg createInstance()
    {
            return new Steyr24M12000kg();
    }
}
