// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>JHSV3Millinocket</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>JHSV3Millinocket.createInstance()</code> or <code>new JHSV3Millinocket()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: SpearheadClassJointHighSpeedVessel  = <code>26</code>; </li>
 *     <li> Specific: JHSV3Millinocket  = <code>3</code>; </li>
 *     <li> Entity type uid: 28855; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@335f5c69. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class JHSV3Millinocket extends EntityType
{
    /** Default constructor */
    public JHSV3Millinocket()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 11701, Auxiliary
        setSubCategory((byte)26); // uid 28852, Spearhead Class (Joint High Speed Vessel)
        setSpecific((byte)3); // uid 28855, JHSV-3 Millinocket
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static JHSV3Millinocket createInstance()
    {
            return new JHSV3Millinocket();
    }
}
