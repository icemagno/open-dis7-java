// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.are.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4cbc2e3b;
 * Country: United Arab Emirates (ARE);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 30358
 */
public class P173AlDhafra extends EntityType
{
    /** Default constructor */
    public P173AlDhafra()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 30354, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 30355, Baynunah Class (Corvette)
        setSpecific((byte)3); // uid 30358, P173 Al Dhafra
    }
}
