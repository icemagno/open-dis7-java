// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.chn.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@bbb6f0;
 * Country: China, Peoples Republic of (CHN);
 * Entity kind: Munition;
 * Domain: BATTLEFIELD_SUPPORT;
 *
 * Entity type uid: 21503
 */
public class _120mm extends EntityType
{
    /** Default constructor */
    public _120mm()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 21465, Ballistic
        setSubCategory((byte)12); // uid 21503, 120 mm
    }
}
