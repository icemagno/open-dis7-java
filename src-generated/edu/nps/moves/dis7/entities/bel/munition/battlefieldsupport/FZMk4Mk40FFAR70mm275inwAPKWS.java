/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FZMk4Mk40FFAR70mm275inwAPKWS</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FZMk4Mk40FFAR70mm275inwAPKWS.createInstance()</code> or <code>new FZMk4Mk40FFAR70mm275inwAPKWS()</code>. </p>
 * <ul>
 *     <li> Country: Belgium (BEL) = <code>21</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>BATTLEFIELD_SUPPORT</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Guided = <code>1</code>; </li>
 *     <li> SubCategory: FZMk4Mk40FFAR70mm275inwAPKWS  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 30310; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7de147e9. </p>
 * @see Country#BELGIUM_BEL
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Guided
 * @see SubCategory

 */
public final class FZMk4Mk40FFAR70mm275inwAPKWS extends EntityType
{
    /** Default constructor */
    public FZMk4Mk40FFAR70mm275inwAPKWS()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)1); // uid 30309, Guided
        setSubCategory((byte)1); // uid 30310, FZ Mk4/Mk40 FFAR (70 mm, 2.75 in) w/APKWS
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FZMk4Mk40FFAR70mm275inwAPKWS createInstance()
    {
            return new FZMk4Mk40FFAR70mm275inwAPKWS();
    }
}
