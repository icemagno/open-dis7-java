package edu.nps.moves.dis7.entities.cze.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@3270d194
 * Country: Czech Republic (CZE)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 30081
 */
public class LargeWheeledUtilityVehicle extends EntityType
{
    public LargeWheeledUtilityVehicle()
    {
        setCountry(Country.CZECH_REPUBLIC_CZE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 30081, Large Wheeled Utility Vehicle
    }
}