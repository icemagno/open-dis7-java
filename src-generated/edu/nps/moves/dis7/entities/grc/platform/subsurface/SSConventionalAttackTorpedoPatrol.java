package edu.nps.moves.dis7.entities.grc.platform.subsurface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6436a7db
 * Country: Greece (GRC)
 * Entity kind: Platform
 * Domain: SUBSURFACE
 *
 * Entity type uid: 23390
 */
public class SSConventionalAttackTorpedoPatrol extends EntityType
{
    public SSConventionalAttackTorpedoPatrol()
    {
        setCountry(Country.GREECE_GRC);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SUBSURFACE));

        setCategory((byte)5); // uid 23390, SS (Conventional Attack - Torpedo, Patrol)
    }
}