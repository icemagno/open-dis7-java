// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.nor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>A535Valkyrien</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>A535Valkyrien.createInstance()</code> or <code>new A535Valkyrien()</code>. </p>
 * <ul>
 *     <li> Country: Norway (NOR) = <code>163</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Auxiliary = <code>16</code>; </li>
 *     <li> SubCategory: ValkyrienClass  = <code>1</code>; </li>
 *     <li> Specific: A535Valkyrien  = <code>1</code>; </li>
 *     <li> Entity type uid: 27597; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@66d23e4a. </p>
 * @see Country#NORWAY_NOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Auxiliary
 * @see SubCategory

 */
public final class A535Valkyrien extends EntityType
{
    /** Default constructor */
    public A535Valkyrien()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27595, Auxiliary
        setSubCategory((byte)1); // uid 27596, Valkyrien Class
        setSpecific((byte)1); // uid 27597, A535 Valkyrien
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static A535Valkyrien createInstance()
    {
            return new A535Valkyrien();
    }
}
