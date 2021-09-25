// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SAGEMSperwerLauncherStation</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SAGEMSperwerLauncherStation.createInstance()</code> or <code>new SAGEMSperwerLauncherStation()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Command, Control, Communications, and Intelligence (C3I) System = <code>29</code>; </li>
 *     <li> SubCategory: SAGEMSperwerUAVSystem  = <code>1</code>; </li>
 *     <li> Specific: SAGEMSperwerLauncherStation  = <code>2</code>; </li>
 *     <li> Entity type uid: 27999; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6f27a732. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CommandControlCommunicationsandIntelligenceC3ISystem
 * @see SubCategory

 */
public final class SAGEMSperwerLauncherStation extends EntityType
{
    /** Default constructor */
    public SAGEMSperwerLauncherStation()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)29); // uid 27996, Command, Control, Communications, and Intelligence (C3I) System
        setSubCategory((byte)1); // uid 27997, SAGEM Sperwer UAV System
        setSpecific((byte)2); // uid 27999, SAGEM Sperwer Launcher Station
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SAGEMSperwerLauncherStation createInstance()
    {
            return new SAGEMSperwerLauncherStation();
    }
}
