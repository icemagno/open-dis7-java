// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jpn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>NissanLEAF</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>NissanLEAF.createInstance()</code> or <code>new NissanLEAF()</code>. </p>
 * <ul>
 *     <li> Country: Japan (JPN) = <code>110</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Car = <code>81</code>; </li>
 *     <li> SubCategory: _5DoorHatchbackEconomyCompactSmall  = <code>52</code>; </li>
 *     <li> Specific: NissanLEAF  = <code>1</code>; </li>
 *     <li> Entity type uid: 29345; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15c25153. </p>
 * @see Country#JAPAN_JPN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see Car
 * @see SubCategory

 */
public final class NissanLEAF extends EntityType
{
    /** Default constructor */
    public NissanLEAF()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24863, Car
        setSubCategory((byte)52); // uid 29344, 5-Door Hatchback, Economy/Compact (Small)
        setSpecific((byte)1); // uid 29345, Nissan LEAF
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static NissanLEAF createInstance()
    {
            return new NissanLEAF();
    }
}
