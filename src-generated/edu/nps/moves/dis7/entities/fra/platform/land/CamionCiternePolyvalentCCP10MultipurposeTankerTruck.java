/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CamionCiternePolyvalentCCP10MultipurposeTankerTruck</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CamionCiternePolyvalentCCP10MultipurposeTankerTruck.createInstance()</code> or <code>new CamionCiternePolyvalentCCP10MultipurposeTankerTruck()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Large Wheeled Utility Vehicle = <code>7</code>; </li>
 *     <li> SubCategory: CamionCiternePolyvalentCCP10MultipurposeTankerTruck  = <code>7</code>; </li>
 *     <li> Specific: null <code>(none)</code>; </li>
 *     <li> Entity type uid: 34347; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7ae0a9ec. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LargeWheeledUtilityVehicle
 * @see SubCategory

 */
public final class CamionCiternePolyvalentCCP10MultipurposeTankerTruck extends EntityType
{
    /** Default constructor */
    public CamionCiternePolyvalentCCP10MultipurposeTankerTruck()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 15675, Large Wheeled Utility Vehicle
        setSubCategory((byte)7); // uid 34347, Camion Citerne Polyvalent (CCP10) - Multipurpose Tanker Truck
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CamionCiternePolyvalentCCP10MultipurposeTankerTruck createInstance()
    {
            return new CamionCiternePolyvalentCCP10MultipurposeTankerTruck();
    }
}
