// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_762mmAWSR98</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_762mmAWSR98.createInstance()</code> or <code>new _762mmAWSR98()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: U.S. Army (USA) = <code>11</code>; </li>
 *     <li> SubCategory: SniperRifles  = <code>15</code>; </li>
 *     <li> Specific: _762mmAWSR98  = <code>43</code>; </li>
 *     <li> Entity type uid: 32680; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@53f495f0. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see USArmyUSA
 * @see SubCategory

 */
public final class _762mmAWSR98 extends EntityType
{
    /** Default constructor */
    public _762mmAWSR98()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32666, U.S. Army (USA)
        setSubCategory((byte)15); // uid 32677, Sniper Rifles
        setSpecific((byte)43); // uid 32680, 7.62mm AW SR-98
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _762mmAWSR98 createInstance()
    {
            return new _762mmAWSR98();
    }
}
