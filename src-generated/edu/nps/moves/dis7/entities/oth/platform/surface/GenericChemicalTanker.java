// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>GenericChemicalTanker</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>GenericChemicalTanker.createInstance()</code> or <code>new GenericChemicalTanker()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tanker (Group 3 Merchant) = <code>82</code>; </li>
 *     <li> SubCategory: GenericChemicalTanker  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 24629; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2f19f2aa. </p>
 * @see Country#OTHER
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankerGroup3Merchant
 * @see SubCategory

 */
public final class GenericChemicalTanker extends EntityType
{
    /** Default constructor */
    public GenericChemicalTanker()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24627, Tanker (Group 3 Merchant)
        setSubCategory((byte)2); // uid 24629, Generic Chemical Tanker
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static GenericChemicalTanker createInstance()
    {
            return new GenericChemicalTanker();
    }
}
