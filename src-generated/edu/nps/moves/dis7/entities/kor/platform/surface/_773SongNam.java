// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_773SongNam</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_773SongNam.createInstance()</code> or <code>new _773SongNam()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: PoHangClassCorvette  = <code>2</code>; </li>
 *     <li> Specific: _773SongNam  = <code>15</code>; </li>
 *     <li> Entity type uid: 17664; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d8792db. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class _773SongNam extends EntityType
{
    /** Default constructor */
    public _773SongNam()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 17638, Guided Missile Frigate (FFG)
        setSubCategory((byte)2); // uid 17649, Po Hang Class (Corvette)
        setSpecific((byte)15); // uid 17664, 773 Song Nam
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _773SongNam createInstance()
    {
            return new _773SongNam();
    }
}
