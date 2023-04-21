/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class12slingloadsnondoctrinal;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SlingLoadHMMWVM998SingleHook</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SlingLoadHMMWVM998SingleHook.createInstance()</code> or <code>new SlingLoadHMMWVM998SingleHook()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_12_SLING_LOADS_NON_DOCTRINAL</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Sling Load, Vehicles = <code>5</code>; </li>
 *     <li> SubCategory: SlingLoadHighMobilityMultipurposeWheeledVehicleHMMWV  = <code>1</code>; </li>
 *     <li> Specific: SlingLoadHMMWVM998SingleHook  = <code>1</code>; </li>
 *     <li> Entity type uid: 30831; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2c154508. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SlingLoadVehicles
 * @see SubCategory

 */
public final class SlingLoadHMMWVM998SingleHook extends EntityType
{
    /** Default constructor */
    public SlingLoadHMMWVM998SingleHook()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_12_SLING_LOADS_NON_DOCTRINAL));

        setCategory((byte)5); // uid 30829, Sling Load, Vehicles
        setSubCategory((byte)1); // uid 30830, Sling Load, High Mobility Multipurpose Wheeled Vehicle (HMMWV)
        setSpecific((byte)1); // uid 30831, Sling Load, HMMWV, M998, Single Hook
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SlingLoadHMMWVM998SingleHook createInstance()
    {
            return new SlingLoadHMMWVM998SingleHook();
    }
}
