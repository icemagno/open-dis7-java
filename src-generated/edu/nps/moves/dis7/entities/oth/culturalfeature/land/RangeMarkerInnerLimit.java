// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RangeMarkerInnerLimit</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RangeMarkerInnerLimit.createInstance()</code> or <code>new RangeMarkerInnerLimit()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Flags/markers = <code>6</code>; </li>
 *     <li> SubCategory: RangeFlagsMarkers  = <code>10</code>; </li>
 *     <li> Specific: RangeMarkerInnerLimit  = <code>3</code>; </li>
 *     <li> Entity type uid: 27369; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f2c995b. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Flagsmarkers
 * @see SubCategory

 */
public final class RangeMarkerInnerLimit extends EntityType
{
    /** Default constructor */
    public RangeMarkerInnerLimit()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 21990, Flags/markers
        setSubCategory((byte)10); // uid 26044, Range Flags/Markers
        setSpecific((byte)3); // uid 27369, Range Marker, Inner Limit
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RangeMarkerInnerLimit createInstance()
    {
            return new RangeMarkerInnerLimit();
    }
}
