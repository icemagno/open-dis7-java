// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.rus.lifeform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@67a0ff25;
 * Country: Russia (RUS);
 * Entity kind: Life form;
 * Domain: LAND;
 *
 * Entity type uid: 32151
 */
public class _105mmRPG32Nashshab extends EntityType
{
    /** Default constructor */
    public _105mmRPG32Nashshab()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.LIFE_FORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)11); // uid 32132, Army
        setSubCategory((byte)45); // uid 32145, Anti-Tank Rockets
        setSpecific((byte)106); // uid 32151, 105mm RPG-32 Nashshab
    }
}
