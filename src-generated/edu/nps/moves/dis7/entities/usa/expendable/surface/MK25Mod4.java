/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MK25Mod4</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MK25Mod4.createInstance()</code> or <code>new MK25Mod4()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Smoke = <code>8</code>; </li>
 *     <li> SubCategory: SmokeMarker  = <code>2</code>; </li>
 *     <li> Specific: MK25ShortBurningMarineMarker  = <code>1</code>; </li>
 *     <li> Entity type uid: 24997; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@2b058bfd. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Smoke
 * @see SubCategory

 */
public final class MK25Mod4 extends EntityType
{
    /** Default constructor */
    public MK25Mod4()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 24992, Smoke
        setSubCategory((byte)2); // uid 24993, Smoke Marker
        setSpecific((byte)1); // uid 24994, MK 25 Short Burning Marine Marker
        setExtra((byte)4); // uid 24997, MK 25 Mod 4
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MK25Mod4 createInstance()
    {
            return new MK25Mod4();
    }
}
