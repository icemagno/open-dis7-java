/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S615Linflexible</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S615Linflexible.createInstance()</code> or <code>new S615Linflexible()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSGN (Nuclear Guided Missile) = <code>2</code>; </li>
 *     <li> SubCategory: LinflexibleclassSNLE  = <code>1</code>; </li>
 *     <li> Specific: S615Linflexible  = <code>5</code>; </li>
 *     <li> Entity type uid: 16185; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b34fff9. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSGNNuclearGuidedMissile
 * @see SubCategory

 */
public final class S615Linflexible extends EntityType
{
    /** Default constructor */
    public S615Linflexible()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)2); // uid 16179, SSGN (Nuclear Guided Missile)
        setSubCategory((byte)1); // uid 16180, L'inflexible class (SNLE)
        setSpecific((byte)5); // uid 16185, S 615 L'inflexible
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S615Linflexible createInstance()
    {
            return new S615Linflexible();
    }
}
