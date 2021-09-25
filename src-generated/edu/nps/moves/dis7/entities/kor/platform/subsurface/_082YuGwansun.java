// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_082YuGwansun</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_082YuGwansun.createInstance()</code> or <code>new _082YuGwansun()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSP (Attack Submarine - Diesel Air-Independent Propulsion) = <code>11</code>; </li>
 *     <li> SubCategory: SohnWonilClassType214  = <code>1</code>; </li>
 *     <li> Specific: _082YuGwansun  = <code>9</code>; </li>
 *     <li> Entity type uid: 30431; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2baa8d82. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSPAttackSubmarineDieselAirIndependentPropulsion
 * @see SubCategory

 */
public final class _082YuGwansun extends EntityType
{
    /** Default constructor */
    public _082YuGwansun()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 30421, SSP (Attack Submarine - Diesel Air-Independent Propulsion)
        setSubCategory((byte)1); // uid 30422, Sohn Won-il Class (Type 214)
        setSpecific((byte)9); // uid 30431, 082 Yu Gwan-sun
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _082YuGwansun createInstance()
    {
            return new _082YuGwansun();
    }
}
