// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_50mmFlare</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_50mmFlare.createInstance()</code> or <code>new _50mmFlare()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Flare = <code>2</code>; </li>
 *     <li> SubCategory: _50mmFlare  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22305; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6fd7aba8. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flare
 * @see SubCategory

 */
public final class _50mmFlare extends EntityType
{
    /** Default constructor */
    public _50mmFlare()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 22301, Flare
        setSubCategory((byte)2); // uid 22305, 50mm Flare
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _50mmFlare createInstance()
    {
            return new _50mmFlare();
    }
}
