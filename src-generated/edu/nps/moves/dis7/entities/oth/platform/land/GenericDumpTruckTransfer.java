/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericDumpTruckTransfer</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericDumpTruckTransfer.createInstance()</code> or <code>new GenericDumpTruckTransfer()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Construction Specialty Vehicle = <code>87</code>; </li>
 *     <li> SubCategory: GenericDumpTruckTransfer  = <code>26</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25907; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5f462e3b. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ConstructionSpecialtyVehicle
 * @see SubCategory

 */
public final class GenericDumpTruckTransfer extends EntityType
{
    /** Default constructor */
    public GenericDumpTruckTransfer()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 25881, Construction Specialty Vehicle
        setSubCategory((byte)26); // uid 25907, Generic Dump Truck, Transfer
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericDumpTruckTransfer createInstance()
    {
            return new GenericDumpTruckTransfer();
    }
}
