// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Prognaz</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Prognaz.createInstance()</code> or <code>new Prognaz()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SPACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Manned = <code>1</code>; </li>
 *     <li> SubCategory: Spacevehicles  = <code>3</code>; </li>
 *     <li> Specific: Prognaz  = <code>6</code>; </li>
 *     <li> Entity type uid: 14841; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75361cf6. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Manned
 * @see SubCategory

 */
public final class Prognaz extends EntityType
{
    /** Default constructor */
    public Prognaz()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 14828, Manned
        setSubCategory((byte)3); // uid 14835, Space vehicles
        setSpecific((byte)6); // uid 14841, Prognaz
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Prognaz createInstance()
    {
            return new Prognaz();
    }
}
