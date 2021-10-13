// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AleksandrNikolay</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AleksandrNikolay.createInstance()</code> or <code>new AleksandrNikolay()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dock landing ship = <code>9</code>; </li>
 *     <li> SubCategory: IvanRogovClass  = <code>1</code>; </li>
 *     <li> Specific: AleksandrNikolay  = <code>2</code>; </li>
 *     <li> Entity type uid: 13756; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@314c8b4a. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Docklandingship
 * @see SubCategory

 */
public final class AleksandrNikolay extends EntityType
{
    /** Default constructor */
    public AleksandrNikolay()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 13753, Dock landing ship
        setSubCategory((byte)1); // uid 13754, Ivan Rogov Class
        setSpecific((byte)2); // uid 13756, Aleksandr Nikolay
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AleksandrNikolay createInstance()
    {
            return new AleksandrNikolay();
    }
}
