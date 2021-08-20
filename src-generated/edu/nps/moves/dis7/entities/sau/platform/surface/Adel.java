// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.sau.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d425813;
 * Country: Saudi Arabia (SAU);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24439
 */
public class Adel extends EntityType
{
    /** Default constructor */
    public Adel()
    {
        setCountry(Country.SAUDI_ARABIA_SAU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)82); // uid 24433, Tanker (Group 3 Merchant)
        setSubCategory((byte)5); // uid 24434, Crude Oil Tanker (up to 159,999 DWT)
        setSpecific((byte)5); // uid 24439, Adel
    }
}
