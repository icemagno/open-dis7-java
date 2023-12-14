/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BostonWhalerMontauk190</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BostonWhalerMontauk190.createInstance()</code> or <code>new BostonWhalerMontauk190()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Private Motorboat = <code>84</code>; </li>
 *     <li> SubCategory: SmallMotorboatupto26ft79m  = <code>1</code>; </li>
 *     <li> Specific: BostonWhalerMontauk  = <code>2</code>; </li>
 *     <li> Entity type uid: 26442; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3ace6346. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PrivateMotorboat
 * @see SubCategory

 */
public final class BostonWhalerMontauk190 extends EntityType
{
    /** Default constructor */
    public BostonWhalerMontauk190()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 26437, Private Motorboat
        setSubCategory((byte)1); // uid 26438, Small Motorboat (up to 26ft/7.9m)
        setSpecific((byte)2); // uid 26439, Boston Whaler Montauk
        setExtra((byte)3); // uid 26442, Boston Whaler Montauk 190
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BostonWhalerMontauk190 createInstance()
    {
            return new BostonWhalerMontauk190();
    }
}
