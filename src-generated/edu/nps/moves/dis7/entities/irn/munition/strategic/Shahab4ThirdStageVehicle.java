/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Shahab4ThirdStageVehicle</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Shahab4ThirdStageVehicle.createInstance()</code> or <code>new Shahab4ThirdStageVehicle()</code>. </p>
 * <ul>
 *     <li> Country: Iran (Islamic Republic of) (IRN) = <code>101</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>STRATEGIC</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: Shahab4  = <code>22</code>; </li>
 *     <li> Specific: Shahab4ThirdStageVehicle  = <code>2</code>; </li>
 *     <li> Entity type uid: 32494; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15f861ee. </p>
 * @see Country#IRAN_ISLAMIC_REPUBLIC_OF_IRN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Shahab4ThirdStageVehicle extends EntityType
{
    /** Default constructor */
    public Shahab4ThirdStageVehicle()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21715, Guided
        setSubCategory((byte)22); // uid 32492, Shahab 4
        setSpecific((byte)2); // uid 32494, Shahab 4 Third Stage Vehicle
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Shahab4ThirdStageVehicle createInstance()
    {
            return new Shahab4ThirdStageVehicle();
    }
}
