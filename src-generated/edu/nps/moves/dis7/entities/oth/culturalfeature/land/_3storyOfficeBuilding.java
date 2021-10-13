// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_3storyOfficeBuilding</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_3storyOfficeBuilding.createInstance()</code> or <code>new _3storyOfficeBuilding()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Camp Lejeune MOUT Collective Training Facility (CTF) = <code>14</code>; </li>
 *     <li> SubCategory: CommercialBuilding  = <code>2</code>; </li>
 *     <li> Specific: _3storyOfficeBuilding  = <code>7</code>; </li>
 *     <li> Entity type uid: 22053; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5cbe95b1. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CampLejeuneMOUTCollectiveTrainingFacilityCTF
 * @see SubCategory

 */
public final class _3storyOfficeBuilding extends EntityType
{
    /** Default constructor */
    public _3storyOfficeBuilding()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 22040, Camp Lejeune MOUT Collective Training Facility (CTF)
        setSubCategory((byte)2); // uid 22046, Commercial Building
        setSpecific((byte)7); // uid 22053, 3-story Office Building
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _3storyOfficeBuilding createInstance()
    {
            return new _3storyOfficeBuilding();
    }
}
