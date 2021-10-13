// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.srb.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D30JA1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D30JA1.createInstance()</code> or <code>new D30JA1()</code>. </p>
 * <ul>
 *     <li> Country: Serbia (SRB) = <code>276</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Towed Artillery = <code>5</code>; </li>
 *     <li> SubCategory: D30JA1  = <code>2</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30162; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@407873d3. </p>
 * @see Country#SERBIA_SRB
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TowedArtillery
 * @see SubCategory

 */
public final class D30JA1 extends EntityType
{
    /** Default constructor */
    public D30JA1()
    {
        setCountry(Country.SERBIA_SRB);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 30160, Towed Artillery
        setSubCategory((byte)2); // uid 30162, D-30JA1
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D30JA1 createInstance()
    {
            return new D30JA1();
    }
}
