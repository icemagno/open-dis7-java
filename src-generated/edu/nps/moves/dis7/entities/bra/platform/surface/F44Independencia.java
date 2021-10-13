// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.bra.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>F44Independencia</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>F44Independencia.createInstance()</code> or <code>new F44Independencia()</code>. </p>
 * <ul>
 *     <li> Country: Brazil (BRA) = <code>29</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>SURFACE</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Guided Missile Frigate (FFG) = <code>6</code>; </li>
 *     <li> SubCategory: NiteroiClassVosperMark10  = <code>1</code>; </li>
 *     <li> Specific: F44Independencia  = <code>5</code>; </li>
 *     <li> Entity type uid: 28681; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@224edc67. </p>
 * @see Country#BRAZIL_BRA
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see GuidedMissileFrigateFFG
 * @see SubCategory

 */
public final class F44Independencia extends EntityType
{
    /** Default constructor */
    public F44Independencia()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 28675, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 28676, Niteroi Class (Vosper Mark 10)
        setSpecific((byte)5); // uid 28681, F 44 Independencia
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static F44Independencia createInstance()
    {
            return new F44Independencia();
    }
}
