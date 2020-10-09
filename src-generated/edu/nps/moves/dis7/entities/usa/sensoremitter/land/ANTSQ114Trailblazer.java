package edu.nps.moves.dis7.entities.usa.sensoremitter.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@75bf9e67
 * Country: United States of America (USA)
 * Entity kind: Sensor/Emitter
 * Domain: LAND
 *
 * Entity type uid: 23645
 */
public class ANTSQ114Trailblazer extends EntityType
{
    public ANTSQ114Trailblazer()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.SENSOR_EMITTER);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)3); // uid 22356, RF Passive
        setSubCategory((byte)1); // uid 23644, Multi-function
        setSpecific((byte)1); // uid 23645, AN/TSQ-114 Trailblazer
    }
}