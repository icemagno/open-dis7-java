package edu.nps.moves.dis7.entities.jpn.munition.antiship;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@72af90e8
 * Country: Japan (JPN)
 * Entity kind: Munition
 * Domain: ANTI_SHIP
 *
 * Entity type uid: 21691
 */
public class Type89Torpedo extends EntityType
{
    public Type89Torpedo()
    {
        setCountry(Country.JAPAN_JPN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_SHIP));

        setCategory((byte)1); // uid 21690, Guided
        setSubCategory((byte)1); // uid 21691, Type 89 Torpedo
    }
}