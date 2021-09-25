// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class9repairpartsandcomponents;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ExtinguisherAgentWater</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ExtinguisherAgentWater.createInstance()</code> or <code>new ExtinguisherAgentWater()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_9_REPAIR_PARTS_AND_COMPONENTS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Other = <code>1</code>; </li>
 *     <li> SubCategory: ExtinguisherAgent  = <code>2</code>; </li>
 *     <li> Specific: ExtinguisherAgentWater  = <code>1</code>; </li>
 *     <li> Entity type uid: 30617; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@14dbfdb1. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see Other
 * @see SubCategory

 */
public final class ExtinguisherAgentWater extends EntityType
{
    /** Default constructor */
    public ExtinguisherAgentWater()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_9_REPAIR_PARTS_AND_COMPONENTS));

        setCategory((byte)1); // uid 30615, Other
        setSubCategory((byte)2); // uid 30616, Extinguisher Agent
        setSpecific((byte)1); // uid 30617, Extinguisher Agent - Water
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ExtinguisherAgentWater createInstance()
    {
            return new ExtinguisherAgentWater();
    }
}
