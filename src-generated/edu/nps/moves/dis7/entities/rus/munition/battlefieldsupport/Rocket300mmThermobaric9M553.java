// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Rocket300mmThermobaric9M553</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Rocket300mmThermobaric9M553.createInstance()</code> or <code>new Rocket300mmThermobaric9M553()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Ballistic = <code>2</code>; </li>
 *     <li> SubCategory: _300mmrocket  = <code>45</code>; </li>
 *     <li> Specific: Rocket300mmThermobaric9M553  = <code>15</code>; </li>
 *     <li> Entity type uid: 23920; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@55adcf9e. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Ballistic
 * @see SubCategory

 */
public final class Rocket300mmThermobaric9M553 extends EntityType
{
    /** Default constructor */
    public Rocket300mmThermobaric9M553()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 20785, Ballistic
        setSubCategory((byte)45); // uid 20908, 300-mm rocket
        setSpecific((byte)15); // uid 23920, Rocket, 300mm, Thermobaric, 9M553
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Rocket300mmThermobaric9M553 createInstance()
    {
            return new Rocket300mmThermobaric9M553();
    }
}
