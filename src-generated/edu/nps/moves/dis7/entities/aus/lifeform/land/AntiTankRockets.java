package edu.nps.moves.dis7.entities.aus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6aa6c17
 * Country: Australia (AUS)
 * Entity kind: Life form
 * Domain: LAND
 *
 * Entity type uid: 31499
 */
public class AntiTankRockets extends EntityType
{
    public AntiTankRockets()
    {
        setCountry(Country.AUSTRALIA_AUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 31462, Australian Army
        setSubCategory((byte)45); // uid 31499, Anti-Tank Rockets
    }
}