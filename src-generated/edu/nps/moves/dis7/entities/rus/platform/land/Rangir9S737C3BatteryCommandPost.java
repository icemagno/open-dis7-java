// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Rangir9S737C3BatteryCommandPost</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Rangir9S737C3BatteryCommandPost.createInstance()</code> or <code>new Rangir9S737C3BatteryCommandPost()</code>. </p>
 * <ul>
 *     <li> Country: Russia (RUS) = <code>222</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>LAND</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Armored Fighting Vehicle = <code>2</code>; </li>
 *     <li> SubCategory: MTLBuTrackedVehicle  = <code>18</code>; </li>
 *     <li> Specific: Rangir9S737C3BatteryCommandPost  = <code>1</code>; </li>
 *     <li> Entity type uid: 12718; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3ff57625. </p>
 * @see Country#RUSSIA_RUS
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see ArmoredFightingVehicle
 * @see SubCategory

 */
public final class Rangir9S737C3BatteryCommandPost extends EntityType
{
    /** Default constructor */
    public Rangir9S737C3BatteryCommandPost()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 12580, Armored Fighting Vehicle
        setSubCategory((byte)18); // uid 12717, MT-LBu Tracked Vehicle
        setSpecific((byte)1); // uid 12718, Rangir (9S737) C3 Battery Command Post
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Rangir9S737C3BatteryCommandPost createInstance()
    {
            return new Rangir9S737C3BatteryCommandPost();
    }
}
