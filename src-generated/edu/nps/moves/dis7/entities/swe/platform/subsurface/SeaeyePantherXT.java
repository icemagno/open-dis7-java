// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SeaeyePantherXT</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SeaeyePantherXT.createInstance()</code> or <code>new SeaeyePantherXT()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned Underwater Vehicle (UUV) = <code>8</code>; </li>
 *     <li> SubCategory: SAABSeaeye  = <code>5</code>; </li>
 *     <li> Specific: SeaeyePantherXT  = <code>8</code>; </li>
 *     <li> Entity type uid: 29282; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1229a2b7. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UnmannedUnderwaterVehicleUUV
 * @see SubCategory

 */
public final class SeaeyePantherXT extends EntityType
{
    /** Default constructor */
    public SeaeyePantherXT()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)8); // uid 25264, Unmanned Underwater Vehicle (UUV)
        setSubCategory((byte)5); // uid 29274, SAAB Seaeye
        setSpecific((byte)8); // uid 29282, Seaeye Panther XT
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SeaeyePantherXT createInstance()
    {
            return new SeaeyePantherXT();
    }
}
