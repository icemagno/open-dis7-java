/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bgr.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AntiHelicopterMineAHM</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AntiHelicopterMineAHM.createInstance()</code> or <code>new AntiHelicopterMineAHM()</code>. </p>
 * <ul>
 *     <li> Country: Bulgaria (BGR) = <code>33</code>; </li>
 *     <li> Entity kind: MunitionDomain = <code>ANTI_AIR</code>; </li>
 *     <li> Domain: Munition = <code>2</code>; </li>
 *     <li> Category: Fixed = <code>3</code>; </li>
 *     <li> SubCategory: AntiHelicopterMineAHM  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 28726; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@288728e. </p>
 * @see Country#BULGARIA_BGR
 * @see EntityKind#MUNITION
 * @see Domain
 * @see MunitionDomain
 * @see Category
 * @see Fixed
 * @see SubCategory

 */
public final class AntiHelicopterMineAHM extends EntityType
{
    /** Default constructor */
    public AntiHelicopterMineAHM()
    {
        setCountry(Country.BULGARIA_BGR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)3); // uid 28725, Fixed
        setSubCategory((byte)1); // uid 28726, Anti-Helicopter Mine (AHM)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AntiHelicopterMineAHM createInstance()
    {
            return new AntiHelicopterMineAHM();
    }
}
