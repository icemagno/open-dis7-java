/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ImeniXXVISyezdaKPSS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ImeniXXVISyezdaKPSS.createInstance()</code> or <code>new ImeniXXVISyezdaKPSS()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary, Merchant Marine = <code>17</code>; </li>
 *     <li> SubCategory: IvanSusaninclassarmedicebreakers  = <code>13</code>; </li>
 *     <li> Specific: ImeniXXVISyezdaKPSS  = <code>5</code>; </li>
 *     <li> Entity type uid: 14566; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v33-DRAFT-20231217-d10 (2023-12-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24eb65e3. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AuxiliaryMerchantMarine
 * @see SubCategory

 */
public final class ImeniXXVISyezdaKPSS extends EntityType
{
    /** Default constructor */
    public ImeniXXVISyezdaKPSS()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)17); // uid 14477, Auxiliary, Merchant Marine
        setSubCategory((byte)13); // uid 14561, Ivan Susanin class (armed ice breakers)
        setSpecific((byte)5); // uid 14566, Imeni XXVI Syezda KPSS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ImeniXXVISyezdaKPSS createInstance()
    {
            return new ImeniXXVISyezdaKPSS();
    }
}
