// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.prk.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@c14e5a5;
 * Country: Korea (Democratic Peoples Republic of) (PRK);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32844
 */
public class TaepoDongIIERSecondStageVehicle extends EntityType
{
    /** Default constructor */
    public TaepoDongIIERSecondStageVehicle()
    {
        setCountry(Country.KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF_PRK);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 21602, Guided
        setSubCategory((byte)96); // uid 32843, Taepo Dong II ER (3-stage version)
        setSpecific((byte)1); // uid 32844, Taepo Dong II ER Second Stage Vehicle
    }
}
