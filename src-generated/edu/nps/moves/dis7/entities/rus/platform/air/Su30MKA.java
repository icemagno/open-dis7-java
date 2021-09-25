// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Su30MKA</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Su30MKA.createInstance()</code> or <code>new Su30MKA()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: Su30FlankerC  = <code>19</code>; </li>
 *     <li> Specific: Su30MKA  = <code>6</code>; </li>
 *     <li> Entity type uid: 25405; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15fa55a6. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class Su30MKA extends EntityType
{
    /** Default constructor */
    public Su30MKA()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 13174, Fighter/Air Defense
        setSubCategory((byte)19); // uid 25399, Su-30 Flanker C
        setSpecific((byte)6); // uid 25405, Su-30MKA
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Su30MKA createInstance()
    {
            return new Su30MKA();
    }
}
