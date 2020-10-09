package edu.nps.moves.dis7.entities.bel.munition.battlefieldsupport;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@15d114ce
 * Country: Belgium (BEL)
 * Entity kind: Munition
 * Domain: BATTLEFIELD_SUPPORT
 *
 * Entity type uid: 30338
 */
public class Mk4Mk40wFZ122FlechetteWarhead extends EntityType
{
    public Mk4Mk40wFZ122FlechetteWarhead()
    {
        setCountry(Country.BELGIUM_BEL);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.BATTLEFIELD_SUPPORT));

        setCategory((byte)2); // uid 30331, Ballistic
        setSubCategory((byte)1); // uid 30332, FZ Mk4/Mk40 FFAR (70 mm, 2.75 in)
        setSpecific((byte)6); // uid 30338, Mk4/Mk40 w/ FZ122 Flechette Warhead
    }
}