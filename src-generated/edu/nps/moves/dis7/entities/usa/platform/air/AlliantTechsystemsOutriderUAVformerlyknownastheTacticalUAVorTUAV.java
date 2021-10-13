// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV.createInstance()</code> or <code>new AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Unmanned = <code>50</code>; </li>
 *     <li> SubCategory: AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV  = <code>7</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 11244; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6ac4c3f7. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Unmanned
 * @see SubCategory

 */
public final class AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV extends EntityType
{
    /** Default constructor */
    public AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 11232, Unmanned
        setSubCategory((byte)7); // uid 11244, Alliant Techsystems Outrider UAV (formerly known as the Tactical UAV or TUAV)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV createInstance()
    {
            return new AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV();
    }
}
