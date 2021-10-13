// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.tun.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_602Ajdir</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_602Ajdir.createInstance()</code> or <code>new _602Ajdir()</code>. </p>
 * <ul>
 *     <li> Country: Tunisia (TUN) = <code>217</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: KondorIClass  = <code>1</code>; </li>
 *     <li> Specific: _602Ajdir  = <code>2</code>; </li>
 *     <li> Entity type uid: 27579; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b97c4ad. </p>
 * @see Country#TUNISIA_TUN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class _602Ajdir extends EntityType
{
    /** Default constructor */
    public _602Ajdir()
    {
        setCountry(Country.TUNISIA_TUN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27576, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 27577, Kondor I Class
        setSpecific((byte)2); // uid 27579, 602 Ajdir
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _602Ajdir createInstance()
    {
            return new _602Ajdir();
    }
}
