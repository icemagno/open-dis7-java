/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ARS25CHANGWON</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ARS25CHANGWON.createInstance()</code> or <code>new ARS25CHANGWON()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SalvageShip  = <code>5</code>; </li>
 *     <li> Specific: ARS25CHANGWON  = <code>2</code>; </li>
 *     <li> Entity type uid: 17725; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@53bf7094. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class ARS25CHANGWON extends EntityType
{
    /** Default constructor */
    public ARS25CHANGWON()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17711, Auxiliary
        setSubCategory((byte)5); // uid 17723, Salvage Ship
        setSpecific((byte)2); // uid 17725, ARS 25 CHANG WON
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ARS25CHANGWON createInstance()
    {
            return new ARS25CHANGWON();
    }
}
