package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c82031b
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 20459
 */
public class BK881HEAT extends EntityType
{
    public BK881HEAT()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 20445, Ballistic
        setSubCategory((byte)7); // uid 20458, 82 mm
        setSpecific((byte)1); // uid 20459, BK-881 HEAT
    }
}