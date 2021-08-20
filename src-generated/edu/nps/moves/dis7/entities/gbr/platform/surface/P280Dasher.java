// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.gbr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4667c4c1;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 15302
 */
public class P280Dasher extends EntityType
{
    /** Default constructor */
    public P280Dasher()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 15274, Light/patrol craft
        setSubCategory((byte)6); // uid 15296, Archer class (training and patrol craft)
        setSpecific((byte)6); // uid 15302, P 280 Dasher
    }
}
