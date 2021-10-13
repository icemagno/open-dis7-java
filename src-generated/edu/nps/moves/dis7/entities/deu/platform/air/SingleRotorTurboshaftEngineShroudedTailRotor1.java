// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SingleRotorTurboshaftEngineShroudedTailRotor1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SingleRotorTurboshaftEngineShroudedTailRotor1.createInstance()</code> or <code>new SingleRotorTurboshaftEngineShroudedTailRotor1()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg) = <code>91</code>; </li>
 *     <li> SubCategory: SingleRotorTurboshaftEngineShroudedTailRotor  = <code>13</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31749; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@14a50707. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CivilianHelicopterMediumupto20000lbs9072kg
 * @see SubCategory

 */
public final class SingleRotorTurboshaftEngineShroudedTailRotor1 extends EntityType
{
    /** Default constructor */
    public SingleRotorTurboshaftEngineShroudedTailRotor1()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)91); // uid 31746, Civilian Helicopter, Medium (up to 20,000 lbs / 9,072 kg)
        setSubCategory((byte)13); // uid 31749, Single Rotor, Turboshaft Engine, Shrouded Tail Rotor
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SingleRotorTurboshaftEngineShroudedTailRotor1 createInstance()
    {
            return new SingleRotorTurboshaftEngineShroudedTailRotor1();
    }
}
