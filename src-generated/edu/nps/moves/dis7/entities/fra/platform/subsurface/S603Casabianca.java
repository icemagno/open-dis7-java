/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>S603Casabianca</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>S603Casabianca.createInstance()</code> or <code>new S603Casabianca()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SUBSURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: SSN (Nuclear Attack Ballistic Missile) (Sous-Marins Nucleaires D'attaque (SNA)) = <code>3</code>; </li>
 *     <li> SubCategory: RubisClassSNA72  = <code>1</code>; </li>
 *     <li> Specific: S603Casabianca  = <code>3</code>; </li>
 *     <li> Entity type uid: 16190; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@503ecb24. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SSNNuclearAttackBallisticMissileSousMarinsNucleairesDattaqueSNA
 * @see SubCategory

 */
public final class S603Casabianca extends EntityType
{
    /** Default constructor */
    public S603Casabianca()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)3); // uid 16186, SSN (Nuclear Attack Ballistic Missile) (Sous-Marins Nucleaires D'attaque (SNA))
        setSubCategory((byte)1); // uid 16187, Rubis Class (SNA 72)
        setSpecific((byte)3); // uid 16190, S 603 Casabianca
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static S603Casabianca createInstance()
    {
            return new S603Casabianca();
    }
}
