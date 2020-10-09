package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3cc053
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 11680
 */
public class LST1197BarnstableCounty extends EntityType
{
    public LST1197BarnstableCounty()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)10); // uid 11660, Tank Landing Ship
        setSubCategory((byte)1); // uid 11661, Newport Class
        setSpecific((byte)19); // uid 11680, LST 1197 Barnstable County
    }
}