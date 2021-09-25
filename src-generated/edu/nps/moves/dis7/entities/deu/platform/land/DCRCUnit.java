// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>DCRCUnit</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>DCRCUnit.createInstance()</code> or <code>new DCRCUnit()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Control Facility = <code>36</code>; </li>
 *     <li> SubCategory: DCRC  = <code>2</code>; </li>
 *     <li> Specific: DCRCUnit  = <code>1</code>; </li>
 *     <li> Entity type uid: 28056; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@238d68ff. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ControlFacility
 * @see SubCategory

 */
public final class DCRCUnit extends EntityType
{
    /** Default constructor */
    public DCRCUnit()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)36); // uid 28054, Control Facility
        setSubCategory((byte)2); // uid 28055, DCRC
        setSpecific((byte)1); // uid 28056, DCRC Unit
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static DCRCUnit createInstance()
    {
            return new DCRCUnit();
    }
}
