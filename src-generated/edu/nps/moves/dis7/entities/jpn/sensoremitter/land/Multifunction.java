// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Multifunction</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Multifunction.createInstance()</code> or <code>new Multifunction()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Sensor/Emitter = <code>9</code>; </li>
 *     <li> Category: RF Active = <code>2</code>; </li>
 *     <li> SubCategory: Multifunction  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 22593; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7d685f4e. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#SENSOR_EMITTER
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RFActive
 * @see SubCategory

 */
public final class Multifunction extends EntityType
{
    /** Default constructor */
    public Multifunction()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 22592, RF Active
        setSubCategory((byte)2); // uid 22593, Multi-function
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Multifunction createInstance()
    {
            return new Multifunction();
    }
}
