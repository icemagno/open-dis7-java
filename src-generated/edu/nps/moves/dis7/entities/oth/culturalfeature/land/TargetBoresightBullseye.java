// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TargetBoresightBullseye</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TargetBoresightBullseye.createInstance()</code> or <code>new TargetBoresightBullseye()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Obstacle = <code>5</code>; </li>
 *     <li> SubCategory: Target  = <code>25</code>; </li>
 *     <li> Specific: TargetBoresight  = <code>1</code>; </li>
 *     <li> Entity type uid: 26029; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@6501b105. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Obstacle
 * @see SubCategory

 */
public final class TargetBoresightBullseye extends EntityType
{
    /** Default constructor */
    public TargetBoresightBullseye()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)25); // uid 23591, Target
        setSpecific((byte)1); // uid 23592, Target, Boresight
        setExtra((byte)3); // uid 26029, Target, Boresight, Bullseye
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TargetBoresightBullseye createInstance()
    {
            return new TargetBoresightBullseye();
    }
}
