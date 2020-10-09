package edu.nps.moves.dis7.entities.ind.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4f25b795
 * Country: India (IND)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 18822
 */
public class HALSA316AlouetteIII extends EntityType
{
    public HALSA316AlouetteIII()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)21); // uid 18821, Utility Helicopter
        setSubCategory((byte)1); // uid 18822, HAL SA 316 Alouette III
    }
}