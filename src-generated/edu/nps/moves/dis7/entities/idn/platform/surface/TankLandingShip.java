package edu.nps.moves.dis7.entities.idn.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@33b1c5c5
 * Country: Indonesia (IDN)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 31090
 */
public class TankLandingShip extends EntityType
{
    public TankLandingShip()
    {
        setCountry(Country.INDONESIA_IDN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 31090, Tank Landing Ship
    }
}