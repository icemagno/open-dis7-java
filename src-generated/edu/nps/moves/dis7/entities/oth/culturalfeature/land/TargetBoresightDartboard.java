/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>TargetBoresightDartboard</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>TargetBoresightDartboard.createInstance()</code> or <code>new TargetBoresightDartboard()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Cultural feature = <code>5</code>; </li>
 *     <li> Category: Obstacle = <code>5</code>; </li>
 *     <li> SubCategory: Target  = <code>25</code>; </li>
 *     <li> Specific: TargetBoresight  = <code>1</code>; </li>
 *     <li> Entity type uid: 26028; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@48ee3c2d. </p>
 * @see Country#OTHER
 * @see EntityKind#CULTURAL_FEATURE
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Obstacle
 * @see SubCategory

 */
public final class TargetBoresightDartboard extends EntityType
{
    /** Default constructor */
    public TargetBoresightDartboard()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)25); // uid 23591, Target
        setSpecific((byte)1); // uid 23592, Target, Boresight
        setExtra((byte)2); // uid 26028, Target, Boresight, Dartboard
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static TargetBoresightDartboard createInstance()
    {
            return new TargetBoresightDartboard();
    }
}
