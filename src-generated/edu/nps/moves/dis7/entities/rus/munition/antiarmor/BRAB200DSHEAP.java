package edu.nps.moves.dis7.entities.rus.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7f12094d
 * Country: Russia (RUS)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 20475
 */
public class BRAB200DSHEAP extends EntityType
{
    public BRAB200DSHEAP()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 20445, Ballistic
        setSubCategory((byte)12); // uid 20475, BRAB-200DS HE AP
    }
}