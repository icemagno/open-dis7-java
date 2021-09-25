// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ser.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SilbaClassLCT</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SilbaClassLCT.createInstance()</code> or <code>new SilbaClassLCT()</code>. </p>
 * <ul>
 *     <li> Country: Serbia and Montenegro = <code>240</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: SilbaClassLCT  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 19082; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@73d3e555. </p>
 * @see Country#SERBIA_AND_MONTENEGRO
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class SilbaClassLCT extends EntityType
{
    /** Default constructor */
    public SilbaClassLCT()
    {
        setCountry(Country.SERBIA_AND_MONTENEGRO);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 19081, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 19082, Silba Class (LCT)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SilbaClassLCT createInstance()
    {
            return new SilbaClassLCT();
    }
}
