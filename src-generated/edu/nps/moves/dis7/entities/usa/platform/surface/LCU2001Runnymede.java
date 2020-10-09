package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69364b2d
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 28921
 */
public class LCU2001Runnymede extends EntityType
{
    public LCU2001Runnymede()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)11); // uid 11685, Landing Craft
        setSubCategory((byte)11); // uid 23692, Landing Craft Utility, LCU-2000, Runnymede Class
        setSpecific((byte)1); // uid 28921, LCU 2001 Runnymede
    }
}