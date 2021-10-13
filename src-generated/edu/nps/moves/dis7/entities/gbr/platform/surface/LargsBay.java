// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LargsBay</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LargsBay.createInstance()</code> or <code>new LargsBay()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Dock Landing Ship = <code>9</code>; </li>
 *     <li> SubCategory: BayClass  = <code>1</code>; </li>
 *     <li> Specific: LargsBay  = <code>1</code>; </li>
 *     <li> Entity type uid: 15357; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7343922c. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DockLandingShip
 * @see SubCategory

 */
public final class LargsBay extends EntityType
{
    /** Default constructor */
    public LargsBay()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 15355, Dock Landing Ship
        setSubCategory((byte)1); // uid 15356, Bay Class
        setSpecific((byte)1); // uid 15357, Largs Bay
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LargsBay createInstance()
    {
            return new LargsBay();
    }
}
