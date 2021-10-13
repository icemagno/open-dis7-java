// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>K48Vidyut</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>K48Vidyut.createInstance()</code> or <code>new K48Vidyut()</code>. </p>
 * <ul>
 *     <li> Country: India (IND) = <code>99</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: VeerTarantul1class  = <code>3</code>; </li>
 *     <li> Specific: K48Vidyut  = <code>9</code>; </li>
 *     <li> Entity type uid: 23186; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@46dffdc3. </p>
 * @see Country#INDIA_IND
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class K48Vidyut extends EntityType
{
    /** Default constructor */
    public K48Vidyut()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18858, Frigate (including Corvette)
        setSubCategory((byte)3); // uid 23177, Veer (Tarantul 1) class
        setSpecific((byte)9); // uid 23186, K48 Vidyut
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static K48Vidyut createInstance()
    {
            return new K48Vidyut();
    }
}
