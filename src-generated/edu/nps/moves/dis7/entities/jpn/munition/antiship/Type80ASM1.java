/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Type80ASM1</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Type80ASM1.createInstance()</code> or <code>new Type80ASM1()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_SHIP</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: ASM11CType8091  = <code>3</code>; </li>
 *     <li> Specific: Type80ASM1  = <code>1</code>; </li>
 *     <li> Entity type uid: 29038; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@adafe19. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class Type80ASM1 extends EntityType
{
    /** Default constructor */
    public Type80ASM1()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21690, Guided
        setSubCategory((byte)3); // uid 29037, ASM-1/1C (Type 80/91)
        setSpecific((byte)1); // uid 29038, Type 80 (ASM-1)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Type80ASM1 createInstance()
    {
            return new Type80ASM1();
    }
}
