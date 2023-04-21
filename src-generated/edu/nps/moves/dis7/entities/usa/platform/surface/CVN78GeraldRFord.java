/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CVN78GeraldRFord</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CVN78GeraldRFord.createInstance()</code> or <code>new CVN78GeraldRFord()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Carrier = <code>1</code>; </li>
 *     <li> SubCategory: GeraldRFordClass  = <code>6</code>; </li>
 *     <li> Specific: CVN78GeraldRFord  = <code>1</code>; </li>
 *     <li> Entity type uid: 26945; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@74ba6ff5. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Carrier
 * @see SubCategory

 */
public final class CVN78GeraldRFord extends EntityType
{
    /** Default constructor */
    public CVN78GeraldRFord()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 11293, Carrier
        setSubCategory((byte)6); // uid 26434, Gerald R. Ford Class
        setSpecific((byte)1); // uid 26945, CVN-78 Gerald R. Ford
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CVN78GeraldRFord createInstance()
    {
            return new CVN78GeraldRFord();
    }
}
