/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P64EleftheriaexP6055TritonGreece</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P64EleftheriaexP6055TritonGreece.createInstance()</code> or <code>new P64EleftheriaexP6055TritonGreece()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: ThetisClassType420  = <code>1</code>; </li>
 *     <li> Specific: P64EleftheriaexP6055TritonGreece  = <code>3</code>; </li>
 *     <li> Entity type uid: 16755; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e0f9063. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class P64EleftheriaexP6055TritonGreece extends EntityType
{
    /** Default constructor */
    public P64EleftheriaexP6055TritonGreece()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16751, Frigate
        setSubCategory((byte)1); // uid 16752, Thetis Class (Type 420)
        setSpecific((byte)3); // uid 16755, P64 Eleftheria (ex P 6055 Triton) (Greece)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P64EleftheriaexP6055TritonGreece createInstance()
    {
            return new P64EleftheriaexP6055TritonGreece();
    }
}
