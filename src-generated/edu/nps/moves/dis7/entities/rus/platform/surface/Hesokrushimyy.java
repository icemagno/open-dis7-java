// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Hesokrushimyy</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Hesokrushimyy.createInstance()</code> or <code>new Hesokrushimyy()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: SAMKotlinclass  = <code>8</code>; </li>
 *     <li> Specific: Hesokrushimyy  = <code>4</code>; </li>
 *     <li> Entity type uid: 13588; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2e34384c. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileDestroyer
 * @see SubCategory

 */
public final class Hesokrushimyy extends EntityType
{
    /** Default constructor */
    public Hesokrushimyy()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 13530, Guided-missile Destroyer
        setSubCategory((byte)8); // uid 13584, SAM Kotlin class
        setSpecific((byte)4); // uid 13588, Hesokrushimyy
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Hesokrushimyy createInstance()
    {
            return new Hesokrushimyy();
    }
}
