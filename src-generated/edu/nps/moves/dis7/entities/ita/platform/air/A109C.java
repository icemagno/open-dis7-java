// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A109C</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A109C.createInstance()</code> or <code>new A109C()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg) = <code>90</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineConventionalTailRotor  = <code>12</code>; </li>
 *     <li> Specific: AgustaWestlandAW109  = <code>1</code>; </li>
 *     <li> Entity type uid: 28502; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6da00fb9. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterSmallupto7000lbs3175kg
 * @see SubCategory

 */
public final class A109C extends EntityType
{
    /** Default constructor */
    public A109C()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)90); // uid 28496, Civilian Helicopter, Small (up to 7,000 lbs / 3,175 kg)
        setSubCategory((byte)12); // uid 28497, Single Rotor, Turboshaft Engine, Conventional Tail Rotor
        setSpecific((byte)1); // uid 28498, Agusta Westland AW109
        setExtra((byte)4); // uid 28502, A109C
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A109C createInstance()
    {
            return new A109C();
    }
}
