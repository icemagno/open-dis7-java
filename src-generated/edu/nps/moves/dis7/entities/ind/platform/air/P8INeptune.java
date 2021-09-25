// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P8INeptune</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P8INeptune.createInstance()</code> or <code>new P8INeptune()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: ASW/Patrol/Observation = <code>5</code>; </li>
 *     <li> SubCategory: BoeingP8MultiMissionMaritimeAircraftMMA  = <code>1</code>; </li>
 *     <li> Specific: P8INeptune  = <code>1</code>; </li>
 *     <li> Entity type uid: 31439; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f132176. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ASWPatrolObservation
 * @see SubCategory

 */
public final class P8INeptune extends EntityType
{
    /** Default constructor */
    public P8INeptune()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)5); // uid 31437, ASW/Patrol/Observation
        setSubCategory((byte)1); // uid 31438, Boeing P-8 Multi-Mission Maritime Aircraft (MMA)
        setSpecific((byte)1); // uid 31439, P-8I Neptune
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P8INeptune createInstance()
    {
            return new P8INeptune();
    }
}
