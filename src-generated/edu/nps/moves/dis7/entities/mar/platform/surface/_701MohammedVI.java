/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_701MohammedVI</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_701MohammedVI.createInstance()</code> or <code>new _701MohammedVI()</code>. </p>
 * <ul>
 *     <li> Country: Morocco (MAR) = <code>147</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: FREMMFrigate  = <code>3</code>; </li>
 *     <li> Specific: _701MohammedVI  = <code>1</code>; </li>
 *     <li> Entity type uid: 28669; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4443ef6f. </p>
 * @see Country#MOROCCO_MAR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _701MohammedVI extends EntityType
{
    /** Default constructor */
    public _701MohammedVI()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27691, Guided Missile Frigate (FFG)
        setSubCategory((byte)3); // uid 28668, FREMM Frigate
        setSpecific((byte)1); // uid 28669, 701 Mohammed VI
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _701MohammedVI createInstance()
    {
            return new _701MohammedVI();
    }
}
