package edu.nps.moves.dis7.entities.svk.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2e6f610d
 * Country: Slovakia (SVK)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 30113
 */
public class MT72 extends EntityType
{
    public MT72()
    {
        setCountry(Country.SLOVAKIA_SVK);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 30111, Armored Utility Vehicle
        setSubCategory((byte)2); // uid 30113, MT-72
    }
}