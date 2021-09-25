// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ANSSQ57BSonobuoy</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ANSSQ57BSonobuoy.createInstance()</code> or <code>new ANSSQ57BSonobuoy()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Acoustic, Passive = <code>11</code>; </li>
 *     <li> SubCategory: Sonobuoy  = <code>77</code>; </li>
 *     <li> Specific: ANSSQ57ANMAmbientNoiseMeasurement  = <code>2</code>; </li>
 *     <li> Entity type uid: 26671; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@356fa0d1. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AcousticPassive
 * @see SubCategory

 */
public final class ANSSQ57BSonobuoy extends EntityType
{
    /** Default constructor */
    public ANSSQ57BSonobuoy()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)11); // uid 22395, Acoustic, Passive
        setSubCategory((byte)77); // uid 22396, Sonobuoy
        setSpecific((byte)2); // uid 22401, AN/SSQ-57 ANM (Ambient Noise Measurement)
        setExtra((byte)2); // uid 26671, AN/SSQ-57B Sonobuoy
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ANSSQ57BSonobuoy createInstance()
    {
            return new ANSSQ57BSonobuoy();
    }
}
