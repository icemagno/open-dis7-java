// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YuryLisyanskyexLedokol91965</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YuryLisyanskyexLedokol91965.createInstance()</code> or <code>new YuryLisyanskyexLedokol91965()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary, Merchant Marine = <code>17</code>; </li>
 *     <li> SubCategory: DobrynyaNikitichclassicebreakers  = <code>8</code>; </li>
 *     <li> Specific: YuryLisyanskyexLedokol91965  = <code>20</code>; </li>
 *     <li> Entity type uid: 14531; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9d3c67. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AuxiliaryMerchantMarine
 * @see SubCategory

 */
public final class YuryLisyanskyexLedokol91965 extends EntityType
{
    /** Default constructor */
    public YuryLisyanskyexLedokol91965()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 14477, Auxiliary, Merchant Marine
        setSubCategory((byte)8); // uid 14511, Dobrynya Nikitich class (ice breakers)
        setSpecific((byte)20); // uid 14531, Yury Lisyansky (ex-Ledokol 9) (1965)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YuryLisyanskyexLedokol91965 createInstance()
    {
            return new YuryLisyanskyexLedokol91965();
    }
}
