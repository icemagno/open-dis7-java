// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DDG41BrisbaneAustralia</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DDG41BrisbaneAustralia.createInstance()</code> or <code>new DDG41BrisbaneAustralia()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: ModifiedCharlesFAdamsClass  = <code>5</code>; </li>
 *     <li> Specific: DDG41BrisbaneAustralia  = <code>3</code>; </li>
 *     <li> Entity type uid: 11442; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@193bb809. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyer
 * @see SubCategory

 */
public final class DDG41BrisbaneAustralia extends EntityType
{
    /** Default constructor */
    public DDG41BrisbaneAustralia()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 11372, Guided Missile Destroyer
        setSubCategory((byte)5); // uid 11439, Modified Charles F. Adams Class
        setSpecific((byte)3); // uid 11442, DDG 41 Brisbane (Australia)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DDG41BrisbaneAustralia createInstance()
    {
            return new DDG41BrisbaneAustralia();
    }
}
