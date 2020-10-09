package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@11f3400c
 * Country: United States of America (USA)
 * Entity kind: Expendable
 * Domain: AIR
 *
 * Entity type uid: 22262
 */
public class ADM141Bchaffdispensing extends EntityType
{
    public ADM141Bchaffdispensing()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)6); // uid 22257, Winged Decoy
        setSubCategory((byte)1); // uid 22258, Tactical Air-Launched Decoy
        setSpecific((byte)4); // uid 22262, ADM-141B chaff-dispensing
    }
}