// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_53ERM281U</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_53ERM281U.createInstance()</code> or <code>new _53ERM281U()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _57mm  = <code>7</code>; </li>
 *     <li> Specific: _53ERM281U  = <code>4</code>; </li>
 *     <li> Entity type uid: 31314; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@426c0486. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class _53ERM281U extends EntityType
{
    /** Default constructor */
    public _53ERM281U()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)2); // uid 20393, Ballistic
        setSubCategory((byte)7); // uid 20413, 57 mm
        setSpecific((byte)4); // uid 31314, 53-ERM-281U
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _53ERM281U createInstance()
    {
            return new _53ERM281U();
    }
}
