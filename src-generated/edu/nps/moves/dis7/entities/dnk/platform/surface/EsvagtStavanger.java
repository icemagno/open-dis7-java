// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>EsvagtStavanger</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>EsvagtStavanger.createInstance()</code> or <code>new EsvagtStavanger()</code>. </p>
 * <ul>
 *     <li> Country: Denmark (DNK) = <code>57</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Support Vessel = <code>83</code>; </li>
 *     <li> SubCategory: EmergencyResponseandRescueVesselERRV  = <code>9</code>; </li>
 *     <li> Specific: EsvagtStavanger  = <code>2</code>; </li>
 *     <li> Entity type uid: 32585; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@6ed3ccb2. </p>
 * @see Country#ACTION_RESPONSE_RELIABLE
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see SupportVessel
 * @see SubCategory

 */
public final class EsvagtStavanger extends EntityType
{
    /** Default constructor */
    public EsvagtStavanger()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)83); // uid 32582, Support Vessel
        setSubCategory((byte)9); // uid 32583, Emergency Response and Rescue Vessel (ERRV)
        setSpecific((byte)2); // uid 32585, Esvagt Stavanger
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static EsvagtStavanger createInstance()
    {
            return new EsvagtStavanger();
    }
}
