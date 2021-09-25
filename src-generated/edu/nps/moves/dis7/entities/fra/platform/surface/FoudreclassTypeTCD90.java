// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FoudreclassTypeTCD90</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FoudreclassTypeTCD90.createInstance()</code> or <code>new FoudreclassTypeTCD90()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dock Landing Ship = <code>9</code>; </li>
 *     <li> SubCategory: FoudreclassTypeTCD90  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 16012; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@793f29ff. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DockLandingShip
 * @see SubCategory

 */
public final class FoudreclassTypeTCD90 extends EntityType
{
    /** Default constructor */
    public FoudreclassTypeTCD90()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 16011, Dock Landing Ship
        setSubCategory((byte)1); // uid 16012, Foudre class (Type TCD 90)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FoudreclassTypeTCD90 createInstance()
    {
            return new FoudreclassTypeTCD90();
    }
}
