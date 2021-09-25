// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BattlefieldSurveillance</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BattlefieldSurveillance.createInstance()</code> or <code>new BattlefieldSurveillance()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: BattlefieldSurveillance  = <code>24</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 23700; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6ea3a513. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class BattlefieldSurveillance extends EntityType
{
    /** Default constructor */
    public BattlefieldSurveillance()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22477, RF Active
        setSubCategory((byte)24); // uid 23700, Battlefield Surveillance
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BattlefieldSurveillance createInstance()
    {
            return new BattlefieldSurveillance();
    }
}
