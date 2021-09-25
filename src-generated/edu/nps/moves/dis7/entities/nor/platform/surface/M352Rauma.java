// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M352Rauma</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M352Rauma.createInstance()</code> or <code>new M352Rauma()</code>. </p>
 * <ul>
 *     <li> Country: Norway (NOR) = <code>163</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: OksoeyAltaclass  = <code>2</code>; </li>
 *     <li> Specific: M352Rauma  = <code>6</code>; </li>
 *     <li> Entity type uid: 27616; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3dddbe65. </p>
 * @see Country#NORWAY_NOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M352Rauma extends EntityType
{
    /** Default constructor */
    public M352Rauma()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 18974, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 27610, Oksoey/Alta class
        setSpecific((byte)6); // uid 27616, M352 Rauma
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M352Rauma createInstance()
    {
            return new M352Rauma();
    }
}
