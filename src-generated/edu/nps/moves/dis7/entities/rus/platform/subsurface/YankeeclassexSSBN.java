// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YankeeclassexSSBN</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YankeeclassexSSBN.createInstance()</code> or <code>new YankeeclassexSSBN()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSAN (Nuclear Auxiliary) = <code>6</code>; </li>
 *     <li> SubCategory: YankeeclassexSSBN  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 14809; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@790a251b. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSANNuclearAuxiliary
 * @see SubCategory

 */
public final class YankeeclassexSSBN extends EntityType
{
    /** Default constructor */
    public YankeeclassexSSBN()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)6); // uid 14808, SSAN (Nuclear Auxiliary)
        setSubCategory((byte)1); // uid 14809, Yankee class (ex-SSBN)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YankeeclassexSSBN createInstance()
    {
            return new YankeeclassexSSBN();
    }
}
