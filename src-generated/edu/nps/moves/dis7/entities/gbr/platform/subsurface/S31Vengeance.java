/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S31Vengeance</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S31Vengeance.createInstance()</code> or <code>new S31Vengeance()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSBN (Nuclear Ballistic Missiles) = <code>1</code>; </li>
 *     <li> SubCategory: VanguardClass  = <code>1</code>; </li>
 *     <li> Specific: S31Vengeance  = <code>4</code>; </li>
 *     <li> Entity type uid: 15591; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6723610b. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSBNNuclearBallisticMissiles
 * @see SubCategory

 */
public final class S31Vengeance extends EntityType
{
    /** Default constructor */
    public S31Vengeance()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)1); // uid 15586, SSBN (Nuclear Ballistic Missiles)
        setSubCategory((byte)1); // uid 15587, Vanguard Class
        setSpecific((byte)4); // uid 15591, S31 Vengeance
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S31Vengeance createInstance()
    {
            return new S31Vengeance();
    }
}
