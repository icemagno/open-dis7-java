package edu.nps.moves.dis7.entities.oth.supply.class7majoritems;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@709d6de5
 * Country: Other
 * Entity kind: Supply
 * Domain: CLASS_7_MAJOR_ITEMS
 *
 * Entity type uid: 30627
 */
public class GAU2BA extends EntityType
{
    public GAU2BA()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.SUPPLY);
        setDomain(Domain.inst(SupplyDomain.CLASS_7_MAJOR_ITEMS));

        setCategory((byte)9); // uid 30622, M - Weapons
        setSubCategory((byte)3); // uid 30623, 7.62 mm/.30 caliber
        setSpecific((byte)4); // uid 30627, GAU-2B/A
    }
}