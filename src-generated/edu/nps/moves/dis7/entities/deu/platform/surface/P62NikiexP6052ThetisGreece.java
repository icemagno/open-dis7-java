// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>P62NikiexP6052ThetisGreece</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>P62NikiexP6052ThetisGreece.createInstance()</code> or <code>new P62NikiexP6052ThetisGreece()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate = <code>50</code>; </li>
 *     <li> SubCategory: ThetisClassType420  = <code>1</code>; </li>
 *     <li> Specific: P62NikiexP6052ThetisGreece  = <code>1</code>; </li>
 *     <li> Entity type uid: 16753; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1b75c2e3. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Frigate
 * @see SubCategory

 */
public final class P62NikiexP6052ThetisGreece extends EntityType
{
    /** Default constructor */
    public P62NikiexP6052ThetisGreece()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16751, Frigate
        setSubCategory((byte)1); // uid 16752, Thetis Class (Type 420)
        setSpecific((byte)1); // uid 16753, P62 Niki (ex P 6052 Thetis) (Greece)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static P62NikiexP6052ThetisGreece createInstance()
    {
            return new P62NikiexP6052ThetisGreece();
    }
}
