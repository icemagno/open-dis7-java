package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3a17b2e3
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 10705
 */
public class SelfPropelledVSHORADGunMissileSystem extends EntityType
{
    public SelfPropelledVSHORADGunMissileSystem()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 10679, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)5); // uid 10705, Self -Propelled VSHORAD Gun / Missile System
    }
}