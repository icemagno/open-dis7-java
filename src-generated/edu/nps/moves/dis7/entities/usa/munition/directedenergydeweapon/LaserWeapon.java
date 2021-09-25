// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.directedenergydeweapon;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LaserWeapon</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LaserWeapon.createInstance()</code> or <code>new LaserWeapon()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>DIRECTED_ENERGY_DE_WEAPON</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Point Effect DE Weapon = <code>1</code>; </li>
 *     <li> SubCategory: LaserWeapon  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 20296; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@20027c44. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see PointEffectDEWeapon
 * @see SubCategory

 */
public final class LaserWeapon extends EntityType
{
    /** Default constructor */
    public LaserWeapon()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.DIRECTED_ENERGY_DE_WEAPON));

        setCategory((byte)1); // uid 20295, Point Effect DE Weapon
        setSubCategory((byte)1); // uid 20296, Laser Weapon
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LaserWeapon createInstance()
    {
            return new LaserWeapon();
    }
}
