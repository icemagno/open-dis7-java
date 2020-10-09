package edu.nps.moves.dis7.entities.svk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@17d32e9b
 * Country: Slovakia (SVK)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 30117
 */
public class ArmoredFightingVehicle extends EntityType
{
    public ArmoredFightingVehicle()
    {
        setCountry(Country.SLOVAKIA_SVK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 30117, Armored Fighting Vehicle
    }
}