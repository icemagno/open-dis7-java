package edu.nps.moves.dis7.entities.fra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c7933ad
 * Country: France (FRA)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 16153
 */
public class F787CommandantdePimodan extends EntityType
{
    public F787CommandantdePimodan()
    {
        setCountry(Country.FRANCE_FRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 16145, Frigate
        setSubCategory((byte)1); // uid 16146, Destienne Dorves (Type A 69) class
        setSpecific((byte)7); // uid 16153, F 787 Commandant de Pimodan
    }
}