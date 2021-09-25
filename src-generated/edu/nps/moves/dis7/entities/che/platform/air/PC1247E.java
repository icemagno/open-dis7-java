// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.che.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PC1247E</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PC1247E.createInstance()</code> or <code>new PC1247E()</code>. </p>
 * <ul>
 *     <li> Country: Switzerland (CHE) = <code>206</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg) = <code>85</code>; </li>
 *     <li> SubCategory: SingleEngineTurboprop  = <code>21</code>; </li>
 *     <li> Specific: PilatusPC12  = <code>1</code>; </li>
 *     <li> Entity type uid: 29222; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@3e33d73e. </p>
 * @see Country#SWITZERLAND_CHE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftSmallupto12500lbs5670kg
 * @see SubCategory

 */
public final class PC1247E extends EntityType
{
    /** Default constructor */
    public PC1247E()
    {
        setCountry(Country.SWITZERLAND_CHE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)85); // uid 29209, Civilian Fixed Wing Aircraft, Small (up to 12,500 lbs / 5,670 kg)
        setSubCategory((byte)21); // uid 29217, Single Engine Turboprop
        setSpecific((byte)1); // uid 29218, Pilatus PC-12
        setExtra((byte)4); // uid 29222, PC-12/47E
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PC1247E createInstance()
    {
            return new PC1247E();
    }
}
