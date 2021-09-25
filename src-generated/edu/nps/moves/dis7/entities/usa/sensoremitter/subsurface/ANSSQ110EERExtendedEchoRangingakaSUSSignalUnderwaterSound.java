// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANSSQ110EERExtendedEchoRangingakaSUSSignalUnderwaterSound</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANSSQ110EERExtendedEchoRangingakaSUSSignalUnderwaterSound.createInstance()</code> or <code>new ANSSQ110EERExtendedEchoRangingakaSUSSignalUnderwaterSound()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, active = <code>10</code>; </li>
 *     <li> SubCategory: Sonobuoy  = <code>77</code>; </li>
 *     <li> Specific: ANSSQ110EERExtendedEchoRangingakaSUSSignalUnderwaterSound  = <code>2</code>; </li>
 *     <li> Entity type uid: 22392; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@72f24a84. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Acousticactive
 * @see SubCategory

 */
public final class ANSSQ110EERExtendedEchoRangingakaSUSSignalUnderwaterSound extends EntityType
{
    /** Default constructor */
    public ANSSQ110EERExtendedEchoRangingakaSUSSignalUnderwaterSound()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)10); // uid 22382, Acoustic, active
        setSubCategory((byte)77); // uid 22384, Sonobuoy
        setSpecific((byte)2); // uid 22392, AN/SSQ-110 EER (Extended Echo Ranging), a.k.a. SUS (Signal, Underwater Sound)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANSSQ110EERExtendedEchoRangingakaSUSSignalUnderwaterSound createInstance()
    {
            return new ANSSQ110EERExtendedEchoRangingakaSUSSignalUnderwaterSound();
    }
}
