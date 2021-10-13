// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.srb.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>YugoimportT72modernizationpackage</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>YugoimportT72modernizationpackage.createInstance()</code> or <code>new YugoimportT72modernizationpackage()</code>. </p>
 * <ul>
 *     <li> Country: Serbia (SRB) = <code>276</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Tank = <code>1</code>; </li>
 *     <li> SubCategory: YugoimportT72modernizationpackage  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30144; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@c35af2a. </p>
 * @see Country#SERBIA_SRB
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Tank
 * @see SubCategory

 */
public final class YugoimportT72modernizationpackage extends EntityType
{
    /** Default constructor */
    public YugoimportT72modernizationpackage()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 30142, Tank
        setSubCategory((byte)2); // uid 30144, Yugoimport T-72 modernization package
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static YugoimportT72modernizationpackage createInstance()
    {
            return new YugoimportT72modernizationpackage();
    }
}
