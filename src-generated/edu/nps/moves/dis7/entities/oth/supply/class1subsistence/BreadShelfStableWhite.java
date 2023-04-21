/**
 * Copyright (c) 2008-2022, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class1subsistence;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>BreadShelfStableWhite</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>BreadShelfStableWhite.createInstance()</code> or <code>new BreadShelfStableWhite()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_1_SUBSISTENCE</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: S - Other Non-Refrigerated = <code>5</code>; </li>
 *     <li> SubCategory: Bread  = <code>1</code>; </li>
 *     <li> Specific: BreadShelfStableWhite  = <code>1</code>; </li>
 *     <li> Entity type uid: 30654; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30 (2022-04-17)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7b4619a3. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see SOtherNonRefrigerated
 * @see SubCategory

 */
public final class BreadShelfStableWhite extends EntityType
{
    /** Default constructor */
    public BreadShelfStableWhite()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_1_SUBSISTENCE));

        setCategory((byte)5); // uid 30652, S - Other Non-Refrigerated
        setSubCategory((byte)1); // uid 30653, Bread
        setSpecific((byte)1); // uid 30654, Bread, Shelf-Stable, White
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static BreadShelfStableWhite createInstance()
    {
            return new BreadShelfStableWhite();
    }
}
