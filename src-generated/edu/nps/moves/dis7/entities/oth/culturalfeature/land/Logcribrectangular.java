package edu.nps.moves.dis7.entities.oth.culturalfeature.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6afeaf2d
 * Country: Other
 * Entity kind: Cultural feature
 * Domain: LAND
 *
 * Entity type uid: 21981
 */
public class Logcribrectangular extends EntityType
{
    public Logcribrectangular()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 21973, Obstacle
        setSubCategory((byte)7); // uid 21981, Log crib, rectangular
    }
}