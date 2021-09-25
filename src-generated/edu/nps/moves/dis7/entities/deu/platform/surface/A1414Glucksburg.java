// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A1414Glucksburg</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A1414Glucksburg.createInstance()</code> or <code>new A1414Glucksburg()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: Luneburgclasstype701supportships  = <code>6</code>; </li>
 *     <li> Specific: A1414Glucksburg  = <code>3</code>; </li>
 *     <li> Entity type uid: 16620; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3b8f0a79. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A1414Glucksburg extends EntityType
{
    /** Default constructor */
    public A1414Glucksburg()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 16594, Auxiliary
        setSubCategory((byte)6); // uid 16617, Luneburg class (type 701, support ships)
        setSpecific((byte)3); // uid 16620, A 1414 Glucksburg
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A1414Glucksburg createInstance()
    {
            return new A1414Glucksburg();
    }
}
