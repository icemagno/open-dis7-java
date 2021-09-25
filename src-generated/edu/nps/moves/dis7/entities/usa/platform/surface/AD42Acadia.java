// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>AD42Acadia</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>AD42Acadia.createInstance()</code> or <code>new AD42Acadia()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Destroyer Tender = <code>53</code>; </li>
 *     <li> SubCategory: SamGompersYellowstoneClass  = <code>1</code>; </li>
 *     <li> Specific: AD42Acadia  = <code>4</code>; </li>
 *     <li> Entity type uid: 11961; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4e424582. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see DestroyerTender
 * @see SubCategory

 */
public final class AD42Acadia extends EntityType
{
    /** Default constructor */
    public AD42Acadia()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)53); // uid 11956, Destroyer Tender
        setSubCategory((byte)1); // uid 11957, Sam Gompers/Yellowstone Class
        setSpecific((byte)4); // uid 11961, AD 42 Acadia
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static AD42Acadia createInstance()
    {
            return new AD42Acadia();
    }
}
