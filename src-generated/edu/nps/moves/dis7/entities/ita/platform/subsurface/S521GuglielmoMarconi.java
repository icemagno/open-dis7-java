// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S521GuglielmoMarconi</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S521GuglielmoMarconi.createInstance()</code> or <code>new S521GuglielmoMarconi()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SS (Conventional Attack-Torpedo, Patrol) = <code>5</code>; </li>
 *     <li> SubCategory: SauroClass1081Type  = <code>2</code>; </li>
 *     <li> Specific: S521GuglielmoMarconi  = <code>4</code>; </li>
 *     <li> Entity type uid: 18659; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@31e75d13. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSConventionalAttackTorpedoPatrol
 * @see SubCategory

 */
public final class S521GuglielmoMarconi extends EntityType
{
    /** Default constructor */
    public S521GuglielmoMarconi()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 18649, SS (Conventional Attack-Torpedo, Patrol)
        setSubCategory((byte)2); // uid 18655, Sauro Class (1081 Type)
        setSpecific((byte)4); // uid 18659, S 521 Guglielmo Marconi
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S521GuglielmoMarconi createInstance()
    {
            return new S521GuglielmoMarconi();
    }
}
