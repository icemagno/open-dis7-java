package edu.nps.moves.dis7.entities.ita.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3eeb318f
 * Country: Italy (ITA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 18282
 */
public class ArmoredPersonnelCarrierAPC extends EntityType
{
    public ArmoredPersonnelCarrierAPC()
    {
        setCountry(Country.ITALY_ITA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 18281, Armored Fighting Vehicle
        setSubCategory((byte)1); // uid 18282, Armored Personnel Carrier (APC)
    }
}