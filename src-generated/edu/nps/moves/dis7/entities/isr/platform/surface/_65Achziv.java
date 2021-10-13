// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.isr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_65Achziv</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_65Achziv.createInstance()</code> or <code>new _65Achziv()</code>. </p>
 * <ul>
 *     <li> Country: Israel (ISR) = <code>105</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Landing Craft = <code>11</code>; </li>
 *     <li> SubCategory: AshdodClassLCT  = <code>1</code>; </li>
 *     <li> Specific: _65Achziv  = <code>3</code>; </li>
 *     <li> Entity type uid: 18247; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4e70a728. </p>
 * @see Country#ISRAEL_ISR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LandingCraft
 * @see SubCategory

 */
public final class _65Achziv extends EntityType
{
    /** Default constructor */
    public _65Achziv()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 18243, Landing Craft
        setSubCategory((byte)1); // uid 18244, Ashdod Class (LCT)
        setSpecific((byte)3); // uid 18247, 65 Achziv
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _65Achziv createInstance()
    {
            return new _65Achziv();
    }
}
