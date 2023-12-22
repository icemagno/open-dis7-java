/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SemitrailerFuelService7500gallonsM1062</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SemitrailerFuelService7500gallonsM1062.createInstance()</code> or <code>new SemitrailerFuelService7500gallonsM1062()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fuel trailer = <code>15</code>; </li>
 *     <li> SubCategory: greaterthan5000gallons  = <code>3</code>; </li>
 *     <li> Specific: SemitrailerFuelService7500gallonsM1062  = <code>1</code>; </li>
 *     <li> Entity type uid: 33470; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@38e83838. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Fueltrailer
 * @see SubCategory

 */
public final class SemitrailerFuelService7500gallonsM1062 extends EntityType
{
    /** Default constructor */
    public SemitrailerFuelService7500gallonsM1062()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)15); // uid 10625, Fuel trailer
        setSubCategory((byte)3); // uid 10629, greater than 5000 gallons
        setSpecific((byte)1); // uid 33470, Semi-trailer, Fuel Service, 7500 gallons, M1062
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SemitrailerFuelService7500gallonsM1062 createInstance()
    {
            return new SemitrailerFuelService7500gallonsM1062();
    }
}
