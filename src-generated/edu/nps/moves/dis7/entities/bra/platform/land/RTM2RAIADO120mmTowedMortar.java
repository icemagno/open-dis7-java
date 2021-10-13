// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RTM2RAIADO120mmTowedMortar</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RTM2RAIADO120mmTowedMortar.createInstance()</code> or <code>new RTM2RAIADO120mmTowedMortar()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mortar = <code>10</code>; </li>
 *     <li> SubCategory: RTM2RAIADO120mmTowedMortar  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32051; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@56f4468b. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Mortar
 * @see SubCategory

 */
public final class RTM2RAIADO120mmTowedMortar extends EntityType
{
    /** Default constructor */
    public RTM2RAIADO120mmTowedMortar()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)10); // uid 32048, Mortar
        setSubCategory((byte)3); // uid 32051, RT-M2 RAIADO 120mm Towed Mortar
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RTM2RAIADO120mmTowedMortar createInstance()
    {
            return new RTM2RAIADO120mmTowedMortar();
    }
}
