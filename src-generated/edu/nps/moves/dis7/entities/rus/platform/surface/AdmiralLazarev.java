package edu.nps.moves.dis7.entities.rus.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1be59f28
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 13512
 */
public class AdmiralLazarev extends EntityType
{
    public AdmiralLazarev()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)3); // uid 13504, Guided-missile Cruiser
        setSubCategory((byte)2); // uid 13510, Kirov class
        setSpecific((byte)2); // uid 13512, Admiral Lazarev
    }
}