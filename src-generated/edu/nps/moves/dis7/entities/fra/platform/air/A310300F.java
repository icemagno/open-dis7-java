// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A310300F</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A310300F.createInstance()</code> or <code>new A310300F()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Fixed Wing Aircraft, Heavy (above 255,000 lbs / 115,666 kg) = <code>88</code>; </li>
 *     <li> SubCategory: TwinJet  = <code>32</code>; </li>
 *     <li> Specific: AirbusA310  = <code>2</code>; </li>
 *     <li> Entity type uid: 26237; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@51e69659. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianFixedWingAircraftHeavyabove255000lbs115666kg
 * @see SubCategory

 */
public final class A310300F extends EntityType
{
    /** Default constructor */
    public A310300F()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)88); // uid 23844, Civilian Fixed Wing Aircraft, Heavy (above 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23845, Twin Jet
        setSpecific((byte)2); // uid 23847, Airbus A310
        setExtra((byte)6); // uid 26237, A310-300F
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A310300F createInstance()
    {
            return new A310300F();
    }
}
