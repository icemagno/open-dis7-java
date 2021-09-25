// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.aus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>HaulmarkTrailerHeavyEquipment</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>HaulmarkTrailerHeavyEquipment.createInstance()</code> or <code>new HaulmarkTrailerHeavyEquipment()</code>. </p>
 * <ul>
 *     <li> Country: Australia (AUS) = <code>13</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Cargo Trailer = <code>14</code>; </li>
 *     <li> SubCategory: Greaterthan10Tons  = <code>5</code>; </li>
 *     <li> Specific: HaulmarkTrailerHeavyEquipment  = <code>2</code>; </li>
 *     <li> Entity type uid: 29394; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2aae9190. </p>
 * @see Country#AUSTRALIA_AUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see CargoTrailer
 * @see SubCategory

 */
public final class HaulmarkTrailerHeavyEquipment extends EntityType
{
    /** Default constructor */
    public HaulmarkTrailerHeavyEquipment()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)14); // uid 29384, Cargo Trailer
        setSubCategory((byte)5); // uid 29392, Greater than 10 Tons
        setSpecific((byte)2); // uid 29394, Haulmark - Trailer, Heavy Equipment
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static HaulmarkTrailerHeavyEquipment createInstance()
    {
            return new HaulmarkTrailerHeavyEquipment();
    }
}
