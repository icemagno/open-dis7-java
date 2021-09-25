// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.can.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>Ferry</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>Ferry.createInstance()</code> or <code>new Ferry()</code>. </p>
 * <ul>
 *     <li> Country: Canada (CAN) = <code>39</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Passenger Vessel (Group 1 Merchant) = <code>80</code>; </li>
 *     <li> SubCategory: Ferry  = <code>4</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 31621; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@480bdb19. </p>
 * @see Country#CANADA_CAN
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see PassengerVesselGroup1Merchant
 * @see SubCategory

 */
public final class Ferry extends EntityType
{
    /** Default constructor */
    public Ferry()
    {
        setCountry(Country.CANADA_CAN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)80); // uid 31620, Passenger Vessel (Group 1 Merchant)
        setSubCategory((byte)4); // uid 31621, Ferry
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static Ferry createInstance()
    {
            return new Ferry();
    }
}
