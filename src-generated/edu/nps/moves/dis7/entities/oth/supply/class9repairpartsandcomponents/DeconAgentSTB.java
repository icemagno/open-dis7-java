/**
 * Copyright (c) 2008-2023, MOVES Institute, Naval Postgraduate School (NPS). All rights reserved.
 * This work is provided under a BSD-style open-source license, see project
 * <a href="https://savage.nps.edu/opendis7-java/license.html" target="_blank">license.html</a> and <a href="https://savage.nps.edu/opendis7-java/license.txt" target="_blank">license.txt</a>
 */
// header autogenerated using string template dis7javalicense.txt

// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.supply.class9repairpartsandcomponents;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DeconAgentSTB</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DeconAgentSTB.createInstance()</code> or <code>new DeconAgentSTB()</code>. </p>
 * <ul>
 *     <li> Country: Other = <code>0</code>; </li>
 *     <li> Entity kind: SupplyDomain = <code>CLASS_9_REPAIR_PARTS_AND_COMPONENTS</code>; </li>
 *     <li> Domain: Supply = <code>6</code>; </li>
 *     <li> Category: Other = <code>1</code>; </li>
 *     <li> SubCategory: Decontaminationsupplies  = <code>1</code>; </li>
 *     <li> Specific: DeconAgentSTB  = <code>1</code>; </li>
 *     <li> Entity type uid: 30801; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v31 (2022-10-08)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63c4d16. </p>
 * @see Country#OTHER
 * @see EntityKind#SUPPLY
 * @see Domain
 * @see SupplyDomain
 * @see Category
 * @see Other
 * @see SubCategory

 */
public final class DeconAgentSTB extends EntityType
{
    /** Default constructor */
    public DeconAgentSTB()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_9_REPAIR_PARTS_AND_COMPONENTS));

        setCategory((byte)1); // uid 30615, Other
        setSubCategory((byte)1); // uid 30800, Decontamination supplies
        setSpecific((byte)1); // uid 30801, Decon Agent STB
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DeconAgentSTB createInstance()
    {
            return new DeconAgentSTB();
    }
}
