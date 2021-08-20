// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.culturalfeature.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15be68b;
 * Country: Other;
 * Entity kind: Cultural feature;
 * Domain: SURFACE;
 *
 * Entity type uid: 29797
 */
public class LighthouseonWaterTallGTE40m extends EntityType
{
    /** Default constructor */
    public LighthouseonWaterTallGTE40m()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.CULTURAL_FEATURE);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 22139, Marker
        setSubCategory((byte)4); // uid 29794, Lighthouse on Water
        setSpecific((byte)3); // uid 29797, Lighthouse on Water, Tall (>=40m)
    }
}
