package edu.nps.moves.dis7.entities.kor.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@35d6ca49
 * Country: Korea (Republic of) (KOR)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17709
 */
public class TankLandingShip extends EntityType
{
    public TankLandingShip()
    {
        setCountry(Country.KOREA_REPUBLIC_OF_KOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 17709, Tank Landing Ship
    }
}