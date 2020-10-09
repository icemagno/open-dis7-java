package edu.nps.moves.dis7.entities.nor.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1d572e62
 * Country: Norway (NOR)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 30280
 */
public class NASAMSTEL extends EntityType
{
    public NASAMSTEL()
    {
        setCountry(Country.NORWAY_NOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 30278, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 30279, Norwegian Advanced Surface to Air Missile System (NASAMS)
        setSpecific((byte)1); // uid 30280, NASAMS TEL
    }
}