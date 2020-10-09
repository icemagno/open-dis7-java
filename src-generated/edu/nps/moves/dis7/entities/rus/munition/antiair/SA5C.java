package edu.nps.moves.dis7.entities.rus.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3db6dd52
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 20347
 */
public class SA5C extends EntityType
{
    public SA5C()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 20301, Guided
        setSubCategory((byte)17); // uid 20344, SA-5 Gammon
        setSpecific((byte)3); // uid 20347, SA-5C
    }
}