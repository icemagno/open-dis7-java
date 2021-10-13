// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A629Durance</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A629Durance.createInstance()</code> or <code>new A629Durance()</code>. </p>
 * <ul>
 *     <li> Country: France (FRA) = <code>71</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Duranceclassunderwayreplenishmenttankers  = <code>2</code>; </li>
 *     <li> Specific: A629Durance  = <code>3</code>; </li>
 *     <li> Entity type uid: 16049; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75437611. </p>
 * @see Country#FRANCE_FRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A629Durance extends EntityType
{
    /** Default constructor */
    public A629Durance()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 16040, Auxiliary
        setSubCategory((byte)2); // uid 16046, Durance class (underway replenishment tankers)
        setSpecific((byte)3); // uid 16049, A 629 Durance
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A629Durance createInstance()
    {
            return new A629Durance();
    }
}
