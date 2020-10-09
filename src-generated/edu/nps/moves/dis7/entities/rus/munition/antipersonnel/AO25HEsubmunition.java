package edu.nps.moves.dis7.entities.rus.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@71369e1a
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_PERSONNEL
 *
 * Entity type uid: 20656
 */
public class AO25HEsubmunition extends EntityType
{
    public AO25HEsubmunition()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 20637, Ballistic
        setSubCategory((byte)11); // uid 20656, AO-2.5 HE submunition
    }
}