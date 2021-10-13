// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ita.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F550SalvatoreTodaro</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F550SalvatoreTodaro.createInstance()</code> or <code>new F550SalvatoreTodaro()</code>. </p>
 * <ul>
 *     <li> Country: Italy (ITA) = <code>106</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Frigate (including Corvette) = <code>50</code>; </li>
 *     <li> SubCategory: DeCristofaroclass  = <code>6</code>; </li>
 *     <li> Specific: F550SalvatoreTodaro  = <code>1</code>; </li>
 *     <li> Entity type uid: 18634; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2453f95d. </p>
 * @see Country#ITALY_ITA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see FrigateincludingCorvette
 * @see SubCategory

 */
public final class F550SalvatoreTodaro extends EntityType
{
    /** Default constructor */
    public F550SalvatoreTodaro()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 18601, Frigate (including Corvette)
        setSubCategory((byte)6); // uid 18633, De Cristofaro class
        setSpecific((byte)1); // uid 18634, F 550 Salvatore Todaro
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F550SalvatoreTodaro createInstance()
    {
            return new F550SalvatoreTodaro();
    }
}
