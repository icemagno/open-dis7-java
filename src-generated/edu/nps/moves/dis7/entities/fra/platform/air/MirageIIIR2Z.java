package edu.nps.moves.dis7.entities.fra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2fb3536e
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 15815
 */
public class MirageIIIR2Z extends EntityType
{
    public MirageIIIR2Z()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 15811, Reconnaissance
        setSubCategory((byte)2); // uid 15813, Mirage III
        setSpecific((byte)2); // uid 15815, Mirage IIIR2Z
    }
}