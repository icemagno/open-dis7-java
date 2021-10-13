// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.brn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_07Darulehsan</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_07Darulehsan.createInstance()</code> or <code>new _07Darulehsan()</code>. </p>
 * <ul>
 *     <li> Country: Brunei Darussalam (BRN) = <code>32</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: DarussalamClass  = <code>1</code>; </li>
 *     <li> Specific: _07Darulehsan  = <code>2</code>; </li>
 *     <li> Entity type uid: 28184; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1794d431. </p>
 * @see Country#BRUNEI_DARUSSALAM_BRN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class _07Darulehsan extends EntityType
{
    /** Default constructor */
    public _07Darulehsan()
    {
        setCountry(Country.BRUNEI_DARUSSALAM_BRN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 28181, Light/Patrol Craft
        setSubCategory((byte)1); // uid 28182, Darussalam Class
        setSpecific((byte)2); // uid 28184, 07 Darulehsan
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _07Darulehsan createInstance()
    {
            return new _07Darulehsan();
    }
}
