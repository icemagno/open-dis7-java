/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CTAGPRABT</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CTAGPRABT.createInstance()</code> or <code>new CTAGPRABT()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_PERSONNEL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _40mm  = <code>22</code>; </li>
 *     <li> Specific: CasedTelescopicAmmunitionCTA  = <code>1</code>; </li>
 *     <li> Entity type uid: 29555; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@c497a55. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class CTAGPRABT extends EntityType
{
    /** Default constructor */
    public CTAGPRABT()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 21128, Ballistic
        setSubCategory((byte)22); // uid 29553, 40mm
        setSpecific((byte)1); // uid 29554, Cased Telescopic Ammunition (CTA)
        setExtra((byte)1); // uid 29555, CTA GPR-AB-T
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CTAGPRABT createInstance()
    {
            return new CTAGPRABT();
    }
}
