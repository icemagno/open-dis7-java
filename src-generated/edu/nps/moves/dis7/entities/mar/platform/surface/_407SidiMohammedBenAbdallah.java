// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_407SidiMohammedBenAbdallah</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_407SidiMohammedBenAbdallah.createInstance()</code> or <code>new _407SidiMohammedBenAbdallah()</code>. </p>
 * <ul>
 *     <li> Country: Morocco (MAR) = <code>147</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank Landing Ship = <code>10</code>; </li>
 *     <li> SubCategory: NewportClass  = <code>1</code>; </li>
 *     <li> Specific: _407SidiMohammedBenAbdallah  = <code>1</code>; </li>
 *     <li> Entity type uid: 27720; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@466cf502. </p>
 * @see Country#MOROCCO_MAR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TankLandingShip
 * @see SubCategory

 */
public final class _407SidiMohammedBenAbdallah extends EntityType
{
    /** Default constructor */
    public _407SidiMohammedBenAbdallah()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 27718, Tank Landing Ship
        setSubCategory((byte)1); // uid 27719, Newport Class
        setSpecific((byte)1); // uid 27720, 407 Sidi Mohammed Ben Abdallah
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _407SidiMohammedBenAbdallah createInstance()
    {
            return new _407SidiMohammedBenAbdallah();
    }
}
