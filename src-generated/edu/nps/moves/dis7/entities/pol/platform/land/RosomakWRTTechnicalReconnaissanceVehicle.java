// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.pol.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>RosomakWRTTechnicalReconnaissanceVehicle</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>RosomakWRTTechnicalReconnaissanceVehicle.createInstance()</code> or <code>new RosomakWRTTechnicalReconnaissanceVehicle()</code>. </p>
 * <ul>
 *     <li> Country: Poland (POL) = <code>175</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Utility Vehicle = <code>3</code>; </li>
 *     <li> SubCategory: KTORosomak  = <code>1</code>; </li>
 *     <li> Specific: RosomakWRTTechnicalReconnaissanceVehicle  = <code>3</code>; </li>
 *     <li> Entity type uid: 31697; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@110844f6. </p>
 * @see Country#POLAND_POL
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredUtilityVehicle
 * @see SubCategory

 */
public final class RosomakWRTTechnicalReconnaissanceVehicle extends EntityType
{
    /** Default constructor */
    public RosomakWRTTechnicalReconnaissanceVehicle()
    {
        setCountry(Country.POLAND_POL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 31693, Armored Utility Vehicle
        setSubCategory((byte)1); // uid 31694, KTO Rosomak
        setSpecific((byte)3); // uid 31697, Rosomak WRT (Technical Reconnaissance Vehicle)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static RosomakWRTTechnicalReconnaissanceVehicle createInstance()
    {
            return new RosomakWRTTechnicalReconnaissanceVehicle();
    }
}
