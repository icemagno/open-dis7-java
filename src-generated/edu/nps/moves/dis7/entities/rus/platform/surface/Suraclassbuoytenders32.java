// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Suraclassbuoytenders32</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Suraclassbuoytenders32.createInstance()</code> or <code>new Suraclassbuoytenders32()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Suraclassbuoytenders  = <code>73</code>; </li>
 *     <li> Specific: _32  = <code>9</code>; </li>
 *     <li> Entity type uid: 14281; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1640c151. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class Suraclassbuoytenders32 extends EntityType
{
    /** Default constructor */
    public Suraclassbuoytenders32()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)73); // uid 14272, Sura class (buoy tenders)
        setSpecific((byte)9); // uid 14281, 32
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Suraclassbuoytenders32 createInstance()
    {
            return new Suraclassbuoytenders32();
    }
}
