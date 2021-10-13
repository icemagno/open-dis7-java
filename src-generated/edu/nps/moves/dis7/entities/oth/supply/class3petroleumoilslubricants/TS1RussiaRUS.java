// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class3petroleumoilslubricants;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TS1RussiaRUS</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TS1RussiaRUS.createInstance()</code> or <code>new TS1RussiaRUS()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_3_PETROLEUM_OILS_LUBRICANTS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: A - POL for Air Vehicles = <code>2</code>; </li>
 *     <li> SubCategory: TS1RussiaRUS  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30679; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@79ba0285. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see APOLforAirVehicles
 * @see SubCategory

 */
public final class TS1RussiaRUS extends EntityType
{
    /** Default constructor */
    public TS1RussiaRUS()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_3_PETROLEUM_OILS_LUBRICANTS));

        setCategory((byte)2); // uid 30674, A - POL for Air Vehicles
        setSubCategory((byte)5); // uid 30679, TS-1 (Russia (RUS))
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TS1RussiaRUS createInstance()
    {
            return new TS1RussiaRUS();
    }
}
