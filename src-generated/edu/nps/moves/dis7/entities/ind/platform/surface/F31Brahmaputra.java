// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.ind.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5674e1f2;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18832
 */
public class F31Brahmaputra extends EntityType
{
    /** Default constructor */
    public F31Brahmaputra()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18827, Guided Missile Frigate (FFG)
        setSubCategory((byte)3); // uid 18831, Brahmaputra Class (FFG)
        setSpecific((byte)1); // uid 18832, F31 Brahmaputra
    }
}
