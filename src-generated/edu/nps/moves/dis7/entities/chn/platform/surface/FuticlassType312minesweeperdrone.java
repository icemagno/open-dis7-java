// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FuticlassType312minesweeperdrone</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FuticlassType312minesweeperdrone.createInstance()</code> or <code>new FuticlassType312minesweeperdrone()</code>. </p>
 * <ul>
 *     <li> Country: China, Peoples Republic of (CHN) = <code>45</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: FuticlassType312minesweeperdrone  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 17186; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1460a8c0. </p>
 * @see Country#CHINA_PEOPLES_REPUBLIC_OF_CHN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class FuticlassType312minesweeperdrone extends EntityType
{
    /** Default constructor */
    public FuticlassType312minesweeperdrone()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 17178, Mine Countermeasure Ship/Craft
        setSubCategory((byte)5); // uid 17186, Futi class Type 312 (minesweeper-drone)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FuticlassType312minesweeperdrone createInstance()
    {
            return new FuticlassType312minesweeperdrone();
    }
}
