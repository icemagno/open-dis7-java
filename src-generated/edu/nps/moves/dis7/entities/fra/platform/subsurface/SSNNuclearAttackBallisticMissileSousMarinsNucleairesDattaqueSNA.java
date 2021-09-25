// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA.createInstance()</code> or <code>new SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSN (Nuclear Attack Ballistic Missile) (Sous-Marins Nucleaires Dattaque (SNA)) = <code>3</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 16186; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@43f02ef2. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA

 */
public final class SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA extends EntityType
{
    /** Default constructor */
    public SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 16186, SSN (Nuclear Attack Ballistic Missile) (Sous-Marins Nucleaires Dattaque (SNA))
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA createInstance()
    {
            return new SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA();
    }
}
