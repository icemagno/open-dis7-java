// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BLU108BSensorFuzedWeaponSFWSubmunition</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BLU108BSensorFuzedWeaponSFWSubmunition.createInstance()</code> or <code>new BLU108BSensorFuzedWeaponSFWSubmunition()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: BLU108BSensorFuzedWeaponSFWSubmunition  = <code>28</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25385; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@58186f9f. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class BLU108BSensorFuzedWeaponSFWSubmunition extends EntityType
{
    /** Default constructor */
    public BLU108BSensorFuzedWeaponSFWSubmunition()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 19887, Guided
        setSubCategory((byte)28); // uid 25385, BLU-108/B Sensor Fuzed Weapon (SFW) Submunition
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BLU108BSensorFuzedWeaponSFWSubmunition createInstance()
    {
            return new BLU108BSensorFuzedWeaponSFWSubmunition();
    }
}
