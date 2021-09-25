// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.swe.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CV9035MKIIIPRI</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CV9035MKIIIPRI.createInstance()</code> or <code>new CV9035MKIIIPRI()</code>. </p>
 * <ul>
 *     <li> Country: Sweden (SWE) = <code>205</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: CombatVehicle90CV90  = <code>1</code>; </li>
 *     <li> Specific: CV9035MKIIIPRI  = <code>1</code>; </li>
 *     <li> Entity type uid: 27967; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@21c815e4. </p>
 * @see Country#SWEDEN_SWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class CV9035MKIIIPRI extends EntityType
{
    /** Default constructor */
    public CV9035MKIIIPRI()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 17470, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 17471, Combat Vehicle 90 (CV90)
        setSpecific((byte)1); // uid 27967, CV9035 MK III PRI
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CV9035MKIIIPRI createInstance()
    {
            return new CV9035MKIIIPRI();
    }
}
