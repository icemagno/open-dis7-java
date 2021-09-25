// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DiksonexVostok3</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DiksonexVostok3.createInstance()</code> or <code>new DiksonexVostok3()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Vytegralesclasssupportdepot  = <code>13</code>; </li>
 *     <li> Specific: DiksonexVostok3  = <code>4</code>; </li>
 *     <li> Entity type uid: 13896; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@f4cfd90. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class DiksonexVostok3 extends EntityType
{
    /** Default constructor */
    public DiksonexVostok3()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)13); // uid 13892, Vytegrales class (support & depot)
        setSpecific((byte)4); // uid 13896, Dikson (ex-Vostok 3)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DiksonexVostok3 createInstance()
    {
            return new DiksonexVostok3();
    }
}
