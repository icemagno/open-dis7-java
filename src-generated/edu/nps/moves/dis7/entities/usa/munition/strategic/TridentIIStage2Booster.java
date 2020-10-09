package edu.nps.moves.dis7.entities.usa.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@30798137
 * Country: United States of America (USA)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 32523
 */
public class TridentIIStage2Booster extends EntityType
{
    public TridentIIStage2Booster()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20282, Guided
        setSubCategory((byte)11); // uid 26360, UGM-133 Trident II D5
        setSpecific((byte)5); // uid 32523, Trident II Stage 2 Booster
    }
}