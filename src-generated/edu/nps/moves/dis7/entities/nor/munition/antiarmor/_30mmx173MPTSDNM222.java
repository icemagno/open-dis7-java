/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nor.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_30mmx173MPTSDNM222</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_30mmx173MPTSDNM222.createInstance()</code> or <code>new _30mmx173MPTSDNM222()</code>. </p>
 * <ul>
 *     <li> Country: Norway (NOR) = <code>163</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _30mmx173  = <code>2</code>; </li>
 *     <li> Specific: _30mmx173MPTSDNM222  = <code>2</code>; </li>
 *     <li> Entity type uid: 28838; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@113eed88. </p>
 * @see Country#NORWAY_NOR
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _30mmx173MPTSDNM222 extends EntityType
{
    /** Default constructor */
    public _30mmx173MPTSDNM222()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 27325, Ballistic
        setSubCategory((byte)2); // uid 28836, 30mm x173
        setSpecific((byte)2); // uid 28838, 30mm x173 MP-T/SD NM222
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _30mmx173MPTSDNM222 createInstance()
    {
            return new _30mmx173MPTSDNM222();
    }
}
