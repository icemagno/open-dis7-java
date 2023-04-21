/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.environmental.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>PowderSpillResidue</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>PowderSpillResidue.createInstance()</code> or <code>new PowderSpillResidue()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Environmental = <code>4</code>; </li>
 *     <li> Category: Powder Spill = <code>2</code>; </li>
 *     <li> SubCategory:  <code>(none)</code>; </li>
 *     <li> Specific: PowderSpillResidue  = <code>1</code>; </li>
 *     <li> Entity type uid: 23898; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6d35ff7b. </p>
 * @see Country#OTHER
 * @see EntityKind#ENVIRONMENTAL
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PowderSpill

 */
public final class PowderSpillResidue extends EntityType
{
    /** Default constructor */
    public PowderSpillResidue()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 23896, Powder Spill
        setSpecific((byte)1); // uid 23898, Powder Spill, Residue
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static PowderSpillResidue createInstance()
    {
            return new PowderSpillResidue();
    }
}
