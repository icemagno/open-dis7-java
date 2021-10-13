// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_623Badik</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_623Badik.createInstance()</code> or <code>new _623Badik()</code>. </p>
 * <ul>
 *     <li> Country: Indonesia (IDN) = <code>100</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fast Attack Craft = <code>64</code>; </li>
 *     <li> SubCategory: MandauClassFastAttackCraftMissile  = <code>3</code>; </li>
 *     <li> Specific: _623Badik  = <code>3</code>; </li>
 *     <li> Entity type uid: 29813; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@604f2bd2. </p>
 * @see Country#INDONESIA_IDN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FastAttackCraft
 * @see SubCategory

 */
public final class _623Badik extends EntityType
{
    /** Default constructor */
    public _623Badik()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)64); // uid 29615, Fast Attack Craft
        setSubCategory((byte)3); // uid 29810, Mandau Class (Fast Attack Craft-Missile)
        setSpecific((byte)3); // uid 29813, 623 Badik
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _623Badik createInstance()
    {
            return new _623Badik();
    }
}
