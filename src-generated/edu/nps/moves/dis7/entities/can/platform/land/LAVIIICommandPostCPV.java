// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>LAVIIICommandPostCPV</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>LAVIIICommandPostCPV.createInstance()</code> or <code>new LAVIIICommandPostCPV()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: LightArmoredVehicleLAVIII  = <code>5</code>; </li>
 *     <li> Specific: LAVIIICommandPostCPV  = <code>1</code>; </li>
 *     <li> Entity type uid: 31846; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4b952a2d. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class LAVIIICommandPostCPV extends EntityType
{
    /** Default constructor */
    public LAVIIICommandPostCPV()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 30991, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 31845, Light Armored Vehicle - LAV III
        setSpecific((byte)1); // uid 31846, LAV-III Command Post (CPV)
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static LAVIIICommandPostCPV createInstance()
    {
            return new LAVIIICommandPostCPV();
    }
}
