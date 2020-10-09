package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@636fccb0
 * Country: United States of America (USA)
 * Entity kind: Expendable
 * Domain: AIR
 *
 * Entity type uid: 24965
 */
public class RedPlasticPencilFlare extends EntityType
{
    public RedPlasticPencilFlare()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)7); // uid 24824, Signal/Illumination Flare
        setSubCategory((byte)1); // uid 24963, Signal Flare
        setSpecific((byte)2); // uid 24965, Red Plastic Pencil Flare
    }
}