// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M43A1wTelemetryLink</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M43A1wTelemetryLink.createInstance()</code> or <code>new M43A1wTelemetryLink()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Chemical, point detector = <code>7</code>; </li>
 *     <li> SubCategory: EarlyWarningSurveillance  = <code>2</code>; </li>
 *     <li> Specific: M43A1ChemicalAlarm  = <code>1</code>; </li>
 *     <li> Entity type uid: 23651; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6d35ff7b. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Chemicalpointdetector
 * @see SubCategory

 */
public final class M43A1wTelemetryLink extends EntityType
{
    /** Default constructor */
    public M43A1wTelemetryLink()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 22359, Chemical, point detector
        setSubCategory((byte)2); // uid 22362, Early Warning/Surveillance
        setSpecific((byte)1); // uid 22363, M43A1 Chemical Alarm
        setExtra((byte)1); // uid 23651, M43A1 w/Telemetry Link
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M43A1wTelemetryLink createInstance()
    {
            return new M43A1wTelemetryLink();
    }
}
