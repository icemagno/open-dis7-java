// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>L34VascoDaGama</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>L34VascoDaGama.createInstance()</code> or <code>new L34VascoDaGama()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Amphibious Assault Ship = <code>54</code>; </li>
 *     <li> SubCategory: Mk3LandingCraftLCULSM  = <code>2</code>; </li>
 *     <li> Specific: L34VascoDaGama  = <code>1</code>; </li>
 *     <li> Entity type uid: 18866; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34a875b3. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AmphibiousAssaultShip
 * @see SubCategory

 */
public final class L34VascoDaGama extends EntityType
{
    /** Default constructor */
    public L34VascoDaGama()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)54); // uid 18862, Amphibious Assault Ship
        setSubCategory((byte)2); // uid 18865, Mk 3 Landing Craft (LCU/LSM)
        setSpecific((byte)1); // uid 18866, L34 Vasco Da Gama
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static L34VascoDaGama createInstance()
    {
            return new L34VascoDaGama();
    }
}
