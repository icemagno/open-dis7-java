// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M5519Mandorlo</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M5519Mandorlo.createInstance()</code> or <code>new M5519Mandorlo()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: AdjutantClass  = <code>2</code>; </li>
 *     <li> Specific: M5519Mandorlo  = <code>5</code>; </li>
 *     <li> Entity type uid: 18363; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@29df4d43. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M5519Mandorlo extends EntityType
{
    /** Default constructor */
    public M5519Mandorlo()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 18344, Mine Countermeasure Ship/Craft
        setSubCategory((byte)2); // uid 18358, Adjutant Class
        setSpecific((byte)5); // uid 18363, M5519 Mandorlo
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M5519Mandorlo createInstance()
    {
            return new M5519Mandorlo();
    }
}
