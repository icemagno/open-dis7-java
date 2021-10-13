// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Vikrant</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Vikrant.createInstance()</code> or <code>new Vikrant()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Carrier = <code>1</code>; </li>
 *     <li> SubCategory: VikrantClass  = <code>2</code>; </li>
 *     <li> Specific: Vikrant  = <code>1</code>; </li>
 *     <li> Entity type uid: 26557; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@34f22f9d. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Carrier
 * @see SubCategory

 */
public final class Vikrant extends EntityType
{
    /** Default constructor */
    public Vikrant()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)1); // uid 26550, Carrier
        setSubCategory((byte)2); // uid 26556, Vikrant Class
        setSpecific((byte)1); // uid 26557, Vikrant
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Vikrant createInstance()
    {
            return new Vikrant();
    }
}
