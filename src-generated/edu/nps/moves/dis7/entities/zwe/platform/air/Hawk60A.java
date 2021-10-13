// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.zwe.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Hawk60A</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Hawk60A.createInstance()</code> or <code>new Hawk60A()</code>. </p>
 * <ul>
 *     <li> Country: Zimbabwe (ZWE) = <code>243</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Trainer = <code>40</code>; </li>
 *     <li> SubCategory: BAESystemsHawk  = <code>1</code>; </li>
 *     <li> Specific: Hawk60A  = <code>2</code>; </li>
 *     <li> Entity type uid: 28590; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7d3691e1. </p>
 * @see Country#ZIMBABWE_ZWE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Trainer
 * @see SubCategory

 */
public final class Hawk60A extends EntityType
{
    /** Default constructor */
    public Hawk60A()
    {
        setCountry(Country.ZIMBABWE_ZWE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 28587, Trainer
        setSubCategory((byte)1); // uid 28588, BAE Systems Hawk
        setSpecific((byte)2); // uid 28590, Hawk 60A
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Hawk60A createInstance()
    {
            return new Hawk60A();
    }
}
