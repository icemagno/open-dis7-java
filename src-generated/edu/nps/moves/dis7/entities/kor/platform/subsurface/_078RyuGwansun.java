// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_078RyuGwansun</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_078RyuGwansun.createInstance()</code> or <code>new _078RyuGwansun()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSP (Attack Submarine - Diesel Air-Independent Propulsion) = <code>11</code>; </li>
 *     <li> SubCategory: SohnWonilClassType214  = <code>1</code>; </li>
 *     <li> Specific: _078RyuGwansun  = <code>6</code>; </li>
 *     <li> Entity type uid: 30428; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@a1217f9. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSPAttackSubmarineDieselAirIndependentPropulsion
 * @see SubCategory

 */
public final class _078RyuGwansun extends EntityType
{
    /** Default constructor */
    public _078RyuGwansun()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 30421, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
        setSubCategory((byte)1); // uid 30422, Sohn Won-il Class (Type 214)
        setSpecific((byte)6); // uid 30428, 078 Ryu Gwansun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _078RyuGwansun createInstance()
    {
            return new _078RyuGwansun();
    }
}
