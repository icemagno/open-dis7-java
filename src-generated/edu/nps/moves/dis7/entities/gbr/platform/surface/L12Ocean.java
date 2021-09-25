// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L12Ocean</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L12Ocean.createInstance()</code> or <code>new L12Ocean()</code>. </p>
 * <ul>
 *     <li> Country: United Kingdom of Great Britain and Northern Ireland (GBR) = <code>224</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Assault Ship = <code>54</code>; </li>
 *     <li> SubCategory: HelicopterCarrierLPH  = <code>2</code>; </li>
 *     <li> Specific: L12Ocean  = <code>1</code>; </li>
 *     <li> Entity type uid: 15575; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@71f1cc02. </p>
 * @see Country#UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousAssaultShip
 * @see SubCategory

 */
public final class L12Ocean extends EntityType
{
    /** Default constructor */
    public L12Ocean()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 15572, Amphibious Assault Ship
        setSubCategory((byte)2); // uid 15574, Helicopter Carrier (LPH)
        setSpecific((byte)1); // uid 15575, L12 Ocean
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L12Ocean createInstance()
    {
            return new L12Ocean();
    }
}
