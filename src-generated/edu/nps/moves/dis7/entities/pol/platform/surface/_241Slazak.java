// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_241Slazak</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_241Slazak.createInstance()</code> or <code>new _241Slazak()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: SlazakClassMekoA100  = <code>4</code>; </li>
 *     <li> Specific: _241Slazak  = <code>1</code>; </li>
 *     <li> Entity type uid: 32572; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5652f555. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class _241Slazak extends EntityType
{
    /** Default constructor */
    public _241Slazak()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 23045, Frigate (including Corvette)
        setSubCategory((byte)4); // uid 32571, Slazak Class (Meko A-100)
        setSpecific((byte)1); // uid 32572, 241 Slazak
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _241Slazak createInstance()
    {
            return new _241Slazak();
    }
}
