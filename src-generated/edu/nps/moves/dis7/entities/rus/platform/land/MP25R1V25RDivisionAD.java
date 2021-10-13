// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>MP25R1V25RDivisionAD</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>MP25R1V25RDivisionAD.createInstance()</code> or <code>new MP25R1V25RDivisionAD()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: MTLBuTrackedVehicle  = <code>18</code>; </li>
 *     <li> Specific: MP25R1V25RDivisionAD  = <code>6</code>; </li>
 *     <li> Entity type uid: 12723; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69ce2f62. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class MP25R1V25RDivisionAD extends EntityType
{
    /** Default constructor */
    public MP25R1V25RDivisionAD()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)18); // uid 12717, MT-LBu Tracked Vehicle
        setSpecific((byte)6); // uid 12723, MP25R (1V25R) Division AD
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static MP25R1V25RDivisionAD createInstance()
    {
            return new MP25R1V25RDivisionAD();
    }
}
