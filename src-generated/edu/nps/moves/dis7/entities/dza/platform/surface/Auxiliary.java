package edu.nps.moves.dis7.entities.dza.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@7e774085
 * Country: Algeria (DZA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 27750
 */
public class Auxiliary extends EntityType
{
    public Auxiliary()
    {
        setCountry(Country.ALGERIA_DZA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 27750, Auxiliary
    }
}