// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class9repairpartsandcomponents;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MinePlow</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MinePlow.createInstance()</code> or <code>new MinePlow()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_9_REPAIR_PARTS_AND_COMPONENTS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: K - Tactical Vehicles = <code>6</code>; </li>
 *     <li> SubCategory: MinePlow  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30804; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@709d6de5. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see KTacticalVehicles
 * @see SubCategory

 */
public final class MinePlow extends EntityType
{
    /** Default constructor */
    public MinePlow()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_9_REPAIR_PARTS_AND_COMPONENTS));

        setCategory((byte)6); // uid 30803, K - Tactical Vehicles
        setSubCategory((byte)1); // uid 30804, Mine Plow
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MinePlow createInstance()
    {
            return new MinePlow();
    }
}
