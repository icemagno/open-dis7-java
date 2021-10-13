// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TUGSElectroOpticInfraredNode</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TUGSElectroOpticInfraredNode.createInstance()</code> or <code>new TUGSElectroOpticInfraredNode()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Warning System = <code>23</code>; </li>
 *     <li> SubCategory: TacticalUnattendedGroundSensorTUGS  = <code>5</code>; </li>
 *     <li> Specific: TUGSElectroOpticInfraredNode  = <code>1</code>; </li>
 *     <li> Entity type uid: 22883; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@cedee22. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see WarningSystem
 * @see SubCategory

 */
public final class TUGSElectroOpticInfraredNode extends EntityType
{
    /** Default constructor */
    public TUGSElectroOpticInfraredNode()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)23); // uid 10653, Warning System
        setSubCategory((byte)5); // uid 10658, Tactical Unattended Ground Sensor (T-UGS)
        setSpecific((byte)1); // uid 22883, T-UGS Electro-Optic/Infrared Node
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TUGSElectroOpticInfraredNode createInstance()
    {
            return new TUGSElectroOpticInfraredNode();
    }
}
