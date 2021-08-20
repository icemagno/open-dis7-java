// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5a4ed68f;
 * Country: Other;
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 24642
 */
public class GenericMediumMotorboatupto39ft119m extends EntityType
{
    /** Default constructor */
    public GenericMediumMotorboatupto39ft119m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)84); // uid 24640, Private Motorboat
        setSubCategory((byte)2); // uid 24642, Generic Medium Motorboat (up to 39ft/11.9m)
    }
}
