// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>IvanKruzenshtern</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>IvanKruzenshtern.createInstance()</code> or <code>new IvanKruzenshtern()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: AkademikKrylovclassnavalresearch  = <code>24</code>; </li>
 *     <li> Specific: IvanKruzenshtern  = <code>2</code>; </li>
 *     <li> Entity type uid: 13971; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34cf294c. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class IvanKruzenshtern extends EntityType
{
    /** Default constructor */
    public IvanKruzenshtern()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 13805, Auxiliary
        setSubCategory((byte)24); // uid 13969, Akademik Krylov class (naval research)
        setSpecific((byte)2); // uid 13971, Ivan Kruzenshtern
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static IvanKruzenshtern createInstance()
    {
            return new IvanKruzenshtern();
    }
}
