// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RR179AL</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RR179AL.createInstance()</code> or <code>new RR179AL()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Chaff = <code>1</code>; </li>
 *     <li> SubCategory: Bundle  = <code>1</code>; </li>
 *     <li> Specific: RR179Chaff  = <code>14</code>; </li>
 *     <li> Entity type uid: 28988; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@7cdc4070. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Chaff
 * @see SubCategory

 */
public final class RR179AL extends EntityType
{
    /** Default constructor */
    public RR179AL()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 22220, Chaff
        setSubCategory((byte)1); // uid 22221, Bundle
        setSpecific((byte)14); // uid 28987, RR-179 Chaff
        setExtra((byte)1); // uid 28988, RR-179/AL
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RR179AL createInstance()
    {
            return new RR179AL();
    }
}
