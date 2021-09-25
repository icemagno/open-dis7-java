// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891.createInstance()</code> or <code>new _762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_PERSONNEL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _762mm  = <code>2</code>; </li>
 *     <li> Specific: _762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891  = <code>4</code>; </li>
 *     <li> Entity type uid: 20645; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@197ce367. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891 extends EntityType
{
    /** Default constructor */
    public _762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 20637, Ballistic
        setSubCategory((byte)2); // uid 20641, 7.62 mm
        setSpecific((byte)4); // uid 20645, 7.62-mm Mosin-Nagant (aka 7.62 x 54R, 7.62-mm Soviet Rimmed, and 7.62-mm obr 1891)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891 createInstance()
    {
            return new _762mmMosinNagantaka762x54R762mmSovietRimmedand762mmobr1891();
    }
}
