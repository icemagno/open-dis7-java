package edu.nps.moves.dis7.entities.gbr.munition.antiarmor;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1ffd0114
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR)
 * Entity kind: Munition
 * Domain: ANTI_ARMOR
 *
 * Entity type uid: 23986
 */
public class CartridgeTank120mmAPFSDSTL26 extends EntityType
{
    public CartridgeTank120mmAPFSDSTL26()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_ARMOR));

        setCategory((byte)2); // uid 20984, Ballistic
        setSubCategory((byte)5); // uid 23984, 120mm tank ammunition
        setSpecific((byte)2); // uid 23986, Cartridge, Tank, 120mm, APFSDS-T, L26
    }
}