/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgd.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F19AbuUbaidah</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F19AbuUbaidah.createInstance()</code> or <code>new F19AbuUbaidah()</code>. </p>
 * <ul>
 *     <li> Country: Bangladesh (BGD) = <code>18</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: JiangweiIIClassType053H3  = <code>3</code>; </li>
 *     <li> Specific: F19AbuUbaidah  = <code>1</code>; </li>
 *     <li> Entity type uid: 34534; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@26653222. </p>
 * @see Country#BANGLADESH_BGD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F19AbuUbaidah extends EntityType
{
    /** Default constructor */
    public F19AbuUbaidah()
    {
        setCountry(Country.BANGLADESH_BGD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 26771, Guided Missile Frigate (FFG)
        setSubCategory((byte)3); // uid 34533, Jiangwei-II Class (Type 053H3)
        setSpecific((byte)1); // uid 34534, F 19 Abu Ubaidah
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F19AbuUbaidah createInstance()
    {
            return new F19AbuUbaidah();
    }
}
