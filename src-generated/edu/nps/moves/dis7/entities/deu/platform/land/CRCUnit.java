// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>CRCUnit</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>CRCUnit.createInstance()</code> or <code>new CRCUnit()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Control Facility = <code>36</code>; </li>
 *     <li> SubCategory: CRC  = <code>1</code>; </li>
 *     <li> Specific: CRCUnit  = <code>1</code>; </li>
 *     <li> Entity type uid: 28064; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@18317edc. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ControlFacility
 * @see SubCategory

 */
public final class CRCUnit extends EntityType
{
    /** Default constructor */
    public CRCUnit()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)36); // uid 28054, Control Facility
        setSubCategory((byte)1); // uid 28063, CRC
        setSpecific((byte)1); // uid 28064, CRC Unit
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static CRCUnit createInstance()
    {
            return new CRCUnit();
    }
}
