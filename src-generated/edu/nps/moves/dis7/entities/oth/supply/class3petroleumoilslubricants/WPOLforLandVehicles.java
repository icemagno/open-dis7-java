package edu.nps.moves.dis7.entities.oth.supply.class3petroleumoilslubricants;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@6efd0a6e
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_3_PETROLEUM_OILS_LUBRICANTS
 *
 * Entity type uid: 30680
 */
public class WPOLforLandVehicles extends EntityType
{
    public WPOLforLandVehicles()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_3_PETROLEUM_OILS_LUBRICANTS));

        setCategory((byte)3); // uid 30680, W - POL for Land Vehicles
    }
}