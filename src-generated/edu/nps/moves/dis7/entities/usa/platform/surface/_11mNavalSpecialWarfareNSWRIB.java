// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_11mNavalSpecialWarfareNSWRIB</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_11mNavalSpecialWarfareNSWRIB.createInstance()</code> or <code>new _11mNavalSpecialWarfareNSWRIB()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/patrol craft = <code>7</code>; </li>
 *     <li> SubCategory: RubberBoats  = <code>2</code>; </li>
 *     <li> Specific: _11mNavalSpecialWarfareNSWRIB  = <code>3</code>; </li>
 *     <li> Entity type uid: 28451; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@357bc488. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Lightpatrolcraft
 * @see SubCategory

 */
public final class _11mNavalSpecialWarfareNSWRIB extends EntityType
{
    /** Default constructor */
    public _11mNavalSpecialWarfareNSWRIB()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 11573, Light/patrol craft
        setSubCategory((byte)2); // uid 23434, Rubber Boats
        setSpecific((byte)3); // uid 28451, 11m Naval Special Warfare (NSW) RIB
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _11mNavalSpecialWarfareNSWRIB createInstance()
    {
            return new _11mNavalSpecialWarfareNSWRIB();
    }
}
