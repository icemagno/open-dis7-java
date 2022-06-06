// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.deu.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>FreightlinerUnimogFLU419</code></b> collects multiple enumeration values together to uniquely define this entity. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>FreightlinerUnimogFLU419.createInstance()</code> or <code>new FreightlinerUnimogFLU419()</code>. </p>
 * <ul>
 *     <li> Country: Germany (DEU) = <code>78</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Construction Specialty Vehicle = <code>87</code>; </li>
 *     <li> SubCategory: Loader  = <code>3</code>; </li>
 *     <li> Specific: FreightlinerUnimogFLU419  = <code>1</code>; </li>
 *     <li> Entity type uid: 34138; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v30-DRAFT-20220129-d11 (2022-01-29)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@331acdad. </p>
 * @see Country#GERMANY_DEU
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ConstructionSpecialtyVehicle
 * @see SubCategory

 */
public final class FreightlinerUnimogFLU419 extends EntityType
{
    /** Default constructor */
    public FreightlinerUnimogFLU419()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)87); // uid 29701, Construction Specialty Vehicle
        setSubCategory((byte)3); // uid 34137, Loader
        setSpecific((byte)1); // uid 34138, Freightliner Unimog FLU-419
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static FreightlinerUnimogFLU419 createInstance()
    {
            return new FreightlinerUnimogFLU419();
    }
}