// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.twn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@44f24a20;
 * Country: Taiwan, Province of China (TWN);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 19204
 */
public class FABG55 extends EntityType
{
    /** Default constructor */
    public FABG55()
    {
        setCountry(Country.TAIWAN_PROVINCE_OF_CHINA_TWN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 19156, Light/Patrol Craft
        setSubCategory((byte)1); // uid 19157, Hai Ou Class
        setSpecific((byte)47); // uid 19204, FABG 55
    }
}
