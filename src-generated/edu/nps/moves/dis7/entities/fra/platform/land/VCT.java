package edu.nps.moves.dis7.entities.fra.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@37858383
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 28780
 */
public class VCT extends EntityType
{
    public VCT()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 15674, Small Wheeled Utility Vehicle
        setSubCategory((byte)4); // uid 28768, VLRA (Escort, Reconnaissance, Support) 6x6
        setSpecific((byte)12); // uid 28780, VCT
    }
}