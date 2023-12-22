/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CartridgeAFV90mmAPFSDSTMecar90</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CartridgeAFV90mmAPFSDSTMecar90.createInstance()</code> or <code>new CartridgeAFV90mmAPFSDSTMecar90()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _90mm  = <code>1</code>; </li>
 *     <li> Specific: CartridgeAFV90mmAPFSDSTMecar90  = <code>2</code>; </li>
 *     <li> Entity type uid: 26955; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9c0d0bd. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class CartridgeAFV90mmAPFSDSTMecar90 extends EntityType
{
    /** Default constructor */
    public CartridgeAFV90mmAPFSDSTMecar90()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 26952, Ballistic
        setSubCategory((byte)1); // uid 26953, 90mm
        setSpecific((byte)2); // uid 26955, Cartridge, AFV, 90mm, APFSDS-T, Mecar90
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CartridgeAFV90mmAPFSDSTMecar90 createInstance()
    {
            return new CartridgeAFV90mmAPFSDSTMecar90();
    }
}
