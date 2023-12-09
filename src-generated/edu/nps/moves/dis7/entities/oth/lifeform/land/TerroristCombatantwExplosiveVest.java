/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TerroristCombatantwExplosiveVest</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TerroristCombatantwExplosiveVest.createInstance()</code> or <code>new TerroristCombatantwExplosiveVest()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Life form = <code>3</code>; </li>
 *     <li> Category: Terrorist Combatant = <code>101</code>; </li>
 *     <li> SubCategory: WeaponNonspecific  = <code>1</code>; </li>
 *     <li> Specific: TerroristCombatantwExplosiveVest  = <code>100</code>; </li>
 *     <li> Entity type uid: 32721; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@65ef9a0a. </p>
 * @see Country#OTHER
 * @see EntityKind#LIFE_FORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see TerroristCombatant
 * @see SubCategory

 */
public final class TerroristCombatantwExplosiveVest extends EntityType
{
    /** Default constructor */
    public TerroristCombatantwExplosiveVest()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)101); // uid 32719, Terrorist Combatant
        setSubCategory((byte)1); // uid 32720, Weapon, Non-specific
        setSpecific((byte)100); // uid 32721, Terrorist Combatant w/ Explosive Vest
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TerroristCombatantwExplosiveVest createInstance()
    {
            return new TerroristCombatantwExplosiveVest();
    }
}
