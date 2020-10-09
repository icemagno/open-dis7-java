package edu.nps.moves.dis7.entities.rus.munition.antiradar;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@72b2c5ed
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_RADAR
 *
 * Entity type uid: 20520
 */
public class Kh29TKedgeAS14ATVguided extends EntityType
{
    public Kh29TKedgeAS14ATVguided()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_RADAR));

        setCategory((byte)1); // uid 20509, Guided
        setSubCategory((byte)7); // uid 20519, Kh-29MP Kedge Anti-Radar
        setSpecific((byte)1); // uid 20520, Kh-29T Kedge (AS-14A) TV-guided
    }
}