// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.oth.environmental.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@23469199;
 * Country: Other;
 * Entity kind: Environmental;
 * Domain: AIR;
 *
 * Entity type uid: 21915
 */
public class Cloud extends EntityType
{
    /** Default constructor */
    public Cloud()
    {
        setCountry(Country.OTHER);
        setEntityKind(EntityKind.ENVIRONMENTAL);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)3); // uid 21915, Cloud
    }
}
