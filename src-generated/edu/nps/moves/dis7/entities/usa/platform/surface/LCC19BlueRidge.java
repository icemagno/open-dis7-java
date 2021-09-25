// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LCC19BlueRidge</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LCC19BlueRidge.createInstance()</code> or <code>new LCC19BlueRidge()</code>. </p>
 * <ul>
 *     <li> Country: United States of America (USA) = <code>225</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Command Ship/Cruiser = <code>2</code>; </li>
 *     <li> SubCategory: BlueRidgeClass  = <code>1</code>; </li>
 *     <li> Specific: LCC19BlueRidge  = <code>1</code>; </li>
 *     <li> Entity type uid: 11318; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1eb9a3ef. </p>
 * @see Country#UNITED_STATES_OF_AMERICA_USA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CommandShipCruiser
 * @see SubCategory

 */
public final class LCC19BlueRidge extends EntityType
{
    /** Default constructor */
    public LCC19BlueRidge()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)2); // uid 11316, Command Ship/Cruiser
        setSubCategory((byte)1); // uid 11317, Blue Ridge Class
        setSpecific((byte)1); // uid 11318, LCC 19 Blue Ridge
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LCC19BlueRidge createInstance()
    {
            return new LCC19BlueRidge();
    }
}
