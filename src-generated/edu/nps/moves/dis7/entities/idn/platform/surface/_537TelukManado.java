// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_537TelukManado</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_537TelukManado.createInstance()</code> or <code>new _537TelukManado()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank Landing Ship = <code>10</code>; </li>
 *     <li> SubCategory: TelukGilimanukClassFroschIConfiguration  = <code>1</code>; </li>
 *     <li> Specific: _537TelukManado  = <code>6</code>; </li>
 *     <li> Entity type uid: 31097; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63f8276e. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankLandingShip
 * @see SubCategory

 */
public final class _537TelukManado extends EntityType
{
    /** Default constructor */
    public _537TelukManado()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 31090, Tank Landing Ship
        setSubCategory((byte)1); // uid 31091, Teluk Gilimanuk Class (Frosch I Configuration)
        setSpecific((byte)6); // uid 31097, 537 Teluk Manado
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _537TelukManado createInstance()
    {
            return new _537TelukManado();
    }
}
