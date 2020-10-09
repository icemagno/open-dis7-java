package edu.nps.moves.dis7.entities.esp.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3ad4a7d6
 * Country: Spain (ESP)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 29903
 */
public class AntiSubmarineWarfarePatrolHelicopter extends EntityType
{
    public AntiSubmarineWarfarePatrolHelicopter()
    {
        setCountry(Country.SPAIN_ESP);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 29903, Anti-Submarine Warfare/Patrol Helicopter
    }
}