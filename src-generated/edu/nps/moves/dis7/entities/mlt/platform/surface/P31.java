// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.mlt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P31</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P31.createInstance()</code> or <code>new P31()</code>. </p>
 * <ul>
 *     <li> Country: Malta (MLT) = <code>135</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: KondorIClass  = <code>1</code>; </li>
 *     <li> Specific: P31  = <code>3</code>; </li>
 *     <li> Entity type uid: 27575; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4cc547a. </p>
 * @see Country#MALTA_MLT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class P31 extends EntityType
{
    /** Default constructor */
    public P31()
    {
        setCountry(Country.MALTA_MLT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27571, Mine Countermeasure Ship/Craft
        setSubCategory((byte)1); // uid 27572, Kondor I Class
        setSpecific((byte)3); // uid 27575, P31
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P31 createInstance()
    {
            return new P31();
    }
}
