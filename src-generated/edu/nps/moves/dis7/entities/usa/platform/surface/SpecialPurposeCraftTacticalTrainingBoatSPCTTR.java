// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SpecialPurposeCraftTacticalTrainingBoatSPCTTR</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SpecialPurposeCraftTacticalTrainingBoatSPCTTR.createInstance()</code> or <code>new SpecialPurposeCraftTacticalTrainingBoatSPCTTR()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Coast Guard Boats = <code>63</code>; </li>
 *     <li> SubCategory: SpecialPurposeCraftTacticalTrainingBoatSPCTTR  = <code>16</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 26782; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@42297bdf. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CoastGuardBoats
 * @see SubCategory

 */
public final class SpecialPurposeCraftTacticalTrainingBoatSPCTTR extends EntityType
{
    /** Default constructor */
    public SpecialPurposeCraftTacticalTrainingBoatSPCTTR()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)63); // uid 12252, Coast Guard Boats
        setSubCategory((byte)16); // uid 26782, Special Purpose Craft Tactical Training Boat (SPC-TTR)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SpecialPurposeCraftTacticalTrainingBoatSPCTTR createInstance()
    {
            return new SpecialPurposeCraftTacticalTrainingBoatSPCTTR();
    }
}
