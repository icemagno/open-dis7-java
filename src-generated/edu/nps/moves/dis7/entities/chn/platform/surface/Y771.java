package edu.nps.moves.dis7.entities.chn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@353d0772
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17337
 */
public class Y771 extends EntityType
{
    public Y771()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 17231, Auxiliary
        setSubCategory((byte)33); // uid 17333, Hongqi class (cargo)
        setSpecific((byte)4); // uid 17337, Y771
    }
}