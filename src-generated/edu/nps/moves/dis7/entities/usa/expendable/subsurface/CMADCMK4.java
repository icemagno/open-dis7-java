// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.expendable.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CMADCMK4</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CMADCMK4.createInstance()</code> or <code>new CMADCMK4()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Expendable = <code>8</code>; </li>
 *     <li> Category: Active Emitter = <code>4</code>; </li>
 *     <li> SubCategory: CMADCMK4  = <code>5</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22277; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@106459d9. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#EXPENDABLE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ActiveEmitter
 * @see SubCategory

 */
public final class CMADCMK4 extends EntityType
{
    /** Default constructor */
    public CMADCMK4()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)4); // uid 22272, Active Emitter
        setSubCategory((byte)5); // uid 22277, CM ADC MK 4
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CMADCMK4 createInstance()
    {
            return new CMADCMK4();
    }
}
