// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fin.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_05Uusimaa</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_05Uusimaa.createInstance()</code> or <code>new _05Uusimaa()</code>. </p>
 * <ul>
 *     <li> Country: Finland (FIN) = <code>70</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: HameenmaaClass  = <code>1</code>; </li>
 *     <li> Specific: _05Uusimaa  = <code>2</code>; </li>
 *     <li> Entity type uid: 23030; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@79d8407f. </p>
 * @see Country#FINLAND_FIN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _05Uusimaa extends EntityType
{
    /** Default constructor */
    public _05Uusimaa()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 23027, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 23028, Hameenmaa Class
        setSpecific((byte)2); // uid 23030, 05 Uusimaa
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _05Uusimaa createInstance()
    {
            return new _05Uusimaa();
    }
}
