package edu.nps.moves.dis7.entities.usa.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1653b84e
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 12430
 */
public class Freedom extends EntityType
{
    public Freedom()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)1); // uid 12422, Manned
        setSubCategory((byte)2); // uid 12429, Space Station
        setSpecific((byte)1); // uid 12430, Freedom
    }
}