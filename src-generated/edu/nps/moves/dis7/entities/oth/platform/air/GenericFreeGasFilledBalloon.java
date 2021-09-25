// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericFreeGasFilledBalloon</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericFreeGasFilledBalloon.createInstance()</code> or <code>new GenericFreeGasFilledBalloon()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Lighter than Air, Balloon = <code>100</code>; </li>
 *     <li> SubCategory: GenericFreeGasFilledBalloon  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24735; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@37ff4054. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianLighterthanAirBalloon
 * @see SubCategory

 */
public final class GenericFreeGasFilledBalloon extends EntityType
{
    /** Default constructor */
    public GenericFreeGasFilledBalloon()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)100); // uid 24734, Civilian Lighter than Air, Balloon
        setSubCategory((byte)1); // uid 24735, Generic Free Gas-Filled Balloon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericFreeGasFilledBalloon createInstance()
    {
            return new GenericFreeGasFilledBalloon();
    }
}
