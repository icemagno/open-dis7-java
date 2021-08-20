// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.kaz.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@62679465;
 * Country: Kazakhstan (KAZ);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27546
 */
public class _2023Aktau extends EntityType
{
    /** Default constructor */
    public _2023Aktau()
    {
        setCountry(Country.KAZAKHSTAN_KAZ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)18); // uid 27543, Utility
        setSubCategory((byte)1); // uid 27544, Type 369/909 Class
        setSpecific((byte)2); // uid 27546, 2023 Aktau
    }
}
