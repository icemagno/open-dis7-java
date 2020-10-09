package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@78910096
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 11244
 */
public class AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV extends EntityType
{
    public AlliantTechsystemsOutriderUAVformerlyknownastheTacticalUAVorTUAV()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)50); // uid 11232, Unmanned
        setSubCategory((byte)7); // uid 11244, Alliant Techsystems Outrider UAV (formerly known as the Tactical UAV or TUAV)
    }
}