// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nzl.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NH90NZDF</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NH90NZDF.createInstance()</code> or <code>new NH90NZDF()</code>. </p>
 * <ul>
 *     <li> Country: New Zealand (NZL) = <code>156</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Utility Helicopter = <code>21</code>; </li>
 *     <li> SubCategory: NH90NZDF  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32002; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2ef8a8c3. </p>
 * @see Country#NEW_ZEALAND_NZL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see UtilityHelicopter
 * @see SubCategory

 */
public final class NH90NZDF extends EntityType
{
    /** Default constructor */
    public NH90NZDF()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 32001, Utility Helicopter
        setSubCategory((byte)1); // uid 32002, NH-90 NZDF
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NH90NZDF createInstance()
    {
            return new NH90NZDF();
    }
}
