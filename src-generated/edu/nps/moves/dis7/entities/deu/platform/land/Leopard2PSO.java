/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Leopard2PSO</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Leopard2PSO.createInstance()</code> or <code>new Leopard2PSO()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: Leopard2ImprovedMBT  = <code>3</code>; </li>
 *     <li> Specific: Leopard2PSO  = <code>7</code>; </li>
 *     <li> Entity type uid: 33330; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@41d426b5. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class Leopard2PSO extends EntityType
{
    /** Default constructor */
    public Leopard2PSO()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 16240, Tank
        setSubCategory((byte)3); // uid 16248, Leopard 2 (Improved) MBT
        setSpecific((byte)7); // uid 33330, Leopard 2 PSO
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Leopard2PSO createInstance()
    {
            return new Leopard2PSO();
    }
}
