/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Opticalimagingsurveillancesatellite</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Opticalimagingsurveillancesatellite.createInstance()</code> or <code>new Opticalimagingsurveillancesatellite()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>2</code>; </li>
 *     <li> SubCategory: Opticalimagingsurveillancesatellite  = <code>8</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 16227; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ef27d7f. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class Opticalimagingsurveillancesatellite extends EntityType
{
    /** Default constructor */
    public Opticalimagingsurveillancesatellite()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 16211, Unmanned
        setSubCategory((byte)8); // uid 16227, Optical imaging surveillance satellite
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Opticalimagingsurveillancesatellite createInstance()
    {
            return new Opticalimagingsurveillancesatellite();
    }
}
