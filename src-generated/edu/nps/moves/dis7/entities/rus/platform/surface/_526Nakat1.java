// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_526Nakat1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_526Nakat1.createInstance()</code> or <code>new _526Nakat1()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided-missile Frigate (includes Corvette) = <code>6</code>; </li>
 *     <li> SubCategory: NanuchkaIVclassCorvette  = <code>9</code>; </li>
 *     <li> Specific: _526Nakat  = <code>1</code>; </li>
 *     <li> Entity type uid: 27184; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@108bdbd8. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedmissileFrigateincludesCorvette
 * @see SubCategory

 */
public final class _526Nakat1 extends EntityType
{
    /** Default constructor */
    public _526Nakat1()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 13593, Guided-missile Frigate (includes Corvette)
        setSubCategory((byte)9); // uid 13665, Nanuchka IV class (Corvette)
        setSpecific((byte)1); // uid 27184, 526 Nakat
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _526Nakat1 createInstance()
    {
            return new _526Nakat1();
    }
}
