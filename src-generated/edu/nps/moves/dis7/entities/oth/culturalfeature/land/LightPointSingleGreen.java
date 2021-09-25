// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LightPointSingleGreen</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LightPointSingleGreen.createInstance()</code> or <code>new LightPointSingleGreen()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Flags/markers = <code>6</code>; </li>
 *     <li> SubCategory: LightPoint  = <code>5</code>; </li>
 *     <li> Specific: LightPointSingle  = <code>1</code>; </li>
 *     <li> Entity type uid: 22905; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@5a6f6cac. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flagsmarkers
 * @see SubCategory

 */
public final class LightPointSingleGreen extends EntityType
{
    /** Default constructor */
    public LightPointSingleGreen()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)5); // uid 22900, Light Point
        setSpecific((byte)1); // uid 22901, Light Point, Single
        setExtra((byte)4); // uid 22905, Light Point, Single, Green
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LightPointSingleGreen createInstance()
    {
            return new LightPointSingleGreen();
    }
}
