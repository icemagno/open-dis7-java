// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.irn.munition.tactical;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@7761e342;
 * Country: Iran (Islamic Republic of) (IRN);
 * Entity kind: Munition;
 * Domain: TACTICAL;
 *
 * Entity type uid: 32479
 */
public class Shahab2 extends EntityType
{
    /** Default constructor */
    public Shahab2()
    {
        setCountry(Country.IRAN_ISLAMIC_REPUBLIC_OF_IRN);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.TACTICAL));

        setCategory((byte)1); // uid 32473, Guided
        setSubCategory((byte)9); // uid 32479, Shahab 2
    }
}
