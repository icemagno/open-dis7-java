/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F789LieutenantDeVaisseauLeHenaff</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F789LieutenantDeVaisseauLeHenaff.createInstance()</code> or <code>new F789LieutenantDeVaisseauLeHenaff()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: DestienneDorvesTypeA69class  = <code>1</code>; </li>
 *     <li> Specific: F789LieutenantDeVaisseauLeHenaff  = <code>9</code>; </li>
 *     <li> Entity type uid: 16155; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6c0d9d86. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class F789LieutenantDeVaisseauLeHenaff extends EntityType
{
    /** Default constructor */
    public F789LieutenantDeVaisseauLeHenaff()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16145, Frigate
        setSubCategory((byte)1); // uid 16146, D'estienne D'orves (Type A 69) class
        setSpecific((byte)9); // uid 16155, F 789 Lieutenant De Vaisseau Le Henaff
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F789LieutenantDeVaisseauLeHenaff createInstance()
    {
            return new F789LieutenantDeVaisseauLeHenaff();
    }
}
