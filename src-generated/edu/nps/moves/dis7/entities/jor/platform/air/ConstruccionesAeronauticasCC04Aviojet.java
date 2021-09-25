// autogenerated using string template entitytypecommon.txt

package edu.nps.moves.dis7.entities.jor.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * <p> Entity class <b><code>ConstruccionesAeronauticasCC04Aviojet</code></b> collects multiple enumeration values together. </p>
 * <p> <i>Usage:</i> create an instance of this class with <code>ConstruccionesAeronauticasCC04Aviojet.createInstance()</code> or <code>new ConstruccionesAeronauticasCC04Aviojet()</code>. </p>
 * <ul>
 *     <li> Country: Jordan (JOR) = <code>114</code>; </li>
 *     <li> Entity kind: PlatformDomain = <code>AIR</code>; </li>
 *     <li> Domain: Platform = <code>1</code>; </li>
 *     <li> Category: Attack/Strike = <code>2</code>; </li>
 *     <li> SubCategory: ConstruccionesAeronauticasCC04Aviojet  = <code>1</code>; </li>
 *     <li> Specific:  <code>(none)</code>; </li>
 *     <li> Entity type uid: 18259; </li>
 *     <li> Online document reference: <a href="https://gitlab.nps.edu/Savage/NetworkedGraphicsMV3500/-/blob/master/specifications/README.md" target="_blank">SISO-REF-010-v28 (2020-05-07)</a>. </li>
 * </ul>
 * <p> Full name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3a320ade. </p>
 * @see Country#JORDAN_JOR
 * @see EntityKind#PLATFORM
 * @see Domain
 * @see PlatformDomain
 * @see Category
 * @see AttackStrike
 * @see SubCategory

 */
public final class ConstruccionesAeronauticasCC04Aviojet extends EntityType
{
    /** Default constructor */
    public ConstruccionesAeronauticasCC04Aviojet()
    {
        setCountry(Country.JORDAN_JOR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)2); // uid 18258, Attack/Strike
        setSubCategory((byte)1); // uid 18259, Construcciones Aeronauticas CC-04 Aviojet
    }
    /** Create a new instance of this final (unmodifiable) class
      * @return copy of class for use as data */
    public static ConstruccionesAeronauticasCC04Aviojet createInstance()
    {
            return new ConstruccionesAeronauticasCC04Aviojet();
    }
}
