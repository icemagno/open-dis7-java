package edu.nps.moves.dis7.entities.isr.munition.antiair;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@743d0d44
 * Country: Israel (ISR)
 * Entity kind: Munition
 * Domain: ANTI_AIR
 *
 * Entity type uid: 29021
 */
public class Arrow2Block4 extends EntityType
{
    public Arrow2Block4()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_AIR));

        setCategory((byte)1); // uid 21282, Guided
        setSubCategory((byte)6); // uid 29016, Arrow / Hetz
        setSpecific((byte)5); // uid 29021, Arrow 2 Block-4
    }
}