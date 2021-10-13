// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.plw.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PresidentHIRemeliik</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PresidentHIRemeliik.createInstance()</code> or <code>new PresidentHIRemeliik()</code>. </p>
 * <ul>
 *     <li> Country: Palau (PLW) = <code>216</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: PacificClassPatrolBoat  = <code>1</code>; </li>
 *     <li> Specific: PresidentHIRemeliik  = <code>1</code>; </li>
 *     <li> Entity type uid: 26729; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4e6d7365. </p>
 * @see Country#PALAU_PLW
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class PresidentHIRemeliik extends EntityType
{
    /** Default constructor */
    public PresidentHIRemeliik()
    {
        setCountry(Country.PALAU_PLW);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 26727, Light/Patrol Craft
        setSubCategory((byte)1); // uid 26728, Pacific Class Patrol Boat
        setSpecific((byte)1); // uid 26729, President H.I. Remeliik
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PresidentHIRemeliik createInstance()
    {
            return new PresidentHIRemeliik();
    }
}
