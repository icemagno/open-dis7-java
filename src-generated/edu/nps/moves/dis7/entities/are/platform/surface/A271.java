package edu.nps.moves.dis7.entities.are.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@94e51e8
 * Country: United Arab Emirates (ARE)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 18724
 */
public class A271 extends EntityType
{
    public A271()
    {
        setCountry(Country.UNITED_ARAB_EMIRATES_ARE);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)16); // uid 18722, Auxiliary
        setSubCategory((byte)1); // uid 18723, Cheverton Type (Tender)
        setSpecific((byte)1); // uid 18724, A271
    }
}