// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>M2664Diana</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>M2664Diana.createInstance()</code> or <code>new M2664Diana()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship / Craft = <code>8</code>; </li>
 *     <li> SubCategory: FrauenlobClassType394  = <code>4</code>; </li>
 *     <li> Specific: M2664Diana  = <code>7</code>; </li>
 *     <li> Entity type uid: 16514; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@934b6cb. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class M2664Diana extends EntityType
{
    /** Default constructor */
    public M2664Diana()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 16484, Mine Countermeasure Ship / Craft
        setSubCategory((byte)4); // uid 16507, Frauenlob Class (Type 394)
        setSpecific((byte)7); // uid 16514, M 2664 Diana
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static M2664Diana createInstance()
    {
            return new M2664Diana();
    }
}
