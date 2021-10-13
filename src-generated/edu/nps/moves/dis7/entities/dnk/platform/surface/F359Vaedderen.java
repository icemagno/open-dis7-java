// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F359Vaedderen</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F359Vaedderen.createInstance()</code> or <code>new F359Vaedderen()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: ThetisClass  = <code>1</code>; </li>
 *     <li> Specific: F359Vaedderen  = <code>3</code>; </li>
 *     <li> Entity type uid: 25439; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@776aec5c. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class F359Vaedderen extends EntityType
{
    /** Default constructor */
    public F359Vaedderen()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 25435, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 25436, Thetis Class
        setSpecific((byte)3); // uid 25439, F359 Vaedderen
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F359Vaedderen createInstance()
    {
            return new F359Vaedderen();
    }
}
