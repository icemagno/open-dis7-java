// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SM3Jettisonedsecondstage</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SM3Jettisonedsecondstage.createInstance()</code> or <code>new SM3Jettisonedsecondstage()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: StandardMissile  = <code>27</code>; </li>
 *     <li> Specific: StandardBMDRIM61  = <code>3</code>; </li>
 *     <li> Entity type uid: 19495; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@1f172892. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class SM3Jettisonedsecondstage extends EntityType
{
    /** Default constructor */
    public SM3Jettisonedsecondstage()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 19406, Guided
        setSubCategory((byte)27); // uid 19475, Standard Missile
        setSpecific((byte)3); // uid 19489, Standard BMD (RIM-61)
        setExtra((byte)6); // uid 19495, SM-3 Jettisoned second stage
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SM3Jettisonedsecondstage createInstance()
    {
            return new SM3Jettisonedsecondstage();
    }
}
