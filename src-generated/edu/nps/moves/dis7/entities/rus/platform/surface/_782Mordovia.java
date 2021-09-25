// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_782Mordovia</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_782Mordovia.createInstance()</code> or <code>new _782Mordovia()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Air cushion/Surface effect = <code>15</code>; </li>
 *     <li> SubCategory: ZubrClassPomornik  = <code>1</code>; </li>
 *     <li> Specific: _782Mordovia  = <code>2</code>; </li>
 *     <li> Entity type uid: 28799; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@68c87fc3. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AircushionSurfaceeffect
 * @see SubCategory

 */
public final class _782Mordovia extends EntityType
{
    /** Default constructor */
    public _782Mordovia()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)15); // uid 13796, Air cushion/Surface effect
        setSubCategory((byte)1); // uid 13797, Zubr Class (Pomornik)
        setSpecific((byte)2); // uid 28799, 782 Mordovia
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _782Mordovia createInstance()
    {
            return new _782Mordovia();
    }
}
