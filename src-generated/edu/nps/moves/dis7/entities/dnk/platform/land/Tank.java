package edu.nps.moves.dis7.entities.dnk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@776aec5c
 * Country: Denmark (DNK)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28832
 */
public class Tank extends EntityType
{
    public Tank()
    {
        setCountry(Country.DENMARK_DNK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)1); // uid 28832, Tank
    }
}