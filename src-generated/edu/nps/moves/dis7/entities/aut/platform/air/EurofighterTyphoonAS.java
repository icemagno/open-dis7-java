/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aut.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EurofighterTyphoonAS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EurofighterTyphoonAS.createInstance()</code> or <code>new EurofighterTyphoonAS()</code>. </p>
 * <ul>
 *     <li> Country: Austria (AUT) = <code>14</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Fighter/Air Defense = <code>1</code>; </li>
 *     <li> SubCategory: EurofighterTyphoon  = <code>1</code>; </li>
 *     <li> Specific: EurofighterTyphoonAS  = <code>1</code>; </li>
 *     <li> Entity type uid: 35503; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@271053e1. </p>
 * @see Country#AUSTRIA_AUT
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FighterAirDefense
 * @see SubCategory

 */
public final class EurofighterTyphoonAS extends EntityType
{
    /** Default constructor */
    public EurofighterTyphoonAS()
    {
        setCountry(Country.AUSTRIA_AUT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 35501, Fighter/Air Defense
        setSubCategory((byte)1); // uid 35502, Eurofighter Typhoon
        setSpecific((byte)1); // uid 35503, Eurofighter Typhoon AS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EurofighterTyphoonAS createInstance()
    {
            return new EurofighterTyphoonAS();
    }
}