// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TacticalWaterPurificationSystem1500Galh5700Lh</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TacticalWaterPurificationSystem1500Galh5700Lh.createInstance()</code> or <code>new TacticalWaterPurificationSystem1500Galh5700Lh()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Engineer Equipment = <code>18</code>; </li>
 *     <li> SubCategory: ROWPUReverseOsmosisWaterPurificationUnit  = <code>18</code>; </li>
 *     <li> Specific: TacticalWaterPurificationSystem1500Galh5700Lh  = <code>2</code>; </li>
 *     <li> Entity type uid: 27685; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3f96f020. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see EngineerEquipment
 * @see SubCategory

 */
public final class TacticalWaterPurificationSystem1500Galh5700Lh extends EntityType
{
    /** Default constructor */
    public TacticalWaterPurificationSystem1500Galh5700Lh()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)18); // uid 27262, ROWPU - Reverse Osmosis Water Purification Unit
        setSpecific((byte)2); // uid 27685, Tactical Water Purification System (1500 Gal/h / 5700 L/h)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TacticalWaterPurificationSystem1500Galh5700Lh createInstance()
    {
            return new TacticalWaterPurificationSystem1500Galh5700Lh();
    }
}
