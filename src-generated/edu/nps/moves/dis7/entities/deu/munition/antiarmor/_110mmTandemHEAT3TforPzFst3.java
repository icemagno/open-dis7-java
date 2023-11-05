/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_110mmTandemHEAT3TforPzFst3</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_110mmTandemHEAT3TforPzFst3.createInstance()</code> or <code>new _110mmTandemHEAT3TforPzFst3()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_ARMOR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _110mm  = <code>9</code>; </li>
 *     <li> Specific: _110mmTandemHEAT3TforPzFst3  = <code>1</code>; </li>
 *     <li> Entity type uid: 21225; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@53e93fb7. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _110mmTandemHEAT3TforPzFst3 extends EntityType
{
    /** Default constructor */
    public _110mmTandemHEAT3TforPzFst3()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 21215, Ballistic
        setSubCategory((byte)9); // uid 21224, 110mm
        setSpecific((byte)1); // uid 21225, 110mm Tandem HEAT, 3-T for PzFst-3
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _110mmTandemHEAT3TforPzFst3 createInstance()
    {
            return new _110mmTandemHEAT3TforPzFst3();
    }
}
