// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.dnk.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@17f7cd29;
 * Country: Denmark (DNK);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 32952
 */
public class CruiseFerry extends EntityType
{
    /** Default constructor */
    public CruiseFerry()
    {
        setCountry(Country.ACTION_RESPONSE_RELIABLE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)80); // uid 32951, Passenger Vessel (Group 1 Merchant)
        setSubCategory((byte)2); // uid 32952, Cruise Ferry
    }
}
