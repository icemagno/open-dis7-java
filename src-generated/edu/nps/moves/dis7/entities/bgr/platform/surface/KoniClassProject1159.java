// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>KoniClassProject1159</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>KoniClassProject1159.createInstance()</code> or <code>new KoniClassProject1159()</code>. </p>
 * <ul>
 *     <li> Country: Bulgaria (BGR) = <code>33</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: KoniClassProject1159  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 32903; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5f2108b5. </p>
 * @see Country#BULGARIA_BGR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class KoniClassProject1159 extends EntityType
{
    /** Default constructor */
    public KoniClassProject1159()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 27868, Frigate (including Corvette)
        setSubCategory((byte)4); // uid 32903, Koni Class (Project 1159)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static KoniClassProject1159 createInstance()
    {
            return new KoniClassProject1159();
    }
}
