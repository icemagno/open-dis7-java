/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.est.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FrauenlobClassType394</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FrauenlobClassType394.createInstance()</code> or <code>new FrauenlobClassType394()</code>. </p>
 * <ul>
 *     <li> Country: Estonia (EST) = <code>250</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Mine Countermeasure Ship/Craft = <code>8</code>; </li>
 *     <li> SubCategory: FrauenlobClassType394  = <code>3</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 27564; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@43dac38f. </p>
 * @see Country#ESTONIA_EST
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see MineCountermeasureShipCraft
 * @see SubCategory

 */
public final class FrauenlobClassType394 extends EntityType
{
    /** Default constructor */
    public FrauenlobClassType394()
    {
        setCountry(Country.ESTONIA_EST);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)8); // uid 27555, Mine Countermeasure Ship/Craft
        setSubCategory((byte)3); // uid 27564, Frauenlob Class (Type 394)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FrauenlobClassType394 createInstance()
    {
            return new FrauenlobClassType394();
    }
}
