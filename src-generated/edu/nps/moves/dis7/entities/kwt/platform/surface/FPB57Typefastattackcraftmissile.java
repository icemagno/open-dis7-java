package edu.nps.moves.dis7.entities.kwt.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@4940809c
 * Country: Kuwait (KWT)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 17921
 */
public class FPB57Typefastattackcraftmissile extends EntityType
{
    public FPB57Typefastattackcraftmissile()
    {
        setCountry(Country.KUWAIT_KWT);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 17912, Light/Patrol Craft
        setSubCategory((byte)4); // uid 17921, FPB 57 Type (fast attack craft-missile)
    }
}