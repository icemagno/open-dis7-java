// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ltu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GulfstreamAerospaceGulfstreamIV</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GulfstreamAerospaceGulfstreamIV.createInstance()</code> or <code>new GulfstreamAerospaceGulfstreamIV()</code>. </p>
 * <ul>
 *     <li> Country: Lithuania (LTU) = <code>255</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo/Tanker = <code>4</code>; </li>
 *     <li> SubCategory: GulfstreamAerospaceGulfstreamIV  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 25618; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4efcf8a. </p>
 * @see Country#LITHUANIA_LTU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTanker
 * @see SubCategory

 */
public final class GulfstreamAerospaceGulfstreamIV extends EntityType
{
    /** Default constructor */
    public GulfstreamAerospaceGulfstreamIV()
    {
        setCountry(Country.LITHUANIA_LTU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)4); // uid 25617, Cargo/Tanker
        setSubCategory((byte)1); // uid 25618, Gulfstream Aerospace Gulfstream IV
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GulfstreamAerospaceGulfstreamIV createInstance()
    {
            return new GulfstreamAerospaceGulfstreamIV();
    }
}
