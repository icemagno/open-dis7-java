package edu.nps.moves.dis7.entities.chn.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3e6ec74
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Munition
 * Domain: BATTLEFIELD_SUPPORT
 *
 * Entity type uid: 21545
 */
public class MinesweepingrocketType81II extends EntityType
{
    public MinesweepingrocketType81II()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21465, Ballistic
        setSubCategory((byte)20); // uid 21543, 253 mm
        setSpecific((byte)2); // uid 21545, Minesweeping rocket Type 81-II
    }
}