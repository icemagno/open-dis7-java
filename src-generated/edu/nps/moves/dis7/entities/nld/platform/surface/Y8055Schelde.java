/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nld.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Y8055Schelde</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Y8055Schelde.createInstance()</code> or <code>new Y8055Schelde()</code>. </p>
 * <ul>
 *     <li> Country: Netherlands (NLD) = <code>153</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: ScheldeClassSmallHarbourTugs  = <code>8</code>; </li>
 *     <li> Specific: Y8055Schelde  = <code>1</code>; </li>
 *     <li> Entity type uid: 28268; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f815e7f. </p>
 * @see Country#NETHERLANDS_NLD
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class Y8055Schelde extends EntityType
{
    /** Default constructor */
    public Y8055Schelde()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18942, Auxiliary
        setSubCategory((byte)8); // uid 28267, Schelde Class (Small Harbour Tugs)
        setSpecific((byte)1); // uid 28268, Y8055 Schelde
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Y8055Schelde createInstance()
    {
            return new Y8055Schelde();
    }
}
