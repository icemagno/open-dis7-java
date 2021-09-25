// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>_556x45mmM249FNMinimiSAWLMG1</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>_556x45mmM249FNMinimiSAWLMG1.createInstance()</code> or <code>new _556x45mmM249FNMinimiSAWLMG1()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Royal Australian Air Force (RAAF) = <code>13</code>; </li>
 *     <li> SubCategory: MachineGuns  = <code>35</code>; </li>
 *     <li> Specific: _556x45mmM249FNMinimiSAWLMG  = <code>20</code>; </li>
 *     <li> Entity type uid: 31529; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f5e6833. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see RoyalAustralianAirForceRAAF
 * @see SubCategory

 */
public final class _556x45mmM249FNMinimiSAWLMG1 extends EntityType
{
    /** Default constructor */
    public _556x45mmM249FNMinimiSAWLMG1()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)13); // uid 31517, Royal Australian Air Force (RAAF)
        setSubCategory((byte)35); // uid 31528, Machine Guns
        setSpecific((byte)20); // uid 31529, 5.56x45mm M249/FN Minimi SAW/LMG
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static _556x45mmM249FNMinimiSAWLMG1 createInstance()
    {
            return new _556x45mmM249FNMinimiSAWLMG1();
    }
}
