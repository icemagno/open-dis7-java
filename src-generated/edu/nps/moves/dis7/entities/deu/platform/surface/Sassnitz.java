package edu.nps.moves.dis7.entities.deu.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5a2d131d
 * Country: Germany (DEU)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 32990
 */
public class Sassnitz extends EntityType
{
    public Sassnitz()
    {
        setCountry(Country.GERMANY_DEU);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)80); // uid 27589, Passenger Vessel (Group 1 Merchant)
        setSubCategory((byte)4); // uid 32986, Ferry
        setSpecific((byte)4); // uid 32990, Sassnitz
    }
}