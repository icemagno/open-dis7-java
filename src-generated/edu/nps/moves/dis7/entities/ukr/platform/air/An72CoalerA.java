// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ukr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>An72CoalerA</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>An72CoalerA.createInstance()</code> or <code>new An72CoalerA()</code>. </p>
 * <ul>
 *     <li> Country: Ukraine (UKR) = <code>265</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg) = <code>87</code>; </li>
 *     <li> SubCategory: TwinJet  = <code>32</code>; </li>
 *     <li> Specific: AntonovAn72  = <code>2</code>; </li>
 *     <li> Entity type uid: 29256; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@439b15f2. </p>
 * @see Country#UKRAINE_UKR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftLargeupto255000lbs115666kg
 * @see SubCategory

 */
public final class An72CoalerA extends EntityType
{
    /** Default constructor */
    public An72CoalerA()
    {
        setCountry(Country.UKRAINE_UKR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 29244, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 29250, Twin Jet
        setSpecific((byte)2); // uid 29255, Antonov An-72
        setExtra((byte)1); // uid 29256, An-72 Coaler-A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static An72CoalerA createInstance()
    {
            return new An72CoalerA();
    }
}
