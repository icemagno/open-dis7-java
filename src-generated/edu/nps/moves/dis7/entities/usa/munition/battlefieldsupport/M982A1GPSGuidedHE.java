// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M982A1GPSGuidedHE</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M982A1GPSGuidedHE.createInstance()</code> or <code>new M982A1GPSGuidedHE()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _155mm  = <code>14</code>; </li>
 *     <li> Specific: M982A1GPSGuidedHE  = <code>30</code>; </li>
 *     <li> Entity type uid: 32087; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@32e697ac. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class M982A1GPSGuidedHE extends EntityType
{
    /** Default constructor */
    public M982A1GPSGuidedHE()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 19971, Ballistic
        setSubCategory((byte)14); // uid 20081, 155 mm
        setSpecific((byte)30); // uid 32087, M982A1 GPS Guided HE
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M982A1GPSGuidedHE createInstance()
    {
            return new M982A1GPSGuidedHE();
    }
}
