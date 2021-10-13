// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Neptunclasssalvagerescuemooring6</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Neptunclasssalvagerescuemooring6.createInstance()</code> or <code>new Neptunclasssalvagerescuemooring6()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Neptunclasssalvagerescuemooring  = <code>77</code>; </li>
 *     <li> Specific: _6  = <code>2</code>; </li>
 *     <li> Entity type uid: 14301; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63bde6c2. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class Neptunclasssalvagerescuemooring6 extends EntityType
{
    /** Default constructor */
    public Neptunclasssalvagerescuemooring6()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)77); // uid 14299, Neptun class (salvage, rescue & mooring)
        setSpecific((byte)2); // uid 14301, 6
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Neptunclasssalvagerescuemooring6 createInstance()
    {
            return new Neptunclasssalvagerescuemooring6();
    }
}
