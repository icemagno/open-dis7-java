package edu.nps.moves.dis7.entities.rus.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1cec219f
 * Country: Russia (RUS)
 * Entity kind: Platform
 * Domain: SPACE
 *
 * Entity type uid: 14865
 */
public class Generation extends EntityType
{
    public Generation()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 14850, Unmanned
        setSubCategory((byte)8); // uid 14863, Optical imaging surveillance satellite
        setSpecific((byte)2); // uid 14865, Generation
    }
}