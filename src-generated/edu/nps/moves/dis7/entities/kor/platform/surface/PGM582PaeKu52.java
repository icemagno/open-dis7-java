// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PGM582PaeKu52</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PGM582PaeKu52.createInstance()</code> or <code>new PGM582PaeKu52()</code>. </p>
 * <ul>
 *     <li> Country: Korea (Republic of) (KOR) = <code>120</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Light/Patrol Craft = <code>7</code>; </li>
 *     <li> SubCategory: PaeKuPSMM5Classfastattackcraftmissile  = <code>1</code>; </li>
 *     <li> Specific: PGM582PaeKu52  = <code>1</code>; </li>
 *     <li> Entity type uid: 17675; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@403132fc. </p>
 * @see Country#KOREA_REPUBLIC_OF_KOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see LightPatrolCraft
 * @see SubCategory

 */
public final class PGM582PaeKu52 extends EntityType
{
    /** Default constructor */
    public PGM582PaeKu52()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17673, Light/Patrol Craft
        setSubCategory((byte)1); // uid 17674, Pae Ku (PSMM 5) Class (fast attack craft-missile)
        setSpecific((byte)1); // uid 17675, PGM 582 Pae Ku 52
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PGM582PaeKu52 createInstance()
    {
            return new PGM582PaeKu52();
    }
}
