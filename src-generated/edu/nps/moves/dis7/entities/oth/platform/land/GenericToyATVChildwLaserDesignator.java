/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericToyATVChildwLaserDesignator</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericToyATVChildwLaserDesignator.createInstance()</code> or <code>new GenericToyATVChildwLaserDesignator()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Recreational = <code>90</code>; </li>
 *     <li> SubCategory: GenericToyATV  = <code>7</code>; </li>
 *     <li> Specific: GenericToyATVChildwLaserDesignator  = <code>1</code>; </li>
 *     <li> Entity type uid: 24837; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d96d872. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Recreational
 * @see SubCategory

 */
public final class GenericToyATVChildwLaserDesignator extends EntityType
{
    /** Default constructor */
    public GenericToyATVChildwLaserDesignator()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)90); // uid 24835, Recreational
        setSubCategory((byte)7); // uid 24836, Generic Toy, ATV
        setSpecific((byte)1); // uid 24837, Generic Toy ATV, Child w/ Laser Designator
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericToyATVChildwLaserDesignator createInstance()
    {
            return new GenericToyATVChildwLaserDesignator();
    }
}
