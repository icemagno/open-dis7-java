// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DT561GSQMagnetic</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DT561GSQMagnetic.createInstance()</code> or <code>new DT561GSQMagnetic()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: Multi-spectral = <code>1</code>; </li>
 *     <li> SubCategory: BattlefieldSurveillance  = <code>24</code>; </li>
 *     <li> Specific: ANGSQ187ImprovedREMBASS  = <code>2</code>; </li>
 *     <li> Entity type uid: 22992; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@4b9f7edc. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Multispectral
 * @see SubCategory

 */
public final class DT561GSQMagnetic extends EntityType
{
    /** Default constructor */
    public DT561GSQMagnetic()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 22987, Multi-spectral
        setSubCategory((byte)24); // uid 22988, Battlefield Surveillance
        setSpecific((byte)2); // uid 22990, AN/GSQ-187 Improved REMBASS
        setExtra((byte)2); // uid 22992, DT-561/GSQ - Magnetic
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DT561GSQMagnetic createInstance()
    {
            return new DT561GSQMagnetic();
    }
}
