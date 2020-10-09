package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4997552e
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 27684
 */
public class LightweightWaterPurificationSystem125Galh470Lh extends EntityType
{
    public LightweightWaterPurificationSystem125Galh470Lh()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)18); // uid 10638, Engineer Equipment
        setSubCategory((byte)18); // uid 27262, ROWPU - Reverse Osmosis Water Purification Unit
        setSpecific((byte)1); // uid 27684, Lightweight Water Purification System (125 Gal/h / 470 L/h)
    }
}