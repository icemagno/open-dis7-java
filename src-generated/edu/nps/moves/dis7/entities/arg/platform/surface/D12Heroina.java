// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.arg.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>D12Heroina</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>D12Heroina.createInstance()</code> or <code>new D12Heroina()</code>. </p>
 * <ul>
 *     <li> Country: Argentina (ARG) = <code>10</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Destroyer = <code>4</code>; </li>
 *     <li> SubCategory: AlmiranteBrownClassMeko360H2  = <code>1</code>; </li>
 *     <li> Specific: D12Heroina  = <code>3</code>; </li>
 *     <li> Entity type uid: 31255; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5d6f64b1. </p>
 * @see Country#ARGENTINA_ARG
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileDestroyer
 * @see SubCategory

 */
public final class D12Heroina extends EntityType
{
    /** Default constructor */
    public D12Heroina()
    {
        setCountry(Country.ARGENTINA_ARG);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)4); // uid 18755, Guided Missile Destroyer
        setSubCategory((byte)1); // uid 18756, Almirante Brown Class (Meko 360H2)
        setSpecific((byte)3); // uid 31255, D 12 Heroina
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static D12Heroina createInstance()
    {
            return new D12Heroina();
    }
}
