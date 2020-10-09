package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3d512652
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: STRATEGIC
 *
 * Entity type uid: 20945
 */
public class SS24Scapel extends EntityType
{
    public SS24Scapel()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)21); // uid 20945, SS-24 Scapel
    }
}