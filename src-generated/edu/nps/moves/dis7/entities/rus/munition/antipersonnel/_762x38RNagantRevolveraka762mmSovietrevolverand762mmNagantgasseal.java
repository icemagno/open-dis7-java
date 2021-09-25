// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_762x38RNagantRevolveraka762mmSovietrevolverand762mmNagantgasseal</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_762x38RNagantRevolveraka762mmSovietrevolverand762mmNagantgasseal.createInstance()</code> or <code>new _762x38RNagantRevolveraka762mmSovietrevolverand762mmNagantgasseal()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_PERSONNEL</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _762mm  = <code>2</code>; </li>
 *     <li> Specific: _762x38RNagantRevolveraka762mmSovietrevolverand762mmNagantgasseal  = <code>2</code>; </li>
 *     <li> Entity type uid: 20643; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6b16de91. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _762x38RNagantRevolveraka762mmSovietrevolverand762mmNagantgasseal extends EntityType
{
    /** Default constructor */
    public _762x38RNagantRevolveraka762mmSovietrevolverand762mmNagantgasseal()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 20637, Ballistic
        setSubCategory((byte)2); // uid 20641, 7.62 mm
        setSpecific((byte)2); // uid 20643, 7.62 x 38R Nagant Revolver (aka 7.62-mm Soviet revolver and 7.62-mm Nagant gas-seal)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _762x38RNagantRevolveraka762mmSovietrevolverand762mmNagantgasseal createInstance()
    {
            return new _762x38RNagantRevolveraka762mmSovietrevolverand762mmNagantgasseal();
    }
}
