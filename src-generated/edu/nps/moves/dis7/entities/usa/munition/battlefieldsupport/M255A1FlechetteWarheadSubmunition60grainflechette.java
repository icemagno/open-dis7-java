/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M255A1FlechetteWarheadSubmunition60grainflechette</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M255A1FlechetteWarheadSubmunition60grainflechette.createInstance()</code> or <code>new M255A1FlechetteWarheadSubmunition60grainflechette()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: Hydra70RocketSystem70mm275in  = <code>21</code>; </li>
 *     <li> Specific: Hydra70wM255A1FlechetteWarhead  = <code>2</code>; </li>
 *     <li> Entity type uid: 24971; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@563843f1. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class M255A1FlechetteWarheadSubmunition60grainflechette extends EntityType
{
    /** Default constructor */
    public M255A1FlechetteWarheadSubmunition60grainflechette()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)21); // uid 20150, Hydra 70 Rocket System (70 mm, 2.75 in)
        setSpecific((byte)2); // uid 20152, Hydra 70 w/ M255A1 Flechette Warhead
        setExtra((byte)1); // uid 24971, M255A1 Flechette Warhead Submunition (60-grain flechette)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M255A1FlechetteWarheadSubmunition60grainflechette createInstance()
    {
            return new M255A1FlechetteWarheadSubmunition60grainflechette();
    }
}
