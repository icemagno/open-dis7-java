// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fin.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_81Tornio</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_81Tornio.createInstance()</code> or <code>new _81Tornio()</code>. </p>
 * <ul>
 *     <li> Country: Finland (FIN) = <code>70</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Attack Craft = <code>64</code>; </li>
 *     <li> SubCategory: HaminaClassMissileBoat  = <code>1</code>; </li>
 *     <li> Specific: _81Tornio  = <code>2</code>; </li>
 *     <li> Entity type uid: 29712; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7530ad9c. </p>
 * @see Country#FINLAND_FIN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastAttackCraft
 * @see SubCategory

 */
public final class _81Tornio extends EntityType
{
    /** Default constructor */
    public _81Tornio()
    {
        setCountry(Country.FINLAND_FIN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29709, Fast Attack Craft
        setSubCategory((byte)1); // uid 29710, Hamina Class Missile Boat
        setSpecific((byte)2); // uid 29712, 81 Tornio
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _81Tornio createInstance()
    {
            return new _81Tornio();
    }
}
