package edu.nps.moves.dis7.entities.swe.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@27bb4dc5
 * Country: Sweden (SWE)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 29086
 */
public class RBS23BAMSE extends EntityType
{
    public RBS23BAMSE()
    {
        setCountry(Country.SWEDEN_SWE);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21630, Guided
        setSubCategory((byte)3); // uid 29086, RBS-23 (BAMSE)
    }
}